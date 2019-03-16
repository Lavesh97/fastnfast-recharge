package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class editinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Online Mobile Recharge</title>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"main\">\n");
      out.write("        \t<div id=\"header\">\n");
      out.write("                    <img src=\"images/header.jpg\">\n");
      out.write("                </div>\n");
      out.write("\t\t\n");
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
      out.write("\t\t\n");
      out.write("\t\t ");
 
		Connection con=null;
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
		if(request.getParameter("submit")!=null){
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String phoneno=request.getParameter("phoneno");
			String password=request.getParameter("pass");
			PreparedStatement ps=con.prepareStatement("update users set fname=?,lname=?,address=?,email=?,phoneno=?,password=? where username=?");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, phoneno);
			ps.setString(6, password);
			ps.setString(7,session.getAttribute("username").toString());
			
      out.write(" \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

			ps.executeUpdate();
		}
		PreparedStatement ps=con.prepareStatement("select * from users where username='"+session.getAttribute("username").toString()+"'");
		ResultSet rs=ps.executeQuery();
		rs.next();
		String fname=rs.getString(1);
		String lname=rs.getString(2);
		String address=rs.getString(3);
		String email=rs.getString(4);
		String phoneno=rs.getString(5);
		String password=rs.getString(7);
		
      out.write(" \n");
      out.write("\t\t<form action=\"editinfo.jsp\" method=\"post\">\n");
      out.write("\t\t<center><table width=\"387\" height=\"150\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>First Name  </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"fname\" value=\"");
      out.print(fname);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Last Name  </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"lname\" value=\"");
      out.print(lname);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Address  </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"address\" value=\"");
      out.print(address);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Email-Id </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Contact No. </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"phoneno\" value=\"");
      out.print(phoneno);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Password  </h3></div></td>\n");
      out.write("<td> <input type=\"text\" name=\"pass\" value=\"");
      out.print(password);
      out.write("\"/> </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" name=\"submit\" value=\"Update\"/></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("     \t<br><hr width=\"500px\">\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\n");
      out.write("    \t</div> \n");
      out.write("\t\t\n");
      out.write("\t\t\t</div>\n");
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
