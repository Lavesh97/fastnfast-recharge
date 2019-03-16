package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Online Mobile Recharge</title>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("//validation func\n");
      out.write("\n");
      out.write("function Validate(){\n");
      out.write("\n");
      out.write("\tvar nam=document.forms['register']['fname'].value;\n");
      out.write("\tvar dnam=document.forms['register']['uname'].value;\n");
      out.write("\tvar no=document.forms['register']['phoneno'].value;\n");
      out.write("\tvar pass=document.forms['register']['pass'].value;\n");
      out.write("\tvar cpass=document.forms['register']['cpass'].value;\n");
      out.write("\n");
      out.write("if((nam==null||nam==\"\")||(dnam==null||dnam==\"\")||(no==null||no==\"\")||(pass==null||pass==\"\")||(cpass==null||cpass==\"\"))\n");
      out.write("{\n");
      out.write("\talert(\"Please Enter all fields\")\n");
      out.write("\treturn false\n");
      out.write("}\n");
      out.write("if(no.length!=10)\n");
      out.write("{\n");
      out.write("\talert(\"The mobile number that you entered is invalid\");\t\n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write("if(!pass.equals(cpass))\n");
      out.write("{\n");
      out.write("\talert(\"The password and the confirm password are not same\");\t\n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("*/\n");
      out.write("return true\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"main\">\n");
      out.write("        \t<div id=\"header\">\n");
      out.write("                    <img src=\"images/header.jpg\">\n");
      out.write("                </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t\t<a href=\"index.jsp\">Home</a>\n");
      out.write("\t\t\t<a href=\"instructions.jsp\">How to use</a>\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\n");
      out.write("\t\t\t<a href=\"about.jsp\">About Us</a>\n");
      out.write("\t\t\t<a href=\"contacts.jsp\">Contact Us</a>\n");
      out.write("\t\t\t<a href=\"admin.jsp\">Admin Login</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"form\">\n");
      out.write("\t\t<form action=\"registerlogin.jsp\" method=\"post\" name=\"register\" onsubmit=\"return Validate();\" >\n");
      out.write("\t\t\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<a><h3>Please fill in your details. <i>Fields marked with * are compulsory.</i></h3></a>\n");
      out.write("\t\t<br>\n");
      out.write("<b><br><table height=\"240\">\n");
      out.write("<tr>\n");
      out.write("<td>First Name*</td>\n");
      out.write("<td><input type=\"text\" name=\"fname\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Last Name</td>\n");
      out.write("<td><input type=\"text\" name=\"lname\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Address</td>\n");
      out.write("<td><input type=\"text\" name=\"address\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<td>Email-Id</td>\n");
      out.write("<td><input type=\"text\" name=\"email\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<td>Contact No.*</td>\n");
      out.write("<td><input type=\"text\" name=\"phoneno\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<td>Desired Username*</td>\n");
      out.write("<td><input type=\"text\" name=\"uname\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("<td>Password*</td>\n");
      out.write("<td><input type=\"password\" name=\"pass\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Confirm Password*</td>\n");
      out.write("<td><input type=\"password\" name=\"cpass\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table></b>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<p align=\"center\"><input type=\"submit\" value=\"Submit\" name=\"submit\" /></p>\n");
      out.write("</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("     \t<br><hr width=\"500px\">\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\n");
      out.write("     </div>\n");
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
