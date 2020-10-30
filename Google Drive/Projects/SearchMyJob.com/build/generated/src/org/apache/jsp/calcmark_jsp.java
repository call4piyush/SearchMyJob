package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class calcmark_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>www.SearchMyJob.com\n");
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"calcmark.jsp\">\n");
      out.write("    <input name=\"OK\" type=\"submit\" id=\"OK\" value=\"Submit\" />\n");
      out.write("</form>\n");
      out.write("\n");

         String sql;
	   int mark = Integer.parseInt(session.getAttribute("mark").toString());
	     
	  
        String ch = request.getParameter("ch");
        String ans = request.getParameter("ans");
        int qno = Integer.parseInt(request.getParameter("qno"));
        if (ch != null) {
//out.println("Ch=" + ch + "<br> Ans=" + ans + "<br>Qno=" + qno + " Mark=" + mark);
            ch = ch.trim();
            ans = ans.trim();
            if (ch.equalsIgnoreCase(ans)) {
                mark++;
                session.setAttribute("mark",String.valueOf(mark));

            }
        }
        if (qno < 10) {
            response.sendRedirect("dispqst.jsp?qno=" + (qno + 1));
        } else {
            try {
            	  
                Connection con=null;
       		    String url = "jdbc:mysql://localhost:3306/";
       		    String dbName = "online";
       		    String driverName = "com.mysql.jdbc.Driver";
       		    String userName = "root";
       		    String password = "root";
       		    ResultSet rs,rs1;
       		    Statement st=null;
       		    Class.forName(driverName).newInstance();
       		    con = DriverManager.getConnection(url+dbName, userName, password);
                String studentid = session.getAttribute("s1").toString();
                sql = "delete from Data where StudentID='" + studentid + "'";
                
                 
                
                
              //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                st = con.createStatement();
                st.executeUpdate(sql);

                String examID = session.getAttribute("examid").toString();
                String jobID = session.getAttribute("jobid").toString();
                mark=Integer.parseInt(session.getAttribute("mark").toString());
                out.println(mark);
                sql="Insert into Result values('" + studentid + "','" +  examID + "','" + jobID + "'," + mark + ")";
                st.executeUpdate(sql);
                response.sendRedirect("dispresult.jsp");
            } catch (Exception ex) {
                out.println(ex.toString());
            }

        }


      out.write("\n");
      out.write("</body>\n");
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
