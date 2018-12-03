package kr.or.kh.common;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kh.member.model.dao.MemberDao;

@Service("logService")
public class LogService {
	@Resource(name="logDao")
	LogDao logDao;
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public int loginLogWrite(MemberLoginLogObject mll) {
		
		return  logDao.loginLogWrite(sqlSession,mll);
	}
}
