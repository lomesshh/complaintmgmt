package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class officerlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  \n");
      out.write("\n");

if(session.getAttribute("officer")!=null) 
{
	response.sendRedirect("index.html");
}

      out.write('\n');
      out.write('\n');

try
{
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root",""); 
	
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("    <title>officer login</title>\n");
      out.write("     <meta charset=\"utf-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\t <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\t <style>\n");
      out.write("\t \n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*, *:before, *:after {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body, h1, h2, h3, h4, h5, h6, p, ol, ul {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-weight: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ol, ul {\n");
      out.write("  list-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  max-width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground: url(https://i.postimg.cc/Hx1wwVZM/pexels-roman-koval-2903060.jpg);\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("  \theight: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div{\n");
      out.write("\tmax-width: 400px;\n");
      out.write("\tmin-height: 200px;\n");
      out.write("\tmargin: 0 auto 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form{\n");
      out.write("    background: #ffffff;\n");
      out.write("    min-height: 200px;\n");
      out.write("    padding: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1, h3{\n");
      out.write("    color: #ffffff;\n");
      out.write("    font-family: Georgia, serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("    font-size: 40px;\n");
      out.write("    padding-top: 100px;\n");
      out.write("    font-weight: bold;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("h3{\n");
      out.write("\tpadding-bottom: 10px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("label{\n");
      out.write("    display: block;\n");
      out.write("    color: #888888;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("input{\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    width: 348px;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 15px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("input[type=submit]{\n");
      out.write("    border: none;\n");
      out.write("    width: 350px; \n");
      out.write("    background: #900C3F;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 13px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    padding-top: 15px;\n");
      out.write("    padding-bottom: 15px;\n");
      out.write("}\n");
      out.write("input[type=button]{\n");
      out.write("    border: none;\n");
      out.write("    width: 350px; \n");
      out.write("    background: #e68a00;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 13px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    padding-top: 15px;\n");
      out.write("    padding-bottom: 15px;\n");
      out.write("}\n");
      out.write("\t \n");
      out.write("\t </style>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\t\n");
      out.write("\t\tfunction validate()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar email = document.myform.txt_email;\n");
      out.write("\t\t\tvar password = document.myform.txt_password;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\tif (email.value == null || email.value == \"\") //check email textbox not blank\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\twindow.alert(\"please enter email ?\"); //alert message\n");
      out.write("\t\t\t\temail.style.background = '#f08080';\n");
      out.write("\t\t\t\temail.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (password.value == null || password.value == \"\") //check password textbox not blank\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\twindow.alert(\"please enter password ?\"); //alert message\n");
      out.write("\t\t\t\tpassword.style.background = '#f08080'; \n");
      out.write("\t\t\t\tpassword.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login-form\"> \n");
      out.write("   <h1 align=\"center\">OFFICER LOGIN</h1><br>\n");
      out.write("   <p style=\"color:red\">\t\t\t\t   \t\t\n");
      out.write("\t");

		if(request.getAttribute("errorMsg")!=null)
		{
			out.println(request.getAttribute("errorMsg")); //error message for email or password 
		}
	
      out.write("\n");
      out.write("\t</p> </br>\n");
      out.write("   <form>\n");
      out.write("        <br><label>Email:</label> \n");
      out.write("\t\t<input type=\"email\" placeholder=\"email\" name=\"email\" required=\"required\" class=\"form-control\" id=\"email\"><br><br>\n");
      out.write("        \n");
      out.write("        <label>Password:</label> \n");
      out.write("\t\t<input type=\"password\" name=\"password\" required=\"required\" class=\"form-control\" placeholder=\"password\" id=\"pwd\"><br><br>\n");
      out.write("                \n");
      out.write("        <br>\n");
      out.write("\t\t<input type=\"submit\" class=\"btn btn-primary btn-block btn-lg\" name=\"login\" value=\"Login\">\n");
      out.write("   </form> \n");
      out.write("  </div> \n");
      out.write("</body>\n");
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
