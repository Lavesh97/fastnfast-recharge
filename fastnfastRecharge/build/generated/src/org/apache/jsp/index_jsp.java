package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Online Mobile Recharge</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("\t<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t@import \"slidertron.css\";\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("        \t<div id=\"header\">\r\n");
      out.write("        \t\t<img src=\"images/header.jpg\"></img>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"instructions.jsp\">How to use</a>\r\n");
      out.write("\t\t\t<a href=\"offer.jsp\">Special Offers!</a>\r\n");
      out.write("\t\t\t<a href=\"about.jsp\">About Us</a>\r\n");
      out.write("\t\t\t<a href=\"contacts.jsp\">Contact Us</a>\r\n");
      out.write("\t\t\t<a href=\"admin.jsp\">Admin Login</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"contentbox\">\r\n");
      out.write("\t\t\t<div id=\"left_sidebar\">\r\n");
      out.write("\t\t\t\t\t<div id=\"box1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"titlebar\">Special Offers\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sidebarcontent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<marquee direction=\"up\" onmousemove=\"this.stop();\" onmouseout=\"this.start();\">\r\n");
      out.write("              \r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("                            <li>Recharge with Rs. 500 or more and get an assured gift!</li>\r\n");
      out.write("                            <br/><li>Full Talktime on recharges above Rs. 1000/-</li></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</marquee>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"box2\">\r\n");
      out.write("                                            \r\n");
      out.write("\t\t\t\t\t\t<div class=\"container1\">\r\n");
      out.write("                                                    <div class=\"titlebar\">Facebook Page\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/fb.png\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"mid_sidebar\">\r\n");
      out.write("\t\t\t\t<div id=\"mbox1\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("var image1=new Image();\r\n");
      out.write("image1.src=\"images/slideshow/airtel.gif\";\r\n");
      out.write("var image2=new Image();\r\n");
      out.write("image2.src=\"images/slideshow/docomo.png\";\r\n");
      out.write("var image3=new Image();\r\n");
      out.write("image3.src=\"images/slideshow/idea.jpg\";\r\n");
      out.write("var image4=new Image();\r\n");
      out.write("image4.src=\"images/slideshow/jio.jpg\";\r\n");
      out.write("var image5=new Image();\r\n");
      out.write("image5.src=\"images/slideshow/vodafone.jpg\";\r\n");
      out.write("var image6=new Image();\r\n");
      out.write("image6.src=\"images/slideshow/pic.jpg\";\r\n");
      out.write("var image7=new Image();   \r\n");
      out.write(" image7.src=\"images/slideshow/operators.jpg\";\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<img src=\"images/slideshow/airtel.gif\" name=\"slide\" width=\"516\" height=\"320\" />\r\n");
      out.write("<script>\r\n");
      out.write("<!--\r\n");
      out.write("//variable that will increment through the images\r\n");
      out.write("var step=1\r\n");
      out.write("function slideit(){\r\n");
      out.write("//if browser does not support the image object, exit.\r\n");
      out.write("if (!document.images)\r\n");
      out.write("return\r\n");
      out.write("document.images.slide.src=eval(\"image\"+step+\".src\")\r\n");
      out.write("if (step<7)\r\n");
      out.write("step++\r\n");
      out.write("else\r\n");
      out.write("step=1\r\n");
      out.write("//call function \"slideit()\" every 2.5 seconds\r\n");
      out.write("setTimeout(\"slideit()\",2500)\r\n");
      out.write("}\r\n");
      out.write("slideit()\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("                                    <div id=\"mbox2\">\r\n");
      out.write("                                    <h2><center>Now recharge your mobile online!</center></h2>\r\n");
      out.write("<br/> One of its kind Online Prepaid Recharge site in India. We provide easy and instant recharge for Airtel, Aircel, Vodafone, LOOP Mobile (BPL Mobile), Reliance, Idea, BSNL, Virgin and Tata Indicom mobile for all circles across India. <br/>Recharge we deliver is PIN less and there is no need to call the IVR. Why buy a voucher or topup card when we provide a convenient way to recharge prepaid mobile using credit/debit/cash card and net banking. <br/>*No extra/hidden cost, you only pay MRP. <br/><center>From this site you get the advantage of 'ANY TIME RECHARGE' while you are travelling anywhere in the world. </center><br/><br/>More services to be added soon... \r\n");
      out.write("                                    \r\n");
      out.write("                                    </div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"right_sidebar\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <div id=\"rbox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"titlebar\">Login</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");

//--------------------------------------
if(request.getParameter("submit")!=null){
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "recharge", "mobile");
PreparedStatement ps=con.prepareStatement("select * from users");   
ResultSet rs=ps.executeQuery();
int flag=0;
while(rs.next()){
	if(rs.getString("username").compareTo(uname)==0 && rs.getString("password").compareTo(pass)==0)
		{session.setAttribute("username", rs.getString("username"));flag=1;break;}
}
if(flag==1)
{
response.sendRedirect("session.jsp");
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
      out.write("<form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("<br/>\r\n");
      out.write("<center>\r\n");
      out.write("<table height=\"79\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Username&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("<td><input type=\"text\" name=\"uname\" /></td>\r\n");
      out.write("</tr>&nbsp;\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Password</td>\r\n");
      out.write("<td><input type=\"password\" name=\"pass\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("<p align=\"center\"><input type=\"submit\" value=\"Submit\" name=\"submit\" /></p>\r\n");
      out.write("</form>\r\n");
      out.write("<center><i>&nbsp;Not a member yet?</i>&nbsp;<a href=\"register.jsp\">Sign Up Now!</a></center>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"rbox1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"titlebar\">Subscribe for Updates</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<br />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"subscribe.jsp\" method=\"post\" name=\"subscribe\" onSubmit=\"return Validate();\" >\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table height=\"99\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Name&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("<td><input type=\"text\" name=\"name\" /></td>\r\n");
      out.write("</tr>&nbsp;\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Email-id</td>\r\n");
      out.write("<td><input type=\"text\" name=\"email\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Contact No.</td>\r\n");
      out.write("<td><input type=\"text\" name=\"contact\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("<p align=\"center\"><input type=\"submit\" value=\"Subscribe Now!\" name=\"submit\" /></p>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//validation func\r\n");
      out.write("function Validate(){\r\n");
      out.write("\r\n");
      out.write("\tvar num=document.forms['subscribe']['contact'].value;\r\n");
      out.write("\tvar nam=document.forms['subscribe']['name'].value;\r\n");
      out.write("\tvar eid=document.forms['subscribe']['email'].value;\r\n");
      out.write("\t\r\n");
      out.write("\tif(num.length!=10)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Invalid mobile number!\");\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif((num==null||num==\"\")||(nam==null||nam==\"\")||(eid==null||eid==\"\"))\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Please Enter all fields\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"rbox3\"><img src=\"images/secure.jpg\" width=\"92%\"/></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("     \t<br><hr width=\"500px\">\r\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\r\n");
      out.write("     </div>  \r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
