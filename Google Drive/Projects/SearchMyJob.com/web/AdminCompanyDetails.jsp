<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
       <style>
          .tyu{ color: #ffffff;
                background-color:#55503b;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform: uppercase;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-width: 1px;
          }
          .dg{
        color: black;
                                border-width: 1px;
               background-color:#d1c79d;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform:none;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-left-style: double;
            }
.dg a{
    text-decoration: none;
    color:#3F3F3F;
}
       </style>
</head>
    <body>
        <table width="100%" height="" border="1" bgcolor="#3f3f3f">
      <tr>
          <td class="tyu" colspan="8">Company Details </td>
      </tr>
      <tr>
        <td class="tyu">Company Name</td>
        <td class="tyu">Address</td>
        <td class="tyu">Post</td>
        <td class="tyu">Username</td>
        <td class="tyu">Phone</td>
        <td class="tyu">Email ID</td>
        <td class="tyu">Cutoff % </td>
        <td class="tyu">Delete</td>
      </tr>
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
       
   // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
      rs=st.executeQuery("select * from Com");
      String cname;
      String name="",add="",post="",uname="",phone="",email="",cutoff="";

        while(rs.next())
            {
            name=rs.getString("CName");
            add=rs.getString("CAddress");
            post=rs.getString("CPost");
            uname=rs.getString("CUsername");
            phone=rs.getString("CContact");
            email=rs.getString("CEmail");
            cutoff=rs.getString("CcutOff");
      %>
      <tr>
        <td height="22" class="dg">
          <%=name%>
        </td>
        <td class="dg">
          <%=add%>
        </td>
        <td class="dg">
          <%=post%>
        </td>
        <td class="dg">
          <%=uname%>
        </td>
        <td class="dg">
          <%=phone%>
        </td>
        <td class="dg">
          <%=email%>
        </td>
        <td class="dg">
          <%=cutoff%>
        </td>
        <td class="dg">
          <% out.println("<a href='ComDelete.jsp?id="+uname+"'>Delete</a>");%>
        </td>
      </tr>
      <%
      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            %>
    </table>
   	
</body>
</html>

