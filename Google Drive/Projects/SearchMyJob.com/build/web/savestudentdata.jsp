<%@page import="java.io.*,java.sql.*;" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> User Register Sucessfully </title>
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
          // Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
           Statement st=con.createStatement();
           Statement st2=con.createStatement();
           Statement st3=con.createStatement();
           String status="s";

           st.executeUpdate("insert into details2 values('"+request.getParameter("name")+"','"+request.getParameter("gender")+"','"+request.getParameter("dob")+"','"+request.getParameter("college")+"','"+request.getParameter("collegephone")+"','"+request.getParameter("collegeemail")+"','"+request.getParameter("branch")+"','"+request.getParameter("markDegree")+"','"+request.getParameter("degree")+"','"+request.getParameter("username")+"','"+request.getParameter("password")+"','"+request.getParameter("email")+"','"+request.getParameter("telephone")+"','"+request.getParameter("address")+"','"+request.getParameter("state")+"','"+request.getParameter("pin")+"','"+request.getParameter("sel_cat")+"')");
		   st2.executeUpdate("insert into login values('"+request.getParameter("username")+"','"+request.getParameter("password")+"','"+status+"')");
          if(request.getParameter("sel_cat").equals("Experienced"))
		   {
           st3.executeUpdate("insert into experienced values('"+request.getParameter("username")+"','"+request.getParameter("expyears")+"','"+request.getParameter("company")+"','"+request.getParameter("designation")+"','"+request.getParameter("salary")+"','"+request.getParameter("comAddress")+"')");
		   }
                      st.close();
                      st2.close();
                      st3.close();
  ;         }

           catch(Exception e)
                   {
               out.println(e);
                   }

%>
                
        <table bgcolor="#3F3F3F" border="0" width="100%">
    <tr>
        <td height="645"><center>
                <b>  You have registered successfully!!!</b>
                <p><a href="login.jsp">Go Forward</a></p>
            </center>
        </td>
    </tr>
</table>
</body>
</html>
