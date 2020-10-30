<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>www.SearchMyJob.com</title>
<style>
    .rty{
        color: #ffffff;
                background-color:#55503b;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform:capitalize;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-width: 1px;
}
.tyu{
        color: black;
                                border-width: 1px;
               background-color:#d1c79d;
                height: 40px;
                border-radius:8px;
                text-align: center;
                text-transform:none;
                width: 120px;
                border-style: dotted;
                border-color: #ddb421;
                 border-left-style: double;
            }
.tyu a{
    text-decoration: none;
    color:orangered;
    font-weight: bold;
}
</style>
</head>

<body style="margin:0px">

    <table bgcolor="#3f3f3f" width="100%" height="109" border="1" align="left">
          <tr>
              <td class="rty" colspan="8">Candidate Details </td>
          </tr>
          <tr>
            <td class="rty">Username</td>
            <td class="rty">password</td>
            <td class="rty">Name</td>
            <td class="rty">Phone</td>
            <td class="rty">Email_id</td>
            <td class="rty">Category</td>
            <td class="rty">Delete</td>
            <td class="rty">Resume</td>
        </tr>
        <%
        
        
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
      //Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
       rs=st.executeQuery("select Username,Name,Address,Telephone,Email,Sel_cat,password from Details2");
	  String  uid="",pass="",name="",phone="",email="",cat="";
        while(rs.next())
            {
			uid=rs.getString("Username");
			pass=rs.getString("password");
			name=rs.getString("name");
			phone=rs.getString("Telephone");
			email=rs.getString("Email");
			cat=rs.getString("Sel_cat");




      %>
        <tr>
          <td class="tyu"><%=uid%></td>
          <td class="tyu"><%=pass%></td>
          <td class="tyu"><%=name%></td>
          <td class="tyu"><%=phone%></td>
          <td class="tyu"><%=email%></td>
          <td class="tyu"><%=cat%></td>
          <td class="tyu"><a href="Delete.jsp?uid=<%=uid%>">Delete</a></td>
          <td class="tyu"><a href="resume2.jsp?uid=<%=uid%>">View</a></td>
        </tr>
        <%
      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            %>
      </table>

</body>
</html>