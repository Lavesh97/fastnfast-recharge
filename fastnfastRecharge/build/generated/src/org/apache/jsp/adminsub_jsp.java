package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class adminsub_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<a href=\"adminlogin.jsp\">Home</a>\t\t\n");
      out.write("\t\t\t<a href=\"adminlogout.jsp\">Admin Logout</a>\n");
      out.write("\t\t</div>\n");
      out.write("<center>\n");


Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select * from subscribe");
ResultSet rs=ps.executeQuery();
int flag=0;

out.print("<div id=\"about_text\"> <table width=\"70%\" border=\"1\"><tr><th><b><h2>Name</th><th><b><h2>Email-id</th>	<th><b><h2>Contact No.</th>	</tr></b>");
out.print("</br></br>");

while(rs.next())
{
	out.print("<tr class=\"tab\" height=\"40px\"><td  align=\"center\">");
 	out.println(rs.getString("name")+"</font></td>");
 	out.println("<td  align=\"center\">"+rs.getString("emailid")+"</td>");
 	out.println("<td  align=\"center\">"+rs.getString("phoneno")+"</td>");
 	out.print("</tr></br>");
}
out.print("</table></font></div>");
}
catch(Exception e)
{
out.println(e.toString());
}




      out.write("\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("     \t<br><hr width=\"500px\">\n");
      out.write("     \t&#169; Copyright StopNrecharge.com. All rights reserved.\n");
      out.write("     </div>\n");
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
