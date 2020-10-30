<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="css/style.css">
               <script type="text/javascript">
    function onSubmit(s)
    {

    var a=document.form1.username.value;
    var b=document.form1.password.value;

    if(s==1)
	{
    if(document.form1.username.value=="")
    {
        alert("Enter Your Name");
       // a.focus();
        return false;
    }
    else if (document.form1.password.value=="")
    {
        alert("enter the password");
        //b.focus();
        return false;
    }
	}
	   document.form1.submit();
    }

    </script>
    </head>
    <body >
        <center>
        <table style="box-shadow:10px 10px 127px black;;" class="s" width="500" border="0">
            <tr >
                <td height="200">
   <form name="form1" method="post" class="login" action="savelogindata.jsp">
          <p>
      <label for="login">UserName:</label>
      <input type="text" name="username" id="username" value="">
    </p>
    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" value="">
    </p>
    <p class="login-submit">
        <button type="button" class="login-button" onclick="javascript:onSubmit(1);">Login </button>

    </p>
    <a href="#">Forget password</a>
        </form>
                   
                </td>
            </tr>
        </table>
        </center>
    </body>
</html>
