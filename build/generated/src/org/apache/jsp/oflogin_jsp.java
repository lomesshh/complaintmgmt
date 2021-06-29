package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class oflogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  \r\n");
      out.write("\r\n");

if(session.getAttribute("officer")!=null) 
{
	response.sendRedirect("login.jsp");
}

      out.write("\r\n");
      out.write("\r\n");

try
{
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint","root",""); 
	
	if(request.getParameter("login")!=null) //check login button click event not null
	{
		String dbemail,dbpassword;
		
		String email,password;
		
		email=request.getParameter("email"); 
		password=request.getParameter("password");
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("select * from officer where email=? AND password=?"); //sql select query 
		pstmt.setString(1,email);
		pstmt.setString(2,password);
		
		ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
		
		if(rs.next())
		{
			dbemail=rs.getString("email");
			dbpassword=rs.getString("password");
			
			if(email.equals(dbemail) && password.equals(dbpassword))
			{
				session.setAttribute("login",dbemail); //session name is login and store fetchable database email address
				response.sendRedirect("officerdashboard.html"); //after login success redirect to welcome.jsp page
			}
		}
		else
		{
			request.setAttribute("errorMsg","invalid email or password"); //invalid error message for email or password wrong
		}
		
		con.close(); //close connection	
	}
	
}
catch(Exception e)
{
	out.println(e);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("    <title>officer login</title>\r\n");
      out.write("     <meta charset=\"utf-8\">\r\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\t <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t <style>\r\n");
      out.write("\t \r\n");
      out.write("html {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("*, *:before, *:after {\r\n");
      out.write("  box-sizing: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, h1, h2, h3, h4, h5, h6, p, ol, ul {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ol, ul {\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("  max-width: 100%;\r\n");
      out.write("  height: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\tbackground: url(https://i.postimg.cc/Hx1wwVZM/pexels-roman-koval-2903060.jpg);\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("  \theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div{\r\n");
      out.write("\tmax-width: 400px;\r\n");
      out.write("\tmin-height: 200px;\r\n");
      out.write("\tmargin: 0 auto 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form{\r\n");
      out.write("    background: #ffffff;\r\n");
      out.write("    min-height: 200px;\r\n");
      out.write("    padding: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1, h3{\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    font-family: Georgia, serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("    padding-top: 100px;\r\n");
      out.write("    font-weight: bold;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3{\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("label{\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: #888888;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("input{\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    width: 348px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write("    border: none;\r\n");
      out.write("    width: 350px; \r\n");
      out.write("    background: #900C3F;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("    padding-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("input[type=button]{\r\n");
      out.write("    border: none;\r\n");
      out.write("    width: 350px; \r\n");
      out.write("    background: #e68a00;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("    padding-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\t \r\n");
      out.write("\t </style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validate()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar email = document.myform.txt_email;\r\n");
      out.write("\t\t\tvar password = document.myform.txt_password;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tif (email.value == null || email.value == \"\") //check email textbox not blank\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\twindow.alert(\"please enter email ?\"); //alert message\r\n");
      out.write("\t\t\t\temail.style.background = '#f08080';\r\n");
      out.write("\t\t\t\temail.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (password.value == null || password.value == \"\") //check password textbox not blank\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\twindow.alert(\"please enter password ?\"); //alert message\r\n");
      out.write("\t\t\t\tpassword.style.background = '#f08080'; \r\n");
      out.write("\t\t\t\tpassword.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"login-form\"> \r\n");
      out.write("   <h1 align=\"center\">OFFICER LOGIN</h1><br>\r\n");
      out.write("   <p style=\"color:red\">\t\t\t\t   \t\t\r\n");
      out.write("\t");

		if(request.getAttribute("errorMsg")!=null)
		{
			out.println(request.getAttribute("errorMsg")); //error message for email or password 
		}
	
      out.write("\r\n");
      out.write("\t</p> </br>\r\n");
      out.write("   <form>\r\n");
      out.write("        <br><label>Email:</label> \r\n");
      out.write("\t\t<input type=\"email\" placeholder=\"email\" name=\"email\" required=\"required\" class=\"form-control\" id=\"email\"><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label>Password:</label> \r\n");
      out.write("\t\t<input type=\"password\" name=\"password\" required=\"required\" class=\"form-control\" placeholder=\"password\" id=\"pwd\"><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label>Department:</label> <select class=\"form-control\" id=\"dept\" name=\"department\">\r\n");
      out.write("        <option value=\"\" selected>Select department</option>\r\n");
      out.write("                               <option value=\"\">Street light</option>\r\n");
      out.write("                               <option value=\"\">Sanitation</option>\r\n");
      out.write("                               <option value=\"\">Pot Holes</option>\r\n");
      out.write("                               <option value=\"\">CCTV</option>\r\n");
      out.write("                               <option value=\"\">Footpath</option>\r\n");
      out.write("                               <option value=\"\">Garbage</option>\r\n");
      out.write("                               <option value=\"\">Speed breaker</option>\r\n");
      out.write("                               <option value=\"\">Open Manholes</option>\r\n");
      out.write("                               <option value=\"\">Pipe Leakage</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\t\t<input type=\"submit\" class=\"btn btn-primary btn-block btn-lg\" name=\"login\" value=\"Login\">\r\n");
      out.write("   </form> \r\n");
      out.write("  </div> \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
