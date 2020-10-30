<%@page import="java.io.*,java.sql.*"session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SearchMyJob.com</title>
        <link rel="stylesheet" href="company/examcreate.css"/>
 <link rel="stylesheet" href="company/style6.css">
        <style>
        .tu{
               background-image: url("Untitled_1.jpg");
               border-radius:25px;

               border-style: solid;
               border: 3px;
               border-color: #ddb421;
}
        </style>
        <script language="javascript">
		function check()
		{
			var a= document.form1.examid.value;
			var b= document.form1.cutoff.value;
			var c=document.form1.examname.value;
			if(document.form1.examid.value=="")
            {
                alert("Enter Exam ID");
                //a.focus();
                return false;
            }
            else if(!parseInt(a))
            {
                alert("Enter Integer");
               // a.focus();
                return false;
            }
			if(document.form1.examname.value=="")
            {
                alert("Enter Exam Name");
                //c.focus();
                return false;
            }

			if(document.form1.cutoff.value=="")
            {
                alert("Enter Cutoff mark");
             //   b.focus();
                return false;
            }
            else if(!parseInt(b))
            {
                alert("Enter Integer");
               // b.focus();
                return false;
            }
			else if(parseInt(b)<0||parseInt(b)>100)
            {
                alert("Enter cutoff in %");
                //b.focus();
                return false;
            }

			return true;
		}
		</script>
    </head>
    <body style="margin: 0px;">
        <table width="100%" border="0" class="tu">
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
        <table width="600"  height="144" border="0" align="center" bgcolor="#3f3f3f">
              <tr>
                  <td class="ry" colspan="2">
                                  Exam Creation
                           </td>
                        </tr>
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


               // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                        %>
                        <form name="form2" action="createexam.jsp">
                            <td class="ry">Select a Job ID</td>
                            <td width="104">
                                <label>
                                    <select name="jobid">
                                        <%      rs = st.executeQuery("select * from job_details");
                                    String s1 = null;
                                    // String s2=null;
                                    while (rs.next()) {
                                        s1 = rs.getString("JobId");
                                        //    s2=rs.getString("Post");

                                        %>
                                        <option value="<%=s1%>"><%=s1%></option>
                                        <% }//while %>
                                    </select>
                                </label>
                            </td>
                            <tr><td colspan="2">
                                    <center><input type="submit" value="Show Details"></center>
                            </td></tr>
                        </form>
                        <%
                          }//if
                          else {
                              jid = request.getParameter("jobid");
                              //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                             // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                              Statement st = con.createStatement();
                              Statement st2 = con.createStatement();
                               rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                              String s2 = null;
                              while (rs.next()) {
                                  s2 = rs.getString("post");

                        %>
                         <tr>
                            <td class="ry">Post Name :</td>
                            <td class="rp"><%=s2%></td>
                        </tr>
                    </table>
                
<form name="form1" method="post" action="saveexamdetails.jsp" onSubmit="return check()">
    <table width="600" bgcolor="#3f3f3f" height="166" border="0" align="center">
                            <tr>
                                <td class="ry"><strong>Exam ID</strong></td>
                                <td ><input type="text" name="examid"></td>
                            </tr>
                            <tr>
                                <td class="ry">Exam Name</td>
                                <td ><input type="text" name="examname"></td>
                            </tr>
                            <tr>
                                <td class="ry">Cutoff %</td>
                                <td ><input type="text" name="cutoff"></td>
                            </tr>

                            <tr>
                                <td  colspan="2">
                                    <center>     <input type="submit" name="Submit" value="Submit"></center>
                                </td>
                            </tr>
                        </table>
                    </form>
                        <%
                }//while
                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", s2);
            }//else

        }//try
        catch (Exception e) {
            out.println(e);
        }
                    %>
        </table>
    </body>
</html>
