package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0px;\n");
      out.write("                background-color: #3f3f3f;\n");
      out.write("}\n");
      out.write("            .poi{\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50%;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("}\n");
      out.write("input[type=text]{\n");
      out.write("    height: 30px;\n");
      out.write("    width: 60%;\n");
      out.write("    border-radius:10px;\n");
      out.write("    background-color: #404040;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("textarea{\n");
      out.write("    color: white;\n");
      out.write("    border-radius:10px;\n");
      out.write("    background-color: #404040;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("input[type=button],input[type=reset]{\n");
      out.write("    height: 30px;\n");
      out.write("    width: 25%;\n");
      out.write("    border-radius:10px;\n");
      out.write("    background-color: #404040;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".tuu{\n");
      out.write("    text-align: center;\n");
      out.write("    color: wheat;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("            <script language=\"javascript\">\n");
      out.write("    function onSubmit(s)\n");
      out.write("    {\n");
      out.write("            var a=document.form1.comname.value;\n");
      out.write("           \n");
      out.write("            var c=document.form1.comemail.value;\n");
      out.write("            var d=document.form1.comcontact.value;\n");
      out.write("           \n");
      out.write("            var f=document.form1.comaddress.value;\n");
      out.write("                    if(s==1)\n");
      out.write("\t\t\t{\n");
      out.write("            if(document.form1.comname.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Name\");\n");
      out.write("     //           a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(parseInt(a))\n");
      out.write("            {\n");
      out.write("                alert(\"Name cannot be integer\");\n");
      out.write("       //         a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comaddress.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Address\");\n");
      out.write("         //      f.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            if(document.form1.comemail.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter  Email\");\n");
      out.write("                //c.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(c.indexOf('@')==-1)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("                //c.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(c.indexOf('.')==-1)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("                //c.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcontact.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Contact no:\");\n");
      out.write("                //d.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(d))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("               //d.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(((document.form1.comcontact.value.length)<6) || ((document.form1.comcontact.value.length)>11))\n");
      out.write("            {\n");
      out.write("                alert(\"Phone no should contain atleast 10 integers \");\n");
      out.write("                //d.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t  document.form1.submit();\n");
      out.write("\n");
      out.write("\n");
      out.write("          }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-top: 8px;\" >\n");
      out.write("        <table height=\"700\"  width=\"100%\" border=\"0\"  >\n");
      out.write("            <tr>\n");
      out.write("                <td  height=\"250\" colspan=\"\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <tr >\n");
      out.write("          <td class=\"tuu\" height=\"10\">\n");
      out.write("              contact form\n");
      out.write("              </td>\n");
      out.write("      </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td width=\"100%\" valign=\"top\">\n");
      out.write(" <form action=\"con1.jsp\" method=\"post\" name=\"form1\" id=\"form1\">\n");
      out.write("     <table bgcolor=\"\" border=\"0\" width =\"50%\"   align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("             <td class=\"poi\">Name</td>\n");
      out.write("             <td class=\"poi\" align=\"center\"><input TYPE=\"text\" NAME=\"comname\" id=\"comname\" size=30 maxlength=30></td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"poi\">Address</td>\n");
      out.write("             <td align=\"center\"> <input NAME=\"comaddress\" TYPE=\"text\" id=\"comaddress\" size=30 maxlength=50></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"poi\">Email_id</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input TYPE=\"text\" NAME=\"comemail\" id=\"comemail\" size=30 maxlength=30 value=''>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"poi\">Contact No:</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input TYPE=\"text\" NAME=\"comcontact\" id=\"comcontact\" size=10 maxlength=30 >\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"poi\">message</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <textarea name=\"message\" >write your question here</textarea>\n");
      out.write("              </td>\n");
      out.write("               </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td height=\"45\" colspan=\"2\" align=\"center\" >\n");
      out.write("\n");
      out.write("                         <input type=\"reset\" value=\"reset\"/>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 <input type=\"button\" value=\"Submit\"  onclick=\"javascript:onSubmit(1);\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("      </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("      \n");
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
