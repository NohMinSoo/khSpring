package kr.or.ms.member.model.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ms.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	/**
	 * @Method Name : selectOneMember
	 * @작성일 : 2018-11-16
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원 1명의 대한 정보를 가져오는 메소드 (로그인, 회원정보 읽어오기 등등에 사용 됨)
	 * @Parameter :  SqlSessionTemplate sqlSession,String userId, String userPw
	 * @return : Member
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public Member selectOneMember(SqlSessionTemplate sqlSession,String userId, String userPw) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("userId", userId);
		map.put("userPw", userPw);
		
		return sqlSession.selectOne("member.oneMember",map);
	
	}

	
	/**
	 * @Method Name : selectIdCheck
	 * @작성일 : 2018-11-21
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 중복되는 아이디를 체크하기 위한 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String id
	 * @return : Member
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public Member selectIdCheck(SqlSessionTemplate sqlSession, String id) {
		return sqlSession.selectOne("member.idCheck",id);
	}
	
	/**
	 * @Method Name : selectNickCheck
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 중복되는 넥네임을 체크하기 위한 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String nick
	 * @return : Member
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public Member selectNickCheck(SqlSessionTemplate sqlSession, String nick) {
		
		return sqlSession.selectOne("member.nickCheck",nick);
	}

	
	/**
	 * @Method Name : updateMemberNick
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : DB에서 회원의 닉네임을 변경하는 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String mId, String data
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int updateMemberNick(SqlSessionTemplate sqlSession, String mId, String data) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("data", data);
		
		return sqlSession.update("member.nickModify", map);
	}
	
	
	/**
	 * @Method Name : updateMemberEmail
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : DB에서 회원의 이메일을 변경하는 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String mId, String data
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int updateMemberEmail(SqlSessionTemplate sqlSession, String mId, String data) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("data", data);
		
		return sqlSession.update("member.emailModify", map);
	}

	
	/**
	 * @Method Name : updateMemberPhone
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : DB에서 회원의 폰번호을 변경하는 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String mId, String data
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int updateMemberPhone(SqlSessionTemplate sqlSession, String mId, String data) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("data", data);
		
		return sqlSession.update("member.phoneModify", map);
	}
	
	/**
	 * @Method Name : updateMemberPhone
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : DB에서 회원의 폰번호을 변경하는 메소드
	 * @Parameter :  SqlSessionTemplate sqlSession, String mId, String data
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int updateMemberAddress(SqlSessionTemplate sqlSession, String mId, String data) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("data", data);
		
		return sqlSession.update("member.addressModify", map);
	}


	public int insertOneMemberJoin(SqlSessionTemplate sqlSession, Member oneMember) {
		
		return sqlSession.update("member.oneMemberJoin", oneMember);
	}


	public Member findOneMemberId(SqlSessionTemplate sqlSession, String mName, String mEmail) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mName", mName);
		map.put("mEmail", mEmail);
		
		return sqlSession.selectOne("member.findOneMemberId", map);
	}


	public Member findOneMemberPw(SqlSessionTemplate sqlSession, String mId, String mName, String mEmail) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("mName", mName);
		map.put("mEmail", mEmail);
		
		return sqlSession.selectOne("member.findOneMemberPw", map);

	}


	public int getRamdomPassword(SqlSessionTemplate sqlSession, String mId, String ramdomPassword) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("ramdomPassword", ramdomPassword);

		return sqlSession.update("member.updateRandomPassword", map);
	}


	public int updateMemberPw(SqlSessionTemplate sqlSession, String mId, String prePw, String newPw) {
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("mId", mId);
		map.put("prePw", prePw);
		map.put("newPw", newPw);
		
		return sqlSession.update("member.updatePw", map);
	}




	
}
