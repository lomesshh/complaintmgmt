package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class emplogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String email=request.getParameter("email");
String pass=request.getParameter("password");
int z=0;
String imgFileName=null;
session.setAttribute("amount",1000);
try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from employee where email='"+email+"' AND password='"+pass+"'");
	
	while(rs.next()){
		
		session.setAttribute("fname",rs.getString(2));
	
		response.sendRedirect("emptask.jsp");
			
	}
        if(z==0){
		//response.sendRedirect("login.jsp");
	}

}
catch(Exception e){
	out.println(e);
	//response.sendRedirect("login.jsp?msg=notexist");
}


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login Page</title>\n");
      out.write("<style>\n");
      out.write("/*body background css*/\n");
      out.write("body{\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbackground: url(https://i.postimg.cc/7bvS4jZ5/pexels-pixabay-33266.jpg)no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*login form css*/\n");
      out.write(".form{\n");
      out.write("\tfont-family: \"Roboto\", sans-serif;\n");
      out.write("\tposition: relative;\n");
      out.write("\tz-index: 1;\n");
      out.write("\tbackground: #FFFFFF;\n");
      out.write("\topacity: 95%;\n");
      out.write("\tmax-width: 260px;\n");
      out.write("\tmargin: 150px auto 100px;\n");
      out.write("\tpadding: 10px 45px 30px 45px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbox-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("}\n");
      out.write(".form p{\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tpadding: 1px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".form input{\n");
      out.write("\toutline: 0;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tbackground: #F2F2F2;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder: 0;\n");
      out.write("\tmargin: 0 0 15px;\n");
      out.write("\tpadding: 15px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form button{\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\toutline: 0;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tbackground: #1ADBE5;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder: 0;\n");
      out.write("\tpadding: 15px;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write(".form button:hover, .form button:active, .form button:focus{\n");
      out.write("\tbackground-color: #06C5CF;\n");
      out.write("\ttransition: all 1s ease 0s;\n");
      out.write("}\n");
      out.write(".form .message{\n");
      out.write("\tmargin: 15px 0 0;\n");
      out.write("\tcolor: #B3B3B3;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write(".form .message a{\n");
      out.write("\tcolor: #06C5CF;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"form\" style=\"padding: 60px 60px\">\n");
      out.write("\t<p style=\"font-size: 20px; font-weight: bold; color: #666; padding: 6px 2px; background-color: #E0FFFF;\">Employee Login</p>\n");
      out.write("        <br>\n");
      out.write("\t<form >\n");
      out.write("\t\t<input type=\"text\" name=\"email\" placeholder=\"email\">\n");
      out.write("\t\t<input type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("                <button>login</button><br>\n");
      out.write("\t\t<p class=\"message\" style=\"font-size: 16px;\">Not registered? <a href=\"employee.html\">Create an account</a></p>\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
