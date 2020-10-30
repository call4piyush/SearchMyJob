<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Registration</title>
        <style>
            h{
                color: white;
              font-size: 21px;
}
 o{
                color: #c7b436;
                font-size: 22px;
}
        </style>
        </head>
    <body bgcolor="#3F3F3F">
        <table height="700"  width="100%" border="0"  >
            <tr>
    <td height="250" colspan="">
        <jsp:include page="header.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
 
        <tr >
          <td height="50"><center><o>Company Registration</o>
              </center> </td>
      </tr>
    </tr>
  <tr>
      <td width="100%" valign="top"><center>
          <jsp:include page="comreg.jsp"></jsp:include>
          </center>
      </td>
  </tr>
</table>
    </body>
</html>
