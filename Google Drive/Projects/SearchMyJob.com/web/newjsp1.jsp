<%@page import="java.io.*,java.sql.*"session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <style type="text/css">
            .hu{
                color: white;
                text-align: center;
}
            
        </style>
        <script language="javascript">
		function check()
		{
			var a= document.form1.examid.value;
			var b= document.form1.cutoff.value;
			var c=document.form1.examname.value;
			if(document.form1.examid.value=="")
            {
                alert("Enter Exam ID");
                //a.focus();
                return false;
            }
            else if(!parseInt(a))
            {
                alert("Enter Integer");
               // a.focus();
                return false;
            }
			if(document.form1.examname.value=="")
            {
                alert("Enter Exam Name");
                //c.focus();
                return false;
            }

			if(document.form1.cutoff.value=="")
            {
                alert("Enter Cutoff mark");
             //   b.focus();
                return false;
            }
            else if(!parseInt(b))
            {
                alert("Enter Integer");
               // b.focus();
                return false;
            }
			else if(parseInt(b)<0||parseInt(b)>100)
            {
                alert("Enter cutoff in %");
                //b.focus();
                return false;
            }

			return true;
		}
		</script>
    </head>
    <body >
        <table width="100%" border="1" >
            <tr>
                <td ></td>
            </tr>
            <tr>
                <td</td>
                <td width="961" bgcolor="#3f3f3f"  valign="top">
                    <table width="277" height="144" border="1" align="center">
                        <tr>
                            <td colspan="2" class="hu">
                                 Exam Creation
                           </td>
                        </tr>
                        <tr>
                        <%
        String jid = request.getParameter("jobid");
        try {
        	 Connection con=null;
    		    String url = "jdbc:mysql://localhost:3306/";
    		    String dbName = "online";
    		    String driverName = "com.mysql.jdbc.Driver";
    		    String userName = "root";
    		    String password = "root";
    		    ResultSet rs,rs1;
    		    Class.forName(driverName).newInstance();
    		    con = DriverManager.getConnection(url+dbName, userName, password);
            if (jid == null) {


               // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                        %>
                        <form name="form2" action="newjsp1.jsp">
                            <td width="163" height="42" class="hu">Select a JobID </td>
                            <td width="104">
                                <label>
                                    <select name="jobid">
                                        <%      rs = st.executeQuery("select * from job_details");
                                    String s1 = null;
                                    // String s2=null;
                                    while (rs.next()) {
                                        s1 = rs.getString("JobId");
                                        //    s2=rs.getString("Post");

                                        %>
                                        <option value="<%=s1%>"><%=s1%></option>
                                        <% }//while %>
                                    </select>
                                </label>
                            </td>
                            <tr><td> <div align="center">
                                        <input type="submit" value="Show Details">
                            </div></td></tr>
                        </form>
                        <%
                          }//if
                          else {
                              jid = request.getParameter("jobid");
                              //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                             // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                              Statement st = con.createStatement();
                              Statement st2 = con.createStatement();
                               rs = st.executeQuery("select * from job_details where JobId='" + jid + "'");
                              String s2 = null;
                              while (rs.next()) {
                                  s2 = rs.getString("post");

                        %>
                        <tr>
                            <td><span class="style19">Post Name :</span></td>
                            <td><%=s2%></td>
                        </tr>
                    </table>
                    <p>&nbsp;</p>
                    <form name="form1" method="post" action="saveexamdetails.jsp" onSubmit="return check()">
                        <table width="318" height="166" border="1" align="center">
                            <tr>
                                <td width="138" height="40" bordercolor="#666666" bgcolor="#B0CDD7"><div align="center" class="style4 style20"><strong>Exam ID</strong></div></td>
                                <td width="164" bordercolor="#666666" bgcolor="#B0CDD7"><input type="text" name="examid"></td>
                            </tr>
                            <tr>
                                <td height="40" bordercolor="#666666" bgcolor="#B0CDD7"><div align="center" class="style4 style20"><strong>Exam Name </strong></div></td>
                                <td bordercolor="#666666" bgcolor="#B0CDD7"><input type="text" name="examname"></td>
                            </tr>
                            <tr>
                                <td height="41" bordercolor="#666666" bgcolor="#B0CDD7"><div align="center" class="style4 style20"><strong>Cutoff %</strong></div></td>
                                <td bordercolor="#666666" bgcolor="#B0CDD7"><input type="text" name="cutoff"></td>
                            </tr>

                            <tr>
                                <td height="33" colspan="2" bordercolor="#666666" bgcolor="#B0CDD7"><div align="center">
                                        <input type="submit" name="Submit" value="Submit">
                                </div>        </td>
                            </tr>
                        </table>
                    </form>
                    <%
                }//while
                session.setAttribute("jobid", request.getParameter("jobid"));
                session.setAttribute("post", s2);
            }//else

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