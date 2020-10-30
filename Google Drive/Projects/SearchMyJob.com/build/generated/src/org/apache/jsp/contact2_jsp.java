package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contact2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius:10px;\n");
      out.write("                width: 70px;\n");
      out.write("                border-style: dotted;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    color: white;\n");
      out.write("    background-color: #3f3f3f;\n");
      out.write("}\n");
      out.write(".fr{\n");
      out.write("    width: 90px;\n");
      out.write("    background-color:#99b7a2;\n");
      out.write("    color: black;\n");
      out.write("    font-size: large;\n");
      out.write("}\n");
      out.write(".re{\n");
      out.write("    background-color:#99b7a2;\n");
      out.write("    color: black;\n");
      out.write("    font-size: large;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    color: cadetblue;\n");
      out.write("    font-size: large;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0px;\">\n");
      out.write("        <table width=\"100%\" border=\"1\" >\n");
      out.write("            ");
         String sql = "";
        Statement st;
        // out.println(uname);

        try {
            sql = "select * from contact";

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
           // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
            rs = st.executeQuery(sql);
            String d1="";
            String d2="";
            String d3="";
            String d4="";
            String d5="";
                    
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"re\">Name</td>\n");
      out.write("                <td class=\"re\">Address</td>\n");
      out.write("                <td class=\"re\">Email_Id</td>\n");
      out.write("                <td class=\"re\">Phone No</td>\n");
      out.write("                <td class=\"fr\">Message</td>\n");
      out.write("                <td class=\"re\">Go Back</td>\n");
      out.write("            </tr>\n");
      out.write("             ");

                        while (rs.next()) {
                          d1=rs.getString("name");
                          d2=rs.getString("address");
                          d3=rs.getString("emailid");
                          d4=rs.getString("contactno");
                         d5=rs.getString("message");

                        }
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(d1);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(d2);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(d3);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(d4);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(d5);
      out.write("</td>\n");
      out.write("                <td><a href=\"AdminHomePage.jsp\">Go Back</a></td>\n");
      out.write("            </tr>\n");
      out.write("                                     ");


        } catch (Exception ex) {
            out.println(ex.toString());
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
