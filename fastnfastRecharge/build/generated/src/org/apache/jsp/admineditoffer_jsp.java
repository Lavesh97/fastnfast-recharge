package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admineditoffer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("    \r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<a href=\"adminlogin.jsp\">Home</a>\t\t\r\n");
      out.write("\t\t\t<a href=\"adminlogout.jsp\">Admin Logout</a>\r\n");
      out.write("                        <a href=\"adminoffer.jsp\">Offer</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

		Connection con=null;
		Class.forName("oracle.jdbc.OracleDriver");
		String operator="";
		String amount="";
		String offerdetail="";
		String state="";
		
		try
		{
		//System.out.println("Driver Load succesfully");
		con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
		PreparedStatement ps=null;
		if(request.getParameter("submit")!=null){
			state=request.getParameter("state");
			operator=request.getParameter("operator");
			offerdetail=request.getParameter("description");
			amount=request.getParameter("amount");
                        System.out.println(request.getParameter("id"));
		 
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t ");

			ps=con.prepareStatement("update offer set operator=?,state=?,amount=?,offerdetail=? where id=?");
			System.out.println("Update success");
                        ps.setString(1, operator);
			ps.setString(2, state);
			ps.setString(3, amount);
			ps.setString(4, offerdetail);
			ps.setInt(5, Integer.parseInt(request.getParameter("id")));
			System.out.println(request.getParameter("id"));
			ps.executeUpdate();
                        System.out.println("exceute update sucess");
		}
		ps=con.prepareStatement("select * from offer where id=?");
		
		ps.setString(1,request.getParameter("id"));
		ResultSet rs=ps.executeQuery();
		rs.next();
		operator=rs.getString("operator");
		amount=rs.getString("amount");
		offerdetail=rs.getString("offerdetail");
		state=rs.getString("state");
		}
		catch(Exception e)
		{
                e.printStackTrace();
		out.println(e.toString());
		}
		
      out.write("\r\n");
      out.write("\t\t<form action=\"admineditoffer.jsp\" method=\"post\">\r\n");
      out.write("  <div align=\"justify\">\r\n");
      out.write("<center>  <table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"174\"><div id=\"about_text\"><c>\r\n");
      out.write(" <br/> <h3>State </h3></c></div> </td>\r\n");
      out.write("<td width=\"219\"> \r\n");
      out.write("    <select name=\"state\">\r\n");
      out.write("      <option value=\"anp\">Andhra Pradesh</option>\r\n");
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
      out.write("</tr>&nbsp;\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div id=\"about_text\"><c>\r\n");
      out.write("  <h3>Mobile Operator  </h3></c></div></td>\r\n");
      out.write("<td> <select name=\"operator\">\r\n");
      out.write("    <option value=\"reliance\">Reliance</option>\r\n");
      out.write("    <option value=\"jio\">Jio</option>\r\n");
      out.write("    <option value=\"airtel\">Airtel</option>\r\n");
      out.write("    <option value=\"vodafone\">Vodafone</option>\r\n");
      out.write("    <option value=\"tatadocomo\">Tata Docomo</option>\r\n");
      out.write("    <option value=\"idea\">Idea</option>\r\n");
      out.write("  </select>  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div id=\"about_text\"><c>\r\n");
      out.write("  <h3>Offer Details  </h3></c></div></td>\r\n");
      out.write("<td><textarea rows=\"5\" cols=\"32\" name=\"description\"></textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><div id=\"about_text\"><c>\r\n");
      out.write("  <h3>Amount  </h3></c></div></td>\r\n");
      out.write("<td><input type=\"text\" name=\"amount\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("<br/> <center><input type=\"submit\" name=\"submit\" value=\"Update Offer\" /></center>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t\t<br><hr width=\"500px\">\r\n");
      out.write("     \t&#169; Copyright @Lavesh All rights reserved.\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
