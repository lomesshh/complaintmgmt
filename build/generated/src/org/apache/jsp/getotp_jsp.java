package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class getotp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("welcome.jsp");
}

      out.write('\n');
      out.write('\n');

try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint","root",""); //create connection
	
	if(request.getParameter("btn_login")!=null) //check login button click event not null
	{
		String dbemail;
		
		String email;
		
		email=request.getParameter("txt_email"); //txt_email
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("select * from login where email=?"); //sql select query 
		pstmt.setString(1,email);
		
		ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
		
		if(rs.next())
		{
			dbemail=rs.getString("email");
			
			if(email.equals(dbemail))
			{
				session.setAttribute("login",dbemail); //session name is login and store fetchable database email address
                                response.sendRedirect("dashboard.html"); //after login success redirect to welcome.jsp page
                                
			}
		}
		else
		{
			request.setAttribute("errorMsg","invalid email"); //invalid error message for email or password wrong
		}
		
		con.close(); //close connection	
	}
	
}
catch(Exception e)
{
	out.println(e);
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<title>Login</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/login-register.css\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<br>\n");
      out.write("    <!-- <ul>\n");
      out.write("        <li><a href=\"home.html\">Back to Home</a></li>\n");
      out.write("    </ul> -->\n");
      out.write("\n");
      out.write("    <div class=\"main-content\" style=\"opacity: 0.7; margin-top: 9rem;\">\n");
      out.write("\n");
      out.write("        <form class=\"form-register\" action=\"UserVerify\" method=\"post\" name=\"myform\" >\n");
      out.write("\n");
      out.write("            <div class=\"form-register-with-email\">\n");
      out.write("\n");
      out.write("                <div class=\"form-white-background\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-title-row\" >\n");
      out.write("                        <h1>Login</h1>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p style=\"color:red\">\t\t\t\t   \t\t\n");
      out.write("                                        ");

					if(request.getAttribute("errorMsg")!=null)
					{
						out.println(request.getAttribute("errorMsg")); //error message for email or password 
					}
					
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\t   </br>\n");
      out.write("                   \n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <label>\n");
      out.write("                            <span>Email</span>\n");
      out.write("                            <input type=\"text\" name=\"txt_email\" id=\"txt_email\" placeholder=\"Enter your email\">\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                  <input type=\"submit\" style=\"background-color: #FF6347; color: white; border-radius: 10px;\" name=\"btn_login\" value=\"Get OTP\"><br><br><br>\n");
      out.write("                    \n");
      out.write("                  <a href=\"register.jsp\" style=\"color: black;\" class=\"form-log-in-with-existing\">You Don't have an account? <b style=\"color: #FF6347;\"> Register here </b></a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
