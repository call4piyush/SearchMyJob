<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="pass/style3.css">
        <script language="javascript">
            function check()
            {
                var a= document.form1.newpass2.value;
                var b= document.form1.newpass.value;
                var c=document.form1.pass.value;
                if(document.form1.pass.value  =="")
                {
                    alert("Enter the old password");
             //       c.focus();
                    return false;
                }
                if(document.form1.newpass2.value =="")
                {
                    alert("Enter the new password");
               //     a.focus();
                    return false;
                }
                else if(a.length<8)
                {
                    alert("password should be minimum 8 characters");
                 //   a.focus();
                    return false;
                }
                if(document.form1.newpass.value=="")
                {
                    alert("ReEnter the password");
                   //b.focus();
                    return false;
                }
                else if(a!=b)
                {
                    alert("Wrong password ma.tch");
                 //b.focus();
                    return false;
                }

                return true;
            }
        </script>
    </head>
    <body>
         <% try {

            //              HttpSession s = request.getSession();
            //  String c1 = request.getParameter("id");
            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");
            // session.getAttribute("c1", c1);

            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Login where username='" + c1 + "' and password ='" + c2 + "'");

            String s1 = null;
            String s2 = null;
                        %>
<%
     while (rs.next()) {
         s1 = rs.getString(1);
         s2 = rs.getString(2);
     }
                        %>
        <form name="form1" method="post" action="savecanpass.jsp" onsubmit="return check()" >
            <table  width="700" height="300" border="0" align="center" cellpadding="1" class="y" >
                            <tr>
                                <td class="p" colspan="3" ><strong>Change Password </strong></td>
                            </tr>
                            <tr>
                                <td class="p" >Username</td>
                                <td  ><input name="user" type="text"  id="user" value="<%=s1%>" size="35"></td>
                                
                            </tr>
                            <tr>
                                <td class="p">Old Password </td>
                                <td><input name="pass" type="text"  id="pass" value="<%=s2%>" size="35"></td>
                            </tr>
                            <tr>
                                <td class="p">New Password </td>
                                <td ><input name="newpass2" type="password" id="newpass2" size="35"></td>
                            </tr>
                            <tr>
                                <td class="p">Retype New Password</td>
                                <td><input name="newpass" type="password" id="newpass" size="35"></td>
                            </tr>
                            <tr>
                                <td colspan="4" class="st"><div align="center">
                                        <input name="Submit" type="submit" value="Submit">
                                </div></td>
                            </tr>
                        </table>
                    </form>
         <%
        }//try
        catch (Exception e) {
            out.println(e);
        }

                %>
    </body>
</html>
