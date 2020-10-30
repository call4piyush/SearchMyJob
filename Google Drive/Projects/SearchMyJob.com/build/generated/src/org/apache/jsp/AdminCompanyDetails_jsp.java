package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class AdminCompanyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("       <style>\r\n");
      out.write("          .tyu{ color: #ffffff;\r\n");
      out.write("                background-color:#55503b;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                border-radius:8px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-transform: uppercase;\r\n");
      out.write("                width: 120px;\r\n");
      out.write("                border-style: dotted;\r\n");
      out.write("                border-color: #ddb421;\r\n");
      out.write("                 border-width: 1px;\r\n");
      out.write("          }\r\n");
      out.write("          .dg{\r\n");
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
      out.write(".dg a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color:#3F3F3F;\r\n");
      out.write("}\r\n");
      out.write("       </style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table width=\"100%\" height=\"\" border=\"1\" bgcolor=\"#3f3f3f\">\r\n");
      out.write("      <tr>\r\n");
      out.write("          <td class=\"tyu\" colspan=\"8\">Company Details </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"tyu\">Company Name</td>\r\n");
      out.write("        <td class=\"tyu\">Address</td>\r\n");
      out.write("        <td class=\"tyu\">Post</td>\r\n");
      out.write("        <td class=\"tyu\">Username</td>\r\n");
      out.write("        <td class=\"tyu\">Phone</td>\r\n");
      out.write("        <td class=\"tyu\">Email ID</td>\r\n");
      out.write("        <td class=\"tyu\">Cutoff % </td>\r\n");
      out.write("        <td class=\"tyu\">Delete</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      
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
    //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
      rs=st.executeQuery("select * from Com");
      String cname;
      String name="",add="",post="",uname="",phone="",email="",cutoff="";

        while(rs.next())
            {
            name=rs.getString("CName");
            add=rs.getString("CAddress");
            post=rs.getString("CPost");
            uname=rs.getString("CUsername");
            phone=rs.getString("CContact");
            email=rs.getString("CEmail");
            cutoff=rs.getString("CcutOff");
      
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"22\" class=\"dg\">\r\n");
      out.write("          ");
      out.print(name);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(add);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(post);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(uname);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(phone);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(email);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
      out.print(cutoff);
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td class=\"dg\">\r\n");
      out.write("          ");
 out.println("<a href='ComDelete.jsp?id="+uname+"'>Delete</a>");
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("   \t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
