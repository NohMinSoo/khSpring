/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-11-27 07:12:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myInfoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1542705501729L));
    _jspx_dependants.put("jar:file:/D:/workspace/2.%20Spring_Web/1_Spring_Web/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

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
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/resources/png/03_KH정보교육원_원형컬러.png\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.memberMyInfo.mNickName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" 님의 정보</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"/resources/css/main_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t#wrapper{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#contents{\r\n");
      out.write("\t\twidth : 1200px;\r\n");
      out.write("\t\theight : 900px;\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t#contents a{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tcolor : blue;\r\n");
      out.write("\t}\r\n");
      out.write("\t#contents>p{\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t\tfont-size: 14px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#contents>div{\r\n");
      out.write("\t\twidth : 100%;\r\n");
      out.write("\t\theight : 850px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#my-data{\r\n");
      out.write("\t\tpadding-left : 50px;\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#my-data>table tr>td:first-child {\r\n");
      out.write("\t\twidth:200px;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t\tfont-weight: bolder;\r\n");
      out.write("\t}\r\n");
      out.write("\t#my-data>table tr>td:nth-child(2) {\r\n");
      out.write("\t\tfont-size: 19px;\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("\t\theight : 70px;\r\n");
      out.write("\t\twidth : 800px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#my-data>table tr:nth-child(2n)>td{\r\n");
      out.write("\t\tpadding : 0;\r\n");
      out.write("\t\theight : 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#my-data>table tr>td:nth-child(3){\r\n");
      out.write("\theight : 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#my-data>table tr>td>span {\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tcolor : gray;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar nickCheckFlag = 0;\r\n");
      out.write("\tfunction modify(id)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar modifyData = id.value;  // 수정된 값 \r\n");
      out.write("\t\tvar elementId = id.id;\t\t// 수정할 input 태그의 ID \r\n");
      out.write("\t\tconsole.log(modifyData);\r\n");
      out.write("\t\tconsole.log(elementId);\r\n");
      out.write("\t\tif(elementId==\"nick\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(nickCheckFlag==0)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tnickCheck(id,modifyData);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tmodifyCall(modifyData,elementId);\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t modifyCall(modifyData,elementId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction nickCheck(id,nick)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/member/nickCheck.kh\",\r\n");
      out.write("\t\t\tdata : {nick:nick},\r\n");
      out.write("\t\t\ttype : \"post\",\t\t\t\t\t\r\n");
      out.write("\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\tif(result === 'true') // 사용 가능 (없을때)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tid.style.border=\"3px solid green\";\r\n");
      out.write("\t\t\t\t\t$(id).next().text(\"수정\");\r\n");
      out.write("\t\t\t\t\t$(id).next().css('background-color','green');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().next().text(\"사용 가능한 닉네임 입니다. 수정버튼을 클릭하세요\");\r\n");
      out.write("\t\t\t\t\t$(id).next().next().next().css('color','green');\r\n");
      out.write("\t\t\t\t\tnickCheckFlag = 1;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse // 사용 불가 (있을때)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tid.style.border=\"3px solid red\";\r\n");
      out.write("\t\t\t\t\t$(id).next().next().next().text(\"이미 사용하는 닉네임 입니다.\");\r\n");
      out.write("\t\t\t\t\t$(id).next().next().next().css('color','red');\r\n");
      out.write("\t\t\t\t\tconsole.log(\"수정 불가\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(){\r\n");
      out.write("\t\t\t\talert(\"수정 실패! 지속적인 문제 발생시 관리자에게 문의해주세요\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction modifyCall(modifyData,elementId)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/member/mModify.kh\",\r\n");
      out.write("\t\t\tdata : {id:elementId,data:modifyData},\r\n");
      out.write("\t\t\ttype : \"post\",\t\t\t\t\t\r\n");
      out.write("\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\tif(result == 'success')\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\talert(\"정보 변경 완료\");\r\n");
      out.write("\t\t\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(){\r\n");
      out.write("\t\t\t\talert(\"수정 실패! 지속적인 문제 발생시 관리자에게 문의해주세요\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/common/sub_my_header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t<p style=\"font-size:25px;\"><b>내정보 수정</b></p>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</center>\r\n");
      out.write("\t\t\t<p><span style=\"color:blue;\"><b><a href=\"/member/myInfo.kh\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mNickName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></b></span>님의 개인 정보입니다.</p>\r\n");
      out.write("\t\t\t<p>회원정보는 개인정보처리방침에 따라 안전하게 보호되며,</p>\r\n");
      out.write("\t\t\t<p>회원님의 <u><b>명백한 동의 없이 공개 또는 제 3자에게 제공되지 않습니다.</b></u></p>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<div id=\"my-data\">\r\n");
      out.write("\t\t\t<table >\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">아이디</td><td><br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><span>(사용자 ID는 변경하실 수  없습니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">이름</td><td><br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><span>(실명 정보(이름, 생년월일, 성별, 개인 고유 식별 정보)가 변경된 경우 본인 확인을 통해 정보를 수정하실 수 있습니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">닉네임<br></td><td><br><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mNickName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"nick\"/> <button onclick=\"modify(nick);\">중복확인</button><br><span>(닉네임은 본인의 얼굴입니다. 부적절한 닉네임 사용시 이용 불가 될 수 있습니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">이메일<br></td><td><br><input type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"email\"/> <button onclick=\"modify(email);\">수정</button><br><span>(kh 서비스 변경/개편/종료, 프로모션 등 kh의 대부분 안내에 사용할 이메일 주소입니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">휴대폰<br></td><td><br><input maxlength=\"11\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mPhone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"phone\" /> <button onclick=\"modify(phone);\">수정</button><br><span>(아이디, 비밀번호 찾기 등 본인확인이 필요한 경우  kh로부터 알림을 받을 때 사용할 휴대전화입니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td rowspan=\"2\">주소<br></td><td><br><input type=\"text\" size=\"70px\" id=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"d_form large\" placeholder=\"주소\"> <button onclick=\"addressSearch()\">주소찾기</button> <button onclick=\"modify(address);\">수정</button><br><span>(고객님의 주소입니다 - 지번 주소만 지원합니다.)</span></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/common/sub_footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 다음 주소 API -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<span id=\"guide\" style=\"color:#999\"></span>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\r\n");
      out.write("    function addressSearch() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("                var extraRoadAddr = ''; // 도로명 조합형 주소 변수\r\n");
      out.write("\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraRoadAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraRoadAddr !== ''){\r\n");
      out.write("                    extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.\r\n");
      out.write("                if(fullRoadAddr !== ''){\r\n");
      out.write("                    fullRoadAddr += extraRoadAddr;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                \r\n");
      out.write("                document.getElementById('address').value = data.jibunAddress;\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\r\n");
      out.write("                if(data.autoJibunAddress) {\r\n");
      out.write("                    var expJibunAddr = data.autoJibunAddress;\r\n");
      out.write("                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById('guide').innerHTML = '';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
