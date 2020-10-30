<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <style type="text/css">
            body{
                background-color: #3f3f3f;
}
            .ji{
                color: white;
                text-align: center;
                height: 40px;
                width: 300px;
}
input[type=text]{
    margin-left: 100px;
    text-align: center;
  padding: 0 10px;
  width: 200px;
  height: 40px;
  color: white;
  text-shadow: 1px 1px 1px black;
  background: rgba(0, 0, 0, 0.16);
  border: 0;
  border-radius: 16px;
  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);
  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);
}
input[type=submit]{
 border-radius:25px;
                height: 30px;
                width: 170px;
                float: none;
                background-color: #3F3F3F;
                color: white;
                font-size: 18px;
                font-family: times new roman;
                text-transform: none;

}
</style>
</head>
<body style="margin:0px">
        <table width="100%" border="0">
        
          <tr>
              <td><jsp:include page="comheader.jsp"></jsp:include></td>
          </tr>
            <td  valign="top">
                <% try {

                String jid =request.getParameter("jid");
                String jpost =request.getParameter("post");
                String jcriteria =request.getParameter("criteria");
                String jvac =request.getParameter("vacancies");
                String jsal =request.getParameter("salary");
                String jdate =request.getParameter("lastdate");
                
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
                //Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();  
                rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                while (rs.next())
                    {  
                    jid=rs.getString("JobId");
                    jpost=rs.getString("Post");
                    jcriteria=rs.getString("Criteria");
                    jvac=rs.getString("NoOfVacancies");
                    jsal=rs.getString("Salary");
                    jdate=rs.getString("LastDate");
      
                    %>
                <form method="post" action="savejobedit.jsp">
  <table width="700" height="276" border="0" align="center">
                
  <tr >
      <td colspan="2" class="ji">Job Details</td>
    </tr>
  <tr>
    <td class="ji">Job ID</td>
    <td ><input name="jobid" type="text" id="jobid" size="35" maxlength="25" value="<%=jid%>"></td>
  </tr>
  <tr>
    <td class="ji">Post</td>
    <td ><input name="post" type="text" id="post"  value="<%=jpost%>" size="35"></td>
  </tr>
  <tr>
    <td class="ji">Criteria</td>
    <td ><input name="criteria" type="text" id="criteria" value="<%=jcriteria%>" size="35" maxlength="25"></td>
  </tr>
  <tr>
    <td class="ji">Vacancies</td>
    <td ><input name="vacancies" type="text" id="vacancies" size="35" maxlength="25" value="<%=jvac%>"></td>
  </tr>
  <tr>
    <td class="ji">Salary/Annum</td>
    <td ><input name="salary" type="text" id="salary" value="<%=jsal%>" size="35" maxlength="25"></td>
  </tr>
  <tr>
    <td class="ji">Last Date</td>
    <td ><input name="lastdate" type="text" id="lastdate" value="<%=jdate%>" size="35" maxlength="25"></td>
  </tr>
  <tr >
    <td height="31" colspan="2"><div align="center">
      <input type="submit" name="button" id="button" value="Edit Details">
    </div></td>
    </tr>
</table>
</form>	
<% }//while
     
}
      catch(Exception e)
      {
         out.println(e); 
      }
%>
            </td>
          </tr>
        </table>  
    </body>
</html>
