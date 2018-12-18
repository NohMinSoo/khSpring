package kr.or.kh.edu.model.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import kr.or.kh.edu.model.vo.ClassInfo;
import kr.or.kh.edu.model.vo.ClassInfoPageData;
import kr.or.kh.edu.model.vo.ClassListPageData;

@Service("eduService")
public interface EduService {
	
	/**
	 * @Method Name : selectClassList
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 전체정보를 가져오는 메소드, 페이징 처리를 위한 데이터 편집이 발생함(교육과정 리스트페이지에 사용)
	 * @Parameter :  SqlSession sqlSession, int reqPage
	 * @return : ClassListPageData
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ClassListPageData selectClassList(int reqPage);
	/**
	 * @Method Name : selectClassNameList
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 :리스팅 메소드를 사용하면 요청페이지만 읽어오기 때문에 전체정보를 조회하는 메소드임(sidenavi, 교육과정 소개페이지에 사용)  
	 * @Parameter :  SqlSession sqlSession
	 * @return : ArrayList<ClassInfo>
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ArrayList<ClassInfo> selectClassNameList();
	/**
	 * @Method Name : selectClassInfo
	 * @작성일 : 2018-12-12
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 1개의 상세정보를 가져오는 메소드(게시글 상세 정보 출력 시 사용)
	 * @Parameter : int classNo
	 * @return : ClassInfoPageData
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ClassInfoPageData selectClassInfo(int classNo);
	/**
	 * @Method Name : modifyClassInfo
	 * @작성일 : 2018-12-13
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 정보를 수정하는 메소드(게시글 수정 시 사용)
	 * @Parameter :  ClassInfo classInfo
	 * @return : ClassInfo
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int modifyClassInfo(ClassInfo classInfo);
	/**
	 * @Method Name : insertClassInfo
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 1개를 입력하는 메소드(게시판 글 작성 시 사용)
	 * @Parameter :  ClassInfo classInfo
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int insertClassInfo(ClassInfo classInfo);
	/**
	 * @Method Name : deleteClassInfo
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO테이블의 교육과정 1개를 삭제하는 메소드
	 * @Parameter :  int classNo
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int deleteClassInfo(int classNo);
}
