<%@ page language="java" import="java.sql.*" %>
<%@ page import="java.sql.*"  %>


<html>

<head>
	<title>Online Mobile Recharge</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<link href="style.css" type="text/css" rel="stylesheet">
</head>

<body>
	<div id="main">
        	<div id="header">
                    <img src="images/header.jpg">
                </div>
		
		<div id="menu">
			<a href="index.jsp">Home</a>
			<a href="instructions.jsp">How to use</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="about.jsp">About Us</a>
			<a href="contacts.jsp">Contact Us</a>
			<a href="admin.jsp">Admin Login</a>
		</div>

<%

String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String address=request.getParameter("address");
String email=request.getParameter("email");
String phoneno=request.getParameter("phoneno");
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");  
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,address);
ps.setString(4, email);
ps.setString(5, phoneno);
ps.setString(6, uname);
ps.setString(7, pass);
ps.executeUpdate();
out.println("<div id=\"about_text\"><d><h2><center>Registered successfully. You can go to the homepage and login now!</center></h2></d></div>");
}
catch(Exception e)
{
out.println(e.toString());
}
%>
<div id="footer">
     	<br><hr width="500px">
     	&#169; Copyright @Lavesh All rights reserved.
     </div>
</div>
</body>
</html>
