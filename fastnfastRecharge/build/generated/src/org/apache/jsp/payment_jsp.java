package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.sql.*;
import java.sql.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\t\t\t<a href=\"session.jsp\">Home</a>\n");
      out.write("\t\t\t<a href=\"session.jsp\">Recharge</a>\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\n");
      out.write("\t\t\t<a href=\"pasttransaction.jsp\">History</a>\t\t\n");
      out.write("\t\t\t<a href=\"editinfo.jsp\">Edit Personal Info</a>\n");
      out.write("\t\t\t<a href=\"logout.jsp\">Logout</a>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");


String bank=request.getParameter("bank");
String card_type=request.getParameter("card_type");
String accno=request.getParameter("accno");
String pin=request.getParameter("pin");
String tid=session.getAttribute("tid").toString();
String user=session.getAttribute("username").toString();
Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{

con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");

PreparedStatement ps1=con.prepareStatement("insert into transactiondetail values ('"+tid+"','"+bank+"','"+card_type+"','"+accno+"','"+pin+"','"+user+"')" );
ps1.executeUpdate();

out.println("<div id=\"about_text\"><center><b><h2>Your transaction is complete</h2></b></center></div>");
out.println("<div id=\"about_text\"><center><b><h2>Your transaction ID is "+tid+"</h2></b></center></div>" );
}

catch(Exception e)
{
out.print(e.toString());
}

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("   <br><hr width=\"500px\">\n");
      out.write("     \t&#169; Copyright StopNrecharge.com. All rights reserved.\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
