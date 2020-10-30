<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="header/style2.css">
    </head>
    <body style="margin: 0px;">
        <table width="100%" border="0">
    <tr>

        <td height="250" >
            <div id="header-wrapper">
            <div id="header" class="container">
			<div id="logo">
                            <h9><font color="white">recruitment</font></h9>

			</div>
		<div id="social">
				<ul class="contact1">
					<h3><span>Today's date: <%= (new java.util.Date()).toLocaleString()%>
                                            </span></h3>
				</ul>
			</div>
		</div>



            <div id="menuu" class="containeru">
			<ul>
			<div class="current_page_itemu">
                            <li><a href="AdminHomePage.jsp" accesskey="1" title="">home</a></li>
                            <li><a href="admincandetails.jsp" accesskey="1" title="">Candidate Details</a></li>
                            <li><a href="admincomdetails.jsp" accesskey="1" title="">Company Details</a></li>
                            <li><a href="AdminChangePassword.jsp" accesskey="1" title="">Change Password</a></li>
                            <li><a href="totaladminresult.jsp" accesskey="2" title="">Results</a></li>
                            <li><a href="logout.jsp" accesskey="3" title="">Log out</a></li>
			
                        </div></ul>
		</div>
            </div>
    </td>
    </tr>
        </table>
     </body>
</html>