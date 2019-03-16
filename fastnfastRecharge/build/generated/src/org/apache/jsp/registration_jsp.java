package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Subscribe Page</h1>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        ");
 
           String name = request.getParameter("name");
            String emailid=request.getParameter("email");
            String contact=request.getParameter("contact");
            System.out.println(name);
            System.out.println(emailid);
            System.out.println(contact);
            Connection con = null;
            Class.forName("oracle.jdbc.OracleDriver");
            try{
                con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
                PreparedStatement ps = con.prepareStatement("insert into subscribe values(?,?,?)");
                ps.setString(1, name);
    ps.setString(2, emailid);
    ps.setString(3, contact);
    ps.executeUpdate();
        
        System.out.println("Done");
            }
            catch(Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("not Done");
                    }
        
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"registration.jsp\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>username</td><td><input type=\"text\" name=\"name\"/></td></tr>\n");
      out.write("                <tr><td>Email</td><td><input type=\"text\" name=\"email\"/></td></tr>\n");
      out.write("                <tr><td>password</td><td><input type=\"text\" name=\"contact\"/></td></tr>\n");
      out.write("                <table>\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Subscribe\"/>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
