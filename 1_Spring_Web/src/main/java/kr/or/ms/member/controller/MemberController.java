package kr.or.ms.member.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ms.member.model.service.MemberService;
import kr.or.ms.member.model.vo.Member;




/**
 * @FileName : MemberController.java (선택된 편집 파일 이름을 작성한다.)
 * @Date :  2018-11-15 (현재의 날짜를 작성한다.)
 * @작성자 : 노민수 (작성자의 이름을 기록한다.)
 * @변경이력 : 2018-11-15 (프로그램이 변경되는 경우 해당 이력을 간략하게 작성한다.)
 * @프로그램 설명 : (프로그램의 기능을 간략하게 기술한다.)
 */
@Controller("memberController")
public class MemberController {
	
	@Resource(name="memberService")
	MemberService mService;
	
	@Autowired
	private JavaMailSender mailSender; //메일 전송용 객체
	
	/**
	 * @Method Name : (선택된 메소드의 이름을 작성한다.)
	 * @작성일 : (메소드를 작성한 일자를 기록한다.)
	 * @작성자 : (작성자의 이름을 작성한다.)
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : (메소드가 수행하는 간단한 기능을 간략하게 기술한다.)
	 * @Parameter :  (메소드의 입력 파라미터를 기술한다.)
	 * @return : (메소드의 리턴타입을 작성한다.)
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/loginPage.kh")
	public String loginPageCall() {
		
		return "member/loginPage";
	}
	
	/**
	 * @Method Name : login
	 * @작성일 : 2018-11-16
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 로그인 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request,
						@RequestParam String userId, @RequestParam String userPw
	 * @return : String 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/login.kh")
	public String login(HttpServletRequest request,
						@RequestParam String userId, @RequestParam String userPw)
	{
		System.out.println(userId+"("+request.getRemoteAddr()+") : 로그인 호출" );
		
		Member oneMember = mService.selectOneMember(userId, userPw);
		
		
		if(oneMember != null)
		{
			HttpSession session = request.getSession(true);
			if(oneMember.getmActive().equals("Y"))
			{session.setAttribute("member", oneMember);}
			return "member/loginSuccess";
		}else
		{
			return "member/loginFailed";
		}
		
	}
	
	
	/**
	 * @Method Name : logout
	 * @작성일 : 2018-11-16
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 로그아웃 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : String 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/logout.kh")
	public String logout(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		
		try {
			session.invalidate();
		} catch (Exception e) {
			return "error/error";
		}
		return "redirect:/index.jsp";
	}
	
	
	/**
	 * @Method Name : memberInfo
	 * @작성일 : 2018-11-16
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 마이페이지 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : ModelAndView 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/myInfo.kh")
	public ModelAndView memberInfo(HttpServletRequest request)
	{
		ModelAndView view = new ModelAndView();
		try {
			HttpSession session = request.getSession(false);
			
			String userId = ((Member)session.getAttribute("member")).getmId();
			String userPw = ((Member)session.getAttribute("member")).getmPw();
			Member oneMember = mService.selectOneMember(userId, userPw);
			
			
			if(oneMember != null)
			{
				view.addObject("memberMyInfo",oneMember);
				view.setViewName("member/myInfoPage");
			}else {
				throw new NullPointerException("정보를 가져오지 못함");
			}
			
		} catch (Exception e) {
			view.setViewName("error/error");
		}
		return view;
		
	}
	
	/**
	 * @Method Name : idCheck
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 닉네임 체크 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : void 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/idCheck.kh")
	public void idCheck(HttpServletRequest request, HttpServletResponse response)
	{
		String id = request.getParameter("id");
		int result = mService.selectIdCheck(id);
		
		try {
			if(result>0) // 사용 가능하다면
			{
				response.getWriter().print("true");
			}else //사용 불가능하다면
			{
				response.getWriter().print("false");
			}
		} catch (Exception e) {
			System.out.println("ID 체크시(idCheckCheck) 문제 발생하였음");
		}
		
			
	}
	
	/**
	 * @Method Name : nickCheck
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 닉네임 체크 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : void 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/nickCheck.kh")
	public void nickCheck(HttpServletRequest request, HttpServletResponse response)
	{
		String nick = request.getParameter("nick");
		int result = mService.selectNickCheck(nick);
		
		try {
			if(result>0) // 사용 가능하다면
			{
				response.getWriter().print("true");
			}else //사용 불가능하다면
			{
				response.getWriter().print("false");
			}
		} catch (Exception e) {
			System.out.println("닉네임 체크시(NickCheck) 문제 발생하였음");
		}
		
			
	}
	

	
	
	/**
	 * @Method Name : modifyCall
	 * @작성일 : 2018-11-19
	 * @작성자 : 노민수
	 * @변경이력 :  
	 * @Method 설명 : 회원 정보 변경 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : void 
	 * @예외처리 :  Null Pointer Exception
	 */
	@RequestMapping(value="/member/mModify.kh")
	public void modifyCall(HttpServletRequest request, HttpServletResponse response)
	{
		String id = request.getParameter("id");
		String data = request.getParameter("data");
		
		HttpSession session = request.getSession(false);
		
		Member member = (Member)session.getAttribute("member");
		
		
		// userId값은 말그대로 해당 유저 Id
		// id 값은 변경하기 위한 id 구분자 (nick,email,phone)
		// data 값은 변경되기 위한 값
		int result = mService.updateOneMember(member.getmId(),id,data);
		
		try {
			if(result>0) // 사용 가능하다면
			{
				//세션에 있는 정보를 갱신
				switch(id)
				{
				case "nick" : member.setmNickName(data); break;
				case "email" : member.setmEmail(data); break;
				case "phone" : member.setmPhone(data); break;
				case "address" : member.setmAddress(data); break;
				}
				session.setAttribute("member", member);
				
				response.getWriter().print("success");
			}else //사용 불가능하다면
			{
				response.getWriter().print("fail");
			}
		} catch (Exception e) {
			System.out.println("회원 정보 변경 메소드(modifyCall)에서 문제 발생");
		}
			
	}
	
	
	/**
	 * @Method Name : joinPageAgreeCall
	 * @작성일 : 2018-11-20
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원 가입시 이용약관을 호출하는 메소드
	 * @Parameter :  null
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/joinPageAgree.kh")
	public String joinPageAgreeCall()
	{
		return "member/joinPageAgree";
	}
	
	
	/**
	 * @Method Name : joinPageCall
	 * @작성일 : 2018-11-20
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원가입 페이지(join Page)를 호출하는 메소드
	 * @Parameter :  null
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/joinPage.kh")
	public String joinPageCall()
	{
		return "member/joinPage";
	}
	
	
	
	/**
	 * @Method Name : khJoinMember
	 * @작성일 : 2018-11-22
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원가입 정보를 받아서 처리하는 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/khJoinMember.kh")
	public String khJoinMember(HttpServletRequest request)
	{
		System.out.println("회원 가입 메소드 호출 (khJoinMember)");
		
		Member oneMember = new Member();
		
		oneMember.setmId(request.getParameter("mId"));
		oneMember.setmPw(request.getParameter("mPw"));
		oneMember.setmName(request.getParameter("mName"));
		oneMember.setmNickName(request.getParameter("mNick"));
		oneMember.setmPhone(request.getParameter("mPhone"));
		oneMember.setmEmail(request.getParameter("mEmail"));
		oneMember.setmAddress(request.getParameter("mAddress-1")+" "+request.getParameter("mAddress-2"));
		
		int result = mService.insertOneMemberJoin(oneMember);
		
		if(result>0)
		{
			return "member/khJoinSuccess";
		}else {
			
			return "member/error";
		}
	}
	
	
	
	/**
	 * @Method Name : idPwFindPageCall
	 * @작성일 : 2018-11-23
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 아이디/패스워드 검색 사이트 호출
	 * @Parameter :  (메소드의 입력 파라미터를 기술한다.)
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/idPwFindPage.kh")
	public String idPwFindPageCall()
	{
		return "member/idPwFindPage";
	}
	
	
	
	
	
	/**
	 * @Method Name : memberIdFind
	 * @작성일 : 2018-11-23
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 아이디 찾기 작동 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request, HttpServletResponse response
	 * @return : void
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/memberIdFind.kh")
	public void memberIdFind(HttpServletRequest request, HttpServletResponse response)
	{
		String mName = request.getParameter("mName");
		String mEmail = request.getParameter("mEmail");
		
		Member oneMember = mService.findOneMemberId(mName,mEmail);
		
		System.out.println("아이디 찾기 유저" + oneMember);
		
		if(oneMember!=null)
		{
			try {
				sendMail("kh.test201811@gmail.com",oneMember.getmEmail(),"[kh] 아이디 찾기 결과 입니다",
						"안녕하세요 kh정보 교육원 입니다.\n"
						+ "귀하의 아이디는 ["+oneMember.getmId()+"] 입니다.");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				response.getWriter().print("true");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				response.getWriter().print("false");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	/**
	 * @Method Name : sendMail
	 * @작성일 : 2018-11-26
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 메일을 보낼때 사용되는 메소드
	 * @Parameter :  String from, String to, String subject, String mailText
	 * @return : void
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	public void sendMail(String from, String to, String subject, String mailText) throws FileNotFoundException, URISyntaxException {
		 try{
		  SimpleMailMessage message = new SimpleMailMessage();
		  message.setFrom(from);
		  message.setTo(to);
		  message.setSubject(subject);
		  message.setText(mailText);
		  mailSender.send(message);
		 }catch(Exception e){
		  e.printStackTrace();
		 }   
		}	
	
	
	/**
	 * @Method Name : memberPwFind
	 * @작성일 : 2018-11-23
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 비밀번호 찾기 작동 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request, HttpServletResponse response
	 * @return : void
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/memberPwFind.kh")
	public void memberPwFind(HttpServletRequest request, HttpServletResponse response)
	{
		String mId = request.getParameter("mId");
		String mName = request.getParameter("mName");
		String mEmail = request.getParameter("mEmail");
		
		System.out.println("패스워드 찾기 메소드 호출");
		Member oneMember = mService.findOneMemberPw(mId,mName,mEmail);
		
		if(oneMember != null)
		{
			try {
				sendMail("kh.test201811@gmail.com",oneMember.getmEmail(),"[kh] 임시 비밀번호 발송",
						"안녕하세요 kh정보 교육원 입니다.\n"
						+ "귀하의 임시 비밀번호는 ["+oneMember.getmPw()+"] 입니다. \n"
						+ "로그인 후 꼭 변경 하시길 바랍니다.\n");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				response.getWriter().print("true");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				response.getWriter().print("false");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

	/**
	 * @Method Name : memberPwChange
	 * @작성일 : 2018-11-26
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 회원의 비밀번호를 변경하는 컨트롤러 메소드 (ajax 통신)
	 * @Parameter :  HttpServletRequest request, HttpServletResponse response
	 * @return : void
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/member/memberPwChange.kh")
	public void memberPwChange(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			String prePw = request.getParameter("prePw");
			String newPw = request.getParameter("newPw");
			Member oneMember = (Member)(request.getSession(false)).getAttribute("member");
			String mId = oneMember.getmId();
			
			int result = mService.updateMemberPw(mId,prePw,newPw);
		
			if(result>0)
			{
				oneMember.setmPw(newPw);
				request.setAttribute("member", oneMember);
				try {
					response.getWriter().print("true");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			try {
				response.getWriter().print("false");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}












