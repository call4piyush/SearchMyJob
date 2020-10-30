package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class savecanpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>www.SearchMyJob.com</title>\n");
      out.write("         <style>\n");
      out.write("            table{\n");
      out.write("                margin-top:230px;\n");
      out.write("}\n");
      out.write("            td{color: bisque;\n");
      out.write("               text-align: center;\n");
      out.write("               height: 40px;\n");
      out.write("               font-size: 25px;\n");
      out.write("               padding-top:0px;\n");
      out.write("               margin-bottom: 52px;\n");
      out.write("}\n");
      out.write("td a{\n");
      out.write("    color:white;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("       <body bgcolor=\"#3F3F3F\">\n");
      out.write("\n");
      out.write("        <table align=\"center\" border=\"0\" >\n");
      out.write("       <tr>  \n");
      out.write("          ");
try
          {
               String c2 = request.getParameter("user");
               // session.getAttribute("c1", c1);
                String c1 =request.getParameter("pass");
                
                Connection con=null;
       		    String url = "jdbc:mysql://localhost:3306/";
       		    String dbName = "online";
       		    String driverName = "com.mysql.jdbc.Driver";
       		    String userName = "root";
       		    String password = "root";
       		    ResultSet rs,rs1;
       		    Class.forName(driverName).newInstance();
       		    con = DriverManager.getConnection(url+dbName, userName, password);
          // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st=con.createStatement();
              st.executeUpdate("Update Login set Password='"+request.getParameter("newpass2")+"' where username='"+c2+"' and password='"+c1+"'");
              
      out.write("\n");
      out.write("          \n");
      out.write("          <td>You have successfully changed your Password</td>\n");
      out.write("\n");
      out.write("             ");
   }
        catch(Exception e)
                {
            out.println(e);
                }
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("               <td >\n");
      out.write("        <a href=\"CandidateHomePage.jsp\"><strong>Goto Home</strong></a>\n");
      out.write("         </td>\n");
      out.write("       </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
