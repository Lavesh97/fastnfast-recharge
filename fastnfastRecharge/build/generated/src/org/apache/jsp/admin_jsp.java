package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Online Mobile Recharge</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("//validation func\r\n");
      out.write("\r\n");
      out.write("function Validate(){\r\n");
      out.write("\r\n");
      out.write("\tvar unam=document.forms['register']['username'].value;\r\n");
      out.write("\tvar pass=document.forms['register']['password'].value;\r\n");
      out.write("\t\r\n");
      out.write("if((unam==null||unam==\"\")||(pass==null||pass==\"\"))\r\n");
      out.write("{\r\n");
      out.write("\talert(\"Please Enter all fields\")\r\n");
      out.write("\treturn false\r\n");
      out.write("}\r\n");
      out.write("return true\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("        \t<div id=\"header\">\r\n");
      out.write("                    <img src=\"images/header.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"instructions.jsp\">How to use</a>\r\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\r\n");
      out.write("\t\t\t<a href=\"about.jsp\">About Us</a>\r\n");
      out.write("\t\t\t<a href=\"contacts.jsp\">Contact Us</a>\r\n");
      out.write("\t\t\t<a href=\"admin.jsp\">Admin Login</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"form\">\r\n");
      out.write("\t\t<form action=\"admin.jsp\" method=\"post\" name=\"register\" onSubmit=\"return Validate();\" >\r\n");
      out.write("\t\t<center>\r\n");
      out.write("<b>\t\t\t\t\r\n");
      out.write("<br><table height=\"100\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div id=\"about_text\"><b>\r\n");
      out.write(" <h3>Username </h3></b></div></td>\r\n");
      out.write("<td><input type=\"text\" name=\"username\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div id=\"about_text\"><b>\r\n");
      out.write("<h3>Password </h3></b></div></td>\r\n");
      out.write("<td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table></b>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<p align=\"center\"><input type=\"submit\" value=\"Submit\" name=\"submit\" /></p>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");

//--------------------------------------
if(request.getParameter("submit")!=null){
	
	out.println("Reached here");
String uname=request.getParameter("username");
String pass=request.getParameter("password");

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select * from admin");   
ResultSet rs=ps.executeQuery();
int flag=0;
while(rs.next()){
	if(rs.getString("username").compareTo(uname)==0 && rs.getString("password").compareTo(pass)==0)
		{session.setAttribute("adminusername", rs.getString("username"));flag=1;break;}
}
if(flag==1)
{
response.sendRedirect("adminlogin.jsp");
}
else{
	
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert(\"Incorrect Information!!\");\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
 
	
}
}catch(Exception e){}
}
//String xyz=rs.getString("fname");
//---------------------------------------

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("     \t<br><hr width=\"500px\">\r\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\r\n");
      out.write("    \t</div> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
