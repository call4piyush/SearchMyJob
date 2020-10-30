<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <style>
            body
            {
                background-color: #3f3f3f;
}
            .df{

                color: white;
                height: 40px;
                width:  50%;
                text-align: center;
}
input[type=text], input[type=password]{
  padding: 0 10px;
  width: 250px;
  height: 40px;
  color: white;
  text-shadow: 1px 1px 1px black;
  background: rgba(0, 0, 0, 0.16);
  border: 0;
  border-radius: 16px;
  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);
  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);
  text-align: center;
  margin-left: 15px;
}
input[type=submit]{
  padding: 0 10px;
  width: 100px;
  height: 40px;
  color: white;
  text-shadow: 1px 1px 1px black;
  background: rgba(0, 0, 0, 0.16);
  border: 0;
  border-radius: 16px;
  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);
  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);
  text-align: center;
}
        </style>
        <script language="javascript">
            function check()
            {
                var a= document.form1.newpass2.value;
                var b= document.form1.newpass.value;
                var c=document.form1.pass.value;
                    if(document.form1.pass.value  =="")
                    {
                        alert("Enter the old password");
                      //  c.focus();
                        return false;
                    }
                   if(document.form1.newpass2.value =="")
                    {
                        alert("Enter the new password");
                        //a.focus();
                        return false;
                    }
                    else if(a.length<8)
                        {
                         alert("password should be minimum 8 characters");
                        //a.focus();
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
                            alert("Wrong password match");
                          //  b.focus();
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
            
            
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Login where username='" + c1 + "' and password ='" + c2 + "'");

            String s1 = null;
            String s2 = null;
                    %>
                    <font color="red">   <center>
                        <%
                        out.println("Username Is--");
                        out.println(c1);
                        %>
                        </center></font>
                        
  <%
     while (rs.next()) {
         s1 = rs.getString(1);
         s2 = rs.getString(2);
     }
  %>
                    <form name="form1" method="post" action="savepassword.jsp" onsubmit="return check()">
                        <table  width="700" height="150" border="0" align="center" >
                            <tr>
                                <td class="df" colspan="2" >Change Password </td>
                            </tr>
                            <tr>
                                <td class="df"> Username </td>
                                <td ><input name="user" type="text"  id="user" value="<%=s1%>" size="35"></td>
                                
                            </tr>
                            <tr>
                                <td class="df">Old Password </td>
                                <td ><input name="pass" type="password"  id="pass"  size="35"></td>
                            </tr>
                            <tr>
                                <td class="df">New Password </td>
                                <td ><input name="newpass2" type="password" id="newpass2" size="35"></td>
                            </tr>
                            <tr>
                                <td class="df">Retype New Password</td>
                                <td ><input name="newpass" type="password" id="newpass" size="35"></td>
                            </tr>
                            <tr>
                                <td colspan="2" >
                                    <center> <input name="Submit" type="submit" value="Submit"></center>
                                </td>
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