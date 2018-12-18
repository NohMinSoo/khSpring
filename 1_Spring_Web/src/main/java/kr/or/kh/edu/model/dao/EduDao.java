package kr.or.kh.edu.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.or.kh.edu.model.vo.ClassInfo;

@Repository("eduDao")
public class EduDao {
	/**
	 * @Method Name : selectClassList
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO 테이블에서 요청한 페이지에 해당하는 데이터를 조회하는 메소드(게시판 페이징 데이터)
	 * @Parameter : SqlSession sqlSession, int reqPage, int pagePerNum
	 * @return : ArrayList<ClassInfo>
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ArrayList<ClassInfo> selectClassList(SqlSession sqlSession, int reqPage, int pagePerNum) {
		RowBounds rowBounds = new RowBounds((reqPage-1)*pagePerNum, pagePerNum);
		List<ClassInfo> list = sqlSession.selectList("edu.selectClassList",null,rowBounds);
		return (ArrayList<ClassInfo>)list;
	}
	/**
	 * @Method Name : totalCount
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO 테이블의 전체 행의 갯수를 구하는 메소드(게시판 페이징 시 필요한 전체 게시물 갯수)
	 * @Parameter :  SqlSession sqlSession
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int totalCount(SqlSession sqlSession) {
		return sqlSession.selectOne("edu.totalCount");
	}
	/**
	 * @Method Name : selectClassNameList
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO 테이블의 전체 게시물 정보를 가져오는 메소드
	 * @Parameter :  SqlSession sqlSession
	 * @return : ArrayList<ClassInfo>
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ArrayList<ClassInfo> selectClassNameList(SqlSession sqlSession) {
		List<ClassInfo> list = sqlSession.selectList("edu.selectClassList");
		return (ArrayList<ClassInfo>)list;
	}
	/**
	 * @Method Name : selectClassInfo
	 * @작성일 : 2018-12-12
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO테이블에서 1개의 교육과정에 대한 상세정보를 가져오는 메소드
	 * @Parameter :  SqlSession sqlSession, int classNo
	 * @return : ClassInfo
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public ClassInfo selectClassInfo(SqlSession sqlSession, int classNo) {
		return sqlSession.selectOne("edu.selectClassInfo",classNo);
	}
	/**
	 * @Method Name : modifyClassInfo
	 * @작성일 : 2018-12-13
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO테이블의 교육과정 1개를 수정하는 메소드
	 * @Parameter :  SqlSession sqlSession, ClassInfo classInfo
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int modifyClassInfo(SqlSession sqlSession, ClassInfo classInfo) {
		return sqlSession.update("edu.updateClassInfo", classInfo);		
	}
	/**
	 * @Method Name : insertClassInfo
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO테이블의 교육과정 1개를 수정하는 메소드
	 * @Parameter :  SqlSession sqlSession, ClassInfo classInfo
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int insertClassInfo(SqlSession sqlSession, ClassInfo classInfo) {
		return sqlSession.insert("edu.insertClassInfo", classInfo);
	}
	/**
	 * @Method Name : deleteClassInfo
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : CLASS_INFO테이블의 교육과정 1개를 삭제하는 메소드
	 * @Parameter :  SqlSession sqlSession, int classNo
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int deleteClassInfo(SqlSession sqlSession, int classNo) {
		return sqlSession.delete("edu.deleteClassInfo",classNo);
	}
}
