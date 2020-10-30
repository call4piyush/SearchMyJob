<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Candidate Resume</title>
        <style>
            body{
                margin: 0px;
}
td{
    width:50%;
    height: 60px;
    text-align: center;
    font-size: 25px;
}
a{
    text-decoration: none;
    font-size:30px;
    text-transform: capitalize;
    color: #00a2d3;
}
body{
    background-color: #3f3f3f;
    color: white;
}
        </style>
    </head>
    <body>
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

            rs = st.executeQuery("select Name,Gender,dob,College,password,CollegePhone,CollegeEmail,branch,MarkDegree,degree,username,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
            s15="",s16="",s18="";
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
                String s17=rs.getString("password");
        %>
        <table border="0" width="100%" >
            <tr>
                <td colspan="2">Username &rArr; <%=s16 %> </td>
               
            </tr>
            <tr>
                <td>Name &rArr; <%=s1 %>
                </td>
                <td>Gender &rArr; <%=s2 %> </td>
            </tr>
            <tr>
                <td>Date_Of_Birth &rArr; <%=s3 %> </td>
                <td>College Name &rArr; <%=s4 %> </td>
            </tr>
            <tr>
                <td>College Phone &rArr; <%=s5 %> </td>
                <td>College E_mail &rArr; <%=s6 %> </td>
            </tr>
            <tr>
                <td>Degree &rArr; <%=s8 %> </td>
                <td>Branch &rArr; <%=s15 %> </td>
            </tr>
            <tr>
                <td>Marks &rArr; <%=s7 %>% </td>
                <td>Email_id &rArr; <%=s9 %></td>
            </tr>
            <tr>
                <td>Telephone &rArr; <%=s10 %> </td>
                <td>Address &rArr; <%=s11 %> </td>
            </tr>
            <tr>
                <td>State &rArr; <%=s12 %>  </td>
                <td>Pin Code &rArr; <%=s13 %> </td>
            </tr>
            <tr>
                <td>Category &rArr; <%=s14 %> </td>
                <td>Password &rArr; <%=s17 %> </td>
            </tr>
                             <%
            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            %>
            <tr>
                <td colspan="2"><a href="AdminHomePage.jsp">go back</a></td>
            </tr>
        </table>
    </body>
</html>
