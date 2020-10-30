<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>www.SearchMyJob.com</title>
        <link rel="stylesheet" href="reg/style3.css"></link>
        <script language="javascript">
            function setVal(obj)
            {
                if(obj.checked==false)
                {
                    document.getElementById("expyears").disabled=true;
                    document.getElementById("company").disabled=true;
                    document.getElementById("designation").disabled=true;
                    document.getElementById("salary").disabled=true;
                    document.getElementById("comAddress").disabled=true;

                }else{
                    document.getElementById("expyears").disabled=false;
                    document.getElementById("company").disabled=false;
                    document.getElementById("designation").disabled=false;
                    document.getElementById("salary").disabled=false;
                    document.getElementById("comAddress").disabled=false;
                }
            }
            function check()
            {
                var x=document.form1.name.value;
                var y=document.form1.college.value;
                var d=document.form1.markDegree.value;
                var a=document.form1.collegephone.value;
                var b=document.form1.collegeemail.value;
                var c=document.form1.email.value;
                var e=document.form1.telephone.value;
                var f=document.form1.pin.value;
                var g=document.form1.expyears.value;
                var h=document.form1.salary.value;
                var i=document.form1.address.value;
                var j=document.form1.state.value;
                var k=document.getElementById("expyears").value;
                var l=document.getElementById("company").value;
                var m=document.getElementById("designation").value;
                var n=document.getElementById("salary").value;
                var o=document.getElementById("comAddress").value;

                if(document.form1.name.value=="")
                {
                    alert("Enter Your Name");
                   //x.focus();
                    return false;
                }
                else if(parseInt(x))
                {
                    alert("Enter name Correctly");
                    //x.focus();
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
                  // y.focus();
                    return false;
                }
                if(document.form1.collegephone.value=="")
                {
                    alert("Enter collegephone number ");
                    //a.focus();
                    return false;
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
                   //b.focus();
                    return false;
                }
                else if(b.indexOf('@')==-1)
                {
                    alert("Use @ email correctly");
                    //b.focus();
                    return false;
                }
                else if(b.indexOf('.')==-1)
                {
                    alert("Use . email correctly");
                    //b.focus();
                    return false;
                }
                if(document.form1.markDegree.value=="")
                {
                    alert("Enter Degree mark");
                    //d.focus();
                    return false;
                }
                else if(!parseInt(d))
                {
                    alert("Enter Integer");
                    //d.focus();
                    return false;
                }
                else if(parseInt(d).length<0||parseInt(d).length>100)
                {
                    alert("Enter Degree % mark correctly  ");
                   // d.focus();
                    return false;
                }
                if(document.form1.email.value=="")
                {
                    alert("Enter email ");
                   // c.focus();
                    return false;
                }
                else if(c.indexOf('@')==-1)
                {
                    alert("Use @ email correctly");
                    //c.focus();
                    return false;
                }
                else if(c.indexOf('.')==-1)
                {
                    alert("Use . email correctly");
                    //c.focus();
                    return false;
                }
                if(document.form1.telephone.value=="")
                {
                    alert("Enter phone number ");

                    return false;
                }
                else if(!parseInt(e))
                {

                    alert("Enter Ph no. Integer");
                    return false;
                }
                else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>11))
                {
                    alert("Phone no should contain atleast 6 integers ");

                 //   e.focus();
                    return false;
                }
                if(document.form1.address.value=="")
                {
                    alert("Enter Address");
                    //i.focus();
                    return false;
                }
                if(document.form1.state.value=="")
                {
                    alert("Specify State");
                   //j.focus();
                    return false;
                }
                if(document.form1.pin.value=="")
                {
                    alert("Enter pin number ");
                  //f.focus();
                    return false;
                }
                else if(!parseInt(f))
                {
                    alert("Enter Integer in pin no.");
                   //f.focus();
                    return false;
                }
                else if((document.form1.pin.value.length)<6)
                {
                    alert("Pin no: should contain 6 integers ");
                   //f.focus();
                    return false;
                }

                if(document.getElementById("cat").checked==true)
                {
                    if(document.getElementById("expyears").value=="")
                    {
                        alert("Enter Exp years");
                       //k.focus();
                        return false;
                    }
					else
					{
					var expyr=document.getElementById("expyears").value;
					if (!parseInt(expyr)){
                            alert("Expyr invalid");
                            return false;
                        }
					}

                    if(document.getElementById("company").value=="")
                    {
                        alert("Enter Company");
                        //l.focus();
                        return false;
                    }

                    if(document.getElementById("designation").value=="")
                    {
                        alert("Enter Designation");
                        //m.focus();
                        return false;
                    }

                    if(document.getElementById("salary").value=="")
                    {
                        alert("Enter Salary");
                       //n.focus();
                        return false;
                    }else{
                        var sal=document.getElementById("salary").value;
                        if (!parseInt(sal)){
                            alert("Salary invalid");
                            return false;
                        }
						if(document.getElementById("comAddress").value=="")
                    {
                        alert("Enter Company Address");
                        //o.focus();
                        return false;
                    }
                    }
                }
                return true;
            }
        </script>
    </head>

    <body  onload="setVal(document.getElementById('cat'))">
        <table width="100%" height="628" border="0" class="style">
           
            <tr>
              
                <td width="100%" >
                    <% try {

            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");


            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");


            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Details2 where Username='" + c1 + "'");
            String s = null;
            String s1 = null;
            String s2 = null;
            String s3 = null;
            String s4 = null;
            String s5 = null;
            String s6 = null;
            String s7 = null;
            String s8 = null;
            String s9 = null;
            String s10 = null;
            String s11 = null;

            String expyrs = "", company = "", desig = "", sal = "", comadd = "", category = "";
            while (rs.next()) {
                s = rs.getString(1);//name
                s1 = rs.getString(4);//colg
                s2 = rs.getString(5);//colg ph
                s3 = rs.getString(6);//colgemeil
                s4 = rs.getString(8);//marks
                s5 = rs.getString(12);//email
                s6 = rs.getString(13);//tlph
                s7 = rs.getString(14);//address
                s8 = rs.getString(15);//state
                s9 = rs.getString(16);//pin
                s10 = rs.getString(15);//pin
                s11 = rs.getString(16);//category

            }
            String sql = "select * from Experienced where Username='" + c1 + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                expyrs = rs.getString(2);
                company = rs.getString(3);
                desig = rs.getString(4);
                sal = rs.getString(5);
                comadd = rs.getString(6);
                category = "Experienced";
            } else {
                category = "Fresher";
            }
                    %>
<form method="POST" action="savestudentedit.jsp" name="form1" onsubmit="return check()">
<table border="0" cellpadding=3 cellspacing=0 align=center>
   <tr wdth =100%>
       <td colspan="2" ><div align="center"><font color="white" size="5">Edit Profile</font></div></td>
   </tr>
                            <tr>
                                <td class="td" >Name&nbsp;</td>
                                
                                <td ><input TYPE="text" NAME="name" size=30
                                                                         maxlength=30 value='<%=s%>'></td>
                            </tr>
                            <tr >
                                <td class="td">
                                   College in which studying
                                </td>
                                <td><input TYPE="text" NAME="college" size=30 maxlength=30 value='<%=s1%>'></td>
                            </tr>
                            <tr>
                                <td class="td">
                                   College Phone
                                </td>
                                <td ><input TYPE="text" NAME="collegephone" size=30 maxlength=30 value='<%=s2%>'></td>
                            </tr>
                            <tr >
                                <td class="td" >
                                 College Email
                                </td>
                                <td><input TYPE="text" NAME="collegeemail" size=30 maxlength=50 value='<%=s3%>'>                                 </td>
                            </tr>
                            <tr>
                                <td class="td">
                                    % of Marks
                                </td>
                                <td >
                                    <table width="111" border=0 cellpadding=0 cellspacing=0>
                                        <tr>
                                            <td width="95"><div align="center"><font SIZE="2" ><strong>Graduation %</strong></font> </div></td>
                                        </tr>
                                        <tr>
                                            <td><input TYPE="text" NAME="markDegree" size=8 maxlength=8 value='<%=s4%>' onblur="checkDec('markBSC')">                                              </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td class="td" >
                                    Email_id
                                </td>
                                <td><input type="text" NAME="email" size=30 maxlength=30 value='<%=s5%>'></td>
                            </tr>
                            <tr >
                                <td class="td" >
                                Telephone Number
                                </td>
                                <td ><input NAME="telephone" TYPE="text" id="telephone" value="<%=s6%>">
                                    
                                </td>
                            </tr>
                            <tr>
                                <td class="td" >Address</td>
                                <td >
                                    <input class=USS_TEXT maxLength=30 name="address" size=40 value='<%=s7%>'>
                                </td>
                            </tr>
                            <tr >
                               <td class="td" > State</td>
                               <td><select name=state> <option selected value='<%=s8%>'><%=s8%></option>
                                        <option value=AP>Andhra Pradesh</option> <option value=AR>Arunachal
                                        Pradesh</option> <option value=AS>Assam</option> <option
                                            value=BR>Bihar</option> <option value=CH>Chandigarh</option> <option
                                            value=CG>Chattisgarh</option> <option value=DL>Delhi</option> <option
                                            value=GA>Goa</option> <option value=GJ>Gujarat</option> <option
                                            value=HR>Haryana</option> <option value=HP>Himachal Pradesh</option>
                                        <option value=JK>Jammu &amp; Kashmir</option> <option
                                            value=JH>Jharkhand</option> <option value=KA>Karnataka</option> <option
                                            value=KL>Kerala</option> <option value=MP>Madhya Pradesh</option>
                                        <option value=MH>Maharashtra</option> <option value=MN>Manipur</option>
                                        <option value=ML>Meghalaya</option> <option value=MZ>Mizoram</option>
                                        <option value=NL>Nagaland</option> <option value=OR>Orissa</option>
                                        <option value=PY>Pondicherry</option> <option value=PB>Punjab</option>
                                        <option value=RJ>Rajasthan</option> <option value=SK>Sikkim</option>
                                        <option value=TN>Tamilnadu</option> <option value=TR>Tripura</option>
                                        <option value=UA>Uttaranchal</option> <option value=UP>Uttar
                                        Pradesh</option> <option value=WB>West Bengal</option> <option
                                    value=XX>Others</option></select><br>                           </td>
                            </tr>
                            <tr>
                                <td class="td" >
                                    Pincode
                                </td>
                                <td ><INPUT class=USS_TEXT maxLength=6 name="pin" size=6 value='<%=s9%>'>
                                   
                                    <input type="hidden" name="category" id="category" value="<%=category%>" />
                                </td>
                            </tr>
                            <%
     if (s11.equalsIgnoreCase("Fresher")) {
                            %>

                            <tr>
                                <td class="td" >
                                    <strong><font SIZE="3" COLOR="#666600" face ='Times New Roman, Times, serif'>Category</font></strong>
                                </td>
                                <td>
                                    <input type="checkbox" name="cat" id="cat"  value='Experienced'  onclick="setVal(this);" />Experienced
                                </td>
                            </tr>

                            <%     }

                            %>
                            <tr >
                                <td class="td" >
                                    Experienced Years
                                </td>
                                <td ><input TYPE="text" NAME="expyears" id="expyears" size=30 maxlength=30 value="<%=expyrs%>"></td>
                            </tr>
                            <tr>
                                <td class="td" >Company</td>
                                <td ><input TYPE="text" NAME="company" id="company" size=30 maxlength=30 value="<%=company%>"></td>
                            </tr>
                            <tr>
                                <td class="td" >Designation </td>
                                <td ><input TYPE="text" NAME="designation" id="designation" size=30 maxlength=30 value="<%=desig%>"></td>
                            </tr>
                            <tr>
                                <td class="td" >Salary</td>
                                <td ><input TYPE="text" NAME="salary" id="salary" size=30 maxlength=30 value="<%=sal%>"></td>
                            </tr>
                            <tr>
                                <td class="td" >Company Address</td>
                                <td ><input TYPE="text" NAME="comAddress" id="comAddress" size=30 maxlength=30 value="<%=comadd%>"></td>
                            </tr>
                            <tr>
                                <td height="49" colspan=2 align="center" ><input TYPE="submit" value="Save"></td>
                            </tr>
                        </table>
                    </form>

                    <%// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    %>

                </td>
            </tr>
        </table>
                    
    </body>
</html>
