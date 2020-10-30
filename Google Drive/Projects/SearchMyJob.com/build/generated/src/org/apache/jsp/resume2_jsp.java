package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class resume2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <title>Candidate Resume</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0px;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("    width:50%;\n");
      out.write("    height: 60px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 25px;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size:30px;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("    color: #00a2d3;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: #3f3f3f;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

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

            rs = st.executeQuery("select Name,Gender,dob,College,password,CollegePhone,CollegeEmail,branch,MarkDegree,degree,username,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
            s15="",s16="",s18="";
            while (rs.next()) {
                s1 = rs.getString("Name");
                s2 = rs.getString("Gender");
                s3 = rs.getString("Dob");
                s4 = rs.getString("College");
                s5 = rs.getString("CollegePhone");
                s6 = rs.getString("CollegeEmail");
                s7 = rs.getString("markDegree");
                s8 = rs.getString("degree");
                s9 =  rs.getString("Email");
                s10 = rs.getString("Telephone");
                s11 = rs.getString("Address");
                s12 = rs.getString("State");
                s13 = rs.getString("Pin");
                s14 = rs.getString("sel_cat");
                s15 = rs.getString("branch");
                s16 = rs.getString("username");
                String s17=rs.getString("password");
        
      out.write("\n");
      out.write("        <table border=\"0\" width=\"100%\" >\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">Username &rArr; ");
      out.print(s16 );
      out.write(" </td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name &rArr; ");
      out.print(s1 );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>Gender &rArr; ");
      out.print(s2 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date_Of_Birth &rArr; ");
      out.print(s3 );
      out.write(" </td>\n");
      out.write("                <td>College Name &rArr; ");
      out.print(s4 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>College Phone &rArr; ");
      out.print(s5 );
      out.write(" </td>\n");
      out.write("                <td>College E_mail &rArr; ");
      out.print(s6 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Degree &rArr; ");
      out.print(s8 );
      out.write(" </td>\n");
      out.write("                <td>Branch &rArr; ");
      out.print(s15 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Marks &rArr; ");
      out.print(s7 );
      out.write("% </td>\n");
      out.write("                <td>Email_id &rArr; ");
      out.print(s9 );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Telephone &rArr; ");
      out.print(s10 );
      out.write(" </td>\n");
      out.write("                <td>Address &rArr; ");
      out.print(s11 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>State &rArr; ");
      out.print(s12 );
      out.write("  </td>\n");
      out.write("                <td>Pin Code &rArr; ");
      out.print(s13 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Category &rArr; ");
      out.print(s14 );
      out.write(" </td>\n");
      out.write("                <td>Password &rArr; ");
      out.print(s17 );
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("                             ");

            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><a href=\"AdminHomePage.jsp\">go back</a></td>\n");
      out.write("            </tr>\n");
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
