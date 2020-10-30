<%@page import="java.io.*,java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.SearchMyJob.com</title>
        <style>
            .tf{ text-align: center;
    border-radius: 16px;
    height: 50px;
    width: 150px;
    background-color: #3F3F3F;
    color: white;
   font-size: 20px;
}
input[type=text], input[type=password],select,textarea{
  padding: 0 10px;
  width: 250px;
  height: 40px;
  color: white;
  text-shadow: 1px 1px 1px black;
  background: rgba(0, 0, 0, 0.16);
  border: 0;
  border-radius: 12px;
  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);
  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);
  text-align: center;
}
.dp{
    color: #ffffff;
    height: 40px;
    text-align: center;
}
input[type=button]{
  padding: 0 10px;
  width: 150px;
  height: 40px;
  color: white;
  text-shadow: 1px 1px 1px black;
  background: rgba(0, 0, 0, 0.16);
  border: 0;
  border-radius: 12px;
  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);
  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);
  text-align: center;
  text-transform: uppercase;
}

        </style>
        <script >
            function onSubmit(i)
            {
                var x=document.form1.jobid.value;
                var y=document.form1.examid.value;
                var a= document.form1.Qno.value;
                var b=document.form1.question.value;
                var c=document.form1.option1.value;
                var d=document.form1.option2.value;
                var e=document.form1.option3.value;
                var f=document.form1.option4.value;
                var g=document.form1.answer.value;
                if(i==1)
                {
                    
                if(document.form1.Qno.value=="")
                    {
                        alert("Enter Question No:");
                        //a.focus();
                        return;
                    }
                    else if(!parseInt(a))
                        {
                            alert("Enter Integer");
                          //  a.focus();
                            return;
                        }
                    else if(document.form1.question.value=="")
                            {
                                alert("Enter Question");
                            //    b.focus();
                                return;
                            }
                            
                    else  if(document.form1.option1.value=="")
                                {
                                    alert("Enter First Option");
                              //      c.focus();
                                    return;
                                }
                    else  if(document.form1.option1.value=="")
                                    {
                                        alert("Enter First Option");
                                //        c.focus();
                                        return;
                                    }
                    else if(document.form1.option2.value=="")
                                        {
                                            alert("Enter Second Option");
                                  //         d.focus();
                                            return;
                                        }
                    else if(document.form1.option3.value=="")
                                            {
                                                alert("Enter Third Option");
                                    //            e.focus();
                                                return;
                                            }
                    else if(document.form1.option4.value=="")
                                                {
                                                    alert("Enter Fourth Option");
                                      //              f.focus();
                                                    return;
                                                }
                    else    if(document.form1.answer.value=="")
                                                    {
                                                        alert("Enter Correct Answer");
                                        //              g.focus();
                                                        return ;
                                                    }
                                                window.location.href="./savequestions.jsp?Button=Submit&jobid="+x+"&examid="+y+"&Qno="+a+"&question="+b+"&option1="+c+"&option2="+d+"&option3="+e+"&option4="+f+"&answer="+g;
              								  }
                                                    document.form1.Submit;
                                                    
                                                   
                                                }
        </script>
    </head>
    <body >
        
           <form name="form1" method="post" action="savequestions.jsp">
               <table width="398" height="383" border="0" align="center" bgcolor="#3F3F3F" >
                            <tr>
                                <td class="dp" colspan="2">Add Questions</td>
                            </tr>
                            <%
            try {
            	
            	
            	  
                Connection con=null;
       		    String url = "jdbc:mysql://localhost:3306/";
       		    String dbName = "online";
       		    String driverName = "com.mysql.jdbc.Driver";
       		    String userName = "root";
       		    String password = "root";
       		   
       		    Class.forName(driverName).newInstance();
       		    con = DriverManager.getConnection(url+dbName, userName, password);
                  
               // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //  Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                Statement st1 = con.createStatement();
                            %>
                            <tr>
                                <td class="tf">Job ID </td>
                                <td ><label>
                                        <select name="jobid" id="jobid">
                                            <%      ResultSet rs1 = st1.executeQuery("select * from job_details");
                                          String s = null;
                                          // String s2=null;
                                          while (rs1.next()) {
                                              s = rs1.getString("jobid");
                                              //    s2=rs.getString("Post");

                                            %>
                                            <option value="<%=s%>"><%=s%></option>
                                            <%}%>  
                                        </select>
                                </label></td>
                            </tr>
                            <tr>
                                <td class="tf">Exam ID</td>
                                <td  >
                                    <label>
                                        <select name="examid">
                                            <%      ResultSet rs = st.executeQuery("select * from Exam");
                                          String s1 = null;
                                          // String s2=null;
                                          while (rs.next()) {
                                              s1 = rs.getString("examid");
                                              //    s2=rs.getString("Post");

                                            %>
                                            <option value="<%=s1%>"><%=s1%></option>
                                            <%} %>
                                        </select>
                                </label>         </td>
                            </tr>
                            <tr>
                                <td class="tf" >Question No:</td>
                                <td class="er">
                                <input name="Qno" type="text" size="10">       </td>
                            </tr>
                            <tr>
                                <td  class="tf">Question</td>
                                <td >
                                    <label>
                                        <textarea name="question" cols="28"></textarea>
                                </label>               </td>
                            </tr>
                            <tr>
                                <td  class="tf">Option1</td>
                                <td >
                                    <label></label>
                                <input name="option1" type="text" size="30"></td>
                            </tr>
                            <tr>
                                <td  class="tf">Option2</td>
                                <td ><input name="option2" type="text" size="30"></td>
                            </tr>
                            <tr>
                                <td class="tf" >Option3</td>
                                <td ><input name="option3" type="text" size="30"></td>
                            </tr>
                            <tr>
                                <td  class="tf">Option4</td>
                                <td ><input name="option4" type="text" size="30"></td>
                            </tr>
                            <tr>
                                <td class="tf" >Answer</td>
                                <td ><input name="answer" type="text" size="30"></td>
                            </tr>
                            <tr>
                                <td colspan="2" ><div align="center">
                                        <input type="button" value="Submit"  onclick="javascript:onSubmit(1);">
                                </div></td>
                            </tr>
                        </table>
                    </form> 
                    <%
            } catch (Exception e) {
                out.println(e);
            }
                    
                %>
        </table>
        
    </body>
</html>




