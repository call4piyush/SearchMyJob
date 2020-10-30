<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
        <script language="javascript">
            function setVal(sval)
            {

                if(sval=="Fresher")
                {
                    document.getElementById("expyears").disabled=true;
                    document.getElementById("company").disabled=true;
                    document.getElementById("designation").disabled=true;
                    document.getElementById("salary").disabled=true;
                    document.getElementById("comAddress").disabled=true;
                }
                else{
                    document.getElementById("expyears").disabled=false;
                    document.getElementById("company").disabled=false;
                    document.getElementById("designation").disabled=false;
                    document.getElementById("salary").disabled=false;
                    document.getElementById("comAddress").disabled=false;
                }
            }

            function onSubmit(s)
            {
                var a=document.form1.collegephone.value;
                var b=document.form1.mark10.value;
                var c=document.form1.mark12.value;
                var d=document.form1.markDegree.value;
                var e=document.form1.telephone.value;
                var f=document.form1.pin.value;
                var x=document.form1.name.value;
                var y=document.form1.college.value;
                var z=document.form1.password.value;
				var g=document.form1.name.value;
				var h=document.form1.gender.value;
				var i=document.form1.dob.value;
				var j=document.form1.collegeemail.value;
				var k=document.form1.branch.value;
				var l=document.form1.username.value;
				var m=document.form1.email.value;

				var o=document.form1.sel_cat.value;
				var p=document.form1.address.value;
				var q=document.form1.state.value;
				if(s==1)
				{
                if(document.form1.name.value=="")
                {
                    alert("Enter Your Name");
                    //g.focus();
                    return false;
                }
                else if(parseInt(x))
                {
                    alert("Enter name Correctly");
                   //g.focus();
                    return false;

                }
                else  if(document.form1.gender.value=="")
                {
                    alert("Enter your gender");
                    //h.focus();
                    return false;
                }
                else if(document.form1.dob.value=="")
                {
                    alert("Enter Date of Birth");
                    //i.focus();
                    return false;
                }
               if(document.form1.college.value=="")
                {
                    alert("Enter College Name ");
                    //y.focus();
                    return false;
                }
                else if(parseInt(y))
                {
                    alert("Enter College Name correctly");
                    //y.focus();
                    return false;
                }
                if(document.form1.collegephone.value=="")
                {
                    alert("Enter collegephone number ");
                   //a.focus();
                    return false ;
                }
                else if(!parseInt(a))
                {
                    alert("Enter CollegePhone Integer");
                    //a.focus();

                    return false;
                }
                else if(((document.form1.collegephone.value.length)<6) || ((document.form1.collegephone.value.length)>11))
                {
                    alert("Phone no: should contain atleast 6 integers ");
                    //a.focus();
                    return false;
                }
                if(document.form1.collegeemail.value=="")
                {
                    alert("Enter College email ");
                 //   j.focus();
                    return false;
                }
                else if(j.indexOf('@')==-1)
                {
                    alert("Use @ email correctly");
                   // j.focus();
                    return false;
                }
                else if(j.indexOf('.')==-1)
                {
                    alert("Use . email correctly");
                   //j.focus();
                    return false;
                }
               if(document.form1.branch.value=="")
                {
                    alert("Specify Branch");
                    //k.focus();
                    return false ;
                }
                if(document.form1.mark10.value=="")
                {
                    alert("Enter your 10th %mark")
                    //b.focus();
                    return false;
                }
                else if(!parseInt(b))
                {
                    alert("Not Integers used");
                   //b.focus();
                    return false;
                }
                else if(parseInt(b)<0||parseInt(b)>100)
                {
                    alert("Enter 10th % mark correctly  ");
                   //b.focus();
                    return false();
                }

              if(document.form1.mark12.value=="")
                {
                    alert("Enter 12th mark")
                    //c.focus();
                    return false ;
                }
                else if(!parseInt(c))
                {
                    alert("Not Integers used");
                    //c.focus();
                    return false;
                }
                else if(parseInt(c)<0||parseInt(c)>100)
                {
                    alert("Enter 12th %mark correctly  ");
                 //  c.focus();
                    return false ();
                }

                else if(document.form1.markDegree.value=="")
                {
                    alert("Enter Degree mark");
                   // d.focus();
                    return false;
                }
                else if(!parseInt(d))
                {
                    alert("Enter Integer");
                    //d.focus();
                    return false ;
                }
                else if(parseInt(d).length<0||parseInt(d).length>100)
                {
                    alert("Enter Degree % mark correctly  ");
                   //d.focus();
                    return false;
                }
               if(document.form1.degree.value=="")
                {
                    alert("Enter Degree");
                    //d.focus();
                    return false ;
                }
                  if(document.form1.username.value=="")
                {
                    alert("Enter  Username");
                 //   l.focus();
                    return false;
                }

           if(document.form1.password.value=="")
                {
                    alert("Enter Password");
                   //z.focus();
                    return false  ;
                }
           else if(z.length<8)
                {
                    alert("Password should be minimum 8 characters");
                    //z.focus();
                    return false;
                }
                if(document.form1.email.value=="")
                {
                    alert("Enter email ");
                 //   m.focus();
                    return false;
                }
                else if(m.indexOf('@')==-1)
                {
                    alert("Use @ email correctly");
                   // m.focus();
                    return false ;
                }
                else if(m.indexOf('.')==-1)
                {
                    alert("Use . email correctly");
                    //m.focus();
                    return false;
                }
                if(document.form1.telephone.value=="")
                {
                    alert("Enter phone number ");
                    //e.focus();
                    return false;
                }
                else if(!parseInt(e))
                {
                    alert("Enter Ph Integer");
                    //e.focus();
                    return false;
                }
                else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>11))
                {
                    alert("Phone no should contain atleast 6 integers ");

                 //   e.focus();
                    return false;
                }
                else  if(document.form1.address.value=="")
                {
                    alert("Enter Address");
                  //  p.focus();
                    return false;
                }
       			 if(document.form1.state.value=="")
                {
                    alert("Specify State");
                   //q.focus();
                    return false;
                }
                if(document.form1.pin.value=="")
                {
                    alert("Enter pin number ");
                   //f.focus();
                    return false ;
                }
                else if(!parseInt(f))
                {
                    alert("Enter Integer");
                 //   f.focus();
                    return false ;
                }
              if((document.form1.pin.value.length)<6)
                {
                    alert("Pin no: should contain 6 integers ");
                   // f.focus();
                    return false;
                }
                if(document.form1.sel_cat.value=="")
                {
                    alert("Specify Category");
                    //o.focus();
                    return false;
                }

                //window.location.href="./savestudentdata.jsp?Button=Submit";
				  }

				  document.form1.submit();


                  }
        </script>
    </head>
    <body>
         <table  class="s" width="700" border="0">
            <tr >
                <td height="100%">
       
                    <form action="savestudentdata.jsp" method="post" name="form1" id="form1" >
                  <p>
              <label1 for="login">Name</label1>
                        <input type="text" name="name" size="30" maxlength="30" value='' />
                        <input type="submit" value="Submit"  onclick="javascript:onSubmit(1);">
                        </p>
                    </form>
                </td>
            </tr>
         </table>
    </body>
</html>
