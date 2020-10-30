<%@page import="java.io.*,java.sql.*;"session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .ji{
                color: white;
                text-align: center;
                height: 40px;
                width: 400px;
font-size: 25px;
            }
.yh{
    text-align: center;
    height: 40px;
}
.yh a{
    color: #BBFFB1;
    text-decoration: none;
    text-align: center;
    font-size: larger;
}
.ko{
    margin-top:280px;
}
        </style>

    </head>
    <body bgcolor="#3f3f3f">
        <table class="ko" align="center" border="0">
           
    <% try
          {
        //  HttpSession s1=request.getSession();
            String a=(String)session.getAttribute("jobid");
            String b=(String)session.getAttribute("post");                    
           // response.sendRedirect("ExamCreation.jsp");
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
         //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
           Statement st=con.createStatement();
           st.executeUpdate("insert into Exam values('"+a+"','"+b+"','"+request.getParameter("examid")+"','"+request.getParameter("examname")+"','"+request.getParameter("cutoff")+"')");
    //  out.println("insert into Exam values('"+a+"','"+b+"','"+request.getParameter("examid")+"','"+request.getParameter("examname")+"','"+request.getParameter("cutoff")+"')");
   //   out.println("test");
      //     st.close();
          // st2.close();
           
             }
       
        
           catch(Exception e)
                   {
               out.println(e);
                   }
        
           %>
           <tr> <td class="ji">
               <%out.println("Data submitted successfully!!!");%>
            </td>
            
           </tr>
           <tr>
               <td class="yh">    <a href="CompanyHomePage.jsp"><strong>Goto Home</strong></a></td>
        </tr>
        </table>
    </body>
</html>
