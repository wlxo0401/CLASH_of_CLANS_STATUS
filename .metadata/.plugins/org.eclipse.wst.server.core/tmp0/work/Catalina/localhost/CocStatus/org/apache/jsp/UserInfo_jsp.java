/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M9
 * Generated at: 2020-03-21 11:28:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>CocStatus</title>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t");

		String userName = request.getParameter("_userName");
		if (userName == null){
			response.sendRedirect("Index.jsp");
		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction show(){\r\n");
      out.write("\t\t\theaddiv.style.display = \"\";\r\n");
      out.write("\t\t\tshowbtn.style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction hide(){\r\n");
      out.write("\t\t\theaddiv.style.display = \"none\";\r\n");
      out.write("\t\t\tshowbtn.style.display = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* Clash of Clans 기록 조회 */\r\n");
      out.write("\t\tvar searchRequest = new XMLHttpRequest();\r\n");
      out.write("\t\tfunction searchFunction(){\r\n");
      out.write("\t\t\tsearchRequest.open(\"Post\", \"./UserSearchServlet?userName=\" + encodeURIComponent('");
      out.print(userName);
      out.write("'), true);\r\n");
      out.write("\t\t\tsearchRequest.onreadystatechange = searchProcess;\r\n");
      out.write("\t\t\tsearchRequest.send(null);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction searchProcess(){\r\n");
      out.write("\t\t\tvar table = document.getElementById(\"ajaxTable\");\r\n");
      out.write("\t\t\ttable.innerHTML = \"\";\r\n");
      out.write("\t\t\tif(searchRequest.readyState = 4 && searchRequest.status == 200) {\r\n");
      out.write("\t\t\t\tvar object = eval('(' + searchRequest.responseText + ')');\r\n");
      out.write("\t\t\t\tvar result = object.result;\r\n");
      out.write("\t\t\t\tfor(var i = 0; i < result.length; i++){\r\n");
      out.write("\t\t\t\t\tvar row = table.insertRow(0);\r\n");
      out.write("\t\t\t\t\tfor(var j = 0; j < result[i].length; j++){\r\n");
      out.write("\t\t\t\t\t\tvar cell = row.insertCell(j);\r\n");
      out.write("\t\t\t\t\t\tcell.innerHTML = result[i][j].value;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar registerRequest2 = new XMLHttpRequest();\r\n");
      out.write("\t\tfunction registerFunction2(){\r\n");
      out.write("\t\t\t\tregisterRequest2.open(\"Post\", \"./UserInputServlet?userName=\" + encodeURIComponent('");
      out.print(userName);
      out.write("') +\r\n");
      out.write("\t\t\t\t\"&plunderGold=\" + encodeURIComponent(document.getElementById(\"inputGold\").value) +\r\n");
      out.write("\t\t\t\t\"&plunderElixir=\" + encodeURIComponent(document.getElementById(\"inputElixir\").value)+\r\n");
      out.write("\t\t\t\t\"&plunderDarkElixir=\" + encodeURIComponent(document.getElementById(\"inputDarkElixir\").value), true);\r\n");
      out.write("\t\t\t\tregisterRequest2.onreadystatechange = registerProcess2;\r\n");
      out.write("\t\t\t\tregisterRequest2.send(null);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction registerProcess2(){\r\n");
      out.write("\t\t\tif(registerRequest2.readyState == 4 && registerRequest2.status == 200){\r\n");
      out.write("\t\t\t\tvar result = registerRequest2.responseText;\r\n");
      out.write("\t\t\t\tif(result != 1){\r\n");
      out.write("\t\t\t\t\talert('닉네임을 확인해주세요.');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\tvar inputGold = document.getElementById(\"inputGold\");\r\n");
      out.write("\t\t\t\t\tvar inputElixir = document.getElementById(\"inputElixir\");\r\n");
      out.write("\t\t\t\t\tvar inputDarkElixir = document.getElementById(\"inputDarkElixir\");\r\n");
      out.write("\t\t\t\t\tinputGold.value = \"\";\r\n");
      out.write("\t\t\t\t\tinputElixir.value = \"\";\r\n");
      out.write("\t\t\t\t\tinputDarkElixir.value = \"\";\r\n");
      out.write("\t\t\t\t\tsearchFunction();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction firstFunction(){\r\n");
      out.write("\t\t\tsearchFunction();\r\n");
      out.write("\t\t\thide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.onload = firstFunction;\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id = \"warp\">\r\n");
      out.write("\t\t<div id = \"header\">\r\n");
      out.write("\t\t\t<div id = \"header-nav\">\r\n");
      out.write("\t\t\t\t<nav id=\"nav-1\">\r\n");
      out.write("\t\t\t\t  \t<a class=\"link-1\" href=\"Index.jsp\">COCStatus</a>\r\n");
      out.write("\t\t\t\t  \t<a class=\"link-1\" href=\"https://gall.dcinside.com/board/lists?id=clashofclans\" target=\"_blank\">DC콬갤러리</a>\r\n");
      out.write("\t\t\t\t  \t<a class=\"link-1\" href=\"http://coc.inven.co.kr\" target=\"_blank\">COC인벤</a>\r\n");
      out.write("\t\t\t\t  \t<a class=\"link-1\" href=\"https://www.youtube.com/user/ClashofClansKorea\" target=\"_blank\">유튜브</a>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id = \"userinfo-container\">\r\n");
      out.write("\t\t\t<div id = \"userInfo\">\r\n");
      out.write("\t\t\t\t<div id = \"user-Info-head\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id = \"uesr-Info-head-up\">\r\n");
      out.write("\t\t\t\t\t\t<img id =\"logo\"  src=\"img/TH13.png\"  width=\"10%\" height=\"auto\" style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t<span color=\"#fff\" class=\"sc-ifAKCX sc-eqIVtm ccYABU\" id=\"userName2\">");
      out.print(userName);
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id = \"showbtn\" value=\"입력\" onclick=\"show();\" style=\"width: 70px\" />\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id = \"headdiv\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"textbox2\" type=\"text\" placeholder=\"골드\"  id=\"inputGold\">  \r\n");
      out.write("\t\t\t\t\t\t<input class=\"textbox2\" type=\"text\" placeholder=\"엘릭서\"  id=\"inputElixir\">  \r\n");
      out.write("\t\t\t\t\t\t<input class=\"textbox2\" type=\"text\" placeholder=\"다크 엘릭서\"  id=\"inputDarkElixir\">  \r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"registerFunction2();\"  value=\"등 록\" id=\"button-blue\"/>\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id = \"hidebtn\" value=\"입력중지\" onclick=\"hide();\" style=\"width: 70px\" />\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id = \"user-Info_body\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"background-color: #fafafa; text-align: center;\">플레이어</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"background-color: #fafafa; text-align: center;\">골 드</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"background-color: #fafafa; text-align: center;\">엘릭서</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"background-color: #fafafa; text-align: center;\">다크 엘릭서</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"ajaxTable\">\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id = \"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer-intro\">만든이 : <a href=\"wlxo0401@gmail.com\"> wlxo0401@gmail.com</a><span class=\"bar\"></span>소개 : 연습용 개인 사이트입니다.</div>\r\n");
      out.write("\t\t\t<div class=\"copyright\">Copyright© KimJiTae</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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