package kr.or.kh.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("logDao")
public class LogDao {

	public int loginLogWrite(SqlSessionTemplate sqlSession, MemberLoginLogObject mll) {
		
		return sqlSession.insert("log.login",mll);
	}

}
