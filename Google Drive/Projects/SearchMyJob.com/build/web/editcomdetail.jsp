<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="company/style8.css">
      <script language="javascript">
			function check()
			{
				var a=document.form1.comname.value;
           		var c=document.form1.comemail.value;
            	var d=document.form1.comcontact.value;
            	var e=document.form1.comcutoff.value;
            	var b=document.form1.comaddress.value;
            	var f=document.form1.compost.value;
            	var g=document.form1.comcriteria.value;
				if(document.form1.comname.value == "")
				{
					alert("Enter Company Name");
                	//a.focus();
                	return false;
				}
				else if(parseInt(a))
           		 {
                alert("Company Name cannot be integer");
                //a.focus();
                return false;
           		 }
				if(document.form1.comaddress.value == "")
				{
					alert("Enter Company Address");
                	//b.focus();
                	return false;
				}
				if(document.form1.compost.value == "")
				{
					alert("Enter Post");
                	//f.focus();
                	return false;
				}
				if(document.form1.comcriteria.value == "")
				{
					alert("Enter Criteria of the Company");
                	//g.focus();
                	return false;
				}
				if(document.form1.comemail.value == "")
				{
					alert("Enter Company Email");
                //	c.focus();
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
				if(document.form1.comcontact.value == "")
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
				if(document.form1.comcutoff.value == "")
				{
					alert("Enter Company Cutoff mark");
                	//e.focus();
                	return false;
				}
				 else if(!parseInt(e))
            	{
                alert("Enter integer");
               //e.focus();
                return false;
            	}
           	 	else if(parseInt(e)<0||parseInt(e)>100)
            	{
                alert("Enter cutoff in %");
                //e.focus();
                return false;
            	}
				return true;
				}
	</script>
    </head>
    <body>
                                <%
        //out.println(c1);
        try {

            //

            String c1 = (String) session.getAttribute("s1");
           
            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();


            rs = st.executeQuery("select CName,CAddress,CPost,CCriteria,CEmail,CContact,CcutOff from Com where CUserName='" + c1 + "'");
            String a = null;
            String b = null;
            String c = null;
            String d = null;
            String e = null;
            String f = null;
            String g = null;
            while (rs.next())
            {
                a = rs.getString("CName");
                b = rs.getString("CAddress");
                c = rs.getString("CPost");
                d = rs.getString("CCriteria");
                e = rs.getString("CEmail");
                f = rs.getString("CContact");
                g = rs.getString("CcutOff");

                        %>
         <form method="POST" action="savecompanyedit.jsp" name="form1" onSubmit="return check()">
             <table  bgcolor="#3F3F3F" width=600" border="0" cellpadding=3 cellspacing=0 align="center">
                                <tr >
                                    <td class="m" colspan="2" >
                               Edit Company Profile
                                    </td>
                                </tr>
                                <tr >
                                    <td class="w">
                                    Name</td>
                                    <td >
                                        <input TYPE="text" NAME="comname" id="comname" size=30 maxlength=30 value="<%=a%>">
                                    </td>
                                </tr>
                                <tr >
                                    <td class="w">
                                    Address</td>
                                    <td >
                                        
                                            <input NAME="comaddress" TYPE="text" id="comaddress" size=30 maxlength=50 value="<%=b%>">
                                   	 </td>
                                </tr>
                                <tr>
                                    <td class="w">
                                    Post</td>
                                    <td >
                                        <input NAME="compost" TYPE="text" id="compost" size=30  maxlength=50 value="<%=c%>">
                                    </td>
                                </tr>
                                <tr>
                                    <td class="w">
                                    Criteria</td>
                                    <td >
                                        <input NAME="comcriteria" TYPE="text" id="comcriteria" size=30  maxlength=50 value="<%=d%>">
                                    </td>
                                </tr>
                                <tr >
                                    <td class="w">
                                   Email_id</td>
                                    <td >
                                        <input TYPE="text" NAME="comemail" id="comemail" size=30 maxlength=30 value="<%=e%>">
                                  </td>
                                </tr>
                                <tr>
                                    <td class="w">
                                    Contact No:</td>
                                    <td >
                                         <input TYPE="text" NAME="comcontact" id="comcontact"size=20 maxlength=30 value="<%=f%>">
                                   </td>
                                </tr>
                                <tr  >
                                    <td class="w">
                                    CutOff %</td>
                                    <td >
                                        
                                            <input TYPE="text" NAME="comcutoff" id="comcutoff" size=30 maxlength=30 value="<%=g%>">
                                       </td>
                                </tr>
                                <tr>
                                    <td height="49" colspan=2 class="w" >
                                        <div align="center"><br>
                                            <input type="reset" />
                                            &nbsp;&nbsp;<input TYPE="submit" value="Edit" >
                                    </div>	    </td>
                                </tr>
                            </table>
                        </form>
                                                 <% }//while

        } catch (Exception e) {
            out.println(e.toString());
        }
                    %>
    </body>
</html>
