package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.util.Random;

public final class finalise_jsp extends org.apache.jasper.runtime.HttpJspBase
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


String operator=request.getParameter("operator");
String state=request.getParameter("state");
String amount=request.getParameter("amount");
String user=session.getAttribute("username").toString();

//amount varchar(50),
//operator varchar(50),
//username varchar(50))

//out.println(xyz); out.println("<br/>");
//out.println(operator); out.println("<br/>");
//out.println(state); out.println("<br/>");
//out.println(amount); out.println("<br/>");

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select * from offer");
Random r=new Random();
int tranid=r.nextInt(100000000);
session.setAttribute("tid", ""+tranid+"");
PreparedStatement ps1=con.prepareStatement("insert into rechargedetail values ('"+amount+"','"+operator+"','"+user+"','"+tranid+"')" );
ps1.executeUpdate();
ResultSet rs=ps.executeQuery();
int flag=0;
while(rs.next()){
	if(rs.getString("operator").compareTo(operator)==0 /* && rs.getString("state").compareTo(state)==0 */ && rs.getString("amount").compareTo(amount)==0)
		{
		flag=1;break;
		}
}
if(flag==1)
{

out.println("<br/>");
out.println("<br/>");
out.println("<div id=\"about_text\"><center><b><h2>There is this offer on the details you entered. This will automatically be taken.</h2></b></center></div>");
out.println("<br/>");
out.println("OFFER :" + rs.getString("offerdetail"));
//out.write("<div id=\"about_text\"><b><h2><center>Login Successful!</center></h2></b></div>");

      out.write("\n");
      out.write("<br>\n");
      out.write("<div id=\"about_text\"><center><b><h2>Enter details for payment</h2></b></center></div> \n");
      out.write("</br>\n");
      out.write("<form action=\"payment.jsp\" method=\"post\" name=\"recharge\">\n");
      out.write("Select Bank\n");
      out.write("<select name=\"bank\">\n");
      out.write("  <option value=\"sboi\">State Bank Of India</option>\n");
      out.write("  <option value=\"boi\">Bank Of India</option>\n");
      out.write("  <option value=\"icici\">ICICI Bank</option>\n");
      out.write("  <option value=\"hdfc\">HDFC Bank</option>\n");
      out.write("  <option value=\"sb\">Syndicate Bank</option>\n");
      out.write("  </select>  </br>\n");
      out.write("Select Mode of Payment &nbsp;   \n");
      out.write("\n");
      out.write("<select name=\"card_type\">\n");
      out.write("  <option value=\"anp\">Debit Card</option>\n");
      out.write("  <option value=\"arp\">Credit Card</option>\n");
      out.write("  <option value=\"assam\">Net Banking</option>\n");
      out.write("</select>  </br>\n");
      out.write("\n");
      out.write("Enter Account No/Card NO <input type=\"text\" name=\"accno\"/> </br>\n");
      out.write("Enter secret pin <input type=\"password\" name=\"pin\" /> </br>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Submit\" name=\"submit\" />\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
 
}
else
{
	out.println("<br/>");
	out.println("<br/>");
	out.println("<div id=\"about_text\"><center><b><h3>There is presently no offer on this amount, service provider. You will get as you get on normal recharge</h3></b></center></div>");
	

      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div id=\"about_text\"><center><b><h2>Enter details for payment</h2></b></center></div> \n");
      out.write("\t<br/>\n");
      out.write("\t<form action=\"payment.jsp\" method=\"post\" name=\"recharge\">\n");
      out.write("\t<center><table width=\"387\" height=\"150\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Select Bank  </h3></div></td>\n");
      out.write("<td> <select name=\"bank\">\n");
      out.write("\t  <option value=\"sboi\">State Bank Of India</option>\n");
      out.write("\t  <option value=\"boi\">Bank Of India</option>\n");
      out.write("\t  <option value=\"icici\">ICICI Bank</option>\n");
      out.write("\t  <option value=\"hdfc\">HDFC Bank</option>\n");
      out.write("\t  <option value=\"sb\">Syndicate Bank</option>\n");
      out.write("\t  </select>  </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Select Mode of Payment </h3></div></td>\n");
      out.write("<td> <select name=\"card_type\">\n");
      out.write("\t  <option value=\"anp\">Debit Card</option>\n");
      out.write("\t  <option value=\"arp\">Credit Card</option>\n");
      out.write("\t  <option value=\"assam\">Net Banking</option>\n");
      out.write("\t</select>  </td>\n");
      out.write("</tr>\t   \n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Enter Account No/Card No. </h3></div></td> \n");
      out.write("  <td> <input type=\"text\" name=\"accno\" /> </td>\n");
      out.write("  </tr>\n");
      out.write("\t\n");
      out.write("\t\t<tr>\n");
      out.write("<td><div class=\"tab\">\n");
      out.write("  <h3>Enter secret pin </h3></div></td> \n");
      out.write("  <td>  <input type=\"password\" name=\"pin\" /> </td>\n");
      out.write("  </tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\t<input type=\"submit\" value=\"Submit\" name=\"submit\" />\n");
      out.write("\t<br/><br/>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\t");
 
	
} 
}
catch(Exception e)
{
out.print(e.toString());
}

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <br><br></br>All rights reserved with StopNrecharge Pvt. Ltd.\n");
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
