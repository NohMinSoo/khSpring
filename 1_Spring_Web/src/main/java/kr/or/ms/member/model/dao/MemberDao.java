package kr.or.ms.member.model.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ms.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	public Member selectOneMember(SqlSessionTemplate sqlSession,String userId, String userPw) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("userId", userId);
		map.put("userPw", userPw);
		
		return sqlSession.selectOne("member.oneMember",map);
	
	}
}
