package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dispqst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Online Exam</title>\r\n");
      out.write("        <script>\r\n");
      out.write("function startTime()\r\n");
      out.write("{\r\n");
      out.write("var today=new Date();\r\n");
      out.write("var h=today.getHours();\r\n");
      out.write("var m=today.getMinutes();\r\n");
      out.write("var s=today.getSeconds();\r\n");
      out.write("\r\n");
      out.write("// add a zero in front of numbers<10\r\n");
      out.write("m=checkTime(m);\r\n");
      out.write("s=checkTime(s);\r\n");
      out.write("\r\n");
      out.write("document.getElementById('txt').innerHTML=\"Time  \"+\"\"+\":\"+h+\":\"+m+\":\"+s+\":\" ;\r\n");
      out.write("t=setTimeout(function(){startTime()},500);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkTime(i)\r\n");
      out.write("{\r\n");
      out.write("if (i<10)\r\n");
      out.write("  {\r\n");
      out.write("  i=\"0\" + i;\r\n");
      out.write("  }\r\n");
      out.write("return i;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .dr{\r\n");
      out.write("                color: white;\r\n");
      out.write("                text-transform: capitalize;\r\n");
      out.write("                text-align: right;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("}\r\n");
      out.write(".ter{\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write(".df{\r\n");
      out.write("    color: burlywood;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".hg{\r\n");
      out.write("    color: darkorange;\r\n");
      out.write("}\r\n");
      out.write(".frt{\r\n");
      out.write("    color:turquoise;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 50px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    text-transform: capitalize;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write("    border-radius:25px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    width:200px;\r\n");
      out.write("    background-color: #3F3F3F;\r\n");
      out.write("    color: antiquewhite;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    box-shadow:0px 0px 12px red;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"startTime()\">\r\n");
      out.write("        ");

        
        Statement st;
        String sql;
        int qno = Integer.parseInt(request.getParameter("qno"));
        String studentid = session.getAttribute("s1").toString();
        String qstn = "", ch1 = "", ch2 = "", ch3 = "", ch4 = "", ans = "";
        try {
            sql = "select * from data where StudentID='" + studentid + "' and QstNo=" + qno;
            
            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
             
          //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          //  con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                qstn = rs.getString(3);
                ch1 = rs.getString(4);
                ch2 = rs.getString(5);
                ch3 = rs.getString(6);
                ch4 = rs.getString(7);
                ans = rs.getString(8);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"calcmark.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <table width=\"100%\" height=\"670\" border=\"0\" bgcolor=\"#3f3f3f\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"frt\" colspan=\"2\">Online Exam</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\"><div class=\"dr\" ><div id=\"txt\"></div></div></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"ter\" style=\"text-align: center;\" width=\"100\"><strong>Question ");
      out.print(qno);
      out.write("\r\n");
      out.write("                      </strong>\r\n");
      out.write("                      <input type=\"hidden\" name=\"qno\" value=\"");
      out.print(qno);
      out.write("\">                  </td>\r\n");
      out.write("                    <td class=\"df\">");
      out.print(qstn);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"ter\"><div align=\"center\"><strong>Option 1</strong></div></td>\r\n");
      out.write("                    <td class=\"hg\" width=\"460\">\r\n");
      out.write("                      <strong>\r\n");
      out.write("                      <input name=\"ch\" type=\"radio\" value=\"");
      out.print(ch1);
      out.write("\">\r\n");
      out.write("                      ");
      out.print(ch1);
      out.write("</strong></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"ter\"><div align=\"center\"><strong>Option 2</strong></div></td>\r\n");
      out.write("                    <td class=\"hg\">\r\n");
      out.write("                      <strong>\r\n");
      out.write("                      <input name=\"ch\" type=\"radio\" value=\"");
      out.print(ch2);
      out.write("\">\r\n");
      out.write("                      ");
      out.print(ch2);
      out.write("</strong></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"ter\"><div align=\"center\"><strong>Option 3</strong></div></td>\r\n");
      out.write("                    <td class=\"hg\">\r\n");
      out.write("                      <strong>\r\n");
      out.write("                      <input name=\"ch\" type=\"radio\" value=\"");
      out.print(ch3);
      out.write("\">\r\n");
      out.write("                      ");
      out.print(ch3);
      out.write("</strong></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"ter\"><div align=\"center\"><strong>Option 4</strong></div></td>\r\n");
      out.write("                    <td class=\"hg\">\r\n");
      out.write("                      <strong>\r\n");
      out.write("                      <input name=\"ch\" type=\"radio\" value=\"");
      out.print(ch4);
      out.write("\">\r\n");
      out.write("                      ");
      out.print(ch4);
      out.write("</strong></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td ><input type=\"hidden\" name=\"ans\" value=\"");
      out.print(ans);
      out.write("\"></td>\r\n");
      out.write("                    ");

                if (qno <= 9) {
                    
      out.write("\r\n");
      out.write("                    <td ><center><input type=\"submit\" name=\"next\" value=\"Next Question\"></center></td>\r\n");
      out.write("                    ");
} else {
                    
      out.write("\r\n");
      out.write("                    <td  width=\"199\"><center><input type=\"submit\" name=\"Finish\" value=\"Finish\"></center></td>\r\n");
      out.write("                    ");
                }
                    
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
            }
        } catch (Exception ex) {
            out.println(ex.toString());
        }
    //out.println(session.getAttribute("mark"));

      out.write("\r\n");
      out.write("    \r\n");
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
