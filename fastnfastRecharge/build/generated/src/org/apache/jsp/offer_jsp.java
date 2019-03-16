package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class offer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
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
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("        \t<div id=\"header\">\r\n");
      out.write("                    <img src=\"images/header.jpg\">\r\n");
      out.write("                </div>\r\n");
 		
if(session.getAttribute("username")==null)
{
	

      out.write("\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"instructions.jsp\">How to use</a>\r\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\r\n");
      out.write("\t\t\t<a href=\"about.jsp\">About Us</a>\r\n");
      out.write("\t\t\t<a href=\"contacts.jsp\">Contact Us</a>\r\n");
      out.write("\t\t\t<a href=\"admin.jsp\">Admin Login</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");

}
else
{
	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"session.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"session.jsp\">Recharge</a>\r\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\r\n");
      out.write("\t\t\t<a href=\"pasttransaction.jsp\">History</a>\t\t\r\n");
      out.write("\t\t\t<a href=\"editinfo.jsp\">Edit Personal Info</a>\r\n");
      out.write("\t\t\t<a href=\"logout.jsp\">Logout</a>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
 		
}


      out.write("\r\n");
      out.write("<form name=\"offer\" action=\"offer.jsp\" method=\"post\" > \r\n");
      out.write("<br><center><table width=\"387\" height=\"150\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div class=\"tab\">\r\n");
      out.write("  <h3>Mobile Operator  </h3></div></td>\r\n");
      out.write("<td> <select name=\"operator\">\r\n");
      out.write("    <option value=\"reliance\">Reliance</option>\r\n");
      out.write("    <option value=\"jio\">Jio</option>\r\n");
      out.write("    <option value=\"airtel\">Airtel</option>\r\n");
      out.write("    <option value=\"vodafone\">Vodafone</option>\r\n");
      out.write("    <option value=\"tatadocomo\">Tata Docomo</option>\r\n");
      out.write("    <option value=\"idea\">Idea</option>\r\n");
      out.write("  </select>  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"174\"><div class=\"tab\">\r\n");
      out.write("  <h3>State </h3></div> </td>\r\n");
      out.write("<td width=\"219\"> \r\n");
      out.write("    <select name=\"state\">\r\n");
      out.write("         <option value=\"anp\">Andhra Pradesh</option>\r\n");
      out.write("      <option value=\"arp\">Arunachal Pradesh</option>\r\n");
      out.write("      <option value=\"assam\">Assam</option>\r\n");
      out.write("      <option value=\"bihar\">Bihar</option>\r\n");
      out.write("      <option value=\"cg\">Chhattisgarh</option>\r\n");
      out.write("      <option value=\"bihar\">Bihar</option>\r\n");
      out.write("      <option value=\"goa\">Goa</option>\r\n");
      out.write("      <option value=\"gujrat\">Gujarat</option>\r\n");
      out.write("      <option value=\"haryana\">Haryana</option>\r\n");
      out.write("      <option value=\"himachal\">Himachal Pradesh</option>\r\n");
      out.write("      <option value=\"jammu\">Jammu and Kashmir</option>\r\n");
      out.write("      <option value=\"jharkhand\">Jharkhand</option>\r\n");
      out.write("      <option value=\"karnataka\">Karnataka</option>\r\n");
      out.write("      <option value=\"kerala\">Kerala</option>\r\n");
      out.write("      <option value=\"madhyapradesh\">Madhya Pradesh</option>\r\n");
      out.write("      <option value=\"maharastra\">Maharastra</option>\r\n");
      out.write("      <option value=\"nagaland\">Nagaland</option>\r\n");
      out.write("      <option value=\"mizoram\">Mizoram</option>\r\n");
      out.write("      <option value=\"orissa\">Orissa</option>\r\n");
      out.write("      <option value=\"punjab\">Punjab</option>\r\n");
      out.write("      <option value=\"rajasthan\">Rajasthan</option>\r\n");
      out.write("      <option value=\"sikkim\">Sikkim</option>\r\n");
      out.write("      <option value=\"tamilnadu\">Tamil Nadu</option>\r\n");
      out.write("      <option value=\"chennai\">Chennai</option>\r\n");
      out.write("      <option value=\"tripura\">Tripura</option>\r\n");
      out.write("      <option value=\"agartala\">Agartala</option>\r\n");
      out.write("      <option value=\"uttrancal\">Uttranchal</option>\r\n");
      out.write("      <option value=\"uttarpradesh\">Uttar Pradesh</option>\r\n");
      out.write("      <option value=\"westbangal\">West Bengal</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<p align=\"center\"><input type=\"submit\" value=\"Submit\" name=\"Submit\"/></p>\t\t\t\t\r\n");
      out.write("</form>\t\t \r\n");
      out.write("\r\n");
      out.write("<div id=\"asd\">\r\n");

if(request.getParameter("Submit")!=null){
	Connection con=null;
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select * from offer");   
ResultSet rs=ps.executeQuery();
String amount="";
String offerdetail="";
String operator=request.getParameter("operator");
String state=request.getParameter("state");
int flag=0;

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table><tr><td><div class=\"tab\"> Description</div></td><td><div class=\"tab\">Amount</div></td></tr>\r\n");
 
while(rs.next()){
	
	if(rs.getString("operator").compareTo(operator)==0 /* && rs.getString("state").compareTo(state)==0 */)
		{
		amount=rs.getString("amount"); 
		offerdetail=rs.getString("offerdetail");
		flag++;
		
      out.write("\r\n");
      out.write("\t\t<tr><td><div class=\"tab\">");
      out.print(offerdetail );
      out.write("</div></td><td><div class=\"tab\">");
      out.print(amount );
      out.write("</div></td></tr>\r\n");
      out.write("\t\t");
 
		}
		
	
}
      out.write("\r\n");
      out.write("                </div></table></center>\r\n");
      out.write("\r\n");

if(flag==0)
	out.println("There is presently no offer for detail selected");
}

      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("     \t<br><hr width=\"500px\">\r\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
