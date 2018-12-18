package kr.or.kh.edu.controller;


import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kh.edu.model.service.EduService;
import kr.or.kh.edu.model.vo.ClassInfo;
import kr.or.kh.edu.model.vo.ClassInfoPageData;
import kr.or.kh.edu.model.vo.ClassListPageData;


/**
 * @FileName : EduController.java
 * @Date :  2018-11-16
 * @작성자 : 노민수
 * @변경이력 :  
 * @프로그램 설명 : "교육과정" 에 대한 기능 요청시 처리되는 컨트롤러 클래스
 */

@Controller
public class EduController {

	
	@Resource(name="eduService")
	EduService eduService;
	/**
	 * @Method Name : curriculumPageCall
	 * @작성일 : 2018-11-16
	 * @작성자 : 이윤수
	 * @변경이력 :  2018-12-17(리턴데이터 타입이 생겨 ModelAndView객체를 사용하여 데이터 전송)
	 * @Method 설명 : 교육과정 소개 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request
	 * @return : String
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/curriculum.kh")
	public ModelAndView curriculumPageCall(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		ArrayList<ClassInfo> classInfo = eduService.selectClassNameList();
		view.addObject("classInfo", classInfo);
		view.setViewName("edu/curriculum");
		return view;
	}
	/**
	 * @Method Name : curriculumList
	 * @작성일 : 2018-12-11
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정을 게시판 리스팅 컨트롤러 메소드
	 * @Parameter :  HttpServletRequest request, @RequestParam int reqPage
	 * @return : ModelAndView
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/curriculumList.kh")
	public ModelAndView curriculumList(HttpServletRequest request, @RequestParam int reqPage) {		
		ModelAndView view = new ModelAndView();
		try {			
			ClassListPageData pd = eduService.selectClassList(reqPage);			
			view.addObject("reqPage", reqPage);
			view.addObject("pd", pd);
			view.setViewName("edu/curriculumlist");
		}catch (Exception e) {
			view.setViewName("error/error");
		}
		return view;
	}
	/**
	 * @Method Name : curriculumInfo
	 * @작성일 : 2018-12-12
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 상세정보 요청 컨트롤러 메소드
	 * @Parameter :  
	 * @return : ModelAndView
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/curriculuminfo.kh")
	public ModelAndView curriculumInfo(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		try {
			int classNo = Integer.parseInt(request.getParameter("classNo"));
			ClassInfoPageData pd = eduService.selectClassInfo(classNo);
			view.addObject("pd", pd);
			view.addObject("classNo", classNo);
			view.setViewName("edu/curriculuminfo");
		}catch(Exception e) {
			view.setViewName("edu/error");
		}		
		return view;
	}
	/**
	 * @Method Name : curriculumModify
	 * @작성일 : 2018-12-13
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정을 수정 컨트롤러 메소드
	 * @Parameter :  
	 * @return : ModelAndView
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/modify.kh")
	public ModelAndView curriculumModify(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();		
		ClassInfo classInfo = new ClassInfo();
		classInfo.setClassNo(Integer.parseInt(request.getParameter("classNoMo")));
		classInfo.setClassDetail(request.getParameter("classDetailMo"));
		classInfo.setTerm(request.getParameter("termMo"));
		classInfo.setClassMemberNum(Integer.parseInt(request.getParameter("classMemberNumMo")));
		classInfo.setNcsSub(request.getParameter("ncsSubMo"));
		classInfo.setClassTime(request.getParameter("classTimeMo"));
		classInfo.setJobField(request.getParameter("jobFieldMo"));
		classInfo.setClassType(request.getParameter("classTypeMo"));
		classInfo.setClassName(request.getParameter("classNameMo"));
		classInfo.setPayment(request.getParameter("paymentMo"));
		classInfo.setSupportTarget(request.getParameter("supportTargetMo"));		
		int result = eduService.modifyClassInfo(classInfo);
		view.addObject("classNo", classInfo.getClassNo());			
		if(result>0) {			
			view.addObject("result","수정 완료");
		}else {
			view.addObject("result","수정 실패");
		}
		view.setViewName("edu/modifyResult");			
		return view;
	}
	/**
	 * @Method Name : write
	 * @작성일 : 2018-12-14
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정 작성하는 페이지를 요청 컨트롤러 메소드
	 * @Parameter :  
	 * @return : String
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/write.kh")
	public String write(HttpServletRequest request) {
		return "edu/classInfoWrite";
	}
	/**
	 * @Method Name : classInfoWrite
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정을 입력하 컨트롤러 메소드
	 * @Parameter :  
	 * @return : String
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/clssInfoWrite.kh")
	public String classInfoWrite(HttpServletRequest request) {
		ClassInfo classInfo = new ClassInfo();
		classInfo.setClassType(request.getParameter("classType"));
		classInfo.setClassName(request.getParameter("className"));
		classInfo.setClassDetail(request.getParameter("classDetail"));
		classInfo.setTerm(request.getParameter("term"));
		classInfo.setClassMemberNum(Integer.parseInt(request.getParameter("classMemberNum")));
		String[] ncsArr = request.getParameterValues("ncsSub");
		StringBuilder sb = new StringBuilder();
		for(String ncs : ncsArr) {			
			 sb.append(ncs+"\r\n");
		}		
		sb.delete(sb.length()-2, sb.length());
		classInfo.setNcsSub(sb.toString());
		classInfo.setPayment(request.getParameter("payment"));
		classInfo.setClassTime(request.getParameter("classTime"));
		classInfo.setJobField(request.getParameter("jobField"));
		classInfo.setSupportTarget(request.getParameter("supportTarget"));
		int result = eduService.insertClassInfo(classInfo);
		if(result>0) {
			return "edu/writeSuccess";			
		}else {
			return "edu/writeFailed";
		}			
	}
	/**
	 * @Method Name : classInfoWrite
	 * @작성일 : 2018-12-17
	 * @작성자 : 이윤수
	 * @변경이력 :  
	 * @Method 설명 : 교육과정을 삭제 컨트롤러 메소드
	 * @Parameter :  
	 * @return : String
	 * @예외처리 :  
	 */
	@RequestMapping(value="/edu/deleteClass.kh")
	public String deleteClass(HttpServletRequest request,@RequestParam int classNo) {
		int result = eduService.deleteClassInfo(classNo);
		if(result>0) {
			return "edu/deleteSuccess";			
		}else {
			return "edu/deleteFailed";
		}
	}
}
