<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .i{
                color: #ffffff;
                background-color:#55503b;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform:capitalize;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-width: 1px;
            }
            .k{color: black;
                                border-width: 1px;
               background-color:#3F3F3F;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform: uppercase;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-left-style: double;
                 color:wheat;
            }
.k a{
    text-transform: capitalize;
    text-decoration: none;
    color:white;
}
body{
    margin: 0px;
}

        </style>
    </head>
    <body bgcolor="#3F3F3F">
        <table width="100%" height="87" border="0" align="center" >
          <tr>
          <td height="10">
              
              
          </td>
      </tr>
            <tr>
              <td colspan="8" class="i">job details</td>
          </tr>
          <tr>
            <td class="i">Job ID</td>
            <td class="i">Post</td>
            <td class="i">Criteria</td>
            <td class="i" >Vacancies</td>
            <td class="i">Salary/Annum</td>
            <td class="i">Last Date</td>
            <td class="i">view details</td>
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
  		    con = DriverManager.getConnection(url+dbName, userName, password);   // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      //Connection conn=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select * from job_details");
            String  jid="",jpost="",jcriteria="",jvac="",jsal="",jdate="";
        while(rs.next())
            {
			jid=rs.getString("JobId");
                        jpost=rs.getString("Post");
                        jcriteria=rs.getString("Criteria");
                        jvac=rs.getString("NoOfVacancies");
                        jsal=rs.getString("Salary");
                        jdate=rs.getString("LastDate");

      %>
      
      <tr>
        <td class="k">
         <%=jid%>
        </td>
        <td class="k">
          <%=jpost%>
        </td>
        <td class="k">
          <%=jcriteria%>
        </td>
        <td class="k">
          <%=jvac%>
        </td>
        <td class="k">
          <%=jsal%>
       </td>
        <td class="k">
          <%=jdate%>
       </td>
       <td class="k">
           <a href="login.jsp">full detail</a>
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
