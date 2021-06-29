package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class vol_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>ADMIN PAGE</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/google_releway.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"assets/css/google_coiny.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/awesomefont.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"//pro.fontawesome.com/releases/v5.10.0/css/all.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.datatables.net/buttons/1.7.0/css/buttons.dataTables.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("h2{\r\n");
      out.write("text-align:center;\r\n");
      out.write(" text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td, th {\r\n");
      out.write("  border: 1px solid #dddddd;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

	

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark  bg-dark\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand modify\" href=\"#\">Pra-Bhakkar</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse \"  id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav mr-auto ml-random \" style=\"\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active \">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"orphanage.jsp\">Orphange <span class=\"sr-only\">(current)\r\n");
      out.write("\t\t\t\t\t\t</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item \">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\"  href=\"volunteer.jsp\">Volunteer</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("        </nav>\r\n");
      out.write("                \r\n");
      out.write("        <div class=\"line\"></div>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- navbar -->\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("<right> <a class=\"btn btn-primary\"  href=\"volunteerlogin1.jsp\">logout</a> </right>\r\n");
      out.write("<h2>All User List</h2>\r\n");
      out.write("<br>\r\n");
      out.write("\t\t<table id=\"example\" class=\"\">\r\n");
      out.write("\r\n");
      out.write("\t<thead class=\"\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Did</th>\r\n");
      out.write("\t\t\t<th>donor_type</th>\r\n");
      out.write("\t\t\t<th>Name</th>\t\t\r\n");
      out.write("\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t<th>mobile</th>\r\n");
      out.write("\t\t\t<th>city</th>\r\n");
      out.write("\t\t\t<th>address</th>\r\n");
      out.write("\t\t\t<th>meal_qty</th>\r\n");
      out.write("\t\t\t<th>date</th>\r\n");
      out.write("\t\t\t<th> image</th>\r\n");
      out.write("\t\t\t<th>Volunter Name</th>\r\n");
      out.write("\t\t\t<th>Orphanage Name</th>\r\n");
      out.write("\t\t\t<th>Status</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t");
 
	String name=(String)session.getAttribute("name");
	System.out.println(name);
	try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fwms","root","");
	Statement st= con.createStatement();

	ResultSet rs=st.executeQuery("select * from donation where vol_name='"+name+"'");
	
	
	while(rs.next()){
		
	



      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(1)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(3)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(4)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(5)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(6)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(7)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(8)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(9)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(10)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(11)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(12)); 
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(13)); 
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td> <a href=\"status.jsp?uid=");
out.println(rs.getString(1)); 
      out.write("\"  class=\"btn btn-info\">Accept</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t <a href=\"deleteUser.jsp?delid=");
out.println(rs.getString(1));
      out.write("\" onclick=\"deleteuser()\" class=\"btn btn-danger\">Delete</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	}
	}
	catch(Exception e){
		System.out.println(e);
	}


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table><br><br>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function deleteuser(){\r\n");
      out.write("\r\n");
      out.write("var del  =  confirm(\"Are you sure you want to delete this record?\");\r\n");
      out.write("\r\n");
      out.write("if (del  == true){\r\n");
      out.write("  \r\n");
      out.write("    window.location = anchor.attr(\"href\");\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else{\r\n");
      out.write("\r\n");
      out.write("\t  event.preventDefault();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"../dataTables/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"../dataTables/js/jquery.datatables.js\"></script>\r\n");
      out.write("<script src=\"../dataTables/js/datatables.bootstrap.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("<script src=\"//cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js\"></script>\r\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/buttons.html5.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/buttons.print.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $('#example').DataTable( {\r\n");
      out.write("    \t\r\n");
      out.write("    } );\r\n");
      out.write("} );\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
