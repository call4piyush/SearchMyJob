<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table bgcolor="#3f3f3f"  width="500" height="97" border="0" align="center">
                <tr>
                    <td class="ti"  colspan="2">
                        View Questions
                    </td>
                </tr>
                <tr>
                    <%
                                String jid = request.getParameter("s1");
                                String eid = request.getParameter("s2");
                                //out.print(jid);
                                try {
                                    Connection con = null;
                                    String url = "jdbc:mysql://localhost:3306/";
                                    String dbName = "online";
                                    String driverName = "com.mysql.jdbc.Driver";
                                    String userName = "root";
                                    String password = "root";
                                    ResultSet rs, rs1;
                                    Class.forName(driverName).newInstance();
                                    con = DriverManager.getConnection(url + dbName, userName, password);
                                    if (eid == null) {
                                        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                        // Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                                        Statement st = con.createStatement();
                                        Statement st2 = con.createStatement();
                    %>
              
                                <%
                                                ResultSet rs2 = st2.executeQuery("select * from job_details");
                                                String s2 = null;
                                                // String s2=null;
                                                while (rs2.next()) {
                                                    s2 = rs2.getString("jobid");
                                                    //    s2=rs.getString("Post");
                                %>
                                </tr>
<%                             rs = st.executeQuery("select * from Exam ");
                                            String s1 = null;
                                            // String s2=null;
                                            while (rs.next()) {
                                                s1 = rs.getString("examid");
                                                //    s2=rs.getString("Post");
                            %>
                            <option value="<%=s1%>"><%=s1%></option>
                            <%}%>
                        
                <tr>
                    <td  align="center" height="40"  colspan="2">
                        <input type="submit" value="Show Details">
                    </td>
                </tr>
            </table>

        <table  bgcolor="#3f3f3f"  border="1" align="left" width="100%" class="d">

            <tr><td class="ta" colspan="8"></td>
            </tr>
            <tr>

                <td class="dta">Question No: </td>
                <td class="dta">Question</td>
                <td class="dta">Option 1</td>
                <td class="dta">Option 2</td>
                <td class="dta">Option 3</td>
                <td class="dta">Option 4</td>
                <td class="dta">Answer</td>
                <td class="dta">Delete</td>
            </tr>
            <%

                            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            //  Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                            Statement st3 = con.createStatement();
                            // Statement st2=con.createStatement();

                            ResultSet rs3 = st3.executeQuery("select QuestionNo,Question,Option1,Option2,Option3,Option4,Answer from Question where ExamID='"
                                    + eid + "' and JobID='" + jid + "'");
                            //  String s2=null;
                            while (rs3.next()) {
                                String qno = rs3.getString("QuestionNo");
                                String ques = rs3.getString("Question");
                                String op1 = rs3.getString("Option1");
                                String op2 = rs3.getString("Option2");
                                String op3 = rs3.getString("Option3");
                                String op4 = rs3.getString("Option4");
                                String ans = rs3.getString("Answer");



            %>
            <tr>
                <td class="dt" ><%=qno%></td>
                <td class="dt">
                        <%=ques%>
                    </td>
                <td class="dt">
                        <%=op1%>
                    </td>
                <td class="dt">
                        <%=op2%>
                    </td>
                <td class="dt">
                        <%=op3%>
                    </td>
                <td class="dt">
                        <%=op4%>
                    </td>
                <td class="dt">
                        <%=ans%>
                    </td>
                <td class="dt"><a href="DeleteQues.jsp?qno=<%=qno%>&jid=<%=jid%>&eid=<%=eid%>" >Delete</a></td>
            </tr>

            <%
                                }
                                con.close();
                            }
}
                        } catch (Exception e) {
                            out.println(e);
                        }
            %>
        </table>
    </body>
</html>
