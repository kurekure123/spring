/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-03-06 04:09:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");
      out.write("\t<table style=\"margin: 0 auto;height: 400px;border: 2px\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td style=\"width: 150px\">아이디</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<input id=\"join-id\" name=\"join-id\" style=\"margin-right: 88px\" type=\"text\" />\r\n");
      out.write("\t\t<button id=\"check-dupl-btn\" name=\"check_dupl_btn\">중복확인</button>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>암호</td>\r\n");
      out.write("\t<td><input id=\"pass\" name=\"pass\"   style=\"margin-right: 150px\" type=\"password\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>이름</td>\r\n");
      out.write("\t<td><input id=\"name\" name=\"name\"  style=\"margin-right: 150px\"  type=\"text\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>암호확인</td>\r\n");
      out.write("\t<td><input name=\"confirm_pass\"   style=\"margin-right: 150px\" type=\"password\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>이메일</td>\r\n");
      out.write("\t<td><input name=\"email\" style=\"margin-right: 41px\" type=\"email\" />@<select>\r\n");
      out.write("\t<option>naver.com</option>\r\n");
      out.write("\t<option>daum.com</option>\r\n");
      out.write("\t<option>google.com</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>가입일</td>\r\n");
      out.write("\t<td><input name=\"join_date\" type=\"date\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>주민번호</td>\r\n");
      out.write("\t<td><input name=\"ssn\" type=\"text\" />-<input type=\"number\" placeholder=\"\" min=\"1\" max=\"9\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>핸드폰번호</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"radio\" name=\"phone\" checked=\"checked\"/>SKT\r\n");
      out.write("\t<input type=\"radio\" name=\"phone\" />KT\r\n");
      out.write("\t<input type=\"radio\" name=\"phone\" />LG\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<select>\r\n");
      out.write("\t<option>010</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input pattern=\"[0-9]{4}\" type=\"text\" />\r\n");
      out.write("\t<input pattern=\"[0-9]{4}\" type=\"text\" />\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>주소</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input name=\"addr\" type=\"button\" value=\"주소검색\"/>\r\n");
      out.write("\t<input type=\"text\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"cmd\" value=\"insert\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"dir\" value=\"user\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"page\" value=\"login\" />\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<button id=\"btn-join-confirm\" style=\"width: 160px; height: 30px\">확 인</button> \r\n");
      out.write("\t\t\t<button style=\"width: 160px; height: 30px\">취 소</button>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>S\r\n");
      out.write("<script>\r\n");
      out.write("\t\t$('#btn-join-confirm').on('click', function(){\r\n");
      out.write("\t\t  alert(\"클릭 인식됨.\");\r\n");
      out.write("\t\t  var id = $('#join-id').val();\r\n");
      out.write("\t\t  var pass = $('#pass').val();\r\n");
      out.write("\t\t  var name = $('#name').val();\r\n");
      out.write("\t\t  location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path.context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/join/'+id+'/'+pass +'/'+ name;\r\n");
      out.write("\t\t});\r\n");
      out.write("// id, name, password (pathvarable)\r\n");
      out.write("</script>\r\n");
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
