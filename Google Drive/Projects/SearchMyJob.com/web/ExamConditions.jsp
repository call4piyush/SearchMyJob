<%@page import="java.io.*,java.sql.*;"session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        
        Statement st = null, st2 = null;
        String sql = null;
        try {
        	  
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
            //con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
        } catch (Exception ex) {
            out.println("Error: " + ex.toString());
        }
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>www.SearchMyJob.com</title>
        <style type="text/css">
            <!--
.style15 {
	font-family: "Comic Sans MS";
	font-size: 24px;
	color: #990000;
}
.style17 {color: #CAF2FF}
.style18 {font-weight: bold; font-size: 18px;}

            -->
        </style>
</head>
<body style="margin:0px" bgcolor="#3f3f3f" >
        <table width="100%" border="0" >
            <tr>
                <td height="250" colspan="2"><jsp:include page="canheader.jsp"/></td>
            </tr>
            <tr>
            <center>
                <td width="961"  valign="top"><table  width="967" height="200" border="0">
                  <tr>
                    <td width="957" height="34"><div align="center"><span class="style15">Online Exam </span></div></td>
                  </tr>
                  <tr>
                    <td height="100" valign="top"><table style="box-shadow:10px 10px 160px black; border-radius:25px; " width="565" border="0" align="center">
                      <tr>
                        <td style="border-radius:25px;" width="573" height="123" valign="top" bgcolor="#666600"><div align="center" class="style17"><span class="style18"><br/> The duration of the exam is 5 minutes. There is no order to answer a question.You may use Next as well as Previous button to get a question to answer. </span></div></td>
                      </tr>
                      <tr>
                        <td valign="top"><form name="form1" method="post" action="ExamConduct.jsp">
                               
                          <label>
                            <div align="center">
                              <input name="Submit" type="submit" class="style18" value="Start Exam">
                              </div>
                          </label>
                        </form>
                        </td>
                      </tr>
                    </table></td>
                  </tr>
             
                </table></td>
            </center>
            </tr>
        </table>
    </body>
</html>
