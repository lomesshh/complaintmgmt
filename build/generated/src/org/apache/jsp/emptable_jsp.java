package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class emptable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"ISO-8859-1\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <title>Employee Table</title>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\t\tbackground: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url(https://i.postimg.cc/yYC536yP/feedbackimg.jpg);\n");
      out.write("\t\theight: 100vh;\n");
      out.write("\t\t-webkit-background-size: cover;\n");
      out.write("\t\tbackground-size: cover;\n");
      out.write("\t\tbackground-position: center center;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".header{\n");
      out.write("    color: black;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-top: 5rem;\n");
      out.write("\tmargin-bottom: 5rem;\n");
      out.write("\tfont-size:40px\n");
      out.write("}\n");
      out.write("/*\n");
      out.write("th{\n");
      out.write("    color: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("    color: black;\n");
      out.write("    font-family: Georgia, serif;\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background-color: #d8f0f2;  \n");
      out.write("}*/\n");
      out.write("\n");
      out.write(".content-table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  margin: 25px 0;\n");
      out.write("  font-size: 0.9em;\n");
      out.write("  min-width: 400px;\n");
      out.write("  border-radius: 8px 8px 0 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table thead tr {\n");
      out.write("  background-color: #9966FF;\n");
      out.write("  color: #fff;\n");
      out.write("  text-align: left;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table th,\n");
      out.write(".content-table td {\n");
      out.write("  padding: 12px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table tbody tr {\n");
      out.write("  border-bottom: 1px solid #ccccff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table tbody tr:nth-of-type(even) {\n");
      out.write("  background-color: #f3f3f3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table tbody tr:last-of-type {\n");
      out.write("  border-bottom: 2px solid #ccccff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-table tbody tr.active-row {\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from employee");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("\t\t<p style=\"color: #bb99ff;\n");
      out.write("\t\tfont-family: Georgia, serif;\n");
      out.write("\t\tfont-size: 40px;\n");
      out.write("\t\tfont-weight: bold; \">Employee Details</p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"content-blog\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<table class=\"table table-striped content-table\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t\t<th>First Name</th>\n");
      out.write("\t\t\t\t\t\t<th>Last name</th>\n");
      out.write("\t\t\t\t\t\t<th>Number</th>\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\n");
      out.write("\t\t\t\t\t\t<th>Department</th>\n");
      out.write("\t\t\t\t\t\t<th>Joining Date</th>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("                                ");

                                while(rs.next()){
                                
      out.write("\n");
      out.write("\t\t\t\t<tbody >\n");
      out.write("\t\t\t\t\t<tr class=\"active-row\">\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(5));
      out.write("</td>\t\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(6));
      out.write("</td>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t");
 } 
      out.write("</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
