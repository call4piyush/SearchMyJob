package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class saveComPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>password change successfully</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            table{\r\n");
      out.write("                margin-top:230px;\r\n");
      out.write("}\r\n");
      out.write("            td{color: bisque;\r\n");
      out.write("               text-align: center;\r\n");
      out.write("               height: 40px;\r\n");
      out.write("               font-size: 25px;\r\n");
      out.write("               padding-top:0px;\r\n");
      out.write("               margin-bottom: 52px;\r\n");
      out.write("}\r\n");
      out.write("td a{\r\n");
      out.write("    color:white;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#3F3F3F\">\r\n");
      out.write("\r\n");
      out.write("        <table align=\"center\" border=\"0\" >\r\n");
      out.write("       <tr>    ");
 try {
            String c2 = request.getParameter("user");
            // session.getAttribute("c1", c1);
            String c1 = request.getParameter("pass");
            String newpass = request.getParameter("newpass");
            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);

            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          //  Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");

            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            String sql1 = "Update Login set Password='" + newpass + "'where username='" + c2 + "'and password='" + c1 + "'";
            //String sql2 = "Update Com set CPassword='" + newpass + "'where CUsername='" + c2 + "'and CPassword='" + c1 + "'";
            //out.println(sql1);
            st.executeUpdate(sql1);
            //st.executeUpdate(sql2);
            
      out.write("\r\n");
      out.write("           <td>\r\n");
      out.write("                ");
out.println("You have Successfully Changed!!!");
      out.write("\r\n");
      out.write("             </td>\r\n");
      out.write("                  ");
   } catch (Exception e) {
            out.println(e);
        }
            
      out.write("\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("               <td >\r\n");
      out.write("        <a href=\"CompanyHomePage.jsp\"><strong>Goto Home</strong></a>\r\n");
      out.write("         </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </body>\r\n");
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
