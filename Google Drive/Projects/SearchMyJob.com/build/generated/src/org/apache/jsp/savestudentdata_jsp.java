package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class savestudentdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> User Register Sucessfully </title>\n");
      out.write("<style>\n");
      out.write("    b{\n");
      out.write("        color: white;\n");
      out.write("        font-size: 40px;\n");
      out.write("}\n");
      out.write("p,a{\n");
      out.write("    color: darkred;\n");
      out.write("    font-size: 25px;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: #3F3F3F;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("  ");
 try
          {

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
           Statement st2=con.createStatement();
           Statement st3=con.createStatement();
           String status="s";

           st.executeUpdate("insert into details2 values('"+request.getParameter("name")+"','"+request.getParameter("gender")+"','"+request.getParameter("dob")+"','"+request.getParameter("college")+"','"+request.getParameter("collegephone")+"','"+request.getParameter("collegeemail")+"','"+request.getParameter("branch")+"','"+request.getParameter("markDegree")+"','"+request.getParameter("degree")+"','"+request.getParameter("username")+"','"+request.getParameter("password")+"','"+request.getParameter("email")+"','"+request.getParameter("telephone")+"','"+request.getParameter("address")+"','"+request.getParameter("state")+"','"+request.getParameter("pin")+"','"+request.getParameter("sel_cat")+"')");
		   st2.executeUpdate("insert into login values('"+request.getParameter("username")+"','"+request.getParameter("password")+"','"+status+"')");
          if(request.getParameter("sel_cat").equals("Experienced"))
		   {
           st3.executeUpdate("insert into experienced values('"+request.getParameter("username")+"','"+request.getParameter("expyears")+"','"+request.getParameter("company")+"','"+request.getParameter("designation")+"','"+request.getParameter("salary")+"','"+request.getParameter("comAddress")+"')");
		   }
                      st.close();
                      st2.close();
                      st3.close();
  ;         }

           catch(Exception e)
                   {
               out.println(e);
                   }


      out.write("\n");
      out.write("                \n");
      out.write("        <table bgcolor=\"#3F3F3F\" border=\"0\" width=\"100%\">\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"645\"><center>\n");
      out.write("                <b>  You have registered successfully!!!</b>\n");
      out.write("                <p><a href=\"login.jsp\">Go Forward</a></p>\n");
      out.write("            </center>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
