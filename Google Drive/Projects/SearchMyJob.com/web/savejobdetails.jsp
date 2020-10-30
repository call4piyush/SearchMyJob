<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <style>
    b{
        color: white;
        font-size: 40px;
}
p,a{
    color: darkred;
    font-size: 25px;
}
body{
    background-color: #3F3F3F;
}
</style>
</head>
<body >
         <% try
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
          Statement st2=con.createStatement();
          
         // String stat="c";
         // st2.executeUpdate("insert into Login values('"+request.getParameter("comusername")+"','"+request.getParameter("compassword")+"','"+stat+"')");
          st.executeUpdate("insert into job_details values('"+request.getParameter("jobid")+"','"+request.getParameter("post")+"','"+request.getParameter("criteria")+"','"+request.getParameter("vacancies")+"','"+request.getParameter("salary")+"','"+request.getParameter("lastdate")+"')");
          st2.executeUpdate("insert into exam values('"+request.getParameter("jobid")+"','"+request.getParameter("post")+"')");
          System.out.println(request.getParameter("jobid"));
           st.close();
           st2.close();
           
             }
       
        
           catch(Exception e)
                   {
                   }
        
           %>

        <table bgcolor="#3F3F3F" border="0" width="100%">
    <tr>
        <td height="645"><center>
                <b><%out.println("Data submitted Succesfully");%>
                </b>
                <p><a href="addjob.jsp">Go Forward</a></p>
            </center>
        </td>
    </tr>
</table>
</html>
