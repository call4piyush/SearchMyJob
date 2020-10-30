package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class savequestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#3f3f3f\">\r\n");
      out.write("        \r\n");
      out.write("    ");

    String i="INCORRECT";
    String jobid=request.getParameter("jobid");
    System.out.println(jobid);
    String examid=request.getParameter("examid");
    String Qno=request.getParameter("Qno");
    String question=request.getParameter("question");
  /*  String option1=request.getParameter("option1");
    String option2=request.getParameter("option2");
    String option3=request.getParameter("option3");
    String option4=request.getParameter("option4");
    String answer=request.getParameter("answer");
    String Button=request.getParameter("Button");*/
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("         ");
 try
          {
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
         //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
           Statement st=con.createStatement();
           
         String sql1 = "Select * from Question where jobID='"+jobid+"'and QuestionNo='"+Qno+"'";
 		        rs1 =st.executeQuery(sql1);
 		    	if(rs1.next())
		    	{ 
      out.write("\r\n");
      out.write("                        <font color=\"white\" size=\"20\" > ");

                        out.println(i);
                        
      out.write("</font>\r\n");
      out.write("                        ");

 		    		/*String sql = "insert into Question values (?,?,?,?,?,?,?,?,?)";
 		   			System.out.println("sql" +sql);
 		   			PreparedStatement pst = con.prepareStatement(sql);
 		   			pst.setString(1, jobid);
 		   			pst.setString(2, examid);
 		   			pst.setString(3, Qno);
 		   			pst.setString(4, question);
 		   			pst.setString(5, option1);
 		   			pst.setString(6, option2);
 		   			pst.setString(7, option3);
 		   			pst.setString(8, option4);
 		   			pst.setString(9, answer);
 		   			int numRowsChanged = pst.executeUpdate();
 		   		 
 		   		out.println(" Inserted The Your's Data : ");
	    		out.println(" '" +jobid+"'");
 		   		
 		   		

 		   		pst.close();*/
 		 	    
 		       //   Statement st2=con.createStatement();
 		          
 		         // String stat="c";
 		         // st2.executeUpdate("insert into Login values('"+request.getParameter("comusername")+"','"+request.getParameter("compassword")+"','"+stat+"')");
 		        
 		         
 		         
 		          // st2.close();
 		    
		    	}
 		    	
 		    	else
 		    	{
 		 st.executeUpdate("insert into Question values('"+request.getParameter("jobid")+"','"+request.getParameter("examid")+"','"+request.getParameter("Qno")+"','"+request.getParameter("question")+"','"+request.getParameter("option1")+"','"+request.getParameter("option2")+"','"+request.getParameter("option3")+"','"+request.getParameter("option4")+"','"+request.getParameter("answer")+"')");
                        
      out.write("\r\n");
      out.write("         <font color=\"white\" size=\"20\" >");

                 out.println(" Question are added in the database:");
                                
      out.write("</font>\r\n");
      out.write("         ");

                 st.close();
             }
          }
        
         catch(SQLException SQLExcp)
			{
			out.println("SQLException:"+SQLExcp);

			}
  		catch(ClassNotFoundException clsNotFndExcp)
			{
 	 	out.println("cnnnot find the cklass"+clsNotFndExcp);
			}
           
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("           <p>  <font color=\"white\" size=\"20\" >    <a href=\"addques.jsp\">GO back</a></font></p>\r\n");
      out.write("        \r\n");
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
