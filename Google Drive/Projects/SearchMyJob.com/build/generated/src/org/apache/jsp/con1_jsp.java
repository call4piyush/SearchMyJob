package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class con1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            a{\n");
      out.write("                color: #990000;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: large;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    margin-top: 300px;\n");
      out.write("    color: white;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#3f3f3f\">\n");
      out.write("      ");

           String dd=request.getParameter("comaddress");
           String Name=request.getParameter("comname");
           String email=request.getParameter("comemail");
           String Phone=request.getParameter("comcontact");
           String message=request.getParameter("message");
        try{
            Connection con=null;
            String sql="insert into contact values('"+Name+"','"+dd+"','"+email+"','"+ Phone+"','"+message+"')";
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "online";
            String driverName = "com.mysql.jdbc.Driver";
   	    String userName = "root";
	    String password = "root";
   	    ResultSet rs,rs1;
   	    Class.forName(driverName);
           con = DriverManager.getConnection(url+dbName, userName, password);
               Statement st=con.createStatement();
               st.executeUpdate(sql);
               st.close();


   }  catch(Exception e)
                   {
               out.println(e);
                   }


                  
      out.write("\n");
      out.write("                  <center> Your message has been successfully submitted<br/><br/>\n");
      out.write("                      <br/><br/>\n");
      out.write("                  <a href=\"index.jsp\">GO Back</a>\n");
      out.write("                  </center>\n");
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
