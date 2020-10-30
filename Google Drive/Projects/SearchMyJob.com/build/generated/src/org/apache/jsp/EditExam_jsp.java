package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class EditExam_jsp extends org.apache.jasper.runtime.HttpJspBase
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


        String jid = request.getParameter("jid");
        String eid = request.getParameter("eid");
        String msg = "";

        if (request.getParameter("update") != null) {
            String examid = request.getParameter("examid");
            String jobid = request.getParameter("jobid");
            String postname = request.getParameter("postname");
            String examname = request.getParameter("exname");
            String cutoff = request.getParameter("cutoff");
            String sql = "Update Exam Set Post='" + postname + "', ExamName='" + examname + "', CutOff='" +
                    cutoff + "' where JobID='" + jobid + "' and ExamID='" + examid + "'";

            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
            Statement st = con.createStatement();
            int x = st.executeUpdate(sql);

            if (x > 0) {
                msg = "success";
                response.sendRedirect("ExamView.jsp?jobid=" + jobid);

            } else {
                msg = "Updation failed";
            }
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar a= document.frm.exname.value;\r\n");
      out.write("\t\t\tvar b= document.frm.cutoff.value;\r\n");
      out.write("\t\t\tvar c=document.frm.postname.value;\r\n");
      out.write("\t\t\tif(document.frm.postname.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Post Name\");\r\n");
      out.write("                c.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(document.frm.exname.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Exam Name\");\r\n");
      out.write("                a.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(document.frm.cutoff.value==\"\")\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Cutoff mark\");\r\n");
      out.write("               b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else if(!parseInt(b))\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter Integer\");\r\n");
      out.write("                b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\telse if(parseInt(b)<0||parseInt(b)>100)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Enter cutoff in %\");\r\n");
      out.write("                b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <table width=\"100%\" border=\"1\" bgcolor=\"#FFFFFF\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"23\" colspan=\"2\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1\" height=\"537\"></td>\r\n");
      out.write("                <td width=\"961\" bgcolor=\"#EDE0E2\" valign=\"top\">\r\n");
      out.write("                    ");


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
       // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
        Statement st = con.createStatement();
        Statement st3 = con.createStatement();
        rs = st.executeQuery("select * from Exam where JobID='" + jid + "' and ExamID='" + eid + "'");
        String post = "", exname = "", cutoff = "";
        if (rs.next()) {
            post = rs.getString("Post");
            exname = rs.getString("ExamName");
            cutoff = rs.getString("CutOff");
        }
                    
      out.write("\r\n");
      out.write("                    <form name=\"frm\" action=\"EditExam.jsp\" method=\"post\" onsubmit=\"return check()\">\r\n");
      out.write("                        <table width=\"449\" border=\"1\" align=\"center\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\"><div align=\"center\"><strong>Edit Exam Details</strong></div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Post</td>\r\n");
      out.write("                                <td><input type=\"text\" name=\"postname\" id=\"postname\" value=\"");
      out.print(post);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Exam Name</td>\r\n");
      out.write("                                <td><input type=\"text\" name=\"exname\" id=\"exname\" value=\"");
      out.print(exname);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Cutoff</td>\r\n");
      out.write("                                <td><input type=\"text\" name=\"cutoff\" id=\"cutoff\" value=\"");
      out.print(cutoff);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                                    <input name=\"jobid\" type=\"hidden\" id=\"jobid\" value=\"");
      out.print(jid);
      out.write("\">\r\n");
      out.write("                                    <input name=\"examid\" type=\"hidden\" id=\"examid\" value=\"");
      out.print(eid);
      out.write("\">\r\n");
      out.write("                                <input type=\"submit\" name=\"update\" id=\"update\" value=\"Update\" ></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" align=\"center\">");
      out.print(msg);
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> ");
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
