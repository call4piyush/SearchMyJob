<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin: 0px;
                background-color: #3f3f3f;
}
            .poi{
                height: 50px;
                width: 50%;
                text-transform: capitalize;
                color: white;
                text-align: center;
}
input[type=text]{
    height: 30px;
    width: 60%;
    border-radius:10px;
    background-color: #404040;
    color: white;
}
textarea{
    color: white;
    border-radius:10px;
    background-color: #404040;
    overflow: hidden;
}
input[type=button],input[type=reset]{
    height: 30px;
    width: 25%;
    border-radius:10px;
    background-color: #404040;
    color: white;
}
.tuu{
    text-align: center;
    color: wheat;
    text-transform: capitalize;
    font-size: 30px;
}
        </style>
            <script language="javascript">
    function onSubmit(s)
    {
            var a=document.form1.comname.value;
           
            var c=document.form1.comemail.value;
            var d=document.form1.comcontact.value;
           
            var f=document.form1.comaddress.value;
                    if(s==1)
			{
            if(document.form1.comname.value=="")
            {
                alert("Enter Name");
     //           a.focus();
                return false;
            }
            else if(parseInt(a))
            {
                alert("Name cannot be integer");
       //         a.focus();
                return false;
            }
            if(document.form1.comaddress.value=="")
            {
                alert("Enter Address");
         //      f.focus();
                return false;
            }
            
            
            if(document.form1.comemail.value=="")
            {
                alert("Enter  Email");
                //c.focus();
                return false;
            }
            else if(c.indexOf('@')==-1)
            {
                alert("Enter Email Correctly");
                //c.focus();
                return false;
            }
            else if(c.indexOf('.')==-1)
            {
                alert("Enter Email Correctly");
                //c.focus();
                return false;
            }
            if(document.form1.comcontact.value=="")
            {
                alert("Enter Contact no:");
                //d.focus();
                return false;
            }
            else if(!parseInt(d))
            {
                alert("Enter integer");
               //d.focus();
                return false;
            }
            else if(((document.form1.comcontact.value.length)<6) || ((document.form1.comcontact.value.length)>11))
            {
                alert("Phone no should contain atleast 10 integers ");
                //d.focus();
                return false;
            }
            

			}

		  document.form1.submit();


          }
    </script>
    </head>
    <body style="margin-top: 8px;" >
        <table height="700"  width="100%" border="0"  >
            <tr>
                <td  height="250" colspan="">
        <jsp:include page="header.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
      <tr >
          <td class="tuu" height="10">
              contact form
              </td>
      </tr>


  <tr>
      <td width="100%" valign="top">
 <form action="con1.jsp" method="post" name="form1" id="form1">
     <table bgcolor="" border="0" width ="50%"   align="center">
                <tr>
             <td class="poi">Name</td>
             <td class="poi" align="center"><input TYPE="text" NAME="comname" id="comname" size=30 maxlength=30></td>
            </tr>
               <tr>
             <td class="poi">Address</td>
             <td align="center"> <input NAME="comaddress" TYPE="text" id="comaddress" size=30 maxlength=50></td>
            </tr>

               <tr>
             <td class="poi">Email_id</td>
              <td align="center">
                  <input TYPE="text" NAME="comemail" id="comemail" size=30 maxlength=30 value=''>
              </td>
            </tr>

               <tr>
             <td class="poi">Contact No:</td>
              <td align="center">
                  <input TYPE="text" NAME="comcontact" id="comcontact" size=10 maxlength=30 >
              </td>
            </tr>
               <tr>
             <td class="poi">message</td>
              <td align="center">
                  <textarea name="message" >write your question here</textarea>
              </td>
               </tr>
                 <tr>
                     <td height="45" colspan="2" align="center" >

                         <input type="reset" value="reset"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                 <input type="button" value="Submit"  onclick="javascript:onSubmit(1);">
                </td>
            </tr>
            </table>
        </form>
      </td>
  </tr>
</table>
      
    </body>
</html>
