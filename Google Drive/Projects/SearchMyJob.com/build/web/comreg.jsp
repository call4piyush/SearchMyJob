<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="reg/style2.css">
            <script language="javascript">
    function onSubmit(s)
    {
            var a=document.form1.comname.value;
            var b=document.form1.compassword.value;
            var c=document.form1.comemail.value;
            var d=document.form1.comcontact.value;
            var e=document.form1.comcutoff.value;
            var f=document.form1.comaddress.value;
          var g=document.form1.compost.value;
          var h=document.form1.comcriteria.value;
          var i=document.form1.comusername.value;

          if(s==1)
			{
            if(document.form1.comname.value=="")
            {
                alert("Enter Company Name");
     //           a.focus();
                return false;
            }
            else if(parseInt(a))
            {
                alert("Company Name cannot be integer");
       //         a.focus();
                return false;
            }
            if(document.form1.comaddress.value=="")
            {
                alert("Enter Company Address");
         //      f.focus();
                return false;
            }
            if(document.form1.compost.value=="")
            {
                alert("Enter Company Post");
           //     g.focus();
                return false;
            }
            if(document.form1.comcriteria.value=="")
            {
                alert("Enter Company Criteria");
             //   h.focus();
                return false;
            }
            if(document.form1.comusername.value=="")
            {
                alert("Enter Company Username");
               //i.focus();
                return false;
            }
            if(document.form1.compassword.value=="")
            {
                alert("Enter Company Password");
                //b.focus();
                return false;
            }
            if(b.length<8)
            {
                alert("Password should be minimum 8 characters");
                //b.focus();
                return false;
            }
            if(document.form1.comemail.value=="")
            {
                alert("Enter Company Email");
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
                alert("Enter Company Contact no:");
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
                alert("Phone no should contain atleast 6 integers ");
                //d.focus();
                return false;
            }
            if(document.form1.comcutoff.value=="")
            {
                alert("Enter Company Cutoff");
                //e.focus();
                return false;
            }
            else if(!parseInt(e))
            {
                alert("Enter integer");
             //   e.focus();
                return false;
            }
            else if(parseInt(e)<0||parseInt(e)>100)
            {
                alert("Enter cutoff in %");
               // e.focus();
                return false;
            }

			}

		  document.form1.submit();


          }
    </script>
    </head>
    <body>
        <form action="savecompanydata.jsp" method="post" name="form1" id="form1">
            <table class="style" border="0" width ="600" height="600" align="center">
                <tr>
             <td class="ta">Name&nbsp;</td>
              <td align="center"><input TYPE="text" NAME="comname" id="comname" size=30 maxlength=30></td>
            </tr>
               <tr>
             <td class="ta">Address</td>
             <td align="center"> <input NAME="comaddress" TYPE="text" id="comaddress" size=30 maxlength=50></td>
            </tr>
              <tr>
             <td class="ta">Post</td>
              <td align="center">
                  <input NAME="compost" TYPE="text" id="compost" size=30  maxlength=50>
              </td>
            </tr>
              <tr>
             <td class="ta">Criteria</td>
              <td align="center">
                  <input NAME="comcriteria" TYPE="text" id="comcriteria" size=30  maxlength=50>
              </td>
            </tr>
              <tr>
             <td class="ta">Username</td>
             <td align="center">
                  <input TYPE="text" NAME="comusername" id="comusername"size=30 maxlength=30 value=''>
              </td>
            </tr>
              <tr>
             <td class="ta">Password</td>
              <td align="center"><input TYPE="password" NAME="compassword" id="compassword" size=32 maxlength=30 value=''></td>
            </tr>
              <tr>
             <td class="ta">Email_id</td>
              <td align="center">
                  <input TYPE="text" NAME="comemail" id="comemail" size=30 maxlength=30 value=''>
              </td>
            </tr>
               <tr>
             <td class="ta">Contact No:</td>
              <td align="center">
                  <input TYPE="text" NAME="comcontact" id="comcontact" size=10 maxlength=30 >
              </td>
            </tr>
               <tr>
             <td class="ta">CutOff %</td>
              <td align="center">
                   <input TYPE="text" NAME="comcutoff" id="comcutoff" size=30 maxlength=30 value=''>
              </td>
               </tr>
                 <tr>
                     <td height="25" colspan="2" align="center" >

                         <input type="reset" value="reset"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                 <input type="button" value="Submit"  onclick="javascript:onSubmit(1);">
                </td>
            </tr>
            </table>
        </form>
    </body>
</html>
