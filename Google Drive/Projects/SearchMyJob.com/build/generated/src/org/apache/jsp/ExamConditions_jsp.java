package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class ExamConditions_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        
        Statement st = null, st2 = null;
        String sql = null;
        try {
        	  
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
            //con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
        } catch (Exception ex) {
            out.println("Error: " + ex.toString());
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>www.SearchMyJob.com</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write(".style15 {\r\n");
      out.write("\tfont-family: \"Comic Sans MS\";\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tcolor: #990000;\r\n");
      out.write("}\r\n");
      out.write(".style17 {color: #CAF2FF}\r\n");
      out.write(".style18 {font-weight: bold; font-size: 18px;}\r\n");
      out.write("\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin:0px\" bgcolor=\"#3f3f3f\" >\r\n");
      out.write("        <table width=\"100%\" border=\"0\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"250\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "canheader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <center>\r\n");
      out.write("                <td width=\"961\"  valign=\"top\"><table  width=\"967\" height=\"200\" border=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"957\" height=\"34\"><div align=\"center\"><span class=\"style15\">Online Exam </span></div></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"100\" valign=\"top\"><table style=\"box-shadow:10px 10px 160px black; border-radius:25px; \" width=\"565\" border=\"0\" align=\"center\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td style=\"border-radius:25px;\" width=\"573\" height=\"123\" valign=\"top\" bgcolor=\"#666600\"><div align=\"center\" class=\"style17\"><span class=\"style18\"><br/> The duration of the exam is 5 minutes. There is no order to answer a question.You may use Next as well as Previous button to get a question to answer. </span></div></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td valign=\"top\"><form name=\"form1\" method=\"post\" action=\"ExamConduct.jsp\">\r\n");
      out.write("                               \r\n");
      out.write("                          <label>\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                              <input name=\"Submit\" type=\"submit\" class=\"style18\" value=\"Start Exam\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </label>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("             \r\n");
      out.write("                </table></td>\r\n");
      out.write("            </center>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
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
