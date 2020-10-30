<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style4.css">
        
    </head>
    <body>
        <table width="100%" height="89" border="0" align="center" bgcolor="#3F3F3F">
      <tr>
          <td class="d" colspan="7">Company Details</td>
      </tr>
      <tr>
       <td class="style">Name</td>
       <td class="style">Address</td>
       <td class="style">Post</td>
       <td class="style">Criteria</td>
       <td class="style">Email</td>
       <td class="style">ContactNo:</td>
       <td class="style">Cutoff % </td>

             <%

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
    //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select * from Com");
        while(rs.next())
            {
   %>
      <tr>
        <td class="style1" >
        <% out.println(rs.getString("CName"));%>
        </td>
        <td class="style1">
          <% out.println(rs.getString("CAddress"));%>
       </td>
       <td class="style1">
          <% out.println(rs.getString("CPost"));%>
        </td>
        <td class="style1">
          <% out.println(rs.getString("CCriteria"));%>
        </td>
        <td class="style1">
          <% out.println(rs.getString("CEmail"));%>
       </td>
        <td class="style1">
          <% out.println(rs.getString("CContact"));%>
        </td>
        <td class="style1">
          <% out.println(rs.getString("CCutoff"));%>
        </td>
      </tr>
      <%
      }//while
      }//try
      catch(Exception e)
              {
          out.println(e);
              }
            %>
         </table>
    </body>
</html>
