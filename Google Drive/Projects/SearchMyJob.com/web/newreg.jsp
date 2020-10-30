<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="reg/style2.css">
        <script language="javascript">
        function setVal(id)
         {

             if(form1.sel_cat.value=="Fresher")
                 {
                     form1.expyears.disabled=true;
                     form1.company.disabled=true;
                     form1.designation.disabled=true;
                     form1.salary.disabled=true;
                     form1.comAddress.disabled=true;
                 }
                 else{
                     form1.expyears.disabled=false;
                     form1.company.disabled=false;
                     form1.designation.disabled=false;
                     form1.salary.disabled=false;
                     form1.comAddress.disabled=false;
                 }
         }

function check()
{
var a=document.form1.collegephone.value;
var b=document.form1.mark10.value;
var c=document.form1.mark12.value;
var d=document.form1.markDegree.value;
var e=document.form1.telephone.value;
var f=document.form1.pin.value;

               if(document.form1.name.value=="")
		 {
                    alert("Enter Your Name");
		   document.form1.name.focus();
		   return false;
		 }
                 if(document.form1.gender.value=="")
		 {
                    alert("Enter your gender");
		   document.form1.gender.focus();
		   return false;
		 }
               if(document.form1.dob.value=="")
		 {
                    alert("Enter Date of Birth");
		   document.form1.dob.focus();
		   return false;
		 }
               if(document.form1.college.value=="")
		 {
                    alert("Enter College Name ");
		   document.form1.college.focus();
		   return false;
		 }
                if(document.form1.collegephone.value=="")
		  {
                     alert("Enter collegephone number ");
		     document.form1.collegephone.focus();
		     return false;
		  }
                  else if(!parseInt(a))
		      {
                         alert("Enter CollegePhone Integer");
		         return false;
		      }
                      else if(((document.form1.collegephone.value.length)<6) || ((document.form1.collegephone.value.length)>11))
	                     {
	                         alert("Phone no: should contain atleast 6 integers ");
	                         document.form1.collegephone.focus();
	                     }
               if(document.form1.collegeemail.value=="")
		   {
                     alert("Enter College email ");
		      document.form1.collegeemail.focus();
		      return false;
		   }
		   else if(document.form1.collegeemail.value.indexOf('@')==-1)
		      {
		       alert("Use @ email correctly");
		       document.form1.collegeemail.focus();
		       return false;
		      }
		     else if(document.form1.collegeemail.value.indexOf('.')==-1)
		       {
		        alert("Use . email correctly");
		        document.form1.collegeemail.focus();
		        return false;
		       }
               if(document.form1.branch.value=="")
		 {
                    alert("Specify Branch");
		   document.form1.branch.focus();
		   return false;
		 }
               if(document.form1.mark10.value=="")
		  {

		    document.form1.mark10.focus();
		    return false;
		  }
                else if(!parseInt(b))
		  {
                      alert("Enter Integer");
		      return false;
                  }
                   else if(parseInt(b)<0||parseInt(b)>100)
	             {
	               alert("Enter 10th % mark correctly  ");
	           //    document.form1.comcutoff.value="";
	               document.form1.mark10.focus();
	             }

                if(document.form1.mark12.value=="")
		  {
                   // alert("Enter C");
		    document.form1.mark12.focus();
		    return false;
		  }
                else if(!parseInt(c))
		  {
                      alert("Enter Integer");
		      return false;
                  }
                   else if(parseInt(c)<0||parseInt(c)>100)

	           {
	               alert("Enter 12th %mark correctly  ");
	               document.form1.mark12.focus();
	           }

                 if(document.form1.markDegree.value=="")
		  {

		    document.form1.markDegree.focus();
		    return false;
		  }
                   else if(!parseInt(d))
		  {
                      alert("Enter Integer");
		      return false;
                  }
                       else if(parseInt(d)<0||parseInt(d)>100)
	               {
	               alert("Enter Degree % mark correctly  ");
	           //    document.form1.comcutoff.value="";
	               document.form1.markDegree.focus();
	             }
                     if(document.form1.degree.value=="")
		        {
                          alert("Enter Degree");
		          document.form1.degree.focus();
		          return false;
		        }
                 if(document.form1.username.value=="")
		    {
                       alert("Enter  Username");
		       document.form1.username.focus();
		       return false;
		    }

                   if(document.form1.password.value=="")
		  {
                    alert("enter password");
		    document.form1.password.focus();
		    return false;
		  }

                   if(document.form1.email.value=="")
		  {
                    alert("Enter email ");
		      document.form1.email.focus();
		      return false;
		  }
		 else if(document.form1.email.value.indexOf('@')==-1)
		  {
		       alert("Use @ email correctly");
		       document.form1.email.focus();
		       return false;
		  }
		else if(document.form1.email.value.indexOf('.')==-1)
		  {
		        alert("Use . email correctly");
		        document.form1.email.focus();
		        return false;
                  }
                   if(document.form1.telephone.value=="")
		  {
                     alert("Enter phone number ");
		     document.form1.telephone.focus();
		     return false;
		  }
                else if(!parseInt(e))
		{
                    alert("Enter Ph Integer");
		    return false;
		}
                        else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>11))
	                     {
	               alert("Phone no should contain atleast 6 integers ");

	               document.form1.telephone.focus();
                        return false;
	                  }
               if(document.form1.address.value=="")
		 {
                    alert("Enter Address");
		   document.form1.address.focus();
		   return false;
		 }
               if(document.form1.state.value=="")
		 {
                    alert("Specify State");
		   document.form1.address.focus();
		   return false;
		 }
               if(document.form1.pin.value=="")
		  {
                     alert("Enter pin number ");
		     document.form1.pin.focus();
		     return false;
		  }
              else if(!parseInt(f))
		{
                    alert("Enter Integer");
		    return false;
		}
              else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>6))
	        {
	               alert("Pin no: should contain 6 integers ");
	               document.form1.pin.focus();
	               return false;
                 }
                 if(document.form1.state.value=="")
		 {
                    alert("Specify State");
		   document.form1.address.focus();
		   return false;
		 }

 return true;
}
</script>
        
    </head>
    <body>
         <form action="savestudentdata.jsp" method="post" name="form1" id="form1"  onclick="javascript:onSubmit(1);" onsubmit="return check()">
            <table class="style" border="0" width ="600" height="900" align="center">
                <tr>
                    <td class="td">Name&nbsp;</td>
                    <td><input type="text" name="name" size="30" maxlength="30" value='' /></td>
                </tr>
                <tr>
                    <td class="td">Gender</td>
                    <td ><select name="gender" >
                        <option value="Female">Female</option>
                        <option  value="Male">Male </option>
                        </select>
                    </td>
                </tr>
                <tr>
                <td class="td">Date of Birth&nbsp;<font color="blue">(DD/MM/YY)</font></td>
              <td><input type="text" name="dob" size="30" maxlength="10" /></td>
            </tr>
            <tr >
                <td class="td">College&nbsp;</td>
              <td><input type="text" name="college" size="30" maxlength="30" /></td>
            </tr>
            <tr>
                <td class="td">College Phone&nbsp;</td>
              <td><input type="text" name="collegephone" size="30" maxlength="10" />
                 </td>
            </tr>
            <tr>
                <td class="td">College Email&nbsp;</td>
              <td><input type="text" name="collegeemail" size="30" maxlength="50" /></td>
            </tr>
            <tr>
                <td class="td">Branch&nbsp;</td>
              <td class="td"><select name="branch" >
                  <option  value="">--------------Select--------------</option>
                <option  value="Applied Electro            ">Applied Electronics </option>
                <option  value="Applied Physics            ">Applied Physics </option>
                <option  value="B C A                      ">B C A </option>
                <option  value="Bioinformatics             ">Bioinformatics </option>
                <option  value="Biotechnology              ">Biotechnology </option>
                <option  value="Chemistry                  ">Chemistry </option>
                <option  value="Comp and Networking        ">Computer and Networking </option>
                <option  value="Comp Application           ">Computer Application </option>
                <option  value="Comp Application &amp; IT  ">Computer Application &amp; IT </option>
                <option  value="Comp Hardware Maintenance  ">Computer Hardware Maintenance </option>
                <option  value="Comp Information Systems   ">Computer Information Systems </option>
                <option  value="Comp Maintenance           ">Computer Maintenance </option>
                <option  value="Comp Maintenance &amp; Electro ">Computer Maintenance &amp; Electronics </option>
                <option  value="Comp Science               ">Computer Science </option>
                <option  value="Comp Science &amp; Information ">Computer Science &amp; Information </option>
                <option  value="Comp Technology            ">Computer Technology </option>
                <option  value="Electro                    ">Electronics </option>
                <option  value="Electro &amp; Communication    ">Electronics &amp; Communication </option>
                <option  value="Electro &amp; Comp Hardware    ">Electronics &amp; Computer Hardware </option>
                <option  value="Electro &amp; Comp Maintenance ">Electronics &amp; Computer Maintenance </option>
                <option  value="Industrial Chemistry       ">Industrial Chemistry </option>
                <option  value="Information Technology     ">Information Technology </option>
                <option  value="Instrumentation            ">Instrumentation </option>
                <option  value="Mathematics                ">Mathematics </option>
                <option  value="Optical Instrumentation    ">Optical Instrumentation </option>
                <option  value="Physics                    ">Physics </option>
                <option  value="Physics &amp; Electro          ">Physics &amp; Electronics </option>
                <option  value="Physics Instrumentation    ">Physics Instrumentation </option>
                <option  value="Physics with Comp App      ">Physics with Comp Applications </option>
                <option  value="Software Systems           ">Software Systems </option>
                <option  value="Software Technology        ">Software Technology </option>
                <option  value="Statistics                 ">Statistics </option>
              </select>              </td>
            </tr>
            <tr >
                <td class="td">Marks(10th, 12th, Grad)&nbsp;</td>
              <td>
         <div> <input class="USS_TEX" name="mark10" size="5" maxlength="5" value='' onblur="checkDec('mark10')" />
          <input class="USS_TEX" name="mark12" size="5" maxlength="5" value='' onblur="checkDec('mark12')" />
          <input class="USS_TEX" name="markDegree" size="5" maxlength="5" value='' onblur="checkDec('markBSC')" />
         </div>    </td>
            </tr>
            <tr>
                <td class="td">Degree&nbsp;</td>
              <td class="td"><select name="degree">
                  <option value ="BTech">B.Tech</option>
                  <option value ="MTech">M.Tech</option>
                  <option value ="MCA">MCA</option>
                  <option value ="BCA">BCA</option>
                  <option value ="BSc">BSc.</option>
                  <option value ="MSc">MSc.</option>
                </select>              </td>
            </tr>
            <tr >
                <td class="td">Username&nbsp;</td>
              <td><input type="text" name="username" size="30" maxlength="30" value='' /></td>
            </tr>
            <tr >
                <td class="td"> Password&nbsp;</td>
              <td><input type="password" name="password" size="30" maxlength="30" value='' /></td>
            </tr>
            <tr>
                <td class="td">Email_id&nbsp;</td>
              <td><input type="text" name="email" size="30" maxlength="30" value='' /></td>
            </tr>
            <tr>
                <td class="td">Telephone Number&nbsp;</td>
              <td><input type="text" name="telephone" value="" maxlength="6" />
                </td>
            </tr>
            <tr>
                <td class="td">Address&nbsp;</td>
              <td><input class="USS_TEXT" maxlength="30" name="address" size="40" value='' />
                 </td>
            </tr>
            <tr>
                <td class="td">State&nbsp;</td>
              <td class="td"><select name="state">
                  <option selected="selected" value="">Select State</option>
                  <option value="AP">Andhra Pradesh</option>
                  <option value="AR">ArunachalPradesh</option>
                  <option value="AS">Assam</option>
                  <option value="BR">Bihar</option>
                  <option value="CH">Chandigarh</option>
                  <option value="CG">Chattisgarh</option>
                  <option value="DL">Delhi</option>
                  <option value="GA">Goa</option>
                  <option value="GJ">Gujarat</option>
                  <option value="HR">Haryana</option>
                  <option value="HP">Himachal Pradesh</option>
                  <option value="JK">Jammu &amp; Kashmir</option>
                  <option value="JH">Jharkhand</option>
                  <option value="KA">Karnataka</option>
                  <option value="KL">Kerala</option>
                  <option value="MP">Madhya Pradesh</option>
                  <option value="MH">Maharashtra</option>
                  <option value="MN">Manipur</option>
                  <option value="ML">Meghalaya</option>
                  <option value="MZ">Mizoram</option>
                  <option value="NL">Nagaland</option>
                  <option value="OR">Orissa</option>
                  <option value="PY">Pondicherry</option>
                  <option value="PB">Punjab</option>
                  <option value="RJ">Rajasthan</option>
                  <option value="SK">Sikkim</option>
                  <option value="TN">Tamilnadu</option>
                  <option value="TR">Tripura</option>
                  <option value="UA">Uttaranchal</option>
                  <option value="UP">Uttar Pradesh</option>
                  <option value="WB">West Bengal</option>
                  <option value="XX">Others</option>
                </select>              </td>
            </tr>
            <tr>
                <td class="td">Pincode&nbsp;</td>
              <td><input class="USS_TEXT" maxlength="6" name="pin" size="6" value='' /></td>
            </tr>
            <tr>
                <td class="td">Category&nbsp;</td>
              <td><select name="sel_cat" id="sel_cat" onchange="setVal(this.id);">
                  <option value="category">select a category</option>
                  <option value="Fresher">Fresher</option>
                  <option value="Experienced">Experienced</option>
                </select>              </td>
            </tr>
            <tr>
                <td class="td">Experienced Years&nbsp;</td>
              <td><input type="text" name="expyears" size="30" maxlength="2" /></td>
            </tr>
            <tr>
                <td class="td">Company&nbsp;</td>
              <td><input type="text" name="company" size="30" maxlength="30" /></td>
            </tr>
            <tr>
                <td class="td">Designation&nbsp;</td>
              <td><input type="text" name="designation" size="30" maxlength="30" /></td>
            </tr>
            <tr>
                <td class="td">Salary&nbsp;</td>
              <td><input type="text" name="salary" size="30" maxlength="30" /></td>
            </tr>
            <tr>
                <td class="td">Company Address&nbsp;</td>
              <td><input type="text" name="comAddress" size="30" maxlength="30" /></td>
            </tr>
            <tr>
              <td colspan="2" align="center" ><br />
             
                  <input type="reset"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                 <input type="submit" value="Submit" >
                </td>
            </tr>
            </table>
        </form>
    </body>
</html>
