package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class canexamresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write(".ro{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write(".lk{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-color: #b92d71;\r\n");
      out.write("    border-radius:20px;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("           ");

        String uname = session.getAttribute("s1").toString();
        String sql = "";
        Statement st;
        // out.println(uname);
        try {
            sql = "select * from Result where studentID='" + uname + "'";
            
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
           // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
            rs = st.executeQuery(sql);
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"lk\" border=\"1\" align=\"center\">\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td class=\"ro\">Student ID</td>\r\n");
      out.write("                            <td class=\"ro\">Exam ID</td>\r\n");
      out.write("                            <td class=\"ro\">Job ID</td>\r\n");
      out.write("                            <td class=\"ro\">Mark</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                        while (rs.next()) {
                            out.println("<tr>");
                            out.println("<td>" + rs.getString(1) + "</td>");
                            out.println("<td>" + rs.getString(2) + "</td>");
                            out.println("<td>" + rs.getString(3) + "</td>");
                            out.println("<td>" + rs.getString(4) + "</td>");

                            out.println("</tr>");
                        }
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");


        } catch (Exception ex) {
            out.println(ex.toString());
        }
                    
      out.write("\r\n");
      out.write("               \r\n");
      out.write("                    <table border=\"1\" class=\"lk\">\r\n");
      out.write("                        <tr><td height=\"150\">iofyoygiosyhgisoy</td></tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("    </body>\r\n");
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
