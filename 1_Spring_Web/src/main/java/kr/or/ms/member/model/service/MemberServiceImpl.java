package kr.or.ms.member.model.service;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ms.member.model.dao.MemberDao;
import kr.or.ms.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberDao")
	MemberDao mDao;
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
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
	public String findOneMemberId(String mName, String mEmail) {
		Member oneMember = mDao.findOneMemberId(sqlSession,mName,mEmail);
		
		return oneMember.getmId(); 
	}

	
}













