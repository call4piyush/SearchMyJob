<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="company/edit.css"/>
    </head>
        <script language="javascript">
            function check()
            {
				var a= document.form1.jobid.value;
				var b= document.form1.vacancies.value;
				var c= document.form1.salary.value;
				var d=document.form1.lastdate.value;
				var e=document.form1.post.value;
				var f=document.form1.criteria.value;
                if(document.form1.jobid.value=="")
                {
                    alert("Enter Job Id");
                    //a.focus();
                    return false;
                }
				else if(!parseInt(a))
            	{
                alert("Please enter Integer");
               //a.focus();
                return false;
            	}
				
                if(document.form1.post.value=="")
                {
                    alert("Enter Post");
                 //   e.focus();
                    return false;
                }
                if(document.form1.criteria.value=="")
                {
                    alert("Enter Criteria");
                   // f.focus();
                    return false;
                }
                if(document.form1.vacancies.value=="")
                {
                    alert("Enter no: of Vacancies available");
                    //b.focus();
                    return false;
                }
				else if(!parseInt(b))
            	{
                alert("Enter integer");
             //b.focus();
                return false;
            	}
                if(document.form1.salary.value=="")
                {
                    alert("Enter Salary");
               //     c.focus();
                    return false;
                }
				else if(!parseInt(c))
            	{
                alert("Enter integer");
               //c.focus();
                return false;
            	}
                if(document.form1.lastdate.value=="")
                {
                    alert("Enter Last Date");
                 //   d.focus();
                    return false;
                }

                return true;
            }

        </script>
    </head>
    <body  bgcolor="#3F3F3F">
       
    <form name="form1" method="post" action="savejobdetails.jsp">
                        <table width="517" height="334" border="0" align="center">
                            <tr >
                                <td colspan="2" class="j">Job Description </div></td>
                            </tr>
                            <tr>
                                <td class="j">Job ID</td>
                                <td ><input name="jobid" id="jobid" type="text" size="30" maxlength="3">
                               </td>
                            </tr>
                            <tr>
                                <td class="j"> Name of Post </td>
                                <td ><input name="post" name="post" type="text" size="30" maxlength="10"></td>
                            </tr>
                            <tr>
                                <td class="j">Criteria</td>
                                <td ><input name="criteria" name="criteria" type="text" size="30" maxlength="15"></td>
                            </tr>
                            <tr>
                                <td class="j">No: of Vacancies</td>
                                <td ><input name="vacancies" name="vacancies" type="text" size="30" maxlength="3"></td>
                            </tr>
                            <tr>
                                <td class="j">Salary/Annum</td>
                                <td ><input name="salary" name="salary" type="text" size="30" maxlength="7"></td>
                            </tr>
                            <tr>
                                <td class="j">Last Date<font color="red">&nbsp;&nbsp;(dd/mm/yy) </font></td>
                                <td ><input name="lastdate" name="lastdate" type="text" size="30" maxlength="10"></td>
                            </tr>
                            <tr >
                                <td colspan="2">
                                    <div align="center">
                                        <input type="submit" name="Submit" value="Submit" onClick="return check()">
                                </div>           </td>
                            </tr>
                        </table>
                    </form>
                    <h2>&nbsp;</h2>
       
    </body>
</html>