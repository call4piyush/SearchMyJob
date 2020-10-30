package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class canheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <link rel=\"stylesheet\" href=\"canhead/style2.css\">\n");
      out.write("       <style>\n");
      out.write("         \n");
      out.write(".t{\n");
      out.write("    background-image: url(\"our_recruiters_3.jpg\");\n");
      out.write("   border-radius:10px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("       </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"100%\" border=\"0\" class=\"t\" >\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <td height=\"250\" >\n");
      out.write("            <div id=\"header-wrapper\">\n");
      out.write("            <div id=\"header\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("                            <h9><font color=\"white\" ></font></h9>\n");
      out.write("                            <div class=\"o\"><a href=\"index.jsp\"><font color=\"#ddb421\">Home Page</font ></a></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div id=\"social\">\n");
      out.write("\t\t\t<div>\n");
      out.write("                            <ul class=\"contact1\">\n");
      out.write("                                \n");
      out.write("\t\t\t\t\t<h3><span>Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\n");
      out.write("                                            </span></h3>\n");
      out.write("                                \n");
      out.write("                                </ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("                </div></div>\n");
      out.write("                                        \n");
 try {

            String c1 = (String) session.getAttribute("s1");


      out.write("\n");
      out.write("<p><marquee> ");

    out.println("Welcome to "+c1);


      out.write("</marquee></p>\n");
      out.write("                                  ");
// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"menup\" class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t<div class=\"current_page_item\">\n");
      out.write("                                \n");
      out.write("\t\t\t\t<li><a href=\"CanEditProfile.jsp\" accesskey=\"1\" title=\"Edit Profile\">Edit Profile</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"CanChangePassword.jsp\" accesskey=\"2\" title=\"Change Password\">Change Password</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"CompanyDetails.jsp\" accesskey=\"3\" title=\"company details\">company details</a></li>\n");
      out.write("                                <li><a href=\"ExamConditions.jsp\" accesskey=\"4\" title=\"Exam\">Exam</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"examresult.jsp\" accesskey=\"5\" title=\"Exam Result\">Exam Result</a></li>\n");
      out.write("                                <li><a href=\"logout.jsp\" accesskey=\"1\" title=\"Log Out\">Log Out</a></li>\n");
      out.write("                        </div></ul>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("     <tr>\n");
      out.write("         <td >\n");
      out.write("             \n");
      out.write("         </td>\n");
      out.write("     </tr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("                    \n");
      out.write("     </body>\n");
      out.write("</html>\n");
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
