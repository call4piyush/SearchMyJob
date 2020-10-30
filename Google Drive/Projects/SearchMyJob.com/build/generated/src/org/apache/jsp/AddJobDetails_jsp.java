package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddJobDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"company/edit.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\tvar a= document.form1.jobid.value;\r\n");
      out.write("\t\t\t\tvar b= document.form1.vacancies.value;\r\n");
      out.write("\t\t\t\tvar c= document.form1.salary.value;\r\n");
      out.write("\t\t\t\tvar d=document.form1.lastdate.value;\r\n");
      out.write("\t\t\t\tvar e=document.form1.post.value;\r\n");
      out.write("\t\t\t\tvar f=document.form1.criteria.value;\r\n");
      out.write("                if(document.form1.jobid.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Job Id\");\r\n");
      out.write("                    //a.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t\telse if(!parseInt(a))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Please enter Integer\");\r\n");
      out.write("               //a.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                if(document.form1.post.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Post\");\r\n");
      out.write("                 //   e.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.criteria.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Criteria\");\r\n");
      out.write("                   // f.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.vacancies.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter no: of Vacancies available\");\r\n");
      out.write("                    //b.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t\telse if(!parseInt(b))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Enter integer\");\r\n");
      out.write("             //b.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("                if(document.form1.salary.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Salary\");\r\n");
      out.write("               //     c.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t\telse if(!parseInt(c))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Enter integer\");\r\n");
      out.write("               //c.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("                if(document.form1.lastdate.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Last Date\");\r\n");
      out.write("                 //   d.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body  bgcolor=\"#3F3F3F\">\r\n");
      out.write("       \r\n");
      out.write("    <form name=\"form1\" method=\"post\" action=\"savejobdetails.jsp\">\r\n");
      out.write("                        <table width=\"517\" height=\"334\" border=\"0\" align=\"center\">\r\n");
      out.write("                            <tr >\r\n");
      out.write("                                <td colspan=\"2\" class=\"j\">Job Description </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\">Job ID</td>\r\n");
      out.write("                                <td ><input name=\"jobid\" id=\"jobid\" type=\"text\" size=\"30\" maxlength=\"3\">\r\n");
      out.write("                               </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\"> Name of Post </td>\r\n");
      out.write("                                <td ><input name=\"post\" name=\"post\" type=\"text\" size=\"30\" maxlength=\"10\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\">Criteria</td>\r\n");
      out.write("                                <td ><input name=\"criteria\" name=\"criteria\" type=\"text\" size=\"30\" maxlength=\"15\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\">No: of Vacancies</td>\r\n");
      out.write("                                <td ><input name=\"vacancies\" name=\"vacancies\" type=\"text\" size=\"30\" maxlength=\"3\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\">Salary/Annum</td>\r\n");
      out.write("                                <td ><input name=\"salary\" name=\"salary\" type=\"text\" size=\"30\" maxlength=\"7\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"j\">Last Date<font color=\"red\">&nbsp;&nbsp;(dd/mm/yy) </font></td>\r\n");
      out.write("                                <td ><input name=\"lastdate\" name=\"lastdate\" type=\"text\" size=\"30\" maxlength=\"10\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr >\r\n");
      out.write("                                <td colspan=\"2\">\r\n");
      out.write("                                    <div align=\"center\">\r\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Submit\" onClick=\"return check()\">\r\n");
      out.write("                                </div>           </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <h2>&nbsp;</h2>\r\n");
      out.write("       \r\n");
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
