/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-11-25 14:10:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class privacy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<b>KH정보교육원 개인정보 보호정책</b><br>\r\n");
      out.write("KH정보교육원의 개인정보취급방침은 다음과 같습니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>수집하는 개인정보 항목</b><br>\r\n");
      out.write("회사는 회원가입, 상담, 서비스 신청 등등을 위해 아래와 같은 개인정보를 수집하고 있습니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("ο 수집항목 : 이름 , 생년월일 , 로그인ID , 비밀번호 , 자택 전화번호 , 자택 주소 , 휴대전화번호 , 이메일 , 직업 , 회사명 , 부서 , 직책 , 회사전화번호 , 서비스 이용기록 , 접속 로그 , 쿠키 , 접속 IP 정보 , 결제기록<br>\r\n");
      out.write("ο 개인정보 수집방법 : 홈페이지(회원가입,상담게시판류) , 서면양식 <br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>개인정보의 수집 및 이용목적</b><br>\r\n");
      out.write("회사는 수집한 개인정보를 다음의 목적을 위해 활용합니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("ο 서비스 제공에 관한 계약 이행 및 서비스 제공에 따른 요금정산<br>\r\n");
      out.write("콘텐츠 제공<br>\r\n");
      out.write("ο 회원 관리<br>\r\n");
      out.write("회원제 서비스 이용에 따른 본인확인 , 개인 식별 , 불량회원의 부정 이용 방지와 비인가 사용 방지 , 가입 의사 확인 , 연령확인 , 만14세 미만 아동 개인정보 수집 시 법정 대리인 동의여부 확인 , 불만처리 등 민원처리 , 고지사항 전달<br>\r\n");
      out.write("ο 마케팅 및 광고에 활용<br>\r\n");
      out.write("이벤트 등 광고성 정보 전달 , 접속 빈도 파악 또는 회원의 서비스 이용에 대한 통계<br>\r\n");
      out.write(" <br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>개인정보의 보유 및 이용기간</b><br>\r\n");
      out.write("회사는 개인정보 수집 및 사용목적 완료 후에는 예외 없이 해당 정보를 지체 없이 파기합니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>개인정보에 관한 민원서비스</b><br>\r\n");
      out.write("회사는 고객의 개인정보를 보호하고 개인정보와 관련한 불만을 처리하기 위하여 아래와 같이 관련 부서를 지정하고 있습니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("o 소 속 : 컨텐츠개발부 <br>\r\n");
      out.write("o 전화번호 : 070-4827-2147 <br>\r\n");
      out.write("o e-mail : sy9519@nate.com<br>\r\n");
      out.write("<br>\r\n");
      out.write("귀하께서는 회사의 서비스를 이용하시며 발생하는 모든 개인정보보호 관련 민원을 담당부서로 신고하실 수 있습니다. 회사는 이용자들의 신고사항에 대해 신속하게 충분한 답변을 드릴 것입니다.<br>\r\n");
      out.write("<br>\r\n");
      out.write("기타 개인정보침해에 대한 신고나 상담이 필요하신 경우에는 아래 기관에 문의하시기 바랍니다.<br>\r\n");
      out.write("1.개인분쟁조정위원회 (www.kopico.go.kr/1833-6972)<br>\r\n");
      out.write("2.정보보호마크인증위원회 (www.eprivacy.or.kr/02-550-9531~2)<br>\r\n");
      out.write("3.대검찰청 사이버범죄수사 (www.spo.go.kr/02-3480-2000)<br>\r\n");
      out.write("4.경찰청 사이버테러대응센터 (cyberbureau.police.go.kr/182)\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
