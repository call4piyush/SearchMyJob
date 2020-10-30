<%@page  import="java.sql.*" %>
<%@page import="java.io.*,java.sql.*,java.util.*,java.util.Vector;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
    </head>
    <body>
        <table>
    
<% try      
      {

            String jid=request.getParameter("jid");
            out.println(jid);
      
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
          //Connection conn=DriverManager.getConnection("jdbc:odbc:OnlineExam");
           Statement st=con.createStatement();
     st.executeUpdate("Delete from Job_Details where JobId='"+jid+"'");
       response.sendRedirect("ViewJobDetails.jsp");
   }//try
      
    catch(Exception e)
     {
        out.println(e);        
     }
%>
    </table>
    </body>
</html>
