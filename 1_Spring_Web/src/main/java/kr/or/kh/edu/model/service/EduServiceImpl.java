package kr.or.kh.edu.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kh.edu.model.dao.EduDao;
import kr.or.kh.edu.model.vo.ClassInfo;
import kr.or.kh.edu.model.vo.ClassInfoPageData;
import kr.or.kh.edu.model.vo.ClassListPageData;


@Service("eduService")
public class EduServiceImpl implements EduService{
	@Resource(name="eduDao")
	EduDao eDao;	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public ClassListPageData selectClassList(int reqPage) {
		
		int pagePerNum = 10;														//한 페이지 당 게시물 수
		int totalCount = eDao.totalCount(sqlSession);							//페이지 수를 구하기 위한 게시물 전체 수 조회
		int totalPage = totalCount/pagePerNum+((totalCount%pagePerNum==0)?0:1);	//전체 페이지 수 나누어떨어지면 페이지까지, 나머지가있으면 1page추가
		
		ArrayList<ClassInfo> classList = eDao.selectClassList(sqlSession,reqPage,pagePerNum);	//게시판 리스트조회
		String pageNavi="";		//네비게이션용 HTML코드가 작성될 변수
		int pageNo = 1;			//출력용 페이지 번호
		int pageNaviSize=5;		//네비안에 페이지는 5개씩하고 이전 다음
		int i = 1;				//순회용
		
		pageNo = ((reqPage-1)/pageNaviSize) * pageNaviSize +1;
		//이전페이지로 가기
		if(pageNo != 1) {
			pageNavi += "<a class='paging' href='/edu/curriculumList.kh?reqPage="+(pageNo-pageNaviSize)+"'><</a>";
		}
		//페이지 네비
		while(!(i++>pageNaviSize || pageNo > totalPage)) {
			if(reqPage == pageNo) {
				pageNavi += "<span class='reqPage'>"+pageNo+"</span>";
			}else {
				pageNavi += "<a class='paging' href='/edu/curriculumList.kh?reqPage="+pageNo+"'>"+pageNo+"</a>";
			}
			pageNo++;
		}
		//다음페이지로 가기
		if(pageNo <= totalPage) {
			pageNavi += "<a class='paging' href='/edu/curriculumList.kh?reqPage="+pageNo+"'>></a>";
		}
		ArrayList<ClassInfo> classNameList = eDao.selectClassNameList(sqlSession);				//sidenavi에 사용할 리스트
	
		return new ClassListPageData(classList,classNameList,pageNavi);
	}
	@Override
	public ArrayList<ClassInfo> selectClassNameList() {
		return eDao.selectClassNameList(sqlSession);		
	}
	@Override
	public ClassInfoPageData selectClassInfo(int classNo) {
		ClassInfo classInfo = eDao.selectClassInfo(sqlSession,classNo);	
		//개행문자를 HTML에서 사용하는 태그로 변경하는 작업
		classInfo.setClassDetail(classInfo.getClassDetail().replaceAll("\n", "<br>"));
		classInfo.setJobField(classInfo.getJobField().replaceAll("\n", "<br>"));		
		classInfo.setNcsSub(classInfo.getNcsSub().replaceAll("\n", "<br>"));
		classInfo.setSupportTarget(classInfo.getSupportTarget().replaceAll("\n", "<br>"));
		//sidenavi에 사용할 리스트
		ArrayList<ClassInfo> classNameList = eDao.selectClassNameList(sqlSession);				
		ClassInfoPageData pd = new ClassInfoPageData(classInfo, classNameList);
		return pd;
	}
	@Override
	public int modifyClassInfo(ClassInfo classInfo) {
		return  eDao.modifyClassInfo(sqlSession, classInfo);				
	}
	@Override
	public int insertClassInfo(ClassInfo classInfo) {
		return  eDao.insertClassInfo(sqlSession, classInfo);		
	}
	@Override
	public int deleteClassInfo(int classNo) {
		return eDao.deleteClassInfo(sqlSession, classNo);		
	}	
}
