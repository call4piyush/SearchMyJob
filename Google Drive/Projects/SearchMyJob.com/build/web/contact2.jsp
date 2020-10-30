<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            td{
                text-align: center;
                height: 40px;
                border-radius:10px;
                width: 70px;
                border-style: dotted;
}
body{
    color: white;
    background-color: #3f3f3f;
}
.fr{
    width: 90px;
    background-color:#99b7a2;
    color: black;
    font-size: large;
}
.re{
    background-color:#99b7a2;
    color: black;
    font-size: large;
}
a{
    color: cadetblue;
    font-size: large;
}
        </style>
    </head>
    <body style="margin: 0px;">
        <table width="100%" border="1" >
            <%         String sql = "";
        Statement st;
        // out.println(uname);

        try {
            sql = "select * from contact";

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
            String d1="";
            String d2="";
            String d3="";
            String d4="";
            String d5="";
                    %>
            <tr>
                <td class="re">Name</td>
                <td class="re">Address</td>
                <td class="re">Email_Id</td>
                <td class="re">Phone No</td>
                <td class="fr">Message</td>
                <td class="re">Go Back</td>
            </tr>
             <%
                        while (rs.next()) {
                          d1=rs.getString("name");
                          d2=rs.getString("address");
                          d3=rs.getString("emailid");
                          d4=rs.getString("contactno");
                         d5=rs.getString("message");

                        }%>
            <tr>
                <td><%=d1%></td>
                <td><%=d2%></td>
                <td><%=d3%></td>
                <td><%=d4%></td>
                <td><%=d5%></td>
                <td><a href="AdminHomePage.jsp">Go Back</a></td>
            </tr>
                                     <%

        } catch (Exception ex) {
            out.println(ex.toString());
        }
                    %>
        </table>
    </body>
</html>
