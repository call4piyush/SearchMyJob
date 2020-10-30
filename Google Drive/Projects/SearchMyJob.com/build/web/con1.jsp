<%@page language="java" import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            a{
                color: #990000;
                text-decoration: none;
                font-size: large;
}
body{
    margin-top: 300px;
    color: white;
    text-transform: capitalize;
}
        </style>
    </head>
    <body bgcolor="#3f3f3f">
      <%
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


                  %>
                  <center> Your message has been successfully submitted<br/><br/>
                      <br/><br/>
                  <a href="index.jsp">GO Back</a>
                  </center>
    </body>
</html>
