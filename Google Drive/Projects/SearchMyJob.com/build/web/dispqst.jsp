<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*" session="true" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Exam</title>
        <script>
function startTime()
{
var today=new Date();
var h=today.getHours();
var m=today.getMinutes();
var s=today.getSeconds();

// add a zero in front of numbers<10
m=checkTime(m);
s=checkTime(s);

document.getElementById('txt').innerHTML="Time  "+""+":"+h+":"+m+":"+s+":" ;
t=setTimeout(function(){startTime()},500);
}

function checkTime(i)
{
if (i<10)
  {
  i="0" + i;
  }
return i;
}
</script>
        <style>
            .dr{
                color: white;
                text-transform: capitalize;
                text-align: right;
                font-size: 30px;
}
body{
    margin: 0px;
}
.ter{
    color: white;
}
.df{
    color: burlywood;
    font-size: larger;
    font-weight: bold;
}
.hg{
    color: darkorange;
}
.frt{
    color:turquoise;
    text-align: center;
    font-size: 50px;
    height: 40px;
    text-transform: capitalize;
}
input[type=submit]{
    border-radius:25px;
    height: 30px;
    width:200px;
    background-color: #3F3F3F;
    color: antiquewhite;
    font-weight: 300;
    box-shadow:0px 0px 12px red;
}
        </style>
    </head>
    <body onload="startTime()">
        <%
        
        Statement st;
        String sql;
        int qno = Integer.parseInt(request.getParameter("qno"));
        String studentid = session.getAttribute("s1").toString();
        String qstn = "", ch1 = "", ch2 = "", ch3 = "", ch4 = "", ans = "";
        try {
            sql = "select * from data where StudentID='" + studentid + "' and QstNo=" + qno;
            
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
          //  con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                qstn = rs.getString(3);
                ch1 = rs.getString(4);
                ch2 = rs.getString(5);
                ch3 = rs.getString(6);
                ch4 = rs.getString(7);
                ans = rs.getString(8);
        %>


        <form action="calcmark.jsp" method="post">

            <table width="100%" height="670" border="0" bgcolor="#3f3f3f">
                <tr>
                    <td class="frt" colspan="2">Online Exam</td>
                </tr>
                <tr>
                    <td colspan="2"><div class="dr" ><div id="txt"></div></div></td>
                </tr>
                <tr>
                    <td class="ter" style="text-align: center;" width="100"><strong>Question <%=qno%>
                      </strong>
                      <input type="hidden" name="qno" value="<%=qno%>">                  </td>
                    <td class="df"><%=qstn%></td>
                </tr>
                <tr>
                    <td class="ter"><div align="center"><strong>Option 1</strong></div></td>
                    <td class="hg" width="460">
                      <strong>
                      <input name="ch" type="radio" value="<%=ch1%>">
                      <%=ch1%></strong></td>
                </tr>
                <tr>
                    <td class="ter"><div align="center"><strong>Option 2</strong></div></td>
                    <td class="hg">
                      <strong>
                      <input name="ch" type="radio" value="<%=ch2%>">
                      <%=ch2%></strong></td>
                </tr>
                <tr>
                    <td class="ter"><div align="center"><strong>Option 3</strong></div></td>
                    <td class="hg">
                      <strong>
                      <input name="ch" type="radio" value="<%=ch3%>">
                      <%=ch3%></strong></td>
                </tr>
                <tr>
                    <td class="ter"><div align="center"><strong>Option 4</strong></div></td>
                    <td class="hg">
                      <strong>
                      <input name="ch" type="radio" value="<%=ch4%>">
                      <%=ch4%></strong></td>
                </tr>
                <tr>
                    <td ><input type="hidden" name="ans" value="<%=ans%>"></td>
                    <%
                if (qno <= 9) {
                    %>
                    <td ><center><input type="submit" name="next" value="Next Question"></center></td>
                    <%} else {
                    %>
                    <td  width="199"><center><input type="submit" name="Finish" value="Finish"></center></td>
                    <%                }
                    %>
                </tr>
            </table>
        </form>
        <%            }
        } catch (Exception ex) {
            out.println(ex.toString());
        }
    //out.println(session.getAttribute("mark"));
%>
    
    </body>
</html>
