/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-11-25 14:10:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"shortcut icon\" href=\"/resources/png/03_KH정보교육원_원형컬러.png\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #D5D5D5;\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\t#container{\r\n");
      out.write("    \tmargin-top : 20px;\r\n");
      out.write("    \tmargin-left : 300px;\r\n");
      out.write("    \twidth : 1000px;\r\n");
      out.write("    \theight : 1550px;\r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("    #contents-2{\r\n");
      out.write("  \r\n");
      out.write("    \tpadding-left: 150px;\r\n");
      out.write("    \tpadding-right: 150px;\r\n");
      out.write("    \ttext-align: left; width : 100%;\r\n");
      out.write("    \theight : 85%;\r\n");
      out.write("  \r\n");
      out.write("    \t\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    #contents-2 div{\r\n");
      out.write("    \twidth : 100%;\r\n");
      out.write("    \theight : 70px;\r\n");
      out.write("    }\r\n");
      out.write("     #contents-2 div input{\r\n");
      out.write("     \tmargin : 10px;\r\n");
      out.write("     \tline-height: 40px;\r\n");
      out.write("     }\r\n");
      out.write("     #contents-2 div span{\r\n");
      out.write("     \tmargin : 10px;\r\n");
      out.write("     \tcolor : red;\r\n");
      out.write("     \tfont-weight: bolder;\r\n");
      out.write("      }\r\n");
      out.write("     #contents-2 div input[type=\"text\"]\r\n");
      out.write("     {\r\n");
      out.write("     \tfont-size : 25px;\r\n");
      out.write("     }\r\n");
      out.write("      #contents-2 div input[type=\"password\"]\r\n");
      out.write("     {\r\n");
      out.write("     \tfont-size : 25px;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     #contents-2 div input[type=\"email\"]\r\n");
      out.write("     {\r\n");
      out.write("     \tfont-size : 25px;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     .inputLabel{\r\n");
      out.write("     \tfont-size : 20px;\r\n");
      out.write("     \tfont-weight: bolder;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     .not-kor\r\n");
      out.write("     {\r\n");
      out.write("     \time-mode:disabled;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     #joinBtn{\r\n");
      out.write("\t\r\n");
      out.write("\t\tbackground-color : #003399;\r\n");
      out.write("\t\twidth :100%;\r\n");
      out.write("\t\theight : 80px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t#contents-2 label>span{\r\n");
      out.write("\t\tfont-size : 15px;\r\n");
      out.write("\t\tcolor: #003399;\r\n");
      out.write("\t}\r\n");
      out.write("\t#addrSearch{\r\n");
      out.write("\t\twidth : 100px;\r\n");
      out.write("\t\theight : 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.addr-2-hide{\r\n");
      out.write("\t\tdisplay:none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("     \r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var checkFlags=[0,0,0,0,0,0,0];\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('#contents-2 div input').focus(function(){\r\n");
      out.write("\t\t$(this).parent().css('border','2px solid #003399');\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#contents-2 div input').blur(function(){\r\n");
      out.write("\t\t$(this).parent().css('border','2px solid #D5D5D5');\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t// 데이터 입력 여부 체크 메소드\r\n");
      out.write("\t$('#contents-2 div input').blur(function(){\r\n");
      out.write("\t\tvar data = $(this).val();\r\n");
      out.write("\t\tif(data==''){\r\n");
      out.write("\t\t\t$(this).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(this).next().next().css('color','red');\r\n");
      out.write("\t\t\tswitch($(this).attr('id'))\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tcase 'mId' : $(this).next().next().text('아이디를 입력해주세요');checkFlags[0]=0; break;\r\n");
      out.write("\t\t\tcase 'mPw' : $(this).next().next().text('비밀번호를 입력해주세요'); break;\r\n");
      out.write("\t\t\tcase 'mPw_re' : $(this).next().next().text('재확인 비밀번호를 입력해주세요');checkFlags[1]=0; break;\r\n");
      out.write("\t\t\tcase 'mName' : $(this).next().next().text('이름을 입력해주세요');checkFlags[2]=0; break;\r\n");
      out.write("\t\t\tcase 'mNick' : $(this).next().next().text('닉네임을 입력해주세요');checkFlags[3]=0; break;\r\n");
      out.write("\t\t\tcase 'mPhone' : $(this).next().next().text('휴대폰 번호를 입력해주세요');checkFlags[4]=0; break;\r\n");
      out.write("\t\t\tcase 'mEmail' : $(this).next().next().text('이메일을 입력해주세요');checkFlags[5]=0; break;\r\n");
      out.write("\t\t\tcase 'mAddress-1' : $('#mAddress-2').next().next().text('주소를 입력해주세요');checkFlags[6]=0; break;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tswitch($(this).attr('id'))\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t//아이디 중복 체크\r\n");
      out.write("\t\t\tcase 'mId' : idCheck(this,data); break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//비밀번호 적절성 체크\r\n");
      out.write("\t\t\tcase 'mPw' : pwCheck(this,data); break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//비밀번호 재확인 중복 체크\r\n");
      out.write("\t\t\tcase 'mPw_re' : pwReCheck(this,data); break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//이름 작성 체크\r\n");
      out.write("\t\t\tcase 'mName' : nameCheck(this,data);break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//닉네임 중복 체크\r\n");
      out.write("\t\t\tcase 'mNick' : nickCheck(this,data);break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//휴대폰 번호 체크\r\n");
      out.write("\t\t\tcase 'mPhone' : phoneCheck(this,data);break;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//이메일 체크\r\n");
      out.write("\t\t\tcase 'mEmail' : emailCheck(this,data);break;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t//주소 체크\r\n");
      out.write("\t\t\tcase 'mAddress-2' : addressCheck(this,data);break;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//아이디 중복 체크 메소드\r\n");
      out.write("\tfunction idCheck(id,data){\r\n");
      out.write("\t\tvar regExpr =  /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!regExpr.test(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tif(data.length>=4)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/member/idCheck.kh\",\r\n");
      out.write("\t\t\tdata : {id : data},\r\n");
      out.write("\t\t\ttype : \"post\",\t\t\t\t\t\r\n");
      out.write("\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\tif(result=='true')\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().text('사용 가능합니다.');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\t\t\tcheckFlags[0]=1;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().text('이미 사용중인 아이디 입니다.');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\t\t\tcheckFlags[0]=0;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t}\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(){\r\n");
      out.write("\t\t\t\tconsole.log(\"서버 전송 실패\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('아이디는 최소 4글자 이상 입력해주세요');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[0]=0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('아이디는 한글이 사용 불가 합니다.');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[0]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//비밀번호 적절성 체크 메소드\r\n");
      out.write("\tfunction pwCheck(id,data){\r\n");
      out.write("\t\tvar expr = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(expr.test(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$(id).next().next().text('사용가능한 비밀번호 입니다.');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\t$('#mPw_re').val('');\r\n");
      out.write("\t\t\t$('#mPw_re').css('border','1px solid gray');\r\n");
      out.write("\t\t\t$('#mPw_re').next().next().text('');\r\n");
      out.write("\t\t\tcheckFlags[1]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('1개 이상의 영소문자, 영대문자, 특수문자, 숫자를 포함해주세요(8글자 이상)');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[1]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//비밀번호 재확인 체크 메소드\r\n");
      out.write("\tfunction pwReCheck(id,data){\r\n");
      out.write("\t\tvar pw = $('#mPw').val();\r\n");
      out.write("\t\tvar pw_re = data; \r\n");
      out.write("\t\tif(pw === pw_re)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$(id).next().next().text('비밀번호 재확인 완료');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\tcheckFlags[1]=1;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('동일한 비밀번호를 입력해주세요');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[1]=0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//이름 작성 체크 메소드\r\n");
      out.write("\tfunction nameCheck(id,data){\r\n");
      out.write("\t\tvar regExp = /[가-힣]{2,}/;\r\n");
      out.write("\t\tif(regExp.test(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$(id).next().next().text('이름 입력 확인');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\tcheckFlags[2]=1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('이름을 정상적으로 작성해주세요');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[2]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//닉네임 중복 체크 메소드\r\n");
      out.write("\tfunction nickCheck(id,data){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/member/nickCheck.kh\",\r\n");
      out.write("\t\t\tdata : {nick : data},\r\n");
      out.write("\t\t\ttype : \"post\",\t\t\t\t\t\r\n");
      out.write("\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\tif(result=='true')\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().text('사용 가능합니다.');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\t\t\tcheckFlags[3]=1;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(id).css('border','4px solid #red');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().text('이미 사용중인 닉네임 입니다.');\r\n");
      out.write("\t\t\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\t\t\tcheckFlags[3]=0;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(){\r\n");
      out.write("\t\t\t\tconsole.log(\"서버 전송 실패\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//휴대폰 번호 체크 메소드\r\n");
      out.write("\tfunction phoneCheck(id,data){\r\n");
      out.write("\t\tvar data = data.replace(/[-]/g,'');\r\n");
      out.write("\t\tvar regExp =  /^01([0|1|6|7|8|9]?)([0-9]{3,4})([0-9]{4})$/;\r\n");
      out.write("\t\tif(data.length>=10 && regExp.test(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$(id).next().next().text('휴대폰 번호 정상 입력 완료');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\tcheckFlags[4]=1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('휴대폰 번호를 정상적으로 입력해주세요');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[4]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//이메일 체크 메소드\r\n");
      out.write("\tfunction emailCheck(id,data){\r\n");
      out.write("\t\tvar regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;\r\n");
      out.write("\t\tvar pw_re = data; \r\n");
      out.write("\t\tif(regExp.test(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$(id).next().next().text('이메일 정상 입력 완료');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','#003399');\r\n");
      out.write("\t\t\tcheckFlags[5]=1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(id).css('border','4px solid red');\r\n");
      out.write("\t\t\t$(id).next().next().text('이메일을 정상적으로 입력해주세요');\r\n");
      out.write("\t\t\t$(id).next().next().css('color','red');\r\n");
      out.write("\t\t\tcheckFlags[5]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//주소 체크 메소드\r\n");
      out.write("\tfunction addressCheck(id,data){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(data.length>0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$('#mAddress-2').css('border','4px solid #003399');\r\n");
      out.write("\t\t\t$('#mAddress-2').next().next().text('주소 정상 입력 완료');\r\n");
      out.write("\t\t\t$('#mAddress-2').next().next().css('color','#003399');\r\n");
      out.write("\t\t\tcheckFlags[6]=1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tcheckFlags[6]=0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t//한글입력 안되게 처리\r\n");
      out.write("\t$( 'input[class=not-kor]' ).on(\"blur keyup\", function() {\r\n");
      out.write("\t\t$(this).val( $(this).val().replace( /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g, '' ) );\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t*/\r\n");
      out.write("\t\r\n");
      out.write("\t/*\r\n");
      out.write("\t  $(\"input[class=not-kor]\").keydown(function(event){ \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t   if (!(event.keyCode >=37 && event.keyCode<=40)) {\r\n");
      out.write("\r\n");
      out.write("\t    var inputVal = $(this).val();\r\n");
      out.write("\r\n");
      out.write("\t    var expr = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;\r\n");
      out.write("\t\t   if(expr.test(inputVal)){\r\n");
      out.write("\t\t\t$(this).text('');\r\n");
      out.write("\t\t    $(this).next().next().css('color','red');\r\n");
      out.write("\t\t\t$(this).next().next().text('한글은 사용할 수 없습니다.');\r\n");
      out.write("\t\t   }else{\r\n");
      out.write("\t\t\t$(this).next().next().text('');\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t    \t\r\n");
      out.write("\t\t    $(this).val(inputVal.replace(/[^a-z0-9]/gi,''));\r\n");
      out.write("\t   }\r\n");
      out.write("\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  });\r\n");
      out.write("\t*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function resultCheck(){\r\n");
      out.write("\tvar count = 0;\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0;i<checkFlags.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(checkFlags[i]==1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcount++;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(count==7)\r\n");
      out.write("\t{\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(\"필수 항목은 모두 입력해주세요\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"container\"  align=\"center\">\r\n");
      out.write("    <div id=\"contents-1\">\r\n");
      out.write("            \t<a href=\"/index.jsp\"><img height=80px width=300px src=\"/resources/png/01_KH정보교육원_가로컬러.png\"/></a><br>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("    <div id=\"contents-2\" >\r\n");
      out.write("\t\t\t<span style=\"font-size:20px;\"><b>KH정보교육원</b>을 찾아주셔서 감사합니다.</span><br>\r\n");
      out.write("\t\t\t<span>회사는 <b><u>회원가입, 상담, 서비스 신청 등을 위해 아래와 같은 개인정보를 수집</u></b>하고 있습니다.</span><br>\r\n");
      out.write("\t\t\t<hr style=\"border:2px solid black;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form id=\"joinForm\" action=\"/member/khJoinMember.kh\" method=\"post\">\r\n");
      out.write("\t\t\t<label for=\"mId\" class=\"inputLabel\">아이디 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"text\" style=\"ime-mode:disable;\" maxlength=\"10\" class=\"not-kor\" size=\"47\" name=\"mId\" id=\"mId\" placeholder=\"가입할 ID를 작성하세요\" autofocus/>\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mPw\" class=\"inputLabel\">비밀번호 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"password\" maxlength=\"20\" size=\"47\" name=\"mPw\" id=\"mPw\"  placeholder=\"사용할 비밀번호를 입력하세요\" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mPw_re\" class=\"inputLabel\">비밀번호 재확인 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"password\" maxlength=\"20\" size=\"47\" id=\"mPw_re\"  placeholder=\"사용할 비밀번호를 재입력하세요\" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mName\" class=\"inputLabel\">이름 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"text\" maxlength=\"8\" size=\"47\" name=\"mName\" id=\"mName\" placeholder=\"본인의 이름을 입력하세요\" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mNick\" class=\"inputLabel\">닉네임 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"text\" maxlength=\"8\" size=\"47\" name=\"mNick\" id=\"mNick\" placeholder=\"사용할 닉네임을 입력하세요\" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mPhone\" class=\"inputLabel\">휴대폰 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"text\" maxlength=\"13\" size=\"47\" name=\"mPhone\" id=\"mPhone\" placeholder=\"휴대폰 번호를 입력해주세요\" />  \r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mEmail\" class=\"inputLabel\">이메일 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"email\" maxlength=\"20\" size=\"47\" name=\"mEmail\" id=\"mEmail\" placeholder=\"등록할 이메일을 입력하세요 \" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"mAddress\" class=\"inputLabel\">주소 <span>(필수)</span></label><br>\r\n");
      out.write("\t\t\t<div><input type=\"text\" onclick=\"addressSearch();\" name=\"mAddress-1\" maxlength=\"50\" size=\"47\" id=\"mAddress-1\" placeholder=\"클릭하면 주소를 검색할 수 있습니다.\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" maxlength=\"50\" size=\"47\" name=\"mAddress-2\" id=\"mAddress-2\" placeholder=\"나머지 주소를 작성하세요\" />\r\n");
      out.write("\t\t\t<br><span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br><br><br class=\"addr-2-hide\"><br class=\"addr-2-hide\"><br class=\"addr-2-hide\"><br class=\"addr-2-hide\">\r\n");
      out.write("\t\t\t<input id=\"joinBtn\" type=\"submit\"   class = \"btn btn-primary\" value=\"가입하기\" onclick=\"return resultCheck();\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer_bar\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/common/main_footer_bar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/common/main_footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 다음 주소 API -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<span id=\"guide\" style=\"color:#999\"></span>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\r\n");
      out.write("    function addressSearch() {\r\n");
      out.write("    \t\r\n");
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
      out.write("                document.getElementById('mAddress-1').value = data.jibunAddress;\r\n");
      out.write("                \r\n");
      out.write("                if(document.getElementById('mAddress-1').value.length>0)\r\n");
      out.write("                {\r\n");
      out.write("                \t$('#mAddress-1').css('border','4px solid #003399');\t\t\r\n");
      out.write("        \t\t\t$('#mAddress-2').attr('type','text');\r\n");
      out.write("        \t\t\t$('.addr-2-hide').css('display','block');\r\n");
      out.write("        \t\t\t\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
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
