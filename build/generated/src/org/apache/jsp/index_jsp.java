package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("welcome.jsp");
}

      out.write("\r\n");
      out.write("\r\n");

try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root",""); //create connection
	
	if(request.getParameter("btn_login")!=null) //check login button click event not null
	{
		String dbemail,dbpassword;
		
		String email,password;
		
		email=request.getParameter("txt_email"); //txt_email
		password=request.getParameter("txt_password"); //txt_password
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("select * from login where email=? AND password=?"); //sql select query 
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
				response.sendRedirect("dashboard.html"); //after login success redirect to welcome.jsp page
                                
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t<title>Login</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/login-register.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("    <!-- <ul>\r\n");
      out.write("        <li><a href=\"home.html\">Back to Home</a></li>\r\n");
      out.write("    </ul> -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main-content\" style=\"opacity: 0.7; margin-top: 5rem;\">\r\n");
      out.write("\r\n");
      out.write("        <form class=\"form-register\" method=\"post\"  name=\"myform\" onsubmit=\"return validate();\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-register-with-email\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-white-background\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-title-row\" >\r\n");
      out.write("                        <h1>Login</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p style=\"color:red\">\t\t\t\t   \t\t\r\n");
      out.write("\t\t\t\t\t");

					if(request.getAttribute("errorMsg")!=null)
					{
						out.println(request.getAttribute("errorMsg")); //error message for email or password 
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   </br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Email</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_email\" id=\"email\" placeholder=\"\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Password</span>\r\n");
      out.write("                            <input type=\"password\" name=\"txt_password\" id=\"password\" placeholder=\"\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                                   <input type=\"submit\" style=\"background-color: #FF6347; color: white; border-radius: 10px;\" name=\"btn_login\" value=\"Login\"><br><br>\r\n");
      out.write("                                   <input type=\"submit\" style=\"background-color: #FF6347; color: white; border-radius: 10px;\" formaction=\"getotp.jsp\" value=\"Login Using OTP\"><br><br><br>\r\n");
      out.write("  \r\n");
      out.write("              \t\t\t\t<a href=\"register.jsp\" style=\"color: black;\" class=\"form-log-in-with-existing\">You Don't have an account? <b style=\"color: #FF6347;\"> Register here </b></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
