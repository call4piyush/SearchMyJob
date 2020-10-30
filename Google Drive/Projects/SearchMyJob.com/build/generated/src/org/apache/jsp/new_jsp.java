package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("               <script type=\"text/javascript\">\n");
      out.write("    function onSubmit(s)\n");
      out.write("    {\n");
      out.write("\n");
      out.write("    var a=document.form1.username.value;\n");
      out.write("    var b=document.form1.password.value;\n");
      out.write("\n");
      out.write("    if(s==1)\n");
      out.write("\t{\n");
      out.write("    if(document.form1.username.value==\"\")\n");
      out.write("    {\n");
      out.write("        alert(\"Enter Your Name\");\n");
      out.write("       // a.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("    else if (document.form1.password.value==\"\")\n");
      out.write("    {\n");
      out.write("        alert(\"enter the password\");\n");
      out.write("        //b.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("\t}\n");
      out.write("\t   document.form1.submit();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <center>\n");
      out.write("        <table style=\"box-shadow:10px 10px 127px black;;\" class=\"s\" width=\"500\" border=\"0\">\n");
      out.write("            <tr >\n");
      out.write("                <td height=\"200\">\n");
      out.write("   <form name=\"form1\" method=\"post\" class=\"login\" action=\"savelogindata.jsp\">\n");
      out.write("          <p>\n");
      out.write("      <label for=\"login\">UserName:</label>\n");
      out.write("      <input type=\"text\" name=\"username\" id=\"username\" value=\"\">\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      <label for=\"password\">Password:</label>\n");
      out.write("      <input type=\"password\" name=\"password\" id=\"password\" value=\"\">\n");
      out.write("    </p>\n");
      out.write("    <p class=\"login-submit\">\n");
      out.write("        <button type=\"button\" class=\"login-button\" onclick=\"javascript:onSubmit(1);\">Login </button>\n");
      out.write("\n");
      out.write("    </p>\n");
      out.write("    <a href=\"#\">Forget password</a>\n");
      out.write("        </form>\n");
      out.write("                   \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </center>\n");
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
