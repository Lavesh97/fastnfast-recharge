package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class subscribe_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Online Mobile Recharge</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");

String name=request.getParameter("name");
String emailid=request.getParameter("email");
String contact=request.getParameter("contact");

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
	con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
	PreparedStatement ps1=con.prepareStatement("select phoneno,email from subscribe");   
	ResultSet rs=ps1.executeQuery();
	int flag=0;
	while(rs.next()){
		if(rs.getString("phoneno").compareTo(contact)==0 || rs.getString("email").compareTo(emailid)==0)
			flag=1;
	}
	if(flag==0)
	{
    PreparedStatement ps=con.prepareStatement("insert into subscribe values(\""+name+"\",\""+emailid+"\",\""+contact+"\")");   
	ps.executeUpdate();
	System.out.println("subscribed!!");
	out.println("<div id=\"about_text\"><b><br/><br/><h1><center><i>Thank you for subscribing to StopNrecharge.com. You will now receive all our updates via SMS/E-mails.</i></center></h1></b></div>");
	}
	else
	{
	System.out.println("not updated!!");
	out.println("<div id=\"about_text\"><b><br/><br/><h1><center><i>You are already subscribed.</i></center></h1></b></div>");
	}
	
}
catch(Exception e)
{
	System.out.println(e.toString());
}								



      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("     \t<br><hr width=\"500px\">\r\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\r\n");
      out.write("     </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
