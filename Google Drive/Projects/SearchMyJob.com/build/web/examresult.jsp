<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam result</title>
        <style>
        .ro{
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
}
.lk{
    width: 100%;
  background-color: #3f3f3f;
    border-radius:20px;
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
    <body bgcolor="#3f3f3f" style="margin: 0px;">
        <table   width="100%" border="0"  >
            <tr>
                <td height="250" colspan="" valign="top">
        <jsp:include page="canheader.jsp"></jsp:include>
    </td>
            </tr>
        </table>
    <table class="lk" border="1" valign="top">
        <tr>
            <td class="ro" colspan="4">
                EXAM DETAILS
            </td>
        </tr>
        <tr >
                            <td class="ro">Student ID</td>
                            <td class="ro">Exam ID</td>
                            <td class="ro">Job ID</td>
                            <td class="ro">Mark</td>
                        </tr>
        <%
        String uname = session.getAttribute("s1").toString();
        String sql = null;
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
     String  s="",s2="",s3="",s4="";
        while(rs.next())
            {
			s=rs.getString(1);
                        s2=rs.getString(2);
                        s3=rs.getString(3);
                        s4=rs.getString(4);
                     

      %>
   
<tr>
        <td class="k">
         <%=s%>
        </td>
        <td class="k">
          <%=s2%>
        </td>
        <td class="k">
          <%=s3%>
        </td>
        <td class="k">
          <%=s4%>
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
