package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class EditJob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            body{\r\n");
      out.write("                background-color: #3f3f3f;\r\n");
      out.write("}\r\n");
      out.write("            .ji{\r\n");
      out.write("                color: white;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("}\r\n");
      out.write("input[type=text]{\r\n");
      out.write("    margin-left: 100px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-shadow: 1px 1px 1px black;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.16);\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 16px;\r\n");
      out.write("  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write(" border-radius:25px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                width: 170px;\r\n");
      out.write("                float: none;\r\n");
      out.write("                background-color: #3F3F3F;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-family: times new roman;\r\n");
      out.write("                text-transform: none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin:0px\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\">\r\n");
      out.write("        \r\n");
      out.write("          <tr>\r\n");
      out.write("              <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "comheader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("            <td  valign=\"top\">\r\n");
      out.write("                ");
 try {

                String jid =request.getParameter("jid");
                String jpost =request.getParameter("post");
                String jcriteria =request.getParameter("criteria");
                String jvac =request.getParameter("vacancies");
                String jsal =request.getParameter("salary");
                String jdate =request.getParameter("lastdate");
                
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
                //Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();  
                rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                while (rs.next())
                    {  
                    jid=rs.getString("JobId");
                    jpost=rs.getString("Post");
                    jcriteria=rs.getString("Criteria");
                    jvac=rs.getString("NoOfVacancies");
                    jsal=rs.getString("Salary");
                    jdate=rs.getString("LastDate");
      
                    
      out.write("\r\n");
      out.write("                <form method=\"post\" action=\"savejobedit.jsp\">\r\n");
      out.write("  <table width=\"700\" height=\"276\" border=\"0\" align=\"center\">\r\n");
      out.write("                \r\n");
      out.write("  <tr >\r\n");
      out.write("      <td colspan=\"2\" class=\"ji\">Job Details</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Job ID</td>\r\n");
      out.write("    <td ><input name=\"jobid\" type=\"text\" id=\"jobid\" size=\"35\" maxlength=\"25\" value=\"");
      out.print(jid);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Post</td>\r\n");
      out.write("    <td ><input name=\"post\" type=\"text\" id=\"post\"  value=\"");
      out.print(jpost);
      out.write("\" size=\"35\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Criteria</td>\r\n");
      out.write("    <td ><input name=\"criteria\" type=\"text\" id=\"criteria\" value=\"");
      out.print(jcriteria);
      out.write("\" size=\"35\" maxlength=\"25\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Vacancies</td>\r\n");
      out.write("    <td ><input name=\"vacancies\" type=\"text\" id=\"vacancies\" size=\"35\" maxlength=\"25\" value=\"");
      out.print(jvac);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Salary/Annum</td>\r\n");
      out.write("    <td ><input name=\"salary\" type=\"text\" id=\"salary\" value=\"");
      out.print(jsal);
      out.write("\" size=\"35\" maxlength=\"25\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"ji\">Last Date</td>\r\n");
      out.write("    <td ><input name=\"lastdate\" type=\"text\" id=\"lastdate\" value=\"");
      out.print(jdate);
      out.write("\" size=\"35\" maxlength=\"25\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr >\r\n");
      out.write("    <td height=\"31\" colspan=\"2\"><div align=\"center\">\r\n");
      out.write("      <input type=\"submit\" name=\"button\" id=\"button\" value=\"Edit Details\">\r\n");
      out.write("    </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\t\r\n");
 }//while
     
}
      catch(Exception e)
      {
         out.println(e); 
      }

      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>  \r\n");
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
