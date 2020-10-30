<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .bh{
                 color: #ffffff;
                background-color:#55503b;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform: uppercase;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-width: 1px;
               text-transform: capitalize;
}
 .k{color: black;
                                border-width: 1px;
               background-color:#3F3F3F;
                height: 40px;
                border-radius:8px;
                text-align: center;

                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-left-style: double;
                 color:wheat;
            }
    </style>
    </head>
    <body style="margin: 0px;" bgcolor="#3f3f3f">
       <table width="100%" border="1" >
<%
        String sql = "";
        Statement st;
        // out.println(uname);
        
        try {
            sql = "select * from Result";

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
                    %>

                        <tr >
                            <td class="bh">Student ID</td>
                            <td class="bh">Exam ID</td>
                            <td class="bh">Job ID</td>
                            <td class="bh">Mark</td>
                        </tr>
          <%
                        while (rs.next()) {
                          d1=rs.getString("StudentId");
                          d2=rs.getString("ExamId");
                          d3=rs.getString("JobId");
                          d4=rs.getString("mark");

                        }%>
        <tr>
            <td class="k"><%=d1%></td>
            <td class="k"><%=d2%></td>
            <td class="k"><%=d3%></td>
            <td class="k"><%=d4%></td>
        </tr>
                    
                    <%

        } catch (Exception ex) {
            out.println(ex.toString());
        }
                    %>
</table>
    </body>
</html>
