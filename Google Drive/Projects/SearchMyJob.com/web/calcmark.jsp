<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*" session="true" %>
<html>
<head>
<title>www.SearchMyJob.com
</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="calcmark.jsp">
    <input name="OK" type="submit" id="OK" value="Submit" />
</form>

<%
         String sql;
	   int mark = Integer.parseInt(session.getAttribute("mark").toString());
	     
	  
        String ch = request.getParameter("ch");
        String ans = request.getParameter("ans");
        int qno = Integer.parseInt(request.getParameter("qno"));
        if (ch != null) {
//out.println("Ch=" + ch + "<br> Ans=" + ans + "<br>Qno=" + qno + " Mark=" + mark);
            ch = ch.trim();
            ans = ans.trim();
            if (ch.equalsIgnoreCase(ans)) {
                mark++;
                session.setAttribute("mark",String.valueOf(mark));

            }
        }
        if (qno < 10) {
            response.sendRedirect("dispqst.jsp?qno=" + (qno + 1));
        } else {
            try {
            	  
                Connection con=null;
       		    String url = "jdbc:mysql://localhost:3306/";
       		    String dbName = "online";
       		    String driverName = "com.mysql.jdbc.Driver";
       		    String userName = "root";
       		    String password = "root";
       		    ResultSet rs,rs1;
       		    Statement st=null;
       		    Class.forName(driverName).newInstance();
       		    con = DriverManager.getConnection(url+dbName, userName, password);
                String studentid = session.getAttribute("s1").toString();
                sql = "delete from Data where StudentID='" + studentid + "'";
                
                 
                
                
              //  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               // con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                st = con.createStatement();
                st.executeUpdate(sql);

                String examID = session.getAttribute("examid").toString();
                String jobID = session.getAttribute("jobid").toString();
                mark=Integer.parseInt(session.getAttribute("mark").toString());
                out.println(mark);
                sql="Insert into Result values('" + studentid + "','" +  examID + "','" + jobID + "'," + mark + ")";
                st.executeUpdate(sql);
                response.sendRedirect("dispresult.jsp");
            } catch (Exception ex) {
                out.println(ex.toString());
            }

        }

%>
</body>
</html>
