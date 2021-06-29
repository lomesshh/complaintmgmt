package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class emp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \t<style>\r\n");
      out.write("\t/*Reset*/\r\n");
      out.write("* {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tuser-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\theight: 90vh;\r\n");
      out.write("\twidth: 100vw;\r\n");
      out.write("\tfont-family: arial;\r\n");
      out.write("\tbackground: url('https://i.postimg.cc/T1QN2gMS/pexels-lukas-590022.jpg') no-repeat;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("\talign-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("\tbackground-color: rgba(0 ,0 , 0, 0.5);\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tborder-radius: 0.9rem;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("\tbox-shadow: 2px 2px 15px #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-heading {\r\n");
      out.write("\theight: 3rem;\r\n");
      out.write("\tmargin: 2.5rem 0 1rem 0;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tjustify-content: center;\r\n");
      out.write("\talign-items: center;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-group {\r\n");
      out.write("\tpadding: 0.9rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-group label {\r\n");
      out.write("\tfont-size: 1.3rem;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container  .form-group input {\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.7);\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 20rem;\r\n");
      out.write("\tborder-radius: 0.4rem;\r\n");
      out.write("\tfont-size: 1rem;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-btn {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 0.9rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-btn input[type=\"submit\"] {\r\n");
      out.write("\tbackground-color: \t#FA8072;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0.3rem 0.9rem;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 1.1rem;\r\n");
      out.write("\tborder-radius: 0.3rem;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-btn input[type=\"submit\"]:hover {\r\n");
      out.write("\tbackground-color: \t#CD5C5C;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container .form-text p {\r\n");
      out.write("\tcolor: orange;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\t</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("\t\t<form action=\"\"newjsp.jsp method=\"post\">\r\n");
      out.write("                  \r\n");
      out.write("\t\t\t<div class=\"form-heading\">\r\n");
      out.write("\t\t\t\t<h1>Get Complaint ID</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>Enter Contact Number</label><br><br>\r\n");
      out.write("\t\t\t\t&nbsp;<input type=\"text\" name=\"eid\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-btn\">  \r\n");
      out.write("\t\t\t\t<input type=\"submit\"  value=\"Get Complaint ID\">\r\n");
      out.write("                                \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </form>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");

String id=request.getParameter("eid");
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint","root","");
    if(!cn.isClosed())
    {
        PreparedStatement ps=cn.prepareStatement("select * from complaint where employee='"+id+"'");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
      out.write("\r\n");
      out.write("       <div class=\"content-blog\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<th>Experience</th>\r\n");
      out.write("\t\t\t\t\t\t<th>First name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Last name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Number</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("                                ");

                                while(rs.next()){
                                
      out.write("\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString("complainttype"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("explanation"));
      out.write("</td>\t\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString("address"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString("latitude"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString("longitude"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t");
 } 
      out.write("</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
