<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidate Resume</title>
        <style>

            td{
                color:#990000;
                border-radius:10px;
                font-size: large;
                background-color:burlywood;
                height: 40px;
                text-transform: capitalize;
                text-align: center;
                width: 25%;
}
td a{
    color:indigo;
}
        </style>

    </head>
    <body bgcolor="#3f3f3f" >
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
       // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
        try {
            String uid = request.getParameter("uid");
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();

            rs = st.executeQuery("select Name,Gender,dob,College,CollegePhone,CollegeEmail,branch,MarkDegree,degree,username,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
            s15="",s16="",s17="",s18="";
            while (rs.next()) {
                s1 = rs.getString("Name");
                s2 = rs.getString("Gender");
                s3 = rs.getString("Dob");
                s4 = rs.getString("College");
                s5 = rs.getString("CollegePhone");
                s6 = rs.getString("CollegeEmail");
                s7 = rs.getString("markDegree");
                s8 = rs.getString("degree");
                s9 =  rs.getString("Email");
                s10 = rs.getString("Telephone");
                s11 = rs.getString("Address");
                s12 = rs.getString("State");
                s13 = rs.getString("Pin");
                s14 = rs.getString("sel_cat");
                s15 = rs.getString("branch");
                s16 = rs.getString("username");

        %>
        <table border="0" align="center" height="100%" width="50%" >
            <tr><td colspan="2">resume</td></tr>
            <tr><td colspan="2">username is <%=s16%></td></tr>
            <tr>
                <td>Name</td>
                 <td><%=s1%></td>
            </tr>
             <tr>
                <td>gender</td>
                 <td><%=s2%></td>
            </tr>
             <tr>
                <td>date_of_birth</td>
                 <td><%=s3%></td>
            </tr>
             <tr>
                <td>college Name</td>
                 <td><%=s4%></td>
            </tr>
             <tr>
                <td>college phone</td>
                 <td><%=s5%></td>
            </tr>
             <tr>
                <td>college email</td>
                 <td><%=s6%></td>
            </tr>
             <tr>
                <td>branch</td>
                 <td><%=s15%></td>
            </tr>
             <tr>
                <td>marks</td>
                 <td><%=s7%>%</td>
            </tr>
             <tr>
                <td>degree</td>
                 <td><%=s8%></td>
            </tr>
             <tr>
                <td>email_id</td>
                 <td><%=s9%></td>
            </tr>
             <tr>
                <td>telephone</td>
                 <td><%=s10%></td>
            </tr>
             <tr>
                <td>address</td>
                 <td><%=s11%></td>
            </tr>
             <tr>
                <td>state</td>
                 <td><%=s12%></td>
            </tr>
             <tr>
                <td>pin code</td>
                 <td><%=s13%></td>
            </tr>
             <tr>
                <td>category</td>
                 <td><%=s14%></td>
            </tr>
                 <%
            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            %>
             <tr>
                 <td colspan="2"><a href="AdminHomePage.jsp">&laquo; go to home</a></td>

            </tr>
        </table>
    </body>
</html>
