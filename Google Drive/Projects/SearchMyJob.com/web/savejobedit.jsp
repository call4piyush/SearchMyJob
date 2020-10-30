<%@page  import="java.sql.*" %>
<%@page import="java.io.*,java.sql.*,java.util.*,java.util.Vector;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>www.SearchMyJob.com</title>
        <style type="text/css">
            <!--
            body {
                background-color: #3f3f3f;
            }
            .opo{
                text-align: center;
                color: white;
                width: 250px;
                height: 40px;
                font-size: 30px;

}
            -->
    </style></head>
    <body>
        <table align="center" width="500" style="margin-top: 300px">
            <% try {
            String jid = request.getParameter("jobid");
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
            //Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();
            st.executeUpdate("Update job_details set Post='" + request.getParameter("post") + "',Criteria='" + request.getParameter("criteria") + "',NoOfVacancies='" + request.getParameter("vacancies") + "',Salary='" + request.getParameter("salary") + "',LastDate='" + request.getParameter("lastdate") + "' where JobId='" + jid + "'");
            %>
            <tr><td class="opo">  <%out.println("You have Successfully Edited!!!");%></td></tr>
            <%   } catch (Exception e) {
            out.println(e);
        }

            %>
        
        
            <tr><td td class="opo">
            <a href="ViewJobDetails.jsp"><strong>Goto Home</strong></a>
        </td></tr>
    </table>
    </body>
</html>
