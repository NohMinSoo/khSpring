package kr.or.kh.member.model.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kh.member.model.dao.MemberDao;
import kr.or.kh.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberDao")
	MemberDao mDao;
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public Member loginMember(HttpServletRequest request,String userId, String userPw) {
		
		Member oneMember = mDao.selectOneMember(sqlSession, userId, userPw);
		
		return oneMember;
	}
	
	
	@Override
	public Member selectOneMember(String userId, String userPw) {
		
		Member oneMember = mDao.selectOneMember(sqlSession, userId, userPw);
		
		return oneMember;
	}
	
	@Override
	public int selectIdCheck(String id) {
		Member oneMember = mDao.selectIdCheck(sqlSession, id);
		if(oneMember!=null)  //해당 닉네임 사용자가 있다면
		{
			return 0;
		}
		else				// 해당 닉네임 사용자가 없다면
		{
			return 1;
		}
	}


	@Override
	public int selectNickCheck(String nick) {
		Member oneMember = mDao.selectNickCheck(sqlSession, nick);
		if(oneMember!=null)  //해당 닉네임 사용자가 있다면
		{
			return 0;
		}
		else				// 해당 닉네임 사용자가 없다면
		{
			return 1;
		}
	}

	
	@Override
	public int updateOneMember(String mId,String id, String data) {
		
		int result  = 0;
		
		// 넘어온 id값에 따라 호출되는 dao가 달라짐
		switch(id)
		{
		case "nick" : result = mDao.updateMemberNick(sqlSession,mId, data); break;
		case "email" : result = mDao.updateMemberEmail(sqlSession,mId,data);break;
		case "phone" : result = mDao.updateMemberPhone(sqlSession,mId, data); break;
		case "address" : result = mDao.updateMemberAddress(sqlSession,mId, data); break;
		}


		return result;
	}

	@Override
	public int insertOneMemberJoin(Member oneMember) {
		return  mDao.insertOneMemberJoin(sqlSession,oneMember);
	}

	@Override
	public Member findOneMemberId(String mName, String mEmail) {
		return  mDao.findOneMemberId(sqlSession,mName,mEmail);
	}

	@Override
	public Member findOneMemberPw(String mId, String mName, String mEmail) {
		
		Member oneMember = mDao.findOneMemberPw(sqlSession,mId,mName,mEmail);
		
		if(oneMember != null)
		{
			System.out.println("해당 사용자는 확인 완료됨");
			String randomPw = getRamdomPassword(8);
			int result  = mDao.getRamdomPassword(sqlSession,mId,randomPw);
			System.out.println("비밀번호 랜덤으로 변경됨");	
			oneMember.setmPw(randomPw);
			return oneMember;
		}else {
			return null;
		}
		
		
	}
	
	@Override
	public String getRamdomPassword(int len) { 
		char[] charSet = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }; 
		int idx = 0; 
		StringBuffer sb = new StringBuffer(); 
		System.out.println("charSet.length :::: "+charSet.length); 
		for (int i = 0; i < len; i++) { 
			idx = (int) (charSet.length * Math.random()); // 36 * 생성된 난수를 Int로 추출 (소숫점제거) 
			System.out.println("idx :::: "+idx); 
			sb.append(charSet[idx]); 
			} 
			return sb.toString(); 
		}

	@Override
	public int updateMemberPw(String mId, String prePw, String newPw) {
		
		return mDao.updateMemberPw(sqlSession,mId, prePw, newPw);
	}
}













