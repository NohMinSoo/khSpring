package kr.or.kh.common;

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
		
	
	private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);

	@Pointcut("execution(* kr.or.kh.member.model.service.MemberServiceImpl.selectOneMember(..))")
	public void loginLog() {}
	
	@Around("loginLog()")
	public Member startLog(ProceedingJoinPoint pjp) throws Throwable{
		
		Object [] arr = pjp.getArgs();
		System.out.println("파라미터 값1 : " + arr[0].toString());
		System.out.println("파라미터 값2 : " + arr[1].toString());
		
		Object returnObj = pjp.proceed();
		System.out.println("[After] : 로그인 로그");
		if(returnObj != null) System.out.println("리턴값 : " + returnObj.toString());
		else System.out.println("리턴값 : "+returnObj);
		
		return (Member)returnObj;
	}
	
}

