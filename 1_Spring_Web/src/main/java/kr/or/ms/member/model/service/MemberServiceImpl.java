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

}













