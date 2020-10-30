package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class jobview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            .i{\n");
      out.write("                color: #ffffff;\n");
      out.write("                background-color:#55503b;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:8px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                width: 120px;\n");
      out.write("                border-style: dotted;\n");
      out.write("                border-color: #ddb421;\n");
      out.write("                 border-width: 1px;\n");
      out.write("            }\n");
      out.write("            .k{color: black;\n");
      out.write("                                border-width: 1px;\n");
      out.write("               background-color:#d1c79d;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:8px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                width: 120px;\n");
      out.write("                border-style: dotted;\n");
      out.write("                border-color: #ddb421;\n");
      out.write("                 border-left-style: double;\n");
      out.write("            }\n");
      out.write(".k a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color:#990000;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#3F3F3F\">\n");
      out.write("        <table width=\"100%\" height=\"87\" border=\"0\" align=\"center\" >\n");
      out.write("          <tr>\n");
      out.write("              <td colspan=\"8\" class=\"i\">Job Details</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"i\">Job ID</td>\n");
      out.write("            <td class=\"i\">Post</td>\n");
      out.write("            <td class=\"i\">Criteria</td>\n");
      out.write("            <td class=\"i\" >Vacancies</td>\n");
      out.write("            <td class=\"i\">Salary/Annum</td>\n");
      out.write("            <td class=\"i\">Last Date</td>\n");
      out.write("            <td class=\"i\">Edit</td>\n");
      out.write("            <td class=\"i\">Delete</td>\n");
      out.write("          </tr>\n");
      out.write("           ");

           Connection con=null;
  		    String url = "jdbc:mysql://localhost:3306/";
  		    String dbName = "online";
  		    String driverName = "com.mysql.jdbc.Driver";
  		    String userName = "root";
  		    String password = "root";
  		    ResultSet rs,rs1;
  		    Class.forName(driverName).newInstance();
  		    con = DriverManager.getConnection(url+dbName, userName, password);   // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      //Connection conn=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select * from job_details");
            String  jid="",jpost="",jcriteria="",jvac="",jsal="",jdate="";
        while(rs.next())
            {
			jid=rs.getString("JobId");
                        jpost=rs.getString("Post");
                        jcriteria=rs.getString("Criteria");
                        jvac=rs.getString("NoOfVacancies");
                        jsal=rs.getString("Salary");
                        jdate=rs.getString("LastDate");

      
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td class=\"k\">\n");
      out.write("         ");
      out.print(jid);
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"k\">\n");
      out.write("          ");
      out.print(jpost);
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"k\">\n");
      out.write("          ");
      out.print(jcriteria);
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"k\">\n");
      out.write("          ");
      out.print(jvac);
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td class=\"k\">\n");
      out.write("          ");
      out.print(jsal);
      out.write("\n");
      out.write("       </td>\n");
      out.write("        <td class=\"k\">\n");
      out.write("          ");
      out.print(jdate);
      out.write("\n");
      out.write("       </td>\n");
      out.write("       <td class=\"k\"><a href=\"EditJob.jsp?jid=");
      out.print(jid);
      out.write("\"><strong>Edit</strong></a></td>\n");
      out.write("       <td class=\"k\"><a href=\"DeleteJob.jsp?jid=");
      out.print(jid);
      out.write("\"><strong>Delete</strong></a></td>\n");
      out.write("      </tr>\n");
      out.write("\n");
      out.write("      ");

      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\n");
      out.write("\n");
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
