
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    </head>
    <body>
        <table width="100%" border="0" class="tu">
    <tr>

        <td height="250" >
            <div id="header-wrapper">
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
    <td><div class="d" align="center"><font color="#ddb421">JOB DETAILS</font> </div>
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

     </body>
</html>