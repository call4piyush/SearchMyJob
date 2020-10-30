package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import java.sql.*;;

public final class ExamConduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

       
        Statement st = null, st2 = null;
      
        String sql = null;
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
              
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
        } catch (Exception ex) {
            out.println("Error: " + ex.toString());
        }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            .style1 {\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #FF0000;\n");
      out.write("                font-family: \"Comic Sans MS\";\n");
      out.write("            }\n");
      out.write("            .style7 {color: white; font-weight: bold;\n");
      out.write("            text-align: center;}\n");
      out.write("            .style14 {color: #006699}\n");
      out.write("            body{\n");
      out.write("                background-color: #3F3F3F;\n");
      out.write("}\n");
      out.write("select{\n");
      out.write("    overflow:hidden;\n");
      out.write("    width: 50px;\n");
      out.write("    border-radius:10px;\n");
      out.write("    background-color: #3f3f3f;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".ft{\n");
      out.write("    color: wheat;\n");
      out.write("    font-size: large;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("            -->\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px\">\n");
      out.write("        <table width=\"100%\" border=\"0\" bgcolor=\"#3f3f3f\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"250\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "canheader.jsp", out, false);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td width=\"961\" valign=\"top\">\n");
      out.write("                    <table width=\"304\" height=\"243\" border=\"0\" align=\"center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\"><div align=\"center\" class=\"style1\">\n");
      out.write("                                    Exam\n");
      out.write("                                    <p>&nbsp;</p>\n");
      out.write("                            </div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("\n");
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
                        
      out.write("\n");
      out.write("                        <form name=\"exam1\" action =\"ExamConduct.jsp\">\n");
      out.write("                            <td width=\"200\" height=\"40\"> <div align=\"center\">   <span class=\"style7\">Select a Job ID </span></div></td>\n");
      out.write("                            <td width=\"112\">\n");
      out.write("                                <center>\n");
      out.write("                                <select name=\"jobid\">\n");
      out.write("                                    ");

                               rs = st.executeQuery("select * from job_details");
                                String s1 = null;
                                // String s2=null;
                                while (rs.next()) {
                                    s1 = rs.getString("JobId");
                                    //    s2=rs.getString("Post");
                                    out.println("<option value='" + s1 + "'>" + s1 + "</option>");
                                }//while

                                    
      out.write("\n");
      out.write("                                </select></center>\n");
      out.write("                            </td>\n");
      out.write("                            <tr><td colspan=\"2\"> <div align=\"center\">\n");
      out.write("                                        <input style=\"border-radius:12px; width: 50px;\n");
      out.write("                                               height:30px; \" type=\"submit\" value=\"OK \">\n");
      out.write("                            </div></td></tr>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                            }//if
                            else {
                                jid = request.getParameter("jobid");
                                sql = "select Post from Exam where JobID='" + jid + "'";
                                rs = st.executeQuery(sql);
                                String post = null;
                                if (rs.next()) {
                                    post = rs.getString("Post");
                                }
                                rs.close();


                        
      out.write(" <form name=\"examSelection\" action =\"11.jsp\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td><span class=\"style7\"><div align=\"center\">Post Name :</div></span></td>\n");
      out.write("                                <td class=\"ft\">");
      out.print(post);
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"30\" class=\"style7\">Select an Exam</td>\n");
      out.write("                                <td><center><select style=\"width: 80px;\" name=\"examid\">\n");
      out.write("\n");
      out.write("                                        ");

                                sql = "select ExamID,ExamName from Exam where JobID='" + jid + "'";
                                rs = st.executeQuery(sql);
                                String exname = null;
                                String exid = null;
                                while (rs.next()) {
                                    exid = rs.getString("ExamID");
                                    exname = rs.getString("ExamName");
                                    out.println("<option value='" + exid + "'>" + exname + "</option>");
                                }
                                        
      out.write("\n");
      out.write("                                        </select></center>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\"><center>\n");
      out.write("                                        <input type=\"submit\" value=\"OK\" style=\"border-radius:12px; width: 50px;height:30px;\"></center>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </form>\n");
      out.write("                    </table>\n");
      out.write("                    <p>&nbsp;</p>\n");
      out.write("\n");
      out.write("                    ");


                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", post);
            }//else
        }//try
        catch (Exception e) {
            out.println(e);
        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
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
