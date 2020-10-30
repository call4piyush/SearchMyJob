<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>www.SearchMyJob.com</title>
        <style type="text/css">
            <!--
            .style1 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	font-size: x-large;
	color: #B0D0D7;
            }
            .style2 {
                font-family: Geneva, Arial, Helvetica, sans-serif;
                font-weight: bold;
            }
body {
	background-color: #006699;
}
.style4 {color: #000000; }
.style10 {color: #000000; font-weight: bold; }
            -->
        </style>
    </head>
    <body>
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
        
       // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
        try {
            String uid = request.getParameter("uid");
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            
            rs = st.executeQuery("select Name,Gender,dob,College,CollegePhone,CollegeEmail,MarkDegree,Email,Telephone,Address,State,Pin,Sel_cat from Details2 where Username='" + uid + "'");
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "", s11 = "", s12 = "", s13 = "", s14 = "",
            s15="",s16="",s17="",s18="";
            while (rs.next()) {
                s1 = rs.getString("Name");
                s2 = rs.getString("Gender");
                s3 = rs.getString("Dob");
                s4 = rs.getString("College");
                s5 = rs.getString("CollegePhone");
                s6 = rs.getString("CollegeEmail");
                s7 = rs.getString("markDegree");
                
                s9 = rs.getString("Email");
                s10 = rs.getString("Telephone");
                s11 = rs.getString("Address");
                s12 = rs.getString("State");
                s13 = rs.getString("Pin");
                s14 = rs.getString("sel_cat");
            
        %>
        <table width="952" height="649" border="0" align="center">
            <tr>
                <td colspan="4"><div align="center" class="style1">Resume</div></td>
          </tr>
            <tr>
              <td width="228">&nbsp;</td>
                <td width="201" height="37"><div align="left" class="style4"><span class="style2">Name
                  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;
              :</span></div></td>
              <td width="86">&nbsp;</td>
              <td width="419"><span class="style10">
              <label>
              </span>
                <div align="left" class="style10"><%=s1%></div>
                  <span class="style10">
                  </label>              
                  </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="38"><div align="left" class="style4"><span class="style2">Gender
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;  &nbsp;:</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s2%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="36"><div align="left" class="style4"><span class="style2">Date of Birth
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s3%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="36"><div align="left" class="style4"><span class="style2">College Name
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;: </span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s4%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="38"><div align="left" class="style4"><span class="style2">College Phone
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;: </span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s5%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="42"><div align="left" class="style4"><span class="style2">College Email
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;: </span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s6%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="40"><div align="left" class="style4"><span class="style2">Degree
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;:</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s7%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="38"><div align="left" class="style4"><span class="style2">Mark
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s8%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="37"><div align="left" class="style4"><span class="style2">Email
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><strong> : </strong></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s9%></div>
                    <span class="style10">
                    </label>               
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="45"><div align="left" class="style4"><span class="style2">Telephone
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; : </span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s10%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="39"><div align="left" class="style4"><span class="style2">Address
              &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><strong> :</strong></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s11%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="37"><div align="left" class="style4"><span class="style2">State
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              :</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s12%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="44"><div align="left" class="style4"><span class="style2">Pincode
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              :</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s13%></div>
                    <span class="style10">
                    </label>                
                    </span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
                <td height="41"><div align="left" class="style4"><span class="style2">Category
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              :</span></div></td>
              <td>&nbsp;</td>
                <td><span class="style10">
                <label>
                </span>
                  <div align="left" class="style10"><%=s14%></div>
                  <span class="style10">
                  </label>
                </span></td>
            </tr>
            <%
            }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }
            %>
    </table>
</body>
</html>




