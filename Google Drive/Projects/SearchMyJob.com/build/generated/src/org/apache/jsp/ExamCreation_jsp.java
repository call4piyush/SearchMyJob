package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class ExamCreation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #FF0000;\r\n");
      out.write("            }\r\n");
      out.write("            .style7 {color: #CC3333; font-weight: bold; }\r\n");
      out.write("            .style14 {color: #006699}\r\n");
      out.write("            .style19 {color: #003366; font-weight: bold; }\r\n");
      out.write("            .style20 {color: #663366}\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("\t\tfunction check()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar a= document.form1.examid.value;\r\n");
      out.write("\t\t\tvar b= document.form1.cutoff.value;\r\n");
      out.write("\t\t\tvar c=document.form1.examname.value;\r\n");
      out.write("\t\t\tif(document.form1.examid.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Exam ID\");\r\n");
      out.write("                //a.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else if(!parseInt(a))\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Integer\");\r\n");
      out.write("               // a.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(document.form1.examname.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Exam Name\");\r\n");
      out.write("                //c.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(document.form1.cutoff.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Cutoff mark\");\r\n");
      out.write("             //   b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else if(!parseInt(b))\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Integer\");\r\n");
      out.write("               // b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\telse if(parseInt(b)<0||parseInt(b)>100)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter cutoff in %\");\r\n");
      out.write("                //b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <table width=\"100%\" border=\"1\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"107\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1\" height=\"512\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Companymenu.html", out, false);
      out.write("</td>\r\n");
      out.write("                <td width=\"961\" bgcolor=\"#B0CDD7\" valign=\"top\">\r\n");
      out.write("                    <table width=\"277\" height=\"144\" border=\"0\" align=\"center\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"2\"><div align=\"center\" class=\"style1\">\r\n");
      out.write("                                    <p class=\"style7 style14\">Exam Creation </p>\r\n");
      out.write("                            </div></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
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
                        
      out.write("\r\n");
      out.write("                        <form name=\"form2\" action=\"ExamCreation.jsp\">\r\n");
      out.write("                            <td width=\"163\" height=\"42\"><span class=\"style19\">Select a JobID </span></td>\r\n");
      out.write("                            <td width=\"104\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <select name=\"jobid\">\r\n");
      out.write("                                        ");
      rs = st.executeQuery("select * from job_details");
                                    String s1 = null;
                                    // String s2=null;
                                    while (rs.next()) {
                                        s1 = rs.getString("JobId");
                                        //    s2=rs.getString("Post");

                                        
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\r\n");
      out.write("                                        ");
 }//while 
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <tr><td> <div align=\"center\">\r\n");
      out.write("                                        <input type=\"submit\" value=\"Show Details\">\r\n");
      out.write("                            </div></td></tr>\r\n");
      out.write("                        </form>\r\n");
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

                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td><span class=\"style19\">Post Name :</span></td>\r\n");
      out.write("                            <td>");
      out.print(s2);
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"saveexamdetails.jsp\" onSubmit=\"return check()\">\r\n");
      out.write("                        <table width=\"318\" height=\"166\" border=\"1\" align=\"center\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"138\" height=\"40\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Exam ID</strong></div></td>\r\n");
      out.write("                                <td width=\"164\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"examid\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"40\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Exam Name </strong></div></td>\r\n");
      out.write("                                <td bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"examname\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"41\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\" class=\"style4 style20\"><strong>Cutoff %</strong></div></td>\r\n");
      out.write("                                <td bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><input type=\"text\" name=\"cutoff\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"33\" colspan=\"2\" bordercolor=\"#666666\" bgcolor=\"#B0CDD7\"><div align=\"center\">\r\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Submit\">\r\n");
      out.write("                                </div>        </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");

                }//while
                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", s2);
            }//else

        }//try
        catch (Exception e) {
            out.println(e);
        }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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
