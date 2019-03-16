package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>loginform</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login Form</h1>\n");
      out.write("        \n");
      out.write("        \n");

    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
if(request.getParameter("submit")!=null)
{
    String uname=request.getParameter("uname");
    String pass=request.getParameter("pass");
    

try{
    Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
    ps=con.prepareStatement("select * from users");
    rs=ps.executeQuery();
    int x=0;
    while(rs.next()){
        if(rs.getString("username").compareTo(uname)==0 && rs.getString("password").compareTo(pass)==0)
                {
                    session.setAttribute("username",rs.getString("username"));
                    x=1;
                }
    }        if(x==1)
        {
            response.sendRedirect("session.jsp");
        }
        else
        {
          
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("          alert(\"Incorrect Information\");   \n");
      out.write("          </script>\n");
      out.write("          ");
}
    
    
}
catch(Exception e)
{
    e.printStackTrace();
}
}

      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"login.jsp\" >\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>username</td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>password</td>\n");
      out.write("                <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Submit\" name=\"submit\"></td> \n");
      out.write("                </tr>\n");
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
