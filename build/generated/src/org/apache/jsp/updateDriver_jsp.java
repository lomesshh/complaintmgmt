package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class updateDriver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Update Driver</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("            \r\n");
      out.write("        * {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: 'Poppins', sans-serif;\r\n");
      out.write("        background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url(https://i.postimg.cc/TYLPb0TP/pexels-gdtography-911738.jpg);\r\n");
      out.write("\theight: 100vh;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tbackground-position: center center;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper {\r\n");
      out.write("\twidth: 1170px;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write(".nav-area {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tmargin-top: 30px;\r\n");
      out.write("        padding: 20px 20px;\r\n");
      out.write("}\r\n");
      out.write(".nav-area li {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write(".nav-area li a {\r\n");
      out.write("        margin-bottom: 30px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tpadding: 5px 20px;\r\n");
      out.write("\tfont-family: poppins;\r\n");
      out.write("\tfont-size: 20px !important;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write(".nav-area li a:hover {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("}\r\n");
      out.write(".ui {\r\n");
      out.write("    background-color: #8C7853;\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    margin-top: 50px;  \r\n");
      out.write("    opacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write(".ui label{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ui h1{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-family: cursive;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputfield\r\n");
      out.write(" {  \r\n");
      out.write(" position:relative;  \r\n");
      out.write(" top:30px;  \r\n");
      out.write(" width:900px;  \r\n");
      out.write(" line-height: 60px!important;  \r\n");
      out.write(" }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 

String host="jdbc:mysql://localhost:3306/complaint2";
Connection conn=null;
Statement stat=null;
Statement stat1=null;
ResultSet res=null;
ResultSet res1=null;
PreparedStatement stmt=null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn=DriverManager.getConnection(host,"root","");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"\" method=\"post\">\r\n");
      out.write("  ");

  stat=conn.createStatement();
  stat1=conn.createStatement();
  String number=request.getParameter("u");
  String data="select * from complaint where number='"+number+"'";
  String data1="select * from employee";
  res = stat.executeQuery(data);
  res1 = stat1.executeQuery(data1);
  while(res.next() && res1.next()){
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("           <div class=\"row\">\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"col-log-3\"></div>\r\n");
      out.write("  <div class=\"col-log-6\">\r\n");
      out.write("                   <div class=\"ui\">\r\n");
      out.write("                       <h1 class=\"text-center\">UPDATE STATUS</h1><br>\r\n");
      out.write("  <form class=\"form-group text-center\">\r\n");
      out.write("                           <div class=\"row\">\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Full Name :</label>\r\n");
      out.write("                                   <input type=\"text\" class=\"form-control\" name=\"fullname\" value='");
      out.print(res.getString("fullname") );
      out.write("'/>\r\n");
      out.write("                               </div>\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Email :</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"email\"  value='");
      out.print(res.getString("email") );
      out.write("' />\r\n");
      out.write("                               </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Number :</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"number\" class=\"form-control\" value='");
      out.print(res.getString("number") );
      out.write("'/>\r\n");
      out.write("                               </div>\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Complaint Type :</label>\r\n");
      out.write("                                    <input type=\"text\"  size=\"50\" name=\"complainttype\" class=\"form-control\" value='");
      out.print(res.getString("complainttype") );
      out.write("'/>                               </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Explanation :</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"explanation\" value='");
      out.print(res.getString("explanation") );
      out.write("'/> \r\n");
      out.write("                               </div>\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Filename :</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"filename\" value='");
      out.print(res.getString("filename") );
      out.write("'/>      \r\n");
      out.write("                               </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Latitude :</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"latitude\" value='");
      out.print(res.getString("latitude") );
      out.write("'/> \r\n");
      out.write("                               </div>\r\n");
      out.write("                               <div class=\"col-lg-6\">\r\n");
      out.write("                                   <label>Longitude :</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"longitude\" value='");
      out.print(res.getString("longitude") );
      out.write("'/> \r\n");
      out.write("                               </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                               <br>\r\n");
      out.write("                                   <label>Status :</label>\r\n");
      out.write("                                    <select class=\"form-control\" name=\"status\" value='");
      out.print(res.getString("status") );
      out.write("'>\r\n");
      out.write("                                        <option value=\"");
      out.print(res.getString("status") );
      out.write('"');
      out.write('>');
      out.print(res.getString("status") );
      out.write("</option>\r\n");
      out.write("                                        <option value=\"Pending\">Pending</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"In Process\">In Process</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Completed\">Completed</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Rejected\">Rejected</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    \r\n");
      out.write("                                   <label>Employee :</label>\r\n");
      out.write("                                <select class=\"form-control\" name=\"employee\" value='");
      out.print(res.getString("employee") );
      out.write("'>\r\n");
      out.write("                                                <option value=\"");
      out.print(res.getString("employee") );
      out.write('"');
      out.write('>');
      out.print(res.getString("employee") );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t<option>");
      out.print(res1.getString(""));
      out.write("</option>\r\n");
      out.write("<!--\t\t\t\t\t\t<option value=\"shekhar nehete\">shekhar nehete</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"amol harne\">amol harne</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"rahul bhangale\">rahul bhangale</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"kalpesh thakur\">kalpesh thakur</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"dipak patel\">dipak patel</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Yash pal\">Yash pal</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"parag patil\">parag patil</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"dhiraj landge\">dhiraj landge</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"aniket chauhan\">aniket chauhan</option>-->\r\n");
      out.write("                                </select>\r\n");
      out.write("                            <br>\r\n");
      out.write("           <input type=\"submit\" value=\"Update\" class=\"btn btn-primary btn-block btn-lg\">\r\n");
      out.write("                           \r\n");
      out.write("                       </form>\r\n");
      out.write("                    </div> \r\n");
      out.write("               </div>\r\n");
      out.write("           </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
}
  
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

String a=request.getParameter("fullname");
String b=request.getParameter("email");
String c=request.getParameter("number");
String d=request.getParameter("complainttype");                 
String e=request.getParameter("explanation");
String f=request.getParameter("filename");
String g=request.getParameter("latitude");
String h=request.getParameter("longitude");
String i=request.getParameter("status");
String j=request.getParameter("employee");

if(a!=null && b!=null && c!=null  && d!=null && e!=null && f!=null && g!=null && h!=null && i!=null && j!=null)
{
	String query="update complaint set fullname=?,email=?,number=?,complainttype=?,explanation=?,filename=?,latitude=?,longitude=?,status=?,employee=? where number='"+c+"'";
	stmt=conn.prepareStatement(query);
        stmt.setString(1,a);
	stmt.setString(2,b);
	stmt.setString(3,c);
	stmt.setString(4,d);
	stmt.setString(5,e);
	stmt.setString(6,f);
	stmt.setString(7,g);
        stmt.setString(8,h);
	stmt.setString(9,i);
	stmt.setString(10,j);

	
	stmt.executeUpdate();
	response.sendRedirect("updatecmpt.jsp");
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
