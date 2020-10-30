package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dispresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #669999;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("body a{\r\n");
      out.write("    color: black;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<p><font color=\"#CC0000\" size=\"5\">\r\n");
      out.write("  ");

        //String mark = session.getAttribute("mark").toString();
        //String uname = session.getAttribute("s1").toString();
       // out.println("Your ID  is: " + uname + "You got  "+ mark + " Mark Out of");
		 

      out.write("\r\n");
      out.write("<center><br/><br/><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("  Your Exam completed....\r\n");
      out.write("  <br></center>\r\n");
      out.write("<center><p>Final Result is published very soon......</p>\r\n");
      out.write("    </center>\r\n");
      out.write("  </font></p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p style=\"text-align: center\"><strong><a href=\"CandidateHomePage.jsp\">Goto Home</a></strong></p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
