/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-11-16 08:40:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/apache-tomcat-8.5.31-windows-x64/apache-tomcat-8.5.31/lib/jstl-1.2.jar", Long.valueOf(1523337116000L));
    _jspx_dependants.put("jar:file:/C:/apache-tomcat-8.5.31-windows-x64/apache-tomcat-8.5.31/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
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
      out.write(" <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("\t#header_layer1\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\twidth:10%;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#header_layer2\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\twidth:65%;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#header_layer3\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\twidth:10%;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#header_layer1 a img{\r\n");
      out.write("\t\tmargin : 10px;\r\n");
      out.write("\t\theight:70%;\r\n");
      out.write("\t\twidth:70%;\r\n");
      out.write("\t\ttransition-duration:1s; /* transition-duration */\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#header_layer1 a:hover img{\r\n");
      out.write("\t\tmargin : 0px;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\ttransition-duration:1s; /* transition-duration */\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#header_layer2 a img{\r\n");
      out.write("\t\tmargin : 5px;\r\n");
      out.write("\t\theight:80px;\r\n");
      out.write("\t\twidth:200px;\r\n");
      out.write("\t\ttransition-duration:1s; /* transition-duration */\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t#header_layer3 a img{\r\n");
      out.write("\t\tmargin : 10px;\r\n");
      out.write("\t\theight:85%;\r\n");
      out.write("\t\twidth:70%;\r\n");
      out.write("\t\ttransition-duration:1s; /* transition-duration */\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#header_layer3 a:hover img{\r\n");
      out.write("\t\tmargin : 0px;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\ttransition-duration:1s; /* transition-duration */\r\n");
      out.write("\t}\r\n");
      out.write("\t#header_layer_time{\t\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\twidth:15%;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var weekName = [\"일요일\", \"월요일\", \"화요일\", \"수요일\", \"목요일\", \"금요일\", \"토요일\"];\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\trealtimeClock();\r\n");
      out.write("});\r\n");
      out.write("function realtimeClock()\r\n");
      out.write("{\r\n");
      out.write("\tvar apm = \"am\";\r\n");
      out.write("\tvar date = new Date();\r\n");
      out.write("\tvar hour = date.getHours();\r\n");
      out.write("\tif( hour < 10) {\r\n");
      out.write("\t\thour = \"0\" + hour;\r\n");
      out.write("\t\tapm = \"am\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse {\r\n");
      out.write("\t\tif(hour >= 12) {\r\n");
      out.write("\t\t\thour = (hour > 12) ? hour-12 : hour;\r\n");
      out.write("\t\t\thour = ( hour < 10) ? \"0\" + hour : hour;\r\n");
      out.write("\t\t\tapm = \"pm\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\thour = hour;\r\n");
      out.write("\t\t\tapm = \"am\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tvar min = (date.getMinutes() < 10) ? \"0\" + date.getMinutes() : date.getMinutes();\r\n");
      out.write("\tvar sec = (date.getSeconds() < 10) ? \"0\" + date.getSeconds() : date.getSeconds();\r\n");
      out.write("\t$(\".timebox\").html( hour + \":\" + min + \":\" + sec + \" \" + \"<span>\" + apm + \"</span>\" );\r\n");
      out.write("\t$(\".time\").html( hour + \":\" + min + \":\" + sec + \" \" + \"<span>\" + apm + \"</span>\" );\r\n");
      out.write("\tvar mon = 1 + date.getMonth();\r\n");
      out.write("\tmon = (mon < 10) ? \"0\" + mon : mon;\r\n");
      out.write("\tvar day = date.getDate();\r\n");
      out.write("\tday = (day < 10) ? \"0\" + day : day;\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".daybox\").html( date.getFullYear() + \"년 \" + mon + \"월 \" + day + \"일 \" + weekName[date.getDay()] );\r\n");
      out.write("\t$(\".date\").html( date.getFullYear() + \"년 \" + mon + \"월 \" + day + \"일 \" + weekName[date.getDay()] );\r\n");
      out.write("\t\r\n");
      out.write("\tsetTimeout(\"realtimeClock()\", 1000);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.timebox{\r\n");
      out.write("\t\tfont-family: \"Tahoma\";\r\n");
      out.write("\t\tfont-size:25px;\r\n");
      out.write("\t\tmargin-top : 20px;\r\n");
      out.write("\t\tfont-weight:bold;\r\n");
      out.write("\t\tletter-spacing:0px;\r\n");
      out.write("\t\tline-height : 40px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t.daybox{\r\n");
      out.write("\tmargin-top: 5px;\r\n");
      out.write("\tcolor : #999999;\r\n");
      out.write("\tletter-spacing:0px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-shadow:0px 1px 1px black; /* 텍스트그림자*/\r\n");
      out.write("\t}\r\n");
      out.write("\t#logout{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tbackground-color : black;\r\n");
      out.write("\t\ttext-shadow:0px 1px 1px black; /* 텍스트그림자*/\r\n");
      out.write("\t}\r\n");
      out.write("\t#logout:hover{\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tbackground-color : skyblue;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div id=\"header_layer1\">\r\n");
      out.write("\t\t\t<a href=\"/index.jsp\"><img alt=\"kh마크\" src=\"/resources/jpg/kh_mark.jpg\"></img></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"header_layer_time\">\r\n");
      out.write("\t\t\t<p style=\"\"class=\"timebox\"><span></span></p>\r\n");
      out.write("\t\t\t<p class=\"daybox\"><span></span></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"header_layer2\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a style=\"padding-left:200px;\"href=\"/index.jsp\" >\r\n");
      out.write("\t\t\t<img height=\"100%\" width=\"200px\" alt=\"kh마크\" src=\"/resources/jpg/kh_info.jpg\"></img>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div style=\"float:right; font-size:15px\" >\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"header_layer3\">\r\n");
      out.write("\t\t<a href=\"http://www.fntimes.com/html/view.php?ud=188100\">\r\n");
      out.write("\t\t\t<img height=\"100%\" width=\"100%\" alt=\"kh마크\" src=\"/resources/jpg/2017_kh_mark.png\">\t\r\n");
      out.write("\t\t\t</img>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /resources/common/main_header.jsp(162,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member !=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<B>[<a style=\"color:blue;\"href=\"/member/myInfo.kh\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.member.mNickName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a>]</B>님 환영합니다  <a id=\"logout\" href=\"/member/logout.kh\">로그아웃</a>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }
}