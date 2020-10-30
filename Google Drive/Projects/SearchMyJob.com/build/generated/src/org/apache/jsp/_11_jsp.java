package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.sql.*;;

public final class _11_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


        String examID = request.getParameter("examid");
        String jobID = session.getAttribute("jobid").toString();

        String studentid=session.getAttribute("s1").toString();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = null;
        int[] ar = new int[10];
        int i = 0;
        if (request.getParameter("examid") != "") {
            while (i < 10) {
                double x = Math.random();
                String t = String.valueOf(x * 20);
                t = t.substring(0, t.indexOf("."));
                int b = Integer.parseInt(t);
                //out.println(b + "<br>");
                boolean flag = false;
                for (int n = 0; n <ar.length; n++) {

                    if (b <= 0 || ar[n] == b) {
                        flag = true;
                    }

                }
                if (flag == false) {
                    ar[i] = b;
                    i++;
                }
            }//while
            try {

                for (int n = 0; n <ar.length; n++) {
                	  
           		    String url = "jdbc:mysql://localhost:3306/";
           		    String dbName = "online";
           		    String driverName = "com.mysql.jdbc.Driver";
           		    String userName = "root";
           		    String password = "root";
           		    ResultSet rs1;
           		    Class.forName(driverName).newInstance();
           		    con = DriverManager.getConnection(url+dbName, userName, password);
                      
                   // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                    st = con.createStatement();
                    
                    rs = st.executeQuery("select * from Question Where JobId='" + jobID + "' and ExamId='" + examID + "' and QuestionNo='"+(n+1)+"'");
                    if (rs.next()) {
        
                        sql="insert into data values('" + studentid + "','" + (n+1) + "','" + rs.getString(4) +"','" + rs.getString(5) +"','" +rs.getString(6) +"','" + rs.getString(7) + "','" + rs.getString(8) + "','" + rs.getString(9) + "')";
                        //out.println(sql + "<br>");

                        st.executeUpdate(sql);
                    }
                }
                session.setAttribute("mark","0");
                session.setAttribute("examid", examID);
                response.sendRedirect("dispqst.jsp?qno=1");
            } catch (Exception ex) {
                out.println("Error: Cannot go forward<br>" + ex.toString() );
            }

        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
