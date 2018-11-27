package kr.or.kh.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kh.member.model.vo.Member;


@Controller("adminController")
public class AdminController {
	/**
	 * @Method Name : adminPageCall
	 * @작성일 : 2018-11-27
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 관리자 페이지를 호출하는 컨트롤러 메소드
	 * @Parameter :  (메소드의 입력 파라미터를 기술한다.)
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/admin/adminPage.kh")
	public String adminPageCall(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		try {
			
			Member member = (Member)session.getAttribute("member");
			
			if(member.getmId().equals("admin"))
			{
				return "admin/adminPage";
			}else {
				throw new Exception();
			}		
		} catch (Exception e) {
			System.out.println("관리자가 아님");
			return "error/error";
		}

		
	
	}
	
	
	/**
	 * @Method Name : allLogManagementPageCall
	 * @작성일 : 2018-11-27
	 * @작성자 : 노민수
	 * @변경이력 :  (메소드가 변경되는 경우 해당 이력을 간략하게 작성한다.)
	 * @Method 설명 : 모든 로그를 관리할 수 있는 페이지를 호출하는 메소드
	 * @Parameter :  (메소드의 입력 파라미터를 기술한다.)
	 * @return : String
	 * @예외처리 :  (메소드가 수행되는 도중에 발생할 수 있는 예외사항을 기술한다.)
	 */
	@RequestMapping(value="/admin/allLogManagementPage.kh")
	public String allLogManagementPageCall() {
		
		return "admin/allLogManagementPage";
	}
}
