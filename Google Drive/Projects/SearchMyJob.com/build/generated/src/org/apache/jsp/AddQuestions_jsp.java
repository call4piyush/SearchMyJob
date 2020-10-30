package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class AddQuestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.SearchMyJob.com</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            .tf{ text-align: center;\r\n");
      out.write("    border-radius: 16px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    background-color: #3F3F3F;\r\n");
      out.write("    color: white;\r\n");
      out.write("   font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("input[type=text], input[type=password],select,textarea{\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  width: 250px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-shadow: 1px 1px 1px black;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.16);\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 12px;\r\n");
      out.write("  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".dp{\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("input[type=button]{\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("  width: 150px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-shadow: 1px 1px 1px black;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.16);\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 12px;\r\n");
      out.write("  -webkit-box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.3), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  box-shadow: inset 0 5px 10px rgba(0, 0, 0, 1.00), 0 1px rgba(255, 255, 255, 0.06);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <script >\r\n");
      out.write("            function onSubmit(i)\r\n");
      out.write("            {\r\n");
      out.write("                var x=document.form1.jobid.value;\r\n");
      out.write("                var y=document.form1.examid.value;\r\n");
      out.write("                var a= document.form1.Qno.value;\r\n");
      out.write("                var b=document.form1.question.value;\r\n");
      out.write("                var c=document.form1.option1.value;\r\n");
      out.write("                var d=document.form1.option2.value;\r\n");
      out.write("                var e=document.form1.option3.value;\r\n");
      out.write("                var f=document.form1.option4.value;\r\n");
      out.write("                var g=document.form1.answer.value;\r\n");
      out.write("                if(i==1)\r\n");
      out.write("                {\r\n");
      out.write("                    \r\n");
      out.write("                if(document.form1.Qno.value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Question No:\");\r\n");
      out.write("                        //a.focus();\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(!parseInt(a))\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Enter Integer\");\r\n");
      out.write("                          //  a.focus();\r\n");
      out.write("                            return;\r\n");
      out.write("                        }\r\n");
      out.write("                    else if(document.form1.question.value==\"\")\r\n");
      out.write("                            {\r\n");
      out.write("                                alert(\"Enter Question\");\r\n");
      out.write("                            //    b.focus();\r\n");
      out.write("                                return;\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("                    else  if(document.form1.option1.value==\"\")\r\n");
      out.write("                                {\r\n");
      out.write("                                    alert(\"Enter First Option\");\r\n");
      out.write("                              //      c.focus();\r\n");
      out.write("                                    return;\r\n");
      out.write("                                }\r\n");
      out.write("                    else  if(document.form1.option1.value==\"\")\r\n");
      out.write("                                    {\r\n");
      out.write("                                        alert(\"Enter First Option\");\r\n");
      out.write("                                //        c.focus();\r\n");
      out.write("                                        return;\r\n");
      out.write("                                    }\r\n");
      out.write("                    else if(document.form1.option2.value==\"\")\r\n");
      out.write("                                        {\r\n");
      out.write("                                            alert(\"Enter Second Option\");\r\n");
      out.write("                                  //         d.focus();\r\n");
      out.write("                                            return;\r\n");
      out.write("                                        }\r\n");
      out.write("                    else if(document.form1.option3.value==\"\")\r\n");
      out.write("                                            {\r\n");
      out.write("                                                alert(\"Enter Third Option\");\r\n");
      out.write("                                    //            e.focus();\r\n");
      out.write("                                                return;\r\n");
      out.write("                                            }\r\n");
      out.write("                    else if(document.form1.option4.value==\"\")\r\n");
      out.write("                                                {\r\n");
      out.write("                                                    alert(\"Enter Fourth Option\");\r\n");
      out.write("                                      //              f.focus();\r\n");
      out.write("                                                    return;\r\n");
      out.write("                                                }\r\n");
      out.write("                    else    if(document.form1.answer.value==\"\")\r\n");
      out.write("                                                    {\r\n");
      out.write("                                                        alert(\"Enter Correct Answer\");\r\n");
      out.write("                                        //              g.focus();\r\n");
      out.write("                                                        return ;\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                window.location.href=\"./savequestions.jsp?Button=Submit&jobid=\"+x+\"&examid=\"+y+\"&Qno=\"+a+\"&question=\"+b+\"&option1=\"+c+\"&option2=\"+d+\"&option3=\"+e+\"&option4=\"+f+\"&answer=\"+g;\r\n");
      out.write("              \t\t\t\t\t\t\t\t  }\r\n");
      out.write("                                                    document.form1.Submit;\r\n");
      out.write("                                                    \r\n");
      out.write("                                                   \r\n");
      out.write("                                                }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        \r\n");
      out.write("           <form name=\"form1\" method=\"post\" action=\"savequestions.jsp\">\r\n");
      out.write("               <table width=\"398\" height=\"383\" border=\"0\" align=\"center\" bgcolor=\"#3F3F3F\" >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"dp\" colspan=\"2\">Add Questions</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

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
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"tf\">Job ID </td>\r\n");
      out.write("                                <td ><label>\r\n");
      out.write("                                        <select name=\"jobid\" id=\"jobid\">\r\n");
      out.write("                                            ");
      ResultSet rs1 = st1.executeQuery("select * from job_details");
                                          String s = null;
                                          // String s2=null;
                                          while (rs1.next()) {
                                              s = rs1.getString("jobid");
                                              //    s2=rs.getString("Post");

                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(s);
      out.write('"');
      out.write('>');
      out.print(s);
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("  \r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </label></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"tf\">Exam ID</td>\r\n");
      out.write("                                <td  >\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <select name=\"examid\">\r\n");
      out.write("                                            ");
      ResultSet rs = st.executeQuery("select * from Exam");
                                          String s1 = null;
                                          // String s2=null;
                                          while (rs.next()) {
                                              s1 = rs.getString("examid");
                                              //    s2=rs.getString("Post");

                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\r\n");
      out.write("                                            ");
} 
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </label>         </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"tf\" >Question No:</td>\r\n");
      out.write("                                <td class=\"er\">\r\n");
      out.write("                                <input name=\"Qno\" type=\"text\" size=\"10\">       </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td  class=\"tf\">Question</td>\r\n");
      out.write("                                <td >\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <textarea name=\"question\" cols=\"28\"></textarea>\r\n");
      out.write("                                </label>               </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td  class=\"tf\">Option1</td>\r\n");
      out.write("                                <td >\r\n");
      out.write("                                    <label></label>\r\n");
      out.write("                                <input name=\"option1\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td  class=\"tf\">Option2</td>\r\n");
      out.write("                                <td ><input name=\"option2\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"tf\" >Option3</td>\r\n");
      out.write("                                <td ><input name=\"option3\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td  class=\"tf\">Option4</td>\r\n");
      out.write("                                <td ><input name=\"option4\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"tf\" >Answer</td>\r\n");
      out.write("                                <td ><input name=\"answer\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" ><div align=\"center\">\r\n");
      out.write("                                        <input type=\"button\" value=\"Submit\"  onclick=\"javascript:onSubmit(1);\">\r\n");
      out.write("                                </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form> \r\n");
      out.write("                    ");

            } catch (Exception e) {
                out.println(e);
            }
                    
                
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
