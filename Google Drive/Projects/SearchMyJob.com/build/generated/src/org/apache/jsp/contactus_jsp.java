package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Us</title>\n");
      out.write("        <style>\n");
      out.write("            o{color: wheat;\n");
      out.write("            font-size: 35px;\n");
      out.write("           \n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                color: #c7b436;\n");
      out.write("              text-align: right;\n");
      out.write("}\n");
      out.write("h{ color: white;\n");
      out.write("    text-align: left;\n");
      out.write("   font-size: 20px;\n");
      out.write("}\n");
      out.write("            p1{\n");
      out.write("                color: #c7b436;\n");
      out.write("              font-size: 20PX;\n");
      out.write("}\n");
      out.write("p1 a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: turquoise;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("       font-size: 25PX;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#3F3F3F\">\n");
      out.write("        <table height=\"700\"  width=\"100%\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("    <td height=\"250\" colspan=\"\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <tr >\n");
      out.write("          <td height=\"10\">\n");
      out.write("              </td>\n");
      out.write("      </tr>\n");
      out.write("<tr >\n");
      out.write("          <td height=\"10\">\n");
      out.write("     <center>   <o>   ONLINE RECUITMENT SYSTEM </o> </center> </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr >\n");
      out.write("          <td height=\"10\">\n");
      out.write("              </td>\n");
      out.write("      </tr>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td ><CENTER><P1>H R INSTITUTE OF TECHNOLOGY, GHAZIABAD </P1>\n");
      out.write("            <br/><br/>\n");
      out.write("            \n");
      out.write("            <P1>\n");
      out.write("                <a href=\"contact.jsp\" title=\"Ask Question for Admin\">ask for any query</a>\n");
      out.write("            </P1>\n");
      out.write("        </CENTER>\n");
      out.write("        </td>\n");
      out.write("</tr>\n");
      out.write("<tr>       <td class=\"tf\" width=\"100%\">\n");
      out.write("\n");
      out.write(" <p>Piyush Joshi&nbsp;&nbsp;(1019410071)</p>\n");
      out.write(" <p>Nakul Dev&nbsp;&nbsp; (1019410062)</p>\n");
      out.write(" <p>Kushal Tiwari&nbsp;&nbsp; (1019410053)</p>\n");
      out.write(" <p>Keshav Kumar Bachchas&nbsp;&nbsp; (1019410050)</p>\n");
      out.write("      </td>\n");
      out.write("    \n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
