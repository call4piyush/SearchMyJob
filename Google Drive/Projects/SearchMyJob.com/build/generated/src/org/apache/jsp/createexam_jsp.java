package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class createexam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SearchMyJob.com</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"company/examcreate.css\"/>\n");
      out.write(" <link rel=\"stylesheet\" href=\"company/style6.css\">\n");
      out.write("        <style>\n");
      out.write("        .tu{\n");
      out.write("               background-image: url(\"Untitled_1.jpg\");\n");
      out.write("               border-radius:25px;\n");
      out.write("\n");
      out.write("               border-style: solid;\n");
      out.write("               border: 3px;\n");
      out.write("               border-color: #ddb421;\n");
      out.write("}\n");
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
      out.write("    <body style=\"margin: 0px;\">\n");
      out.write("        <table width=\"100%\" border=\"0\" class=\"tu\">\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <td height=\"250\" >\n");
      out.write("            <div id=\"header-wrapper2\">\n");
      out.write("\n");
      out.write("            <div id=\"header\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("\n");
      out.write("                            <div class=\"o\"><a href=\"index.jsp\"><font color=\"#ddb421\">Home Page</font ></a></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"social\">\n");
      out.write("\t\t\t<div>\n");
      out.write("                            <ul class=\"contact1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h3><span>Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\n");
      out.write("                                            </span></h3>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("                </div></div>\n");
      out.write("\n");
 try {

            String c1 = (String) session.getAttribute("s1");


      out.write("\n");
      out.write("<p><marquee> ");

    out.println("Welcome to "+c1);


      out.write("</marquee></p>\n");
      out.write("                                  ");
// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"menup\" class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t<div class=\"current_page_item\">\n");
      out.write("\n");
      out.write("                            <li><a  href=\"EditComProfile.jsp\" accesskey=\"9\" title=\"EDIT PROFILE\">Edit Profile</a></li>\n");
      out.write("                                <li><a href=\"ComChangePassword.jsp\" accesskey=\"2\" title=\"CHANGE PASSWORD\">Change&nbsp;Password</a></li>\n");
      out.write("                                <li ><a href=\"addjob.jsp\" accesskey=\"3\" title=\"JOB DETAIL\">ADD</a></li>\n");
      out.write("                                <li><a href=\"ViewJobDetails.jsp\" accesskey=\"3\" title=\"JOB DETAIL\">View</a></li>\n");
      out.write("                                <li><a href=\"createexam.jsp\" accesskey=\"4\" title=\"EXAM CREATION\">Create</a></li>\n");
      out.write("                                <li><a href=\"ExamView.jsp\" accesskey=\"4\" title=\"EXAM VIEW\">View</a></li>\n");
      out.write("                                <li><a href=\"addques.jsp\" accesskey=\"5\" title=\"QUES ADD\">ADD</a></li>\n");
      out.write("                                <li><a href=\"quesview.jsp\" accesskey=\"5\" title=\"QUES VIEW\">View</a> </li>\n");
      out.write("                                <li><a href=\"logout.jsp\" accesskey=\"1\" title=\"LOG OUT\">Log Out</a></li>\n");
      out.write("\n");
      out.write("                        </div></ul>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td><div class=\"df\" align=\"center\"><font color=\"#ddb421\">JOB DETAILS</font> </div>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><div class=\"g\" align=\"center\"><font color=\"#ddb421\">examination</font> </div>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><div class=\"f\" align=\"center\"><font color=\"#ddb421\">Question</font> </div>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("        <table width=\"600\"  height=\"144\" border=\"0\" align=\"center\" bgcolor=\"#3f3f3f\">\n");
      out.write("              <tr>\n");
      out.write("                  <td class=\"ry\" colspan=\"2\">\n");
      out.write("                                  Exam Creation\n");
      out.write("                           </td>\n");
      out.write("                        </tr>\n");
      out.write("                         ");

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
      out.write("                        <form name=\"form2\" action=\"createexam.jsp\">\n");
      out.write("                            <td class=\"ry\">Select a Job ID</td>\n");
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
      out.write("                            <tr><td colspan=\"2\">\n");
      out.write("                                    <center><input type=\"submit\" value=\"Show Details\"></center>\n");
      out.write("                            </td></tr>\n");
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
      out.write("                         <tr>\n");
      out.write("                            <td class=\"ry\">Post Name :</td>\n");
      out.write("                            <td class=\"rp\">");
      out.print(s2);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                \n");
      out.write("<form name=\"form1\" method=\"post\" action=\"saveexamdetails.jsp\" onSubmit=\"return check()\">\n");
      out.write("    <table width=\"600\" bgcolor=\"#3f3f3f\" height=\"166\" border=\"0\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"ry\"><strong>Exam ID</strong></td>\n");
      out.write("                                <td ><input type=\"text\" name=\"examid\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"ry\">Exam Name</td>\n");
      out.write("                                <td ><input type=\"text\" name=\"examname\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"ry\">Cutoff %</td>\n");
      out.write("                                <td ><input type=\"text\" name=\"cutoff\"></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td  colspan=\"2\">\n");
      out.write("                                    <center>     <input type=\"submit\" name=\"Submit\" value=\"Submit\"></center>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                        ");

                }//while
                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", s2);
            }//else

        }//try
        catch (Exception e) {
            out.println(e);
        }
                    
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
