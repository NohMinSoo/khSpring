package kr.or.ms.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;

import kr.or.ms.member.model.vo.Member;

public interface MemberService {
	
	
	/**
	 * @Method Name : selectOneMember
	 * @작성일 : 2018-11-16
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 회원 1명의 정보를 가져오는 메소드 (로그인, 회원정보 조회 등등에 사용됨)
	 * @Parameter :  String userId, String userPw
	 * @return : Member
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public Member selectOneMember(String userId, String userPw);

	/**
	 * @Method Name : selectNickCheck
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 사용중인 닉네임이 있는지를 파악하는 메소드
	 * @Parameter :  String nick
	 * @return : int
	 * @예외처리 :  null Pointer
	 */
	public int selectNickCheck(String nick);

	
	
	/**
	 * @Method Name : updateOneMember
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 넘어오는 값에 따라 회원 정보를 변경하는 메소드
	 * @Parameter : String id, String data
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int updateOneMember(String mId,String id, String data);

	/**
	 * @Method Name : selectIdCheck
	 * @작성일 : 2018-11-21
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원 ID 중복 체크를 위한 메소드
	 * @Parameter :  String id
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int selectIdCheck(String id);

	/**
	 * @Method Name :insertOneMemberJoin
	 * @작성일 : 2018-11-22
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원 가입을 처리할 수 있는 서비스 메소드
	 * @Parameter :  Member oneMember
	 * @return : int
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public int insertOneMemberJoin(Member oneMember);
	
}
