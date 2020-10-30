package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class canedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>www.SearchMyJob.com</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"reg/style3.css\"></link>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function setVal(obj)\n");
      out.write("            {\n");
      out.write("                if(obj.checked==false)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"expyears\").disabled=true;\n");
      out.write("                    document.getElementById(\"company\").disabled=true;\n");
      out.write("                    document.getElementById(\"designation\").disabled=true;\n");
      out.write("                    document.getElementById(\"salary\").disabled=true;\n");
      out.write("                    document.getElementById(\"comAddress\").disabled=true;\n");
      out.write("\n");
      out.write("                }else{\n");
      out.write("                    document.getElementById(\"expyears\").disabled=false;\n");
      out.write("                    document.getElementById(\"company\").disabled=false;\n");
      out.write("                    document.getElementById(\"designation\").disabled=false;\n");
      out.write("                    document.getElementById(\"salary\").disabled=false;\n");
      out.write("                    document.getElementById(\"comAddress\").disabled=false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                var x=document.form1.name.value;\n");
      out.write("                var y=document.form1.college.value;\n");
      out.write("                var d=document.form1.markDegree.value;\n");
      out.write("                var a=document.form1.collegephone.value;\n");
      out.write("                var b=document.form1.collegeemail.value;\n");
      out.write("                var c=document.form1.email.value;\n");
      out.write("                var e=document.form1.telephone.value;\n");
      out.write("                var f=document.form1.pin.value;\n");
      out.write("                var g=document.form1.expyears.value;\n");
      out.write("                var h=document.form1.salary.value;\n");
      out.write("                var i=document.form1.address.value;\n");
      out.write("                var j=document.form1.state.value;\n");
      out.write("                var k=document.getElementById(\"expyears\").value;\n");
      out.write("                var l=document.getElementById(\"company\").value;\n");
      out.write("                var m=document.getElementById(\"designation\").value;\n");
      out.write("                var n=document.getElementById(\"salary\").value;\n");
      out.write("                var o=document.getElementById(\"comAddress\").value;\n");
      out.write("\n");
      out.write("                if(document.form1.name.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Your Name\");\n");
      out.write("                   //x.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(parseInt(x))\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter name Correctly\");\n");
      out.write("                    //x.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.college.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter College Name \");\n");
      out.write("                    //y.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(parseInt(y))\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter College Name correctly\");\n");
      out.write("                  // y.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.collegephone.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter collegephone number \");\n");
      out.write("                    //a.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!parseInt(a))\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter CollegePhone Integer\");\n");
      out.write("                    //a.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(((document.form1.collegephone.value.length)<6) || ((document.form1.collegephone.value.length)>11))\n");
      out.write("                {\n");
      out.write("                    alert(\"Phone no: should contain atleast 6 integers \");\n");
      out.write("                    //a.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.collegeemail.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter College email \");\n");
      out.write("                   //b.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(b.indexOf('@')==-1)\n");
      out.write("                {\n");
      out.write("                    alert(\"Use @ email correctly\");\n");
      out.write("                    //b.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(b.indexOf('.')==-1)\n");
      out.write("                {\n");
      out.write("                    alert(\"Use . email correctly\");\n");
      out.write("                    //b.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.markDegree.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Degree mark\");\n");
      out.write("                    //d.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!parseInt(d))\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Integer\");\n");
      out.write("                    //d.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(parseInt(d).length<0||parseInt(d).length>100)\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Degree % mark correctly  \");\n");
      out.write("                   // d.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.email.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter email \");\n");
      out.write("                   // c.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(c.indexOf('@')==-1)\n");
      out.write("                {\n");
      out.write("                    alert(\"Use @ email correctly\");\n");
      out.write("                    //c.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(c.indexOf('.')==-1)\n");
      out.write("                {\n");
      out.write("                    alert(\"Use . email correctly\");\n");
      out.write("                    //c.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.telephone.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter phone number \");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!parseInt(e))\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    alert(\"Enter Ph no. Integer\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>11))\n");
      out.write("                {\n");
      out.write("                    alert(\"Phone no should contain atleast 6 integers \");\n");
      out.write("\n");
      out.write("                 //   e.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.address.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Address\");\n");
      out.write("                    //i.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.state.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Specify State\");\n");
      out.write("                   //j.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.pin.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter pin number \");\n");
      out.write("                  //f.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!parseInt(f))\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Integer in pin no.\");\n");
      out.write("                   //f.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if((document.form1.pin.value.length)<6)\n");
      out.write("                {\n");
      out.write("                    alert(\"Pin no: should contain 6 integers \");\n");
      out.write("                   //f.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if(document.getElementById(\"cat\").checked==true)\n");
      out.write("                {\n");
      out.write("                    if(document.getElementById(\"expyears\").value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Exp years\");\n");
      out.write("                       //k.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\tvar expyr=document.getElementById(\"expyears\").value;\n");
      out.write("\t\t\t\t\tif (!parseInt(expyr)){\n");
      out.write("                            alert(\"Expyr invalid\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("                    if(document.getElementById(\"company\").value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Company\");\n");
      out.write("                        //l.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if(document.getElementById(\"designation\").value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Designation\");\n");
      out.write("                        //m.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if(document.getElementById(\"salary\").value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Salary\");\n");
      out.write("                       //n.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }else{\n");
      out.write("                        var sal=document.getElementById(\"salary\").value;\n");
      out.write("                        if (!parseInt(sal)){\n");
      out.write("                            alert(\"Salary invalid\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("\t\t\t\t\t\tif(document.getElementById(\"comAddress\").value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Enter Company Address\");\n");
      out.write("                        //o.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body  onload=\"setVal(document.getElementById('cat'))\">\n");
      out.write("        <table width=\"100%\" height=\"628\" border=\"0\" class=\"style\">\n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("              \n");
      out.write("                <td width=\"100%\" >\n");
      out.write("                    ");
 try {

            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");


            Connection con=null;
   		    String url = "jdbc:mysql://localhost:3306/";
   		    String dbName = "online";
   		    String driverName = "com.mysql.jdbc.Driver";
   		    String userName = "root";
   		    String password = "root";
   		    ResultSet rs,rs1;
   		    Class.forName(driverName).newInstance();
   		    con = DriverManager.getConnection(url+dbName, userName, password);           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");


            Statement st = con.createStatement();

            rs = st.executeQuery("select * from Details2 where Username='" + c1 + "'");
            String s = null;
            String s1 = null;
            String s2 = null;
            String s3 = null;
            String s4 = null;
            String s5 = null;
            String s6 = null;
            String s7 = null;
            String s8 = null;
            String s9 = null;
            String s10 = null;
            String s11 = null;

            String expyrs = "", company = "", desig = "", sal = "", comadd = "", category = "";
            while (rs.next()) {
                s = rs.getString(1);//name
                s1 = rs.getString(4);//colg
                s2 = rs.getString(5);//colg ph
                s3 = rs.getString(6);//colgemeil
                s4 = rs.getString(8);//marks
                s5 = rs.getString(12);//email
                s6 = rs.getString(13);//tlph
                s7 = rs.getString(14);//address
                s8 = rs.getString(15);//state
                s9 = rs.getString(16);//pin
                s10 = rs.getString(15);//pin
                s11 = rs.getString(16);//category

            }
            String sql = "select * from Experienced where Username='" + c1 + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                expyrs = rs.getString(2);
                company = rs.getString(3);
                desig = rs.getString(4);
                sal = rs.getString(5);
                comadd = rs.getString(6);
                category = "Experienced";
            } else {
                category = "Fresher";
            }
                    
      out.write("\n");
      out.write("<form method=\"POST\" action=\"savestudentedit.jsp\" name=\"form1\" onsubmit=\"return check()\">\n");
      out.write("<table border=\"0\" cellpadding=3 cellspacing=0 align=center>\n");
      out.write("   <tr wdth =100%>\n");
      out.write("       <td colspan=\"2\" ><div align=\"center\"><font color=\"white\" size=\"5\">Edit Profile</font></div></td>\n");
      out.write("   </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Name&nbsp;</td>\n");
      out.write("                                \n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"name\" size=30\n");
      out.write("                                                                         maxlength=30 value='");
      out.print(s);
      out.write("'></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr >\n");
      out.write("                                <td class=\"td\">\n");
      out.write("                                   College in which studying\n");
      out.write("                                </td>\n");
      out.write("                                <td><input TYPE=\"text\" NAME=\"college\" size=30 maxlength=30 value='");
      out.print(s1);
      out.write("'></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\">\n");
      out.write("                                   College Phone\n");
      out.write("                                </td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"collegephone\" size=30 maxlength=30 value='");
      out.print(s2);
      out.write("'></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr >\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                 College Email\n");
      out.write("                                </td>\n");
      out.write("                                <td><input TYPE=\"text\" NAME=\"collegeemail\" size=30 maxlength=50 value='");
      out.print(s3);
      out.write("'>                                 </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\">\n");
      out.write("                                    % of Marks\n");
      out.write("                                </td>\n");
      out.write("                                <td >\n");
      out.write("                                    <table width=\"111\" border=0 cellpadding=0 cellspacing=0>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td width=\"95\"><div align=\"center\"><font SIZE=\"2\" ><strong>Graduation %</strong></font> </div></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><input TYPE=\"text\" NAME=\"markDegree\" size=8 maxlength=8 value='");
      out.print(s4);
      out.write("' onblur=\"checkDec('markBSC')\">                                              </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                    Email_id\n");
      out.write("                                </td>\n");
      out.write("                                <td><input type=\"text\" NAME=\"email\" size=30 maxlength=30 value='");
      out.print(s5);
      out.write("'></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr >\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                Telephone Number\n");
      out.write("                                </td>\n");
      out.write("                                <td ><input NAME=\"telephone\" TYPE=\"text\" id=\"telephone\" value=\"");
      out.print(s6);
      out.write("\">\n");
      out.write("                                    \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Address</td>\n");
      out.write("                                <td >\n");
      out.write("                                    <input class=USS_TEXT maxLength=30 name=\"address\" size=40 value='");
      out.print(s7);
      out.write("'>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr >\n");
      out.write("                               <td class=\"td\" > State</td>\n");
      out.write("                               <td><select name=state> <option selected value='");
      out.print(s8);
      out.write('\'');
      out.write('>');
      out.print(s8);
      out.write("</option>\n");
      out.write("                                        <option value=AP>Andhra Pradesh</option> <option value=AR>Arunachal\n");
      out.write("                                        Pradesh</option> <option value=AS>Assam</option> <option\n");
      out.write("                                            value=BR>Bihar</option> <option value=CH>Chandigarh</option> <option\n");
      out.write("                                            value=CG>Chattisgarh</option> <option value=DL>Delhi</option> <option\n");
      out.write("                                            value=GA>Goa</option> <option value=GJ>Gujarat</option> <option\n");
      out.write("                                            value=HR>Haryana</option> <option value=HP>Himachal Pradesh</option>\n");
      out.write("                                        <option value=JK>Jammu &amp; Kashmir</option> <option\n");
      out.write("                                            value=JH>Jharkhand</option> <option value=KA>Karnataka</option> <option\n");
      out.write("                                            value=KL>Kerala</option> <option value=MP>Madhya Pradesh</option>\n");
      out.write("                                        <option value=MH>Maharashtra</option> <option value=MN>Manipur</option>\n");
      out.write("                                        <option value=ML>Meghalaya</option> <option value=MZ>Mizoram</option>\n");
      out.write("                                        <option value=NL>Nagaland</option> <option value=OR>Orissa</option>\n");
      out.write("                                        <option value=PY>Pondicherry</option> <option value=PB>Punjab</option>\n");
      out.write("                                        <option value=RJ>Rajasthan</option> <option value=SK>Sikkim</option>\n");
      out.write("                                        <option value=TN>Tamilnadu</option> <option value=TR>Tripura</option>\n");
      out.write("                                        <option value=UA>Uttaranchal</option> <option value=UP>Uttar\n");
      out.write("                                        Pradesh</option> <option value=WB>West Bengal</option> <option\n");
      out.write("                                    value=XX>Others</option></select><br>                           </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                    Pincode\n");
      out.write("                                </td>\n");
      out.write("                                <td ><INPUT class=USS_TEXT maxLength=6 name=\"pin\" size=6 value='");
      out.print(s9);
      out.write("'>\n");
      out.write("                                   \n");
      out.write("                                    <input type=\"hidden\" name=\"category\" id=\"category\" value=\"");
      out.print(category);
      out.write("\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

     if (s11.equalsIgnoreCase("Fresher")) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Category</font></strong>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"checkbox\" name=\"cat\" id=\"cat\"  value='Experienced'  onclick=\"setVal(this);\" />Experienced\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");
     }

                            
      out.write("\n");
      out.write("                            <tr >\n");
      out.write("                                <td class=\"td\" >\n");
      out.write("                                    Experienced Years\n");
      out.write("                                </td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"expyears\" id=\"expyears\" size=30 maxlength=30 value=\"");
      out.print(expyrs);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Company</td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"company\" id=\"company\" size=30 maxlength=30 value=\"");
      out.print(company);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Designation </td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"designation\" id=\"designation\" size=30 maxlength=30 value=\"");
      out.print(desig);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Salary</td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"salary\" id=\"salary\" size=30 maxlength=30 value=\"");
      out.print(sal);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"td\" >Company Address</td>\n");
      out.write("                                <td ><input TYPE=\"text\" NAME=\"comAddress\" id=\"comAddress\" size=30 maxlength=30 value=\"");
      out.print(comadd);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"49\" colspan=2 align=\"center\" ><input TYPE=\"submit\" value=\"Save\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    ");
// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("                    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
