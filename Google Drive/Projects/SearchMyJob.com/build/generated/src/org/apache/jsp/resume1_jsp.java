package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class resume1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Candidate Resume</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            td{\n");
      out.write("                color:#990000;\n");
      out.write("                border-radius:10px;\n");
      out.write("                font-size: large;\n");
      out.write("                background-color:burlywood;\n");
      out.write("                height: 40px;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 25%;\n");
      out.write("}\n");
      out.write("td a{\n");
      out.write("    color:indigo;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#3f3f3f\" >\n");
      out.write("          ");

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

            rs = st.executeQuery("select Name,Gender,dob,College,CollegePhone,CollegeEmail,branch,MarkDegree,degree,username,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
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
                s8 = rs.getString("degree");
                s9 =  rs.getString("Email");
                s10 = rs.getString("Telephone");
                s11 = rs.getString("Address");
                s12 = rs.getString("State");
                s13 = rs.getString("Pin");
                s14 = rs.getString("sel_cat");
                s15 = rs.getString("branch");
                s16 = rs.getString("username");

        
      out.write("\n");
      out.write("        <table border=\"0\" align=\"center\" height=\"100%\" width=\"50%\" >\n");
      out.write("            <tr><td colspan=\"2\">resume</td></tr>\n");
      out.write("            <tr><td colspan=\"2\">username is ");
      out.print(s16);
      out.write("</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                 <td>");
      out.print(s1);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>gender</td>\n");
      out.write("                 <td>");
      out.print(s2);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>date_of_birth</td>\n");
      out.write("                 <td>");
      out.print(s3);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>college Name</td>\n");
      out.write("                 <td>");
      out.print(s4);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>college phone</td>\n");
      out.write("                 <td>");
      out.print(s5);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>college email</td>\n");
      out.write("                 <td>");
      out.print(s6);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>branch</td>\n");
      out.write("                 <td>");
      out.print(s15);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>marks</td>\n");
      out.write("                 <td>");
      out.print(s7);
      out.write("%</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>degree</td>\n");
      out.write("                 <td>");
      out.print(s8);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>email_id</td>\n");
      out.write("                 <td>");
      out.print(s9);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>telephone</td>\n");
      out.write("                 <td>");
      out.print(s10);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>address</td>\n");
      out.write("                 <td>");
      out.print(s11);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>state</td>\n");
      out.write("                 <td>");
      out.print(s12);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>pin code</td>\n");
      out.write("                 <td>");
      out.print(s13);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>category</td>\n");
      out.write("                 <td>");
      out.print(s14);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("                 ");

            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td colspan=\"2\"><a href=\"AdminHomePage.jsp\">&laquo; go to home</a></td>\n");
      out.write("\n");
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
