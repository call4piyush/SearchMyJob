package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"reg/style2.css\">\n");
      out.write("            <script language=\"javascript\">\n");
      out.write("    function onSubmit(s)\n");
      out.write("    {\n");
      out.write("            var a=document.form1.comname.value;\n");
      out.write("            var b=document.form1.compassword.value;\n");
      out.write("            var c=document.form1.comemail.value;\n");
      out.write("            var d=document.form1.comcontact.value;\n");
      out.write("            var e=document.form1.comcutoff.value;\n");
      out.write("            var f=document.form1.comaddress.value;\n");
      out.write("          var g=document.form1.compost.value;\n");
      out.write("          var h=document.form1.comcriteria.value;\n");
      out.write("          var i=document.form1.comusername.value;\n");
      out.write("\n");
      out.write("          if(s==1)\n");
      out.write("\t\t\t{\n");
      out.write("            if(document.form1.comname.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Name\");\n");
      out.write("     //           a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(parseInt(a))\n");
      out.write("            {\n");
      out.write("                alert(\"Company Name cannot be integer\");\n");
      out.write("       //         a.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comaddress.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Address\");\n");
      out.write("         //      f.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.compost.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Post\");\n");
      out.write("           //     g.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcriteria.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Criteria\");\n");
      out.write("             //   h.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comusername.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Username\");\n");
      out.write("               //i.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.compassword.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Password\");\n");
      out.write("                //b.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(b.length<8)\n");
      out.write("            {\n");
      out.write("                alert(\"Password should be minimum 8 characters\");\n");
      out.write("                //b.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comemail.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Email\");\n");
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
      out.write("                alert(\"Enter Company Contact no:\");\n");
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
      out.write("                alert(\"Phone no should contain atleast 6 integers \");\n");
      out.write("                //d.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcutoff.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Cutoff\");\n");
      out.write("                //e.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(e))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("             //   e.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(parseInt(e)<0||parseInt(e)>100)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter cutoff in %\");\n");
      out.write("               // e.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t  document.form1.submit();\n");
      out.write("\n");
      out.write("\n");
      out.write("          }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"savecompanydata.jsp\" method=\"post\" name=\"form1\" id=\"form1\">\n");
      out.write("            <table class=\"style\" border=\"0\" width =\"600\" height=\"600\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("             <td class=\"ta\">Name&nbsp;</td>\n");
      out.write("              <td align=\"center\"><input TYPE=\"text\" NAME=\"comname\" id=\"comname\" size=30 maxlength=30></td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"ta\">Address</td>\n");
      out.write("             <td align=\"center\"> <input NAME=\"comaddress\" TYPE=\"text\" id=\"comaddress\" size=30 maxlength=50></td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("             <td class=\"ta\">Post</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input NAME=\"compost\" TYPE=\"text\" id=\"compost\" size=30  maxlength=50>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("             <td class=\"ta\">Criteria</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input NAME=\"comcriteria\" TYPE=\"text\" id=\"comcriteria\" size=30  maxlength=50>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("             <td class=\"ta\">Username</td>\n");
      out.write("             <td align=\"center\">\n");
      out.write("                  <input TYPE=\"text\" NAME=\"comusername\" id=\"comusername\"size=30 maxlength=30 value=''>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("             <td class=\"ta\">Password</td>\n");
      out.write("              <td align=\"center\"><input TYPE=\"password\" NAME=\"compassword\" id=\"compassword\" size=32 maxlength=30 value=''></td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("             <td class=\"ta\">Email_id</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input TYPE=\"text\" NAME=\"comemail\" id=\"comemail\" size=30 maxlength=30 value=''>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"ta\">Contact No:</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <input TYPE=\"text\" NAME=\"comcontact\" id=\"comcontact\" size=10 maxlength=30 >\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("             <td class=\"ta\">CutOff %</td>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                   <input TYPE=\"text\" NAME=\"comcutoff\" id=\"comcutoff\" size=30 maxlength=30 value=''>\n");
      out.write("              </td>\n");
      out.write("               </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td height=\"25\" colspan=\"2\" align=\"center\" >\n");
      out.write("\n");
      out.write("                         <input type=\"reset\" value=\"reset\"/>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 <input type=\"button\" value=\"Submit\"  onclick=\"javascript:onSubmit(1);\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
