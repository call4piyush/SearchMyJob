<%@page import="java.io.*,java.sql.*"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <link rel="stylesheet" href="reg/style55.css"/>
        <link rel="stylesheet" href="company/style6.css">
        <style>
            .tpo{
               background-image: url("Untitled_1.jpg");
               border-radius:25px;
               height: 250px;
               width: 100%;
               border-style: solid;
               border: 3px;
               border-color: #ddb421;
            
}
    </style>
   
    </head>
    <body style="margin:0px" bgcolor="#3f3f3f">
        <table  border="0" class="tpo">
    <tr>

        <td height="250" >
            <div id="header-wrapper2">
               
            <div id="header" class="container">
			<div id="logo">
                            
                            <div class="o"><a href="index.jsp"><font color="#ddb421">Home Page</font ></a></div>

			</div>

		<div id="social">
			<div>
                            <ul class="contact1">

					<h3><span>Today's date: <%= (new java.util.Date()).toLocaleString()%>
                                            </span></h3>

                                </ul>
			</div>
                </div></div>

<% try {

            String c1 = (String) session.getAttribute("s1");

%>
<p><marquee> <%
    out.println("Welcome to "+c1);

%></marquee></p>
                                  <%// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    %>


            <div id="menup" class="container">
			<ul>
			<div class="current_page_item">

                            <li><a  href="EditComProfile.jsp" accesskey="9" title="EDIT PROFILE">Edit Profile</a></li>
                                <li><a href="ComChangePassword.jsp" accesskey="2" title="CHANGE PASSWORD">Change&nbsp;Password</a></li>
                                <li ><a href="addjob.jsp" accesskey="3" title="JOB DETAIL">ADD</a></li>
                                <li><a href="ViewJobDetails.jsp" accesskey="3" title="JOB DETAIL">View</a></li>
                                <li><a href="createexam.jsp" accesskey="4" title="EXAM CREATION">Create</a></li>
                                <li><a href="ExamView.jsp" accesskey="4" title="EXAM VIEW">View</a></li>
                                <li><a href="addques.jsp" accesskey="5" title="QUES ADD">ADD</a></li>
                                <li><a href="quesview.jsp" accesskey="5" title="QUES VIEW">View</a> </li>
                                <li><a href="logout.jsp" accesskey="1" title="LOG OUT">Log Out</a></li>

                        </div></ul>
		</div>
            </div>
    </td>
    </tr>
    <tr>
    <td><div class="df" align="center"><font color="#ddb421">JOB DETAILS</font> </div>
    </td>
</tr>
<tr>
    <td><div class="g" align="center"><font color="#ddb421">examination</font> </div>
    </td>
</tr>
<tr>
    <td><div class="f" align="center"><font color="#ddb421">Question</font> </div>
    </td>
</tr>
        <table width="100%" border="0" >
     <td width="961" bgcolor="#3f3f3f" valign="top"><form name="form1" action="ExamView.jsp">
                        <table width="277" height="128" border="0" align="center"  >
                            <tr>
                                <td height="49" colspan="2"><div align="center" class="style1">
                                        Exam View
                                </div></td>
                            </tr>
                            <%
        String jid = request.getParameter("jobid");
        //out.print(jid);
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
            	 
              //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                //Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                            %>
                            <tr>
                                <td width="135" height="42" class="rt"><span class="style1">Select a Job ID </span></td>
                                <td width="132">
                                    <center>    <label >
                                        <select name="jobid">
                                            <%       rs = st.executeQuery("select * from job_details");
                            String s1 = null;

                            while (rs.next()) {
                                s1 = rs.getString("JobId");


                                            %>
                                            <option value="<%=s1%>"><%=s1%></option>
                                            <%     }
                                            %>
                                        </select>
                                        </label></center>
                                </td>
                            </tr>
                            <tr><td colspan="2" height="40  "><center> <input type="submit" value="Show Details"></center> </td></tr>
                        </table>
                    </form>

                    <%
                            } else {
                                jid = request.getParameter("jobid");
                                
                                Statement st = con.createStatement();

                                rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                                String s2 = null;
                                while (rs.next()) {
                                    s2 = rs.getString("Post");
                                }
                    %>
                    <table width="100%" height="54" border="1" align="center" class="op">

                        <tr>
                            <td class="er">Exam ID </td>
                            <td class="er">Exam Name </td>
                            <td class="er">Cutoff % </td>
                            <td class="er">Edit</td>
                            <td class="er">Delete</td>
                        </tr>

                        <%    Statement st2 = con.createStatement();
                                ResultSet rs2 = st2.executeQuery("select * from Exam where JobId='" + jid + "'");

                                while (rs2.next()) {
                                    String eid = rs2.getString("ExamID");
                                    String ename = rs2.getString("ExamName");
                                    String ecut = rs2.getString("CutOff");
                        %>
                        <tr valign="top">
                            <td class="eu"><%=eid%></td>
                            <td class="eu"><%=ename%></td>
                            <td class="eu"><%=ecut%></td>
                            <td class="eu"><a href="EditExam.jsp?eid=<%=eid%>&jid=<%=jid%>">Edit</a></td>
                            <td class="eu"><a href="DeleteExam.jsp?eid=<%=eid%>">Delete</a></td>
                        </tr>
                        <%
                }
            }
        } catch (Exception e) {
            out.println(e);
        }
                        %>
                    </table>

                </td>
            
        </table>
         </table>
    </body></html>
    