package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"header/style2.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0px;\">\n");
      out.write("        <table width=\"100%\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <td height=\"250\" >\n");
      out.write("            <div id=\"header-wrapper\">\n");
      out.write("            <div id=\"header\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("                            <h9><font color=\"white\">recruitment</font></h9>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div id=\"social\">\n");
      out.write("\t\t\t\t<ul class=\"contact1\">\n");
      out.write("\t\t\t\t\t<h3><span>Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\n");
      out.write("                                            </span></h3>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"menuu\" class=\"containeru\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t<div class=\"current_page_itemu\">\n");
      out.write("                            <li><a href=\"AdminHomePage.jsp\" accesskey=\"1\" title=\"\">home</a></li>\n");
      out.write("                            <li><a href=\"admincandetails.jsp\" accesskey=\"1\" title=\"\">Candidate Details</a></li>\n");
      out.write("                            <li><a href=\"admincomdetails.jsp\" accesskey=\"1\" title=\"\">Company Details</a></li>\n");
      out.write("                            <li><a href=\"AdminChangePassword.jsp\" accesskey=\"1\" title=\"\">Change Password</a></li>\n");
      out.write("                            <li><a href=\"totaladminresult.jsp\" accesskey=\"2\" title=\"\">Results</a></li>\n");
      out.write("                            <li><a href=\"logout.jsp\" accesskey=\"3\" title=\"\">Log out</a></li>\n");
      out.write("\t\t\t\n");
      out.write("                        </div></ul>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("        </table>\n");
      out.write("     </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
