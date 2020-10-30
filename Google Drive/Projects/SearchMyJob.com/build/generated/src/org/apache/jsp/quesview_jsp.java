package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class quesview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"company/style6.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #3F3F3F;\n");
      out.write("                margin: 0px;\n");
      out.write("}\n");
      out.write("            .ti{\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:29px;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .qo{\n");
      out.write("                text-align: center;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:20px;\n");
      out.write("            }\n");
      out.write("            .qo select{\n");
      out.write("                border-radius:25px;\n");
      out.write("                width: 50px;\n");
      out.write("                color: white;\n");
      out.write("                background-color: #3F3F3F;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {   border-radius:25px;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 170px;\n");
      out.write("                float: none;\n");
      out.write("                background-color: #3F3F3F;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-family: times new roman;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("               margin-top: -98px;\n");
      out.write("               border-radius:20px;\n");
      out.write("               border-color: #3F3F3F;\n");
      out.write("}\n");
      out.write(".dt{color: black;\n");
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
      out.write("               font-weight: 600;\n");
      out.write("                  color:black;\n");
      out.write("}\n");
      out.write(".dta{\n");
      out.write("       color: #ffffff;\n");
      out.write("                background-color:#55503b;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:8px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                width: 120px;\n");
      out.write("                border-style: dotted;\n");
      out.write("                border-color: #ddb421;\n");
      out.write("                 border-width: 1px;\n");
      out.write("}\n");
      out.write(".ta{\n");
      out.write("    background-color:#55503b;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:8px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                width: 120px;\n");
      out.write("                border-style: dotted;\n");
      out.write("                border-color: #ddb421;\n");
      out.write("                 border-width: 1px;\n");
      out.write("                 color: white;\n");
      out.write("}\n");
      out.write(".dt a{\n");
      out.write("    color: #b92d71;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(" .tu{\n");
      out.write("               background-image: url(\"Untitled_1.jpg\");\n");
      out.write("               border-radius:25px;\n");
      out.write("               \n");
      out.write("               border-style: solid;\n");
      out.write("               border: 3px;\n");
      out.write("               border-color: #ddb421;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <table width=\"100%\" border=\"0\" class=\"tu\">\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <td height=\"250\" >\n");
      out.write("            <div id=\"header-wrapper\">\n");
      out.write("            <div id=\"header\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("                            <h9><font color=\"white\" ></font></h9>\n");
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
      out.write("<tr>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <form name=\"form1\" action=\"quesview.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <table bgcolor=\"#3f3f3f\"  width=\"500\" height=\"97\" border=\"0\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"ti\"  colspan=\"2\">\n");
      out.write("                        View Questions\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                                String jid = request.getParameter("jobid");
                                String eid = request.getParameter("examid");
                                //out.print(jid);
                                try {
                                    Connection con = null;
                                    String url = "jdbc:mysql://localhost:3306/";
                                    String dbName = "online";
                                    String driverName = "com.mysql.jdbc.Driver";
                                    String userName = "root";
                                    String password = "root";
                                    ResultSet rs, rs1;
                                    Class.forName(driverName).newInstance();
                                    con = DriverManager.getConnection(url + dbName, userName, password);
                                    if (eid == null) {
                                        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                        // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                                        Statement st = con.createStatement();
                                        Statement st2 = con.createStatement();
                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"ti\">Select an Job ID</td>\n");
      out.write("                    <td class=\"qo\" ><label>\n");
      out.write("                            <select name=\"jobid\">\n");
      out.write("                                ");

                                                ResultSet rs2 = st2.executeQuery("select * from job_details");
                                                String s2 = null;
                                                // String s2=null;
                                                while (rs2.next()) {
                                                    s2 = rs2.getString("jobid");
                                                    //    s2=rs.getString("Post");
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(s2);
      out.write('"');
      out.write('>');
      out.print(s2);
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                    </td></tr>\n");
      out.write("\n");
      out.write("                <td class=\"ti\">Select an Exam ID </td>\n");
      out.write("                <td class=\"qo\" ><label>\n");
      out.write("                        <select name=\"examid\">\n");
      out.write("                            ");
       rs = st.executeQuery("select * from Exam ");
                                            String s1 = null;
                                            // String s2=null;
                                            while (rs.next()) {
                                                s1 = rs.getString("examid");
                                                //    s2=rs.getString("Post");
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                </td></tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td  align=\"center\" height=\"40\"  colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Show Details\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                        <p>\n");
      out.write("            ");

                        } else {
            
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <table  bgcolor=\"#3f3f3f\"  border=\"1\" align=\"left\" width=\"100%\" class=\"d\">\n");
      out.write("\n");
      out.write("            <tr><td class=\"ta\" colspan=\"8\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td class=\"dta\">Question No: </td>\n");
      out.write("                <td class=\"dta\">Question</td>\n");
      out.write("                <td class=\"dta\">Option 1</td>\n");
      out.write("                <td class=\"dta\">Option 2</td>\n");
      out.write("                <td class=\"dta\">Option 3</td>\n");
      out.write("                <td class=\"dta\">Option 4</td>\n");
      out.write("                <td class=\"dta\">Answer</td>\n");
      out.write("                <td class=\"dta\">Delete</td>\n");
      out.write("            </tr>\n");
      out.write("            ");


                            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            //  Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                            Statement st3 = con.createStatement();
                            // Statement st2=con.createStatement();

                            ResultSet rs3 = st3.executeQuery("select QuestionNo,Question,Option1,Option2,Option3,Option4,Answer from Question where ExamID='"
                                    + eid + "' and JobID='" + jid + "'");
                            //  String s2=null;
                            while (rs3.next()) {
                                String qno = rs3.getString("QuestionNo");
                                String ques = rs3.getString("Question");
                                String op1 = rs3.getString("Option1");
                                String op2 = rs3.getString("Option2");
                                String op3 = rs3.getString("Option3");
                                String op4 = rs3.getString("Option4");
                                String ans = rs3.getString("Answer");



            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"dt\" >");
      out.print(qno);
      out.write("</td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(ques);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(op1);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(op2);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(op3);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(op4);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\">\n");
      out.write("                        ");
      out.print(ans);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                <td class=\"dt\"><a href=\"DeleteQues.jsp?qno=");
      out.print(qno);
      out.write("&jid=");
      out.print(jid);
      out.write("&eid=");
      out.print(eid);
      out.write("\" >Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                                }
                                con.close();
                            }

                        } catch (Exception e) {
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
