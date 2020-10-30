package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class ExamView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"reg/style55.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"company/style6.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .tpo{\r\n");
      out.write("               background-image: url(\"Untitled_1.jpg\");\r\n");
      out.write("               border-radius:25px;\r\n");
      out.write("               height: 250px;\r\n");
      out.write("               width: 100%;\r\n");
      out.write("               border-style: solid;\r\n");
      out.write("               border: 3px;\r\n");
      out.write("               border-color: #ddb421;\r\n");
      out.write("            \r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("   \r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#3f3f3f\">\r\n");
      out.write("        <table  border=\"0\" class=\"tpo\">\r\n");
      out.write("    <tr>\r\n");
      out.write("\r\n");
      out.write("        <td height=\"250\" >\r\n");
      out.write("            <div id=\"header-wrapper2\">\r\n");
      out.write("               \r\n");
      out.write("            <div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"o\"><a href=\"index.jsp\"><font color=\"#ddb421\">Home Page</font ></a></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"social\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("                            <ul class=\"contact1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3><span>Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\r\n");
      out.write("                                            </span></h3>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                </div></div>\r\n");
      out.write("\r\n");
 try {

            String c1 = (String) session.getAttribute("s1");


      out.write("\r\n");
      out.write("<p><marquee> ");

    out.println("Welcome to "+c1);


      out.write("</marquee></p>\r\n");
      out.write("                                  ");
// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"menup\" class=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<div class=\"current_page_item\">\r\n");
      out.write("\r\n");
      out.write("                            <li><a  href=\"EditComProfile.jsp\" accesskey=\"9\" title=\"EDIT PROFILE\">Edit Profile</a></li>\r\n");
      out.write("                                <li><a href=\"ComChangePassword.jsp\" accesskey=\"2\" title=\"CHANGE PASSWORD\">Change&nbsp;Password</a></li>\r\n");
      out.write("                                <li ><a href=\"addjob.jsp\" accesskey=\"3\" title=\"JOB DETAIL\">ADD</a></li>\r\n");
      out.write("                                <li><a href=\"ViewJobDetails.jsp\" accesskey=\"3\" title=\"JOB DETAIL\">View</a></li>\r\n");
      out.write("                                <li><a href=\"createexam.jsp\" accesskey=\"4\" title=\"EXAM CREATION\">Create</a></li>\r\n");
      out.write("                                <li><a href=\"ExamView.jsp\" accesskey=\"4\" title=\"EXAM VIEW\">View</a></li>\r\n");
      out.write("                                <li><a href=\"addques.jsp\" accesskey=\"5\" title=\"QUES ADD\">ADD</a></li>\r\n");
      out.write("                                <li><a href=\"quesview.jsp\" accesskey=\"5\" title=\"QUES VIEW\">View</a> </li>\r\n");
      out.write("                                <li><a href=\"logout.jsp\" accesskey=\"1\" title=\"LOG OUT\">Log Out</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </div></ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><div class=\"df\" align=\"center\"><font color=\"#ddb421\">JOB DETAILS</font> </div>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><div class=\"g\" align=\"center\"><font color=\"#ddb421\">examination</font> </div>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><div class=\"f\" align=\"center\"><font color=\"#ddb421\">Question</font> </div>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("        <table width=\"100%\" border=\"0\" >\r\n");
      out.write("     <td width=\"961\" bgcolor=\"#3f3f3f\" valign=\"top\"><form name=\"form1\" action=\"ExamView.jsp\">\r\n");
      out.write("                        <table width=\"277\" height=\"128\" border=\"0\" align=\"center\"  >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"49\" colspan=\"2\"><div align=\"center\" class=\"style1\">\r\n");
      out.write("                                        Exam View\r\n");
      out.write("                                </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

        String jid = request.getParameter("jobid");
        //out.print(jid);
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
            	 
              //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                //Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"135\" height=\"42\" class=\"rt\"><span class=\"style1\">Select a Job ID </span></td>\r\n");
      out.write("                                <td width=\"132\">\r\n");
      out.write("                                    <center>    <label >\r\n");
      out.write("                                        <select name=\"jobid\">\r\n");
      out.write("                                            ");
       rs = st.executeQuery("select * from job_details");
                            String s1 = null;

                            while (rs.next()) {
                                s1 = rs.getString("JobId");


                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\r\n");
      out.write("                                            ");
     }
                                            
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        </label></center>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr><td colspan=\"2\" height=\"40  \"><center> <input type=\"submit\" value=\"Show Details\"></center> </td></tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");

                            } else {
                                jid = request.getParameter("jobid");
                                
                                Statement st = con.createStatement();

                                rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                                String s2 = null;
                                while (rs.next()) {
                                    s2 = rs.getString("Post");
                                }
                    
      out.write("\r\n");
      out.write("                    <table width=\"100%\" height=\"54\" border=\"1\" align=\"center\" class=\"op\">\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"er\">Exam ID </td>\r\n");
      out.write("                            <td class=\"er\">Exam Name </td>\r\n");
      out.write("                            <td class=\"er\">Cutoff % </td>\r\n");
      out.write("                            <td class=\"er\">Edit</td>\r\n");
      out.write("                            <td class=\"er\">Delete</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        ");
    Statement st2 = con.createStatement();
                                ResultSet rs2 = st2.executeQuery("select * from Exam where JobId='" + jid + "'");

                                while (rs2.next()) {
                                    String eid = rs2.getString("ExamID");
                                    String ename = rs2.getString("ExamName");
                                    String ecut = rs2.getString("CutOff");
                        
      out.write("\r\n");
      out.write("                        <tr valign=\"top\">\r\n");
      out.write("                            <td class=\"eu\">");
      out.print(eid);
      out.write("</td>\r\n");
      out.write("                            <td class=\"eu\">");
      out.print(ename);
      out.write("</td>\r\n");
      out.write("                            <td class=\"eu\">");
      out.print(ecut);
      out.write("</td>\r\n");
      out.write("                            <td class=\"eu\"><a href=\"EditExam.jsp?eid=");
      out.print(eid);
      out.write("&jid=");
      out.print(jid);
      out.write("\">Edit</a></td>\r\n");
      out.write("                            <td class=\"eu\"><a href=\"DeleteExam.jsp?eid=");
      out.print(eid);
      out.write("\">Delete</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                }
            }
        } catch (Exception e) {
            out.println(e);
        }
                        
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("         </table>\r\n");
      out.write("    </body></html>\r\n");
      out.write("    ");
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
