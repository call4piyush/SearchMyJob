package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class savestudentedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("              <style>\r\n");
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
      out.write("     <body bgcolor=\"#3F3F3F\">\r\n");
      out.write("\r\n");
      out.write("        <table align=\"center\" border=\"0\" >\r\n");
      out.write("       <tr>   \r\n");
      out.write("        ");

        try {
            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");
            String old_cat = request.getParameter("category");
            String new_cat = request.getParameter("cat");
            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
             
          //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();

            String name = request.getParameter("name");
            String college = request.getParameter("college");
            String coph = request.getParameter("collegephone");
            String cemail = request.getParameter("collegeemail");
            String degree = request.getParameter("markDegree");
            String email = request.getParameter("email");
            String ph = request.getParameter("telephone");
            String add = request.getParameter("address");
            String state = request.getParameter("state");
            String pin = request.getParameter("pin");
            String expyears = request.getParameter("expyears");
           
            rs = null;
            if (old_cat.equalsIgnoreCase("Fresher") && new_cat == null) {
                new_cat = "Fresher";
            } else if (old_cat.equalsIgnoreCase("Experienced")) {
                new_cat = "Experienced";
            }
            String a = "Update Details2 set Name='" + name + "',College='" + college +
                    "',CollegePhone='" + coph + "',Colle='" + cemail +
                    "',markDegree='" + degree + "',email='" + email + "',Telephone='" +
                    ph + "',Address='" + add + "',State='" + state +
                    "',Pin='" + pin + "',sel_cat='" + new_cat + "' where Username='" + c1 + "'";
            st.executeUpdate(a);
            String q = null;
            if (old_cat.equalsIgnoreCase("Fresher") && new_cat.equalsIgnoreCase("Experienced")) {
                q = "insert into Experienced values('" + c1 + "','" + request.getParameter("expyears") +
                        "','" + request.getParameter("company") + "','" + request.getParameter("designation") +
                        "','" + request.getParameter("salary") + "','" + request.getParameter("comAddress") +
                        "')";
            } else if (old_cat.equalsIgnoreCase("Experienced")) {
                q = "Update Experienced set Exp_Year='" + request.getParameter("expyears") + "',Company='" +
                        request.getParameter("company") + "',Designation='" + request.getParameter("designation") +
                        "',Salary='" + request.getParameter("salary") + "',ComAddress='" + request.getParameter("comAddress") +
                        "'where Username='" + c1 + "'";
            }
            if (q != null) {
                st2.executeUpdate(q);
            }


        
      out.write("\r\n");
      out.write("        <td>");
out.println("You have Successfully Edited!!!");
      out.write("</td>\r\n");
      out.write("        ");

        } //try
        catch (Exception e) {
            out.println(e);
        }
        
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("               <td >\r\n");
      out.write("        <a href=\"CandidateHomePage.jsp\"><strong>Goto Home</strong></a>\r\n");
      out.write("         </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
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
