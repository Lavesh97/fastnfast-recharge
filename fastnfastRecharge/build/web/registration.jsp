<%-- 
    Document   : registration.jsp
    Created on : 11 Mar, 2019, 7:22:49 AM
    Author     : juned shaikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Subscribe Page</h1>
      <%@ page language="java" import="java.sql.*" %>
      <%@ page import="java.sql.*"  %>
        <% 
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
        
        %>
        <form method="post" action="registration.jsp">
            <table>
                <tr><td>username</td><td><input type="text" name="name"/></td></tr>
                <tr><td>Email</td><td><input type="text" name="email"/></td></tr>
                <tr><td>password</td><td><input type="text" name="contact"/></td></tr>
                <table>
                    <input type="submit" name="submit" value="Subscribe"/>
                </table>
                    
            </table>
        </form>
    </body>
</html>
