package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>www.SearchMyJob.com</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .hu{\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("\t\tfunction check()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar a= document.form1.examid.value;\n");
      out.write("\t\t\tvar b= document.form1.cutoff.value;\n");
      out.write("\t\t\tvar c=document.form1.examname.value;\n");
      out.write("\t\t\tif(document.form1.examid.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Exam ID\");\n");
      out.write("                //a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(a))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Integer\");\n");
      out.write("               // a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\t\t\tif(document.form1.examname.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Exam Name\");\n");
      out.write("                //c.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\t\t\tif(document.form1.cutoff.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Cutoff mark\");\n");
      out.write("             //   b.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(b))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Integer\");\n");
      out.write("               // b.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\t\t\telse if(parseInt(b)<0||parseInt(b)>100)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter cutoff in %\");\n");
      out.write("                //b.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <table width=\"100%\" border=\"1\" >\n");
      out.write("            <tr>\n");
      out.write("                <td ></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td</td>\n");
      out.write("                <td width=\"961\" bgcolor=\"#3f3f3f\"  valign=\"top\">\n");
      out.write("                    <table width=\"277\" height=\"144\" border=\"1\" align=\"center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" class=\"hu\">\n");
      out.write("                                 Exam Creation\n");
      out.write("                           </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        ");

        String jid = request.getParameter("jobid");
        try {
        	 Connection con=null;
    		    String url = "jdbc:mysql://localhost:3306/";
    		    String dbName = "online";
    		    String driverName = "com.mysql.jdbc.Driver";
    		    String userName = "root";
    		    String password = "root";
    		    ResultSet rs,rs1;
    		    Class.forName(driverName).newInstance();
    		    con = DriverManager.getConnection(url+dbName, userName, password);
            if (jid == null) {


               // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                        
      out.write("\n");
      out.write("                        <form name=\"form2\" action=\"newjsp1.jsp\">\n");
      out.write("                            <td width=\"163\" height=\"42\" class=\"hu\">Select a JobID </td>\n");
      out.write("                            <td width=\"104\">\n");
      out.write("                                <label>\n");
      out.write("                                    <select name=\"jobid\">\n");
      out.write("                                        ");
      rs = st.executeQuery("select * from job_details");
                                    String s1 = null;
                                    // String s2=null;
                                    while (rs.next()) {
                                        s1 = rs.getString("JobId");
                                        //    s2=rs.getString("Post");

                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\n");
      out.write("                                        ");
 }//while 
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </label>\n");
      out.write("                            </td>\n");
      out.write("                            <tr><td> <div align=\"center\">\n");
      out.write("                                        <input type=\"submit\" value=\"Show Details\">\n");
      out.write("                            </div></td></tr>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                          }//if
                          else {
                              jid = request.getParameter("jobid");
                              //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                             // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                              Statement st = con.createStatement();
                              Statement st2 = con.createStatement();
                               rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                              String s2 = null;
                              while (rs.next()) {
                                  s2 = rs.getString("post");

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><span class=\"style19\">Post Name :</span></td>\n");
      out.write("                            <td>");
      out.print(s2);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <p>&nbsp;</p>\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"saveexamdetails.jsp\" onSubmit=\"return check()\">\n");
      out.write("                        <table width=\"318\" height=\"166\" border=\"1\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"138\" height=\"40\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Exam ID</strong></div></td>\n");
      out.write("                                <td width=\"164\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"examid\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"40\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Exam Name </strong></div></td>\n");
      out.write("                                <td bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"examname\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"41\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Cutoff %</strong></div></td>\n");
      out.write("                                <td bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"cutoff\"></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"33\" colspan=\"2\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\">\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Submit\">\n");
      out.write("                                </div>        </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                }//while
                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", s2);
            }//else

        }//try
        catch (Exception e) {
            out.println(e);
        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
