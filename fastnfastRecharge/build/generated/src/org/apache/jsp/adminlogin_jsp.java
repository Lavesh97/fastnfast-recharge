package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
 
if(session.getAttribute("adminusername")!=null)
{

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Online Mobile Recharge</title>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"main\">\n");
      out.write("        \t<div id=\"header\">\n");
      out.write("                    <img src=\"images/header.jpg\">\n");
      out.write("                </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t\t<a href=\"adminlogin.jsp\">Home</a>\t\t\n");
      out.write("\t\t\t<a href=\"adminlogout.jsp\">Admin Logout</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"about_text\"><b><h2><center>Welcome Admin!</center></h2></b></div>\n");
      out.write("\t<div id=\"about_text\"><c><h3><a href=\"adminoffer.jsp\"><li>Update Offer<br/> \n");
      out.write("                            <a href=\"adminsub.jsp\"><br/><li>See subscribed people list<br/>\t\n");
      out.write("                                    <a href=\"adminreguser.jsp\"><br/><li>See registered user list</h3> </c>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("     \t<br><hr width=\"500px\">\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\n");
      out.write("     </div> \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");

}
else
{
response.sendRedirect("admin.jsp");
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
