package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\r\n");
      out.write("            body\r\n");
      out.write("            {\r\n");
      out.write("                background-color: #3f3f3f;\r\n");
      out.write("}\r\n");
      out.write("            .df{\r\n");
      out.write("\r\n");
      out.write("                color: white;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width:  50%;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("}\r\n");
      out.write("input[type=text], input[type=password]{\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  width: 250px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-shadow: 1px 1px 1px black;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.16);\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 16px;\r\n");
      out.write("  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  width: 100px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-shadow: 1px 1px 1px black;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.16);\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 16px;\r\n");
      out.write("  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                var a= document.form1.newpass2.value;\r\n");
      out.write("                var b= document.form1.newpass.value;\r\n");
      out.write("                var c=document.form1.pass.value;\r\n");
      out.write("                    if(document.form1.pass.value  ==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter the old password\");\r\n");
      out.write("                      //  c.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                   if(document.form1.newpass2.value ==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter the new password\");\r\n");
      out.write("                        //a.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(a.length<8)\r\n");
      out.write("                        {\r\n");
      out.write("                         alert(\"password should be minimum 8 characters\");\r\n");
      out.write("                        //a.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    if(document.form1.newpass.value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"ReEnter the password\");\r\n");
      out.write("                        //b.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(a!=b)\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Wrong password match\");\r\n");
      out.write("                          //  b.focus();\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    \r\n");
      out.write("                    return true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("                    ");
 try {

            //              HttpSession s = request.getSession();
            //  String c1 = request.getParameter("id");
            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");
            // session.getAttribute("c1", c1);
             
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
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Login where username='" + c1 + "' and password ='" + c2 + "'");

            String s1 = null;
            String s2 = null;
                    
      out.write("\r\n");
      out.write("                    <font color=\"red\">   <center>\r\n");
      out.write("                        ");

                        out.println("Username Is--");
                        out.println(c1);
                        
      out.write("\r\n");
      out.write("                        </center></font>\r\n");
      out.write("                        \r\n");
      out.write("  ");

     while (rs.next()) {
         s1 = rs.getString(1);
         s2 = rs.getString(2);
     }
  
      out.write("\r\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"savepassword.jsp\" onsubmit=\"return check()\">\r\n");
      out.write("                        <table  width=\"700\" height=\"150\" border=\"0\" align=\"center\" >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"df\" colspan=\"2\" >Change Password </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"df\"> Username </td>\r\n");
      out.write("                                <td ><input name=\"user\" type=\"text\"  id=\"user\" value=\"");
      out.print(s1);
      out.write("\" size=\"35\"></td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"df\">Old Password </td>\r\n");
      out.write("                                <td ><input name=\"pass\" type=\"password\"  id=\"pass\"  size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"df\">New Password </td>\r\n");
      out.write("                                <td ><input name=\"newpass2\" type=\"password\" id=\"newpass2\" size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"df\">Retype New Password</td>\r\n");
      out.write("                                <td ><input name=\"newpass\" type=\"password\" id=\"newpass\" size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" >\r\n");
      out.write("                                    <center> <input name=\"Submit\" type=\"submit\" value=\"Submit\"></center>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");

        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\r\n");
      out.write("\r\n");
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
