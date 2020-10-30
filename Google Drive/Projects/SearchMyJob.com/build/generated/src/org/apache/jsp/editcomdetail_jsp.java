package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class editcomdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <link rel=\"stylesheet\" href=\"company/style8.css\">\n");
      out.write("      <script language=\"javascript\">\n");
      out.write("\t\t\tfunction check()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar a=document.form1.comname.value;\n");
      out.write("           \t\tvar c=document.form1.comemail.value;\n");
      out.write("            \tvar d=document.form1.comcontact.value;\n");
      out.write("            \tvar e=document.form1.comcutoff.value;\n");
      out.write("            \tvar b=document.form1.comaddress.value;\n");
      out.write("            \tvar f=document.form1.compost.value;\n");
      out.write("            \tvar g=document.form1.comcriteria.value;\n");
      out.write("\t\t\t\tif(document.form1.comname.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Company Name\");\n");
      out.write("                \t//a.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse if(parseInt(a))\n");
      out.write("           \t\t {\n");
      out.write("                alert(\"Company Name cannot be integer\");\n");
      out.write("                //a.focus();\n");
      out.write("                return false;\n");
      out.write("           \t\t }\n");
      out.write("\t\t\t\tif(document.form1.comaddress.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Company Address\");\n");
      out.write("                \t//b.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(document.form1.compost.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Post\");\n");
      out.write("                \t//f.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(document.form1.comcriteria.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Criteria of the Company\");\n");
      out.write("                \t//g.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(document.form1.comemail.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Company Email\");\n");
      out.write("                //\tc.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse if(c.indexOf('@')==-1)\n");
      out.write("         \t   {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("               //c.focus();\n");
      out.write("                return false;\n");
      out.write("          \t\t}\n");
      out.write("           \t\t else if(c.indexOf('.')==-1)\n");
      out.write("           \t\t {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("                //c.focus();\n");
      out.write("                return false;\n");
      out.write("          \t\t  }\n");
      out.write("\t\t\t\tif(document.form1.comcontact.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Company Contact no:\");\n");
      out.write("                \t//d.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse if(!parseInt(d))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                //d.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("            \telse if(((document.form1.comcontact.value.length)<6) || ((document.form1.comcontact.value.length)>11))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Phone no should contain atleast 6 integers \");\n");
      out.write("                //d.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("\t\t\t\tif(document.form1.comcutoff.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\talert(\"Enter Company Cutoff mark\");\n");
      out.write("                \t//e.focus();\n");
      out.write("                \treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t else if(!parseInt(e))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("               //e.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("           \t \telse if(parseInt(e)<0||parseInt(e)>100)\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter cutoff in %\");\n");
      out.write("                //e.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                                ");

        //out.println(c1);
        try {

            //

            String c1 = (String) session.getAttribute("s1");
           
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


            rs = st.executeQuery("select CName,CAddress,CPost,CCriteria,CEmail,CContact,CcutOff from Com where CUserName='" + c1 + "'");
            String a = null;
            String b = null;
            String c = null;
            String d = null;
            String e = null;
            String f = null;
            String g = null;
            while (rs.next())
            {
                a = rs.getString("CName");
                b = rs.getString("CAddress");
                c = rs.getString("CPost");
                d = rs.getString("CCriteria");
                e = rs.getString("CEmail");
                f = rs.getString("CContact");
                g = rs.getString("CcutOff");

                        
      out.write("\n");
      out.write("         <form method=\"POST\" action=\"savecompanyedit.jsp\" name=\"form1\" onSubmit=\"return check()\">\n");
      out.write("             <table  bgcolor=\"#3F3F3F\" width=600\" border=\"0\" cellpadding=3 cellspacing=0 align=\"center\">\n");
      out.write("                                <tr >\n");
      out.write("                                    <td class=\"m\" colspan=\"2\" >\n");
      out.write("                               Edit Company Profile\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    Name</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comname\" id=\"comname\" size=30 maxlength=30 value=\"");
      out.print(a);
      out.write("\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    Address</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        \n");
      out.write("                                            <input NAME=\"comaddress\" TYPE=\"text\" id=\"comaddress\" size=30 maxlength=50 value=\"");
      out.print(b);
      out.write("\">\n");
      out.write("                                   \t </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    Post</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        <input NAME=\"compost\" TYPE=\"text\" id=\"compost\" size=30  maxlength=50 value=\"");
      out.print(c);
      out.write("\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    Criteria</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        <input NAME=\"comcriteria\" TYPE=\"text\" id=\"comcriteria\" size=30  maxlength=50 value=\"");
      out.print(d);
      out.write("\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr >\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                   Email_id</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comemail\" id=\"comemail\" size=30 maxlength=30 value=\"");
      out.print(e);
      out.write("\">\n");
      out.write("                                  </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    Contact No:</td>\n");
      out.write("                                    <td >\n");
      out.write("                                         <input TYPE=\"text\" NAME=\"comcontact\" id=\"comcontact\"size=20 maxlength=30 value=\"");
      out.print(f);
      out.write("\">\n");
      out.write("                                   </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr  >\n");
      out.write("                                    <td class=\"w\">\n");
      out.write("                                    CutOff %</td>\n");
      out.write("                                    <td >\n");
      out.write("                                        \n");
      out.write("                                            <input TYPE=\"text\" NAME=\"comcutoff\" id=\"comcutoff\" size=30 maxlength=30 value=\"");
      out.print(g);
      out.write("\">\n");
      out.write("                                       </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"49\" colspan=2 class=\"w\" >\n");
      out.write("                                        <div align=\"center\"><br>\n");
      out.write("                                            <input type=\"reset\" />\n");
      out.write("                                            &nbsp;&nbsp;<input TYPE=\"submit\" value=\"Edit\" >\n");
      out.write("                                    </div>\t    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                                                 ");
 }//while

        } catch (Exception e) {
            out.println(e.toString());
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
