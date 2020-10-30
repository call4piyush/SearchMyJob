<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="header/style1.css">
    </head>
    <body>
        <table width="100%" border="0">
    <tr>

        <td height="250" >
            <div id="header-wrapper">
            <div id="header" class="container">
			<div id="logo">
                            <h9><font color="white">SearchMyJob.com</font></h9>

			</div>
		<div id="social">
				<ul class="contact1">
					<h3><span>Today's date: <%= (new java.util.Date()).toLocaleString()%>
                                            </span></h3>
				</ul>
			</div>
		</div>



            <div id="menu" class="container">
			<ul>
			<div class="current_page_item">
                                <li><a href="index.jsp" accesskey="1" title="HomePage">Home</a></li>
                                <li><a href="vacancy.jsp" accesskey="1" title="Jobs">job's</a></li>
				<li><a href="login.jsp" accesskey="1" title="Sign In">Log In</a></li>
				<li><a href="registration.jsp" accesskey="2" title="Usre Registration">Registration</a></li>
				<li><a href="companyreg.jsp" accesskey="3" title="Company Registration">Company Registration</a></li>
				<li><a href="aboutus.jsp" accesskey="4" title="About Us">About Us </a></li>
				<li><a href="contactus.jsp" accesskey="5" title="Contact Us">Contact Us</a></li>
                        </div></ul>
		</div>
            </div>
    </td>
    </tr>
        </table>
     </body>
</html>
