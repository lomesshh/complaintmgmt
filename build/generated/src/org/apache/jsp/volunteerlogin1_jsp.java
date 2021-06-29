package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class volunteerlogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String email=request.getParameter("email");
String pass=request.getParameter("password");
int z=0;
String imgFileName=null;
session.setAttribute("amount",1000);
try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fwms","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from volunteer_reg where email='"+email+"' AND password='"+pass+"'");
	
	while(rs.next()){
		
		session.setAttribute("name",rs.getString(1));
	
		response.sendRedirect("vol_action.jsp");
			
	}
	if(z==0){
		//response.sendRedirect("login.jsp?msg=notexist");
	}

	
}
catch(Exception e){
	out.println(e);
	//response.sendRedirect("login.jsp?msg=notexist");
}


      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <title>Hello, world!</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"login.css\"> -->\r\n");
      out.write("  </head>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');\r\n");
      out.write("body{\r\n");
      out.write("  font-family: 'Poppins', sans-serif;\r\n");
      out.write("  background-color: #00ac96;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".content{\r\n");
      out.write("\r\n");
      out.write("  margin: 8%;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  padding: 4rem 1rem 4rem 1rem;\r\n");
      out.write("  box-shadow: 0 0 5px 5px rgba(0,0,0, .05);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signin-text{\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("  font-weight: 600 !important;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control{\r\n");
      out.write("  display:block;\r\n");
      out.write("  width:100%;\r\n");
      out.write("  font-size: 1rem;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  line-height: 1.5;\r\n");
      out.write("  border-color: #00ac96 !important;\r\n");
      out.write("  border-style: solid !important; \r\n");
      out.write("  border-width: 0 0 1px 0 !important;\r\n");
      out.write("  padding: 0px !important;\r\n");
      out.write("  color:#495057;\r\n");
      out.write("  height: auto;\r\n");
      out.write("  border-radius: 0;\r\n");
      out.write("  background-color:  #fff;\r\n");
      out.write("  background-clip:padding-box;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control:focus{\r\n");
      out.write("\r\n");
      out.write("  color:#495057;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  border-color: #fff;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  box-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".btn-class{\r\n");
      out.write("   border-color: #00ac96;\r\n");
      out.write("    color: #00ac96;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-class:hover{\r\n");
      out.write("  background-color: #00ac96;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </style>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("  <nav aria-label=\"breadcrumb\">\r\n");
      out.write("  <ol class=\"breadcrumb\">\r\n");
      out.write("    <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("    \r\n");
      out.write("  </ol>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("    <div class =\"container\">\r\n");
      out.write("      <div class=\"row content\">\r\n");
      out.write("        <div class=\"col-md-6 mb-3\">\r\n");
      out.write("          <img src=\"https://blogs.nottingham.ac.uk/wordsonwords/files/2016/06/volunteer-652383_1280-cropped-420x210.jpg\"class=\"img-fluid\" alt=\"image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <h3 class=\"signin-text mb-3\">Sign In </h3>\r\n");
      out.write("          <form action=\"volunteerlogin1.jsp\" method=\"post\">\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("              <label for=\"email\">Email </label> \r\n");
      out.write("              <input type=\"email\" name=\"email\" class=\"form-control\">             \r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"form-group\"> \r\n");
      out.write("              <label for=\"password\">Password</label>\r\n");
      out.write("              <input type=\"password\" name=\"password\" class=\"form-control\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group form-check\">\r\n");
      out.write("              <input type=\"checkbox\" name=\"checkbox\" class=\"form-check-input\" id=\"checkbox\">\r\n");
      out.write("                <label class=\"form-check-label\" for=\"Remember me\">Remember me </label>\r\n");
      out.write("            </div>\r\n");
      out.write("          <input type=\"submit\" value=\"submit\">\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
