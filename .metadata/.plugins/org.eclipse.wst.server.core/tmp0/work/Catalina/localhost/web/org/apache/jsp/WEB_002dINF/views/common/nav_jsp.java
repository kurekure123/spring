/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-02-27 03:26:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path.js}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav id=\"nav\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"burgerking\" class=\"cursor-pointer\" href=\"#\">버거킹</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"nav-kakao-link\" class=\"cursor-pointer\" href=\"#\">카카오뱅크</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"bitcamp\" class=\"cursor-pointer\" href=\"#\">비트캠프</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"nav-mobile-link\" class=\"cursor-pointer\" href=\"#\">SK 텔레콤</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"lotto\" class=\"cursor-pointer\" href=\"#\">로또</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"mypage\" class=\"cursor-pointer\" href=\"#\">마이페이지</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a id=\"logout\" class=\"cursor-pointer\" href=\"#\">로그아웃</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("  <div class=\"bs-example\">\r\n");
      out.write("    <ul class=\"nav nav-pills\" role=\"tablist\">\r\n");
      out.write("      <li role=\"presentation\" class=\"active\"><a href=\"#\">Regular link</a></li>\r\n");
      out.write("      <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("        <a id=\"drop4\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" role=\"button\" aria-expanded=\"false\">\r\n");
      out.write("          Dropdown\r\n");
      out.write("          <span class=\"caret\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"menu1\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop4\">\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Another action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Something else here</a></li>\r\n");
      out.write("          <li role=\"presentation\" class=\"divider\"></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Separated link</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("        <a id=\"drop5\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" role=\"button\" aria-expanded=\"false\">\r\n");
      out.write("          Dropdown\r\n");
      out.write("          <span class=\"caret\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"menu2\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop5\">\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Another action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Something else here</a></li>\r\n");
      out.write("          <li role=\"presentation\" class=\"divider\"></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Separated link</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("        <a id=\"drop6\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" role=\"button\" aria-expanded=\"false\">\r\n");
      out.write("          Dropdown\r\n");
      out.write("          <span class=\"caret\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul id=\"menu3\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop6\">\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Another action</a></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Something else here</a></li>\r\n");
      out.write("          <li role=\"presentation\" class=\"divider\"></li>\r\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"https://twitter.com/fat\">Separated link</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul> <!-- /pills -->\r\n");
      out.write("  </div> <!-- /example -->\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t$('#burgerking').on('click', function() {\r\n");
      out.write("\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path.context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/burgerking\";\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
