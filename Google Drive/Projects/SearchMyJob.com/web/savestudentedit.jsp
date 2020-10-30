<%@page import="java.io.*" session="true"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
              <style>
            table{
                margin-top:230px;
}
            td{color: bisque;
               text-align: center;
               height: 40px;
               font-size: 25px;
               padding-top:0px;
               margin-bottom: 52px;
}
td a{
    color:white;
    text-decoration: none;
}
        </style>
    </head>
     <body bgcolor="#3F3F3F">

        <table align="center" border="0" >
       <tr>   
        <%
        try {
            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");
            String old_cat = request.getParameter("category");
            String new_cat = request.getParameter("cat");
            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
             
          //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();

            String name = request.getParameter("name");
            String college = request.getParameter("college");
            String coph = request.getParameter("collegephone");
            String cemail = request.getParameter("collegeemail");
            String degree = request.getParameter("markDegree");
            String email = request.getParameter("email");
            String ph = request.getParameter("telephone");
            String add = request.getParameter("address");
            String state = request.getParameter("state");
            String pin = request.getParameter("pin");
            String expyears = request.getParameter("expyears");
           
            rs = null;
            if (old_cat.equalsIgnoreCase("Fresher") && new_cat == null) {
                new_cat = "Fresher";
            } else if (old_cat.equalsIgnoreCase("Experienced")) {
                new_cat = "Experienced";
            }
            String a = "Update Details2 set Name='" + name + "',College='" + college +
                    "',CollegePhone='" + coph + "',Colle='" + cemail +
                    "',markDegree='" + degree + "',email='" + email + "',Telephone='" +
                    ph + "',Address='" + add + "',State='" + state +
                    "',Pin='" + pin + "',sel_cat='" + new_cat + "' where Username='" + c1 + "'";
            st.executeUpdate(a);
            String q = null;
            if (old_cat.equalsIgnoreCase("Fresher") && new_cat.equalsIgnoreCase("Experienced")) {
                q = "insert into Experienced values('" + c1 + "','" + request.getParameter("expyears") +
                        "','" + request.getParameter("company") + "','" + request.getParameter("designation") +
                        "','" + request.getParameter("salary") + "','" + request.getParameter("comAddress") +
                        "')";
            } else if (old_cat.equalsIgnoreCase("Experienced")) {
                q = "Update Experienced set Exp_Year='" + request.getParameter("expyears") + "',Company='" +
                        request.getParameter("company") + "',Designation='" + request.getParameter("designation") +
                        "',Salary='" + request.getParameter("salary") + "',ComAddress='" + request.getParameter("comAddress") +
                        "'where Username='" + c1 + "'";
            }
            if (q != null) {
                st2.executeUpdate(q);
            }


        %>
        <td><%out.println("You have Successfully Edited!!!");%></td>
        <%
        } //try
        catch (Exception e) {
            out.println(e);
        }
        %>
        <tr>
               <td >
        <a href="CandidateHomePage.jsp"><strong>Goto Home</strong></a>
         </td>
       </tr>
        </table>
        
    </body>
</html>
