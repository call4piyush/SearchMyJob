<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
    </head>
    <body bgcolor="#3f3f3f">
        
    <%
    String i="INCORRECT";
    String jobid=request.getParameter("jobid");
    System.out.println(jobid);
    String examid=request.getParameter("examid");
    String Qno=request.getParameter("Qno");
    String question=request.getParameter("question");
  /*  String option1=request.getParameter("option1");
    String option2=request.getParameter("option2");
    String option3=request.getParameter("option3");
    String option4=request.getParameter("option4");
    String answer=request.getParameter("answer");
    String Button=request.getParameter("Button");*/
    %>
    
         <% try
          {
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
         //  Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
           Statement st=con.createStatement();
           
         String sql1 = "Select * from Question where jobID='"+jobid+"'and QuestionNo='"+Qno+"'";
 		        rs1 =st.executeQuery(sql1);
 		    	if(rs1.next())
		    	{ %>
                        <font color="white" size="20" > <%
                        out.println(i);
                        %></font>
                        <%
 		    		/*String sql = "insert into Question values (?,?,?,?,?,?,?,?,?)";
 		   			System.out.println("sql" +sql);
 		   			PreparedStatement pst = con.prepareStatement(sql);
 		   			pst.setString(1, jobid);
 		   			pst.setString(2, examid);
 		   			pst.setString(3, Qno);
 		   			pst.setString(4, question);
 		   			pst.setString(5, option1);
 		   			pst.setString(6, option2);
 		   			pst.setString(7, option3);
 		   			pst.setString(8, option4);
 		   			pst.setString(9, answer);
 		   			int numRowsChanged = pst.executeUpdate();
 		   		 
 		   		out.println(" Inserted The Your's Data : ");
	    		out.println(" '" +jobid+"'");
 		   		
 		   		

 		   		pst.close();*/
 		 	    
 		       //   Statement st2=con.createStatement();
 		          
 		         // String stat="c";
 		         // st2.executeUpdate("insert into Login values('"+request.getParameter("comusername")+"','"+request.getParameter("compassword")+"','"+stat+"')");
 		        
 		         
 		         
 		          // st2.close();
 		    
		    	}
 		    	
 		    	else
 		    	{
 		 st.executeUpdate("insert into Question values('"+request.getParameter("jobid")+"','"+request.getParameter("examid")+"','"+request.getParameter("Qno")+"','"+request.getParameter("question")+"','"+request.getParameter("option1")+"','"+request.getParameter("option2")+"','"+request.getParameter("option3")+"','"+request.getParameter("option4")+"','"+request.getParameter("answer")+"')");
                        %>
         <font color="white" size="20" ><%
                 out.println(" Question are added in the database:");
                                %></font>
         <%
                 st.close();
             }
          }
        
         catch(SQLException SQLExcp)
			{
			out.println("SQLException:"+SQLExcp);

			}
  		catch(ClassNotFoundException clsNotFndExcp)
			{
 	 	out.println("cnnnot find the cklass"+clsNotFndExcp);
			}
           %>

        
           <p>  <font color="white" size="20" >    <a href="addques.jsp">GO back</a></font></p>
        
    </body>
</html>
