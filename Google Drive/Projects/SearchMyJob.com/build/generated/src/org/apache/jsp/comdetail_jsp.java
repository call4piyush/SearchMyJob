package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class comdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style4.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"100%\" height=\"89\" border=\"0\" align=\"center\" bgcolor=\"#3F3F3F\">\n");
      out.write("      <tr>\n");
      out.write("          <td class=\"d\" colspan=\"7\">Company Details</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("       <td class=\"style\">Name</td>\n");
      out.write("       <td class=\"style\">Address</td>\n");
      out.write("       <td class=\"style\">Post</td>\n");
      out.write("       <td class=\"style\">Criteria</td>\n");
      out.write("       <td class=\"style\">Email</td>\n");
      out.write("       <td class=\"style\">ContactNo:</td>\n");
      out.write("       <td class=\"style\">Cutoff % </td>\n");
      out.write("\n");
      out.write("             ");


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
    //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select * from Com");
        while(rs.next())
            {
   
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td class=\"style1\" >\n");
      out.write("        ");
 out.println(rs.getString("CName"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CAddress"));
      out.write("\n");
      out.write("       </td>\n");
      out.write("       <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CPost"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CCriteria"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CEmail"));
      out.write("\n");
      out.write("       </td>\n");
      out.write("        <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CContact"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"style1\">\n");
      out.write("          ");
 out.println(rs.getString("CCutoff"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("      ");

      }//while
      }//try
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\n");
      out.write("         </table>\n");
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
