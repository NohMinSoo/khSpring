package kr.or.kh.common;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.kh.member.model.vo.Member;

@Service
@Aspect
public class LogAdvice {
		
	@Resource(name="logService")
	LogService logService;	
	
	private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);

	@Pointcut("execution(* kr.or.kh.member.model.service.MemberServiceImpl.loginMember(..))")
	public void loginLog() {}
	
	@Around("loginLog()")
	public Member loginLogWrite(ProceedingJoinPoint pjp) throws Throwable{
		
		Object [] arr = pjp.getArgs();
		// arr[0] == request 객체
		// arr[1] == mId 
		// arr[2] == mPw
		
		HttpServletRequest request = (HttpServletRequest)arr[0];
		String mId = arr[1].toString();
		String mPw = arr[2].toString();

		Object returnObj = pjp.proceed();
		
		
		MemberLoginLogObject mll = new MemberLoginLogObject();
		
		mll.setmId(mId);
		if(returnObj!=null)	mll.setMllSuccess("Y");
		else mll.setMllSuccess("N");
		mll.setMllIp(request.getRemoteAddr());
		
		if(returnObj!=null) mll.setMllReason("로그인 성공");
		else mll.setMllReason("로그인 실패(아이디 혹은 비밀번호 틀림)");
		
		mll.setMllUserAgent(request.getHeader("User-Agent"));
		mll.setMllUrl(request.getRequestURL().toString());
		mll.setMllReferer(request.getHeader("referer"));
		mll.setMllDateTime(this.getTimeStamp());
		
		
		int result = logService.loginLogWrite(mll);
		if(result > 0)
		{
			System.out.println("로그인 로그 DB에 기록 성공");
		}else {
			System.out.println("로그인 로그 DB에 기록 실패");
		}
		
		return (Member)returnObj;
	}
	
	public Timestamp getTimeStamp() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss.SSS");

		Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
		
		return timestamp;
		
	}
	
}













