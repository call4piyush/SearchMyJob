<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="canhead/style2.css">
       <style>
         
.t{
    background-image: url("our_recruiters_3.jpg");
   border-radius:10px;
    
}
       </style>
    </head>
    <body>
        <table width="100%" border="0" class="t" >
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
                                
				<li><a href="CanEditProfile.jsp" accesskey="1" title="Edit Profile">Edit Profile</a></li>
				<li><a href="CanChangePassword.jsp" accesskey="2" title="Change Password">Change Password</a></li>
				<li><a href="CompanyDetails.jsp" accesskey="3" title="company details">company details</a></li>
                                <li><a href="ExamConditions.jsp" accesskey="4" title="Exam">Exam</a></li>
				<li><a href="examresult.jsp" accesskey="5" title="Exam Result">Exam Result</a></li>
                                <li><a href="logout.jsp" accesskey="1" title="Log Out">Log Out</a></li>
                        </div></ul>
		</div>
            </div>
    </td>
    </tr>
    
     <tr>
         <td >
             
         </td>
     </tr>
            

        </table>
                    
     </body>
</html>
