package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class emptask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>ADMIN PAGE</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/google_releway.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"assets/css/google_coiny.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/awesomefont.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"//pro.fontawesome.com/releases/v5.10.0/css/all.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.datatables.net/buttons/1.7.0/css/buttons.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"./style.css\">\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
      out.write(".gone{\n");
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
      out.write("/* general utility classes */\n");
      out.write(".warn {\n");
      out.write("  color: lightsalmon;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* header */\n");
      out.write("header[role=banner] {\n");
      out.write("  background: white;\n");
      out.write("  box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.15);\n");
      out.write("}\n");
      out.write("header[role=banner] h1 {\n");
      out.write("  margin: 0;\n");
      out.write("  font-weight: 300;\n");
      out.write("  padding: 1rem;\n");
      out.write("}\n");
      out.write("header[role=banner] h1:before {\n");
      out.write("  content: \"?\";\n");
      out.write("  font-family: FontAwesome;\n");
      out.write("  padding-right: 0.6em;\n");
      out.write("  color: turquoise;\n");
      out.write("}\n");
      out.write("header[role=banner] .utilities {\n");
      out.write("  width: 100%;\n");
      out.write("  background: slategray;\n");
      out.write("  color: #ddd;\n");
      out.write("}\n");
      out.write("header[role=banner] .utilities li {\n");
      out.write("  border-bottom: solid 1px rgba(255, 255, 255, 0.2);\n");
      out.write("}\n");
      out.write("header[role=banner] .utilities li a {\n");
      out.write("  padding: 0.7em;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* header */\n");
      out.write(".utilities a:before {\n");
      out.write("  content: \"?\";\n");
      out.write("  font-family: FontAwesome;\n");
      out.write("  padding-right: 0.6em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logout a:before {\n");
      out.write("  content: \"?\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".users a:before {\n");
      out.write("  content: \"?\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");

	

      out.write("\n");
      out.write("<body>\n");
      out.write("    <header role=\"banner\">\n");
      out.write(" <h1><b>Online Complaint Registration</b></h1>\n");
      out.write("  <ul class=\"utilities\">\n");
      out.write("    <li class=\"logout warn\"><a href=\"logout.jsp\">Log Out</a></li>\n");
      out.write("  </ul>\n");
      out.write("</header>\n");
      out.write("<div class=\"gone\">\n");
      out.write("\t\t<p style=\"color: #d8f0f2;\n");
      out.write("\t\tfont-family: Georgia, serif;\n");
      out.write("\t\tfont-size: 40px;\n");
      out.write("\t\tfont-weight: bold; \">Alloted Complaints</p>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");
      out.write("\t");
 
	String name=(String)session.getAttribute("fname");
	System.out.println(name);
	try{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint2","root","");
	Statement st= con.createStatement();

	ResultSet rs=st.executeQuery("select * from complaint where employee='"+name+"'");
	
	
	while(rs.next()){
		
	



      out.write("\n");
      out.write("\n");
      out.write("\t<tr>\t\t\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(1)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(2));
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(3)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(4)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(5)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(6)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(7)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(8)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(9)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(10)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(11)); 
      out.write("</td>\n");
      out.write("\t\t\t<td>");
out.println(rs.getString(12)); 
      out.write("</td>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");

	}
	}
	catch(Exception e){
		System.out.println(e);
	}


      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table><br><br>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"../dataTables/js/jquery.js\"></script>\n");
      out.write("<script src=\"../dataTables/js/jquery.datatables.js\"></script>\n");
      out.write("<script src=\"../dataTables/js/datatables.bootstrap.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("<script src=\"//cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/dataTables.buttons.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js\"></script>\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/buttons.html5.min.js\"></script>\n");
      out.write("<script src=\"//cdn.datatables.net/buttons/1.7.0/js/buttons.print.min.js\"></script> \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $('#example').DataTable( {\n");
      out.write("    \t\n");
      out.write("    } );\n");
      out.write("} );\n");
      out.write("</script>\n");
      out.write("\n");
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
