package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class canpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"pass/style3.css\">\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                var a= document.form1.newpass2.value;\n");
      out.write("                var b= document.form1.newpass.value;\n");
      out.write("                var c=document.form1.pass.value;\n");
      out.write("                if(document.form1.pass.value  ==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter the old password\");\n");
      out.write("             //       c.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.newpass2.value ==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter the new password\");\n");
      out.write("               //     a.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(a.length<8)\n");
      out.write("                {\n");
      out.write("                    alert(\"password should be minimum 8 characters\");\n");
      out.write("                 //   a.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.newpass.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"ReEnter the password\");\n");
      out.write("                   //b.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(a!=b)\n");
      out.write("                {\n");
      out.write("                    alert(\"Wrong password ma.tch\");\n");
      out.write("                 //b.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
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
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Login where username='" + c1 + "' and password ='" + c2 + "'");

            String s1 = null;
            String s2 = null;
                        
      out.write('\n');

     while (rs.next()) {
         s1 = rs.getString(1);
         s2 = rs.getString(2);
     }
                        
      out.write("\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"savecanpass.jsp\" onsubmit=\"return check()\" >\n");
      out.write("            <table  width=\"700\" height=\"300\" border=\"0\" align=\"center\" cellpadding=\"1\" class=\"y\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"p\" colspan=\"3\" ><strong>Change Password </strong></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"p\" >Username</td>\n");
      out.write("                                <td  ><input name=\"user\" type=\"text\"  id=\"user\" value=\"");
      out.print(s1);
      out.write("\" size=\"35\"></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"p\">Old Password </td>\n");
      out.write("                                <td><input name=\"pass\" type=\"text\"  id=\"pass\" value=\"");
      out.print(s2);
      out.write("\" size=\"35\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"p\">New Password </td>\n");
      out.write("                                <td ><input name=\"newpass2\" type=\"password\" id=\"newpass2\" size=\"35\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"p\">Retype New Password</td>\n");
      out.write("                                <td><input name=\"newpass\" type=\"password\" id=\"newpass\" size=\"35\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"4\" class=\"st\"><div align=\"center\">\n");
      out.write("                                        <input name=\"Submit\" type=\"submit\" value=\"Submit\">\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("         ");

        }//try
        catch (Exception e) {
            out.println(e);
        }

                
      out.write("\n");
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
