package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class AdminCandidateDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>www.SearchMyJob.com</title>\r\n");
      out.write("<style>\r\n");
      out.write("    .rty{\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("                background-color:#55503b;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                border-radius:8px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-transform:capitalize;\r\n");
      out.write("                width: 120px;\r\n");
      out.write("                border-style: dotted;\r\n");
      out.write("                border-color: #ddb421;\r\n");
      out.write("                 border-width: 1px;\r\n");
      out.write("}\r\n");
      out.write(".tyu{\r\n");
      out.write("        color: black;\r\n");
      out.write("                                border-width: 1px;\r\n");
      out.write("               background-color:#d1c79d;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                border-radius:8px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-transform:none;\r\n");
      out.write("                width: 120px;\r\n");
      out.write("                border-style: dotted;\r\n");
      out.write("                border-color: #ddb421;\r\n");
      out.write("                 border-left-style: double;\r\n");
      out.write("            }\r\n");
      out.write(".tyu a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color:orangered;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin:0px\">\r\n");
      out.write("\r\n");
      out.write("    <table bgcolor=\"#3f3f3f\" width=\"100%\" height=\"109\" border=\"1\" align=\"left\">\r\n");
      out.write("          <tr>\r\n");
      out.write("              <td class=\"rty\" colspan=\"8\">Candidate Details </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"rty\">Username</td>\r\n");
      out.write("            <td class=\"rty\">password</td>\r\n");
      out.write("            <td class=\"rty\">Name</td>\r\n");
      out.write("            <td class=\"rty\">Phone</td>\r\n");
      out.write("            <td class=\"rty\">Email_id</td>\r\n");
      out.write("            <td class=\"rty\">Category</td>\r\n");
      out.write("            <td class=\"rty\">Delete</td>\r\n");
      out.write("            <td class=\"rty\">Resume</td>\r\n");
      out.write("        </tr>\r\n");
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
    //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      //Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select Username,Name,Address,Telephone,Email,Sel_cat,password from Details2");
	  String  uid="",pass="",name="",phone="",email="",cat="";
        while(rs.next())
            {
			uid=rs.getString("Username");
			pass=rs.getString("password");
			name=rs.getString("name");
			phone=rs.getString("Telephone");
			email=rs.getString("Email");
			cat=rs.getString("Sel_cat");




      
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(uid);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(pass);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(name);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(phone);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(email);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\">");
      out.print(cat);
      out.write("</td>\r\n");
      out.write("          <td class=\"tyu\"><a href=\"Delete.jsp?uid=");
      out.print(uid);
      out.write("\">Delete</a></td>\r\n");
      out.write("          <td class=\"tyu\"><a href=\"resume2.jsp?uid=");
      out.print(uid);
      out.write("\">View</a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");

      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
