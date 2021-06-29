package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if(session.getAttribute("login")!=null) //check login session user not access or back to register.jsp page
{
	response.sendRedirect("index.html");
}

      out.write('\r');
      out.write('\n');

try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root",""); //create connection
	
	if(request.getParameter("btn_register")!=null) //check register button click event not null
	{
		String firstname,lastname,email,number,address,password;
		
		firstname=request.getParameter("txt_firstname"); //txt_firstname
		lastname=request.getParameter("txt_lastname"); //txt_lastname
		email=request.getParameter("txt_email"); //txt_email
		number=request.getParameter("txt_number"); //txt_number
		address=request.getParameter("txt_address"); //txt_address
		password=request.getParameter("txt_password"); //txt_password
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("insert into login(firstname,lastname,email,number,address,password) values(?,?,?,?,?,?)"); //sql insert query
		pstmt.setString(1,firstname);
		pstmt.setString(2,lastname);
		pstmt.setString(3,email);
		pstmt.setString(4,number);
		pstmt.setString(5,address);
		pstmt.setString(6,password);
		
		pstmt.executeUpdate(); //execute query
		
		request.setAttribute("successMsg","Register Successfully...! Please login"); //register success messeage
                
		con.close(); //close connection
	}
}
catch(Exception e)
{
	out.println(e);
}

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t<title>Register</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/login-register.css\">\r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("\t<!-- javascript for registeration form validation-->\r\n");
      out.write("\t<script>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction validate()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar first_name= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z \r\n");
      out.write("\t\t\tvar last_name= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z \r\n");
      out.write("\t\t\tvar email_valid= /^[\\w\\d\\.]+\\@[a-zA-Z\\.]+\\.[A-Za-z]{1,4}$/; //pattern valid email validation\r\n");
      out.write("\t\t\tvar number_valid= /^[0-9]+{10}$/;\r\n");
      out.write("\t\t\tvar address_valid= /^[a-z A-Z]+$/;\r\n");
      out.write("\t\t\tvar password_valid=/^[A-Z a-z 0-9 !@#$%&*()<>]{6,12}$/; //pattern password allowed A to Z, a to z, 0-9, !@#$%&*()<> charecter \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar fname = document.getElementById(\"fname\"); //textbox id fname\r\n");
      out.write("            var lname = document.getElementById(\"lname\"); //textbox id lname\r\n");
      out.write("            var email = document.getElementById(\"email\"); //textbox id email\r\n");
      out.write("            var number = document.getElementById(\"number\");\r\n");
      out.write("            var address = document.getElementById(\"address\");\r\n");
      out.write("            var password = document.getElementById(\"password\"); //textbox id password\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!first_name.test(fname.value) || fname.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Enter Firstname Alphabet Only....!\");\r\n");
      out.write("                fname.focus();\r\n");
      out.write("                fname.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(!last_name.test(lname.value) || lname.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Enter Lastname Alphabet Only....!\");\r\n");
      out.write("                lname.focus();\r\n");
      out.write("                lname.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(!email_valid.test(email.value) || email.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Enter Valid Email....!\");\r\n");
      out.write("                email.focus();\r\n");
      out.write("                email.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(!number_valid.test(email.value) || number.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Enter Valid Contact number....!\");\r\n");
      out.write("                email.focus();\r\n");
      out.write("                email.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(!address_valid.test(email.value) || Address.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Enter Valid Address....!\");\r\n");
      out.write("                email.focus();\r\n");
      out.write("                email.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t\tif(!password_valid.test(password.value) || password.value=='') \r\n");
      out.write("            {\r\n");
      out.write("\t\t\t\talert(\"Password Must Be 6 to 12 and allowed !@#$%&*()<> character\");\r\n");
      out.write("                password.focus();\r\n");
      out.write("                password.style.background = '#f08080';\r\n");
      out.write("                return false;                    \r\n");
      out.write("            }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("    <!-- <ul>\r\n");
      out.write("        <li><a href=\"home.html\">Back to Home</a></li>\r\n");
      out.write("    </ul> -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main-content\" style=\"opacity: 0.7\">\r\n");
      out.write("\r\n");
      out.write("        <form class=\"form-register\" method=\"post\" onsubmit=\"return validate();\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-register-with-email\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-white-background\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-title-row\">\r\n");
      out.write("                        <h1>Registration</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t<p style=\"color:green\">\t\t\t\t   \t\t\r\n");
      out.write("\t\t\t\t\t");

					if(request.getAttribute("successMsg")!=null)
					{
						out.println(request.getAttribute("successMsg")); //register success message
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   </br>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Firstname</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_firstname\" id=\"fname\" placeholder=\"\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Lastname</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_lastname\" id=\"lname\" placeholder=\"\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Email</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_email\" id=\"email\" placeholder=\"\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Contact</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_number\" id=\"number\" placeholder=\"\" maxlength=\"10\" pattern=\"\\d{10}\">\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"form-row\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <span>Address</span>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_address\" id=\"address\" placeholder=\"\">\r\n");
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
      out.write("                                   <input type=\"submit\" style=\"background-color: #FF6347; color: white; border-radius: 10px;\" name=\"btn_register\" value=\"Register\"><br><br><br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                          <a href=\"index.jsp\" style=\"color: black;\" class=\"form-log-in-with-existing\">Already have an account? <b style=\"color: #FF6347;\"> Login here </b></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t\r\n");
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
