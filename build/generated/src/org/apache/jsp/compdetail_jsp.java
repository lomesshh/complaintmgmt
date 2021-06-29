package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class compdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \t<style>\n");
      out.write("\t/*Reset*/\n");
      out.write("* {\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tuser-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\theight: 100vh;\n");
      out.write("\twidth: 100vw;\n");
      out.write("\tfont-family: arial;\n");
      out.write("\tbackground: url('https://i.postimg.cc/T1QN2gMS/pexels-lukas-590022.jpg') no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("\tbackground-color: rgba(0 ,0 , 0, 0.5);\n");
      out.write("\theight: 700px;\n");
      out.write("\twidth: 600px;\n");
      out.write("\tborder-radius: 0.9rem;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\tbox-shadow: 2px 2px 15px #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-heading {\n");
      out.write("\theight: 3rem;\n");
      out.write("\tmargin: 2.5rem 0 1rem 0;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-group {\n");
      out.write("\tpadding: 0.9rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-group label {\n");
      out.write("\tfont-size: 1.3rem;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container  .form-group input {\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.7);\n");
      out.write("\theight: 30px;\n");
      out.write("\twidth: 20rem;\n");
      out.write("\tborder-radius: 0.4rem;\n");
      out.write("\tfont-size: 1rem;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-btn {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding: 0.9rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-btn input[type=\"submit\"] {\n");
      out.write("\tbackground-color: \t#FA8072;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding: 0.3rem 0.9rem;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 1.1rem;\n");
      out.write("\tborder-radius: 0.3rem;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-btn input[type=\"submit\"]:hover {\n");
      out.write("\tbackground-color: \t#CD5C5C;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container .form-text p {\n");
      out.write("\tcolor: orange;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("\t\t<form action=\"\"newjsp.jsp method=\"post\">\n");
      out.write("                    <br><br><br><br><br><br><br><br><br><br>\n");
      out.write("\t\t\t<div class=\"form-heading\">\n");
      out.write("\t\t\t\t<h1>Check Status</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>Enter Complaint ID</label><br><br>\n");
      out.write("\t\t\t\t&nbsp;<input type=\"text\" name=\"eid\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-btn\">  \n");
      out.write("\t\t\t\t<input type=\"submit\"  value=\"Get Status\">\n");
      out.write("                                \n");
      out.write("\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                 </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

String id=request.getParameter("eid");
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint","root","");
    if(!cn.isClosed())
    {
        PreparedStatement ps=cn.prepareStatement("select * from complaint where id='"+id+"'");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
      out.write("\n");
      out.write("       <div class=\"container\">\n");
      out.write("\t\t<form >\n");
      out.write("                    <br><br><br><br><br><br><br><br>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Complaint ID:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("id") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>First Name:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("fullname") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Cont Number:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("number") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Email:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("email") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Complaint Type:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("complainttype") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Status:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("status") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label>Alloted Employee:</label>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"text\" readonly value='");
      out.print(rs.getString("employee") );
      out.write("'>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        ");
}
        else
        {
            out.println("");
        }
    }
}
catch (Exception e)
{
    out.println("The Error is :" +e.getMessage());
}


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
