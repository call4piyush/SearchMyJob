<%@page import="java.io.*,java.sql.*"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="company/style6.css">
        <style>
            body{
                background-color: #3F3F3F;
                margin: 0px;
}
            .ti{
                color: white;
                text-align: center;
                width: 250px;
                height: 40px;
                border-radius:29px;
                font-size: 20px;
            }
            .qo{
                text-align: center;
                width: 250px;
                height: 40px;
                border-radius:20px;
            }
            .qo select{
                border-radius:25px;
                width: 50px;
                color: white;
                background-color: #3F3F3F;
            }
            input[type=submit]
            {   border-radius:25px;
                height: 30px;
                width: 170px;
                float: none;
                background-color: #3F3F3F;
                color: white;
                font-size: 18px;
                font-family: times new roman;
                text-transform: uppercase;
            }
            .d{
               margin-top: -98px;
               border-radius:20px;
               border-color: #3F3F3F;
}
.dt{color: black;
                                border-width: 1px;
               background-color:#d1c79d;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform: uppercase;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-left-style: double;
               font-weight: 600;
                  color:black;
}
.dta{
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
.ta{
    background-color:#55503b;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform: uppercase;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-width: 1px;
                 color: white;
}
.dt a{
    color: #b92d71;
    text-decoration: none;
}
 .tu{
               background-image: url("Untitled_1.jpg");
               border-radius:25px;
               
               border-style: solid;
               border: 3px;
               border-color: #ddb421;
}
        </style>
    </head>
    <body>
           <table width="100%" border="0" class="tu">
    <tr>

        <td height="250" >
            <div id="header-wrapper">
            <div id="header" class="container">
			<div id="logo">
                            <h9><font color="white" ></font></h9>
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


        </table>

        <form name="form1" action="quesview.jsp" method="post">

            <table bgcolor="#3f3f3f"  width="500" height="97" border="0" align="center">
                <tr>
                    <td class="ti"  colspan="2">
                        View Questions
                    </td>
                </tr>
                <tr>
                    <%
                                String jid = request.getParameter("jobid");
                                String eid = request.getParameter("examid");
                                //out.print(jid);
                                try {
                                    Connection con = null;
                                    String url = "jdbc:mysql://localhost:3306/";
                                    String dbName = "online";
                                    String driverName = "com.mysql.jdbc.Driver";
                                    String userName = "root";
                                    String password = "root";
                                    ResultSet rs, rs1;
                                    Class.forName(driverName).newInstance();
                                    con = DriverManager.getConnection(url + dbName, userName, password);
                                    if (eid == null) {
                                        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                        // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                                        Statement st = con.createStatement();
                                        Statement st2 = con.createStatement();
                    %>
                <tr>
                    <td class="ti">Select an Job ID</td>
                    <td class="qo" ><label>
                            <select name="jobid">
                                <%
                                                ResultSet rs2 = st2.executeQuery("select * from job_details");
                                                String s2 = null;
                                                // String s2=null;
                                                while (rs2.next()) {
                                                    s2 = rs2.getString("jobid");
                                                    //    s2=rs.getString("Post");
                                %>
                                <option value="<%=s2%>"><%=s2%></option>
                                <%}%>
                            </select>
                        </label>

                    </td></tr>

                <td class="ti">Select an Exam ID </td>
                <td class="qo" ><label>
                        <select name="examid">
                            <%       rs = st.executeQuery("select * from Exam ");
                                            String s1 = null;
                                            // String s2=null;
                                            while (rs.next()) {
                                                s1 = rs.getString("examid");
                                                //    s2=rs.getString("Post");
                            %>
                            <option value="<%=s1%>"><%=s1%></option>
                            <%}%>
                        </select>
                    </label>

                </td></tr>

                <tr>
                    <td  align="center" height="40"  colspan="2">
                        <input type="submit" value="Show Details">
                    </td>
                </tr>
            </table>
        </form>
                        <p>
            <%
                        } else {
            %>
        </p>
        <table  bgcolor="#3f3f3f"  border="1" align="left" width="100%" class="d">

            <tr><td class="ta" colspan="8"></td>
            </tr>
            <tr>
                
                <td class="dta">Question No: </td>
                <td class="dta">Question</td>
                <td class="dta">Option 1</td>
                <td class="dta">Option 2</td>
                <td class="dta">Option 3</td>
                <td class="dta">Option 4</td>
                <td class="dta">Answer</td>
                <td class="dta">Delete</td>
            </tr>
            <%

                            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            //  Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                            Statement st3 = con.createStatement();
                            // Statement st2=con.createStatement();

                            ResultSet rs3 = st3.executeQuery("select QuestionNo,Question,Option1,Option2,Option3,Option4,Answer from Question where ExamID='"
                                    + eid + "' and JobID='" + jid + "'");
                            //  String s2=null;
                            while (rs3.next()) {
                                String qno = rs3.getString("QuestionNo");
                                String ques = rs3.getString("Question");
                                String op1 = rs3.getString("Option1");
                                String op2 = rs3.getString("Option2");
                                String op3 = rs3.getString("Option3");
                                String op4 = rs3.getString("Option4");
                                String ans = rs3.getString("Answer");



            %>
            <tr>
                <td class="dt" ><%=qno%></td>
                <td class="dt">
                        <%=ques%>
                    </td>
                <td class="dt">
                        <%=op1%>
                    </td>
                <td class="dt">
                        <%=op2%>
                    </td>
                <td class="dt">
                        <%=op3%>
                    </td>
                <td class="dt">
                        <%=op4%>
                    </td>
                <td class="dt">
                        <%=ans%>
                    </td>
                <td class="dt"><a href="DeleteQues.jsp?qno=<%=qno%>&jid=<%=jid%>&eid=<%=eid%>" >Delete</a></td>
            </tr>

            <%
                                }
                                con.close();
                            }

                        } catch (Exception e) {
                            out.println(e);
                        }
            %>
        </table>
    </body>
</html>
