<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
         <style>
            table{
                margin-top:230px;
}
            td{color: bisque;
               text-align: center;
               height: 40px;
               font-size: 25px;
               padding-top:0px;
               margin-bottom: 52px;
}
td a{
    color:white;
    text-decoration: none;
}
        </style>
    </head>
       <body bgcolor="#3F3F3F">

        <table align="center" border="0" >
       <tr>  
          <%try
          {
               String c2 = request.getParameter("user");
               // session.getAttribute("c1", c1);
                String c1 =request.getParameter("pass");
                
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
          // Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st=con.createStatement();
              st.executeUpdate("Update Login set Password='"+request.getParameter("newpass2")+"' where username='"+c2+"' and password='"+c1+"'");
              %>
          
          <td>You have successfully changed your Password</td>

             <%   }
        catch(Exception e)
                {
            out.println(e);
                }
        %>
        <tr>
               <td >
        <a href="CandidateHomePage.jsp"><strong>Goto Home</strong></a>
         </td>
       </tr>
        </table>
    </body>
</html>
