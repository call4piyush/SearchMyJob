<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true" import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
    </head>
    <style>
.ro{
            text-align: center;
    border-radius: 20px;
    height: 50px;
    
   

   font-size: 20px;
}
.lk{
    width: 100%;
    border-color: #b92d71;
    border-radius:20px;
}
    </style>
    <body>
           <%
        String uname = session.getAttribute("s1").toString();
        String sql = "";
        Statement st;
        // out.println(uname);
        try {
            sql = "select * from Result where studentID='" + uname + "'";
            
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
           // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
            rs = st.executeQuery(sql);
                    %>

                    <table class="lk" border="1" align="center">
                        <tr >
                            <td class="ro">Student ID</td>
                            <td class="ro">Exam ID</td>
                            <td class="ro">Job ID</td>
                            <td class="ro">Mark</td>
                        </tr>
                        <%
                        while (rs.next()) {
                            out.println("<tr>");
                            out.println("<td>" + rs.getString(1) + "</td>");
                            out.println("<td>" + rs.getString(2) + "</td>");
                            out.println("<td>" + rs.getString(3) + "</td>");
                            out.println("<td>" + rs.getString(4) + "</td>");

                            out.println("</tr>");
                        }%>
                    </table>
                    <%

        } catch (Exception ex) {
            out.println(ex.toString());
        }
                    %>
               
                    <table border="1" class="lk">
                        <tr><td height="150">iofyoygiosyhgisoy</td></tr>
                    </table>
    </body>
</html>
