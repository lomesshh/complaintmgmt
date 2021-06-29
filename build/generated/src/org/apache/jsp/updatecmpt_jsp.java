package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class updatecmpt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("        \t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<title>View Data</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url(https://i.postimg.cc/yYC536yP/feedbackimg.jpg);\n");
      out.write("\theight: 100vh;\n");
      out.write("\t-webkit-background-size: cover;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center center;\n");
      out.write("\tposition: relative;\n");
      out.write("        align-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header{\n");
      out.write("    color: black;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-top: 5rem;\n");
      out.write("\tmargin-bottom: 5rem;\n");
      out.write("\tfont-size:40px\n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("    color: black;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("    color: black;\n");
      out.write("    font-family: Georgia, serif;\n");
      out.write("    font-size:10;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background-color: #d8f0f2;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("td{\n");
      out.write("    color: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("td{\n");
      out.write("    color: black;\n");
      out.write("    font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("    font-size:10;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background-color: whitesmoke;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t\t<p style=\"color: #d8f0f2;\n");
      out.write("\t\tfont-family: Georgia, serif;\n");
      out.write("\t\tfont-size: 40px;\n");
      out.write("\t\tfont-weight: bold; \">User Complaints</p>\n");
      out.write("\t\t</div>\n");
      out.write("    <div class=\"content-blog\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    <center>\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("                                                <th>Comp id</th>\n");
      out.write("                                                <th>Full name</th>\n");
      out.write("\t\t\t\t\t\t<th>Number</th>\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\n");
      out.write("\t\t\t\t\t\t<th>Complaint Type</th>\n");
      out.write("\t\t\t\t\t\t<th>Explanation</th>\n");
      out.write("\t\t\t\t\t\t<th>image</th>\n");
      out.write("                                                <th>Address</th>\n");
      out.write("\t\t\t\t\t\t<th>latitude</th>\n");
      out.write("\t\t\t\t\t\t<th>longitude</th>\n");
      out.write("\t\t\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t\t\t<th>Alloted Employee</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");
 

String host="jdbc:mysql://localhost:3306/complaint2";
Connection conn=null;
Statement stat=null;
ResultSet res=null;
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection(host,"root","");
stat=conn.createStatement();
String data="select * from complaint order by id";
res=stat.executeQuery(data);
while(res.next()){
	

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(res.getString("id") );
      out.write("</td>\n");
      out.write("  <td>");
      out.print(res.getString("fullname") );
      out.write("</td>\n");
      out.write("   <td>");
      out.print(res.getString("number") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(res.getString("email") );
      out.write("</td>\n");
      out.write("     <td>");
      out.print(res.getString("complainttype") );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(res.getString("explanation") );
      out.write("</td>\n");
      out.write("       <td><a target=\"_blank\" href=\"images/");
      out.print(res.getString("filename") );
      out.write("\">\n");
      out.write("           <image src=\"images/");
      out.print(res.getString("filename") );
      out.write("\" width=\"150\" height=\"150\"/>\n");
      out.write("           </a>\n");
      out.write("       </td>\n");
      out.write("        <td>");
      out.print(res.getString("address") );
      out.write("</td>\n");
      out.write("       <td>");
      out.print(res.getString("latitude") );
      out.write("</td>\n");
      out.write("       <td>");
      out.print(res.getString("longitude") );
      out.write("</td>\n");
      out.write("       <td>");
      out.print(res.getString("status") );
      out.write("</td>\n");
      out.write("       <td>");
      out.print(res.getString("employee") );
      out.write("</td>\n");
      out.write("       <td>\n");
      out.write("                    <a href='updateDriver.jsp?u=");
      out.print(res.getString("number") );
      out.write("' class=\"btn btn-info\">Update</a>\n");
      out.write("       </td>\n");
      out.write(" </tr>\n");
      out.write(" ");

 }
      out.write("\n");
      out.write("</tbody>\n");
      out.write("\n");
      out.write("</table>\n");
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
