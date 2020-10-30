package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <table bgcolor=\"#3f3f3f\"  width=\"500\" height=\"97\" border=\"0\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"ti\"  colspan=\"2\">\n");
      out.write("                        View Questions\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                                String jid = request.getParameter("s1");
                                String eid = request.getParameter("s2");
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
      out.write("              \n");
      out.write("                                ");

                                                ResultSet rs2 = st2.executeQuery("select * from job_details");
                                                String s2 = null;
                                                // String s2=null;
                                                while (rs2.next()) {
                                                    s2 = rs2.getString("jobid");
                                                    //    s2=rs.getString("Post");
                                
      out.write("\n");
      out.write("                                </tr>\n");
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
      out.write("                        \n");
      out.write("                <tr>\n");
      out.write("                    <td  align=\"center\" height=\"40\"  colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Show Details\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        <table  bgcolor=\"#3f3f3f\"  border=\"1\" align=\"left\" width=\"100%\" class=\"d\">\n");
      out.write("\n");
      out.write("            <tr><td class=\"ta\" colspan=\"8\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("\n");
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
