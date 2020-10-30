<%@page import="java.io.*,java.sql.*" session="true"%>
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
           // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
        } catch (Exception ex) {
            out.println("Error: " + ex.toString());
        }
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.io.*,java.sql.*;"session="true"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            <!--
            .style1 {
                font-size: 18px;
                font-weight: bold;
                color: #FF0000;
                font-family: "Comic Sans MS";
            }
            .style7 {color: white; font-weight: bold;
            text-align: center;}
            .style14 {color: #006699}
            body{
                background-color: #3F3F3F;
}
select{
    overflow:hidden;
    width: 50px;
    border-radius:10px;
    background-color: #3f3f3f;
    color: white;
}
.ft{
    color: wheat;
    font-size: large;
    font-weight: bold;
    text-align: center;
}
            -->
        </style>
    </head>
    <body style="margin:0px">
        <table width="100%" border="0" bgcolor="#3f3f3f">
            <tr>
                <td height="250" colspan="2"><jsp:include page="canheader.jsp"/></td>
            </tr>
            <tr>
                
                <td width="961" valign="top">
                    <table width="304" height="243" border="0" align="center">
                        <tr>
                            <td colspan="2"><div align="center" class="style1">
                                    Exam
                                    <p>&nbsp;</p>
                            </div></td>
                        </tr>
                        <tr>


                        <%
        String jid = request.getParameter("jobid");
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
            if (jid == null) {
                        %>
                        <form name="exam1" action ="ExamConduct.jsp">
                            <td width="200" height="40"> <div align="center">   <span class="style7">Select a Job ID </span></div></td>
                            <td width="112">
                                <center>
                                <select name="jobid">
                                    <%
                               rs = st.executeQuery("select * from job_details");
                                String s1 = null;
                                // String s2=null;
                                while (rs.next()) {
                                    s1 = rs.getString("JobId");
                                    //    s2=rs.getString("Post");
                                    out.println("<option value='" + s1 + "'>" + s1 + "</option>");
                                }//while

                                    %>
                                </select></center>
                            </td>
                            <tr><td colspan="2"> <div align="center">
                                        <input style="border-radius:12px; width: 50px;
                                               height:30px; " type="submit" value="OK ">
                            </div></td></tr>
                        </form>
                        <%
                            }//if
                            else {
                                jid = request.getParameter("jobid");
                                sql = "select Post from Exam where JobID='" + jid + "'";
                                rs = st.executeQuery(sql);
                                String post = null;
                                if (rs.next()) {
                                    post = rs.getString("Post");
                                }
                                rs.close();


                        %> <form name="examSelection" action ="11.jsp">
                            <tr>
                                <td><span class="style7"><div align="center">Post Name :</div></span></td>
                                <td class="ft"><%=post%></td>
                                
                            </tr>

                            
                            <tr>
                                <td height="30" class="style7">Select an Exam</td>
                                <td><center><select style="width: 80px;" name="examid">

                                        <%
                                sql = "select ExamID,ExamName from Exam where JobID='" + jid + "'";
                                rs = st.executeQuery(sql);
                                String exname = null;
                                String exid = null;
                                while (rs.next()) {
                                    exid = rs.getString("ExamID");
                                    exname = rs.getString("ExamName");
                                    out.println("<option value='" + exid + "'>" + exname + "</option>");
                                }
                                        %>
                                        </select></center>
                                </td>
                                
                            </tr>
                            <tr>
                                <td colspan="2"><center>
                                        <input type="submit" value="OK" style="border-radius:12px; width: 50px;height:30px;"></center>
                                </td>
                            </tr>
                        </form>
                    </table>
                    <p>&nbsp;</p>

                    <%

                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", post);
            }//else
        }//try
        catch (Exception e) {
            out.println(e);
        }
                    %>

                </td>

            </tr>
        </table>
    </body>
</html>
