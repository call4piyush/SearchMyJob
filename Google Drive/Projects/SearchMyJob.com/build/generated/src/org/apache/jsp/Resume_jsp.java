package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class Resume_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: x-large;\r\n");
      out.write("\tcolor: #B0D0D7;\r\n");
      out.write("            }\r\n");
      out.write("            .style2 {\r\n");
      out.write("                font-family: Geneva, Arial, Helvetica, sans-serif;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #006699;\r\n");
      out.write("}\r\n");
      out.write(".style4 {color: #000000; }\r\n");
      out.write(".style10 {color: #000000; font-weight: bold; }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 
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
       // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
        try {
            String uid = request.getParameter("uid");
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            
            rs = st.executeQuery("select Name,Gender,dob,College,CollegePhone,CollegeEmail,MarkDegree,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
            s15="",s16="",s17="",s18="";
            while (rs.next()) {
                s1 = rs.getString("Name");
                s2 = rs.getString("Gender");
                s3 = rs.getString("Dob");
                s4 = rs.getString("College");
                s5 = rs.getString("CollegePhone");
                s6 = rs.getString("CollegeEmail");
                s7 = rs.getString("markDegree");
                
                s9 = rs.getString("Email");
                s10 = rs.getString("Telephone");
                s11 = rs.getString("Address");
                s12 = rs.getString("State");
                s13 = rs.getString("Pin");
                s14 = rs.getString("sel_cat");
            
        
      out.write("\r\n");
      out.write("        <table width=\"952\" height=\"649\" border=\"0\" align=\"center\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\"><div align=\"center\" class=\"style1\">Resume</div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"228\">&nbsp;</td>\r\n");
      out.write("                <td width=\"201\" height=\"37\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Name\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;\r\n");
      out.write("              :</span></div></td>\r\n");
      out.write("              <td width=\"86\">&nbsp;</td>\r\n");
      out.write("              <td width=\"419\"><span class=\"style10\">\r\n");
      out.write("              <label>\r\n");
      out.write("              </span>\r\n");
      out.write("                <div align=\"left\" class=\"style10\">");
      out.print(s1);
      out.write("</div>\r\n");
      out.write("                  <span class=\"style10\">\r\n");
      out.write("                  </label>              \r\n");
      out.write("                  </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"38\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Gender\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;  &nbsp;:</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s2);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"36\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Date of Birth\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s3);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"36\"><div align=\"left\" class=\"style4\"><span class=\"style2\">College Name\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;: </span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s4);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"38\"><div align=\"left\" class=\"style4\"><span class=\"style2\">College Phone\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;: </span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s5);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"42\"><div align=\"left\" class=\"style4\"><span class=\"style2\">College Email\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;: </span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s6);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"40\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Degree\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;:</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s7);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"38\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Mark\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s8);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"37\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Email\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><strong> : </strong></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s9);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>               \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"45\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Telephone\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; : </span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s10);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"39\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Address\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><strong> :</strong></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s11);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"37\"><div align=\"left\" class=\"style4\"><span class=\"style2\">State\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              :</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s12);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"44\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Pincode\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              :</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s13);
      out.write("</div>\r\n");
      out.write("                    <span class=\"style10\">\r\n");
      out.write("                    </label>                \r\n");
      out.write("                    </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"41\"><div align=\"left\" class=\"style4\"><span class=\"style2\">Category\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              :</span></div></td>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("                <td><span class=\"style10\">\r\n");
      out.write("                <label>\r\n");
      out.write("                </span>\r\n");
      out.write("                  <div align=\"left\" class=\"style10\">");
      out.print(s14);
      out.write("</div>\r\n");
      out.write("                  <span class=\"style10\">\r\n");
      out.write("                  </label>\r\n");
      out.write("                </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
