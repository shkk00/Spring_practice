/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-21 05:47:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.layout.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainFooter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write(" <!--policy email fSite-->\r\n");
      out.write("\t<div class=\"footLinkWrap\">\r\n");
      out.write("    \t<div class=\"footLink\">\r\n");
      out.write("        \t<div class=\"link\">\r\n");
      out.write("        \t\t<div class=\"english_page\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index/engindex.do\">English</a></div>\r\n");
      out.write("            \t<div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/centerintro/info/centerGuide.do\">이용안내</a></div>\r\n");
      out.write("                <div><a href=\"http://www.cdc.go.kr/CDC/contents/CdcKrContentView.jsp?cid=121345&menuIds=HOME006-MNU2808-MNU2993\" target=\"_blank\" rel=\"noopener noreferrer\"><font style=\"color: #F2CB61\">개인정보처리방침</font></a></div>\r\n");
      out.write("                <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/policy/copy.do\">저작권정책</a></div>\r\n");
      out.write("                <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/policy/viewer.do\">뷰어다운로드</a></div>\r\n");
      out.write("                <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/centerintro/mobile/mobileService.do\">모바일서비스</a></div>\r\n");
      out.write("                \r\n");
      out.write("\t            <div class=\"fSite\" style=\"padding:0 0 0 0;\">\r\n");
      out.write("\t                <div class=\"fSite_select\">\r\n");
      out.write("\t                    <span class=\"arr\"></span>\r\n");
      out.write("\t                    <select style=\"height:31px;\" onchange=\"window.open(value,'_blank');\">\r\n");
      out.write("\t                        <option value=\"http://cdc.go.kr/CDC/intro.html\"><a target=\"_blank\" href=\"http://cdc.go.kr/CDC/intro.html\">질병관리본부</a></option>\r\n");
      out.write("\t                        <option value=\"http://nih.go.kr/NIH_NEW/intro.html\"><a target=\"_blank\" href=\"http://nih.go.kr/NIH_NEW/intro.html\">국립보건연구원</a></option>\r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t                  </div>            \r\n");
      out.write("\t            </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--policy email fSite-->\r\n");
      out.write("    \r\n");
      out.write("    <!--foot txt-->\r\n");
      out.write("    <div class=\"foot\">\r\n");
      out.write("        \t<div class=\"foot1\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/main/foot01.PNG\" alt=\"질병관리본부\"></div>\r\n");
      out.write("        \t<div class=\"foot2\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/main/foot02.PNG\" alt=\"질병관리본부\"></div>\r\n");
      out.write("    \t<div>\r\n");
      out.write("            <div>\r\n");
      out.write("               \r\n");
      out.write("                <address>(28160) 충북 청주시 흥덕구 오송읍 오송생명2로 202 국립의과학지식센터</address><br>\r\n");
      out.write("\t\t\t\tTel : 043-249-3000 Fax : 043-249-3034 E-mail : <a href=\"mailto:ncmik@korea.kr\">ncmik@korea.kr</a><br>\r\n");
      out.write("                Copyright by NCMIK. All Rights Reserved.\r\n");
      out.write("        \t</div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--foot txt-->\r\n");
      out.write("</footer>\t\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
