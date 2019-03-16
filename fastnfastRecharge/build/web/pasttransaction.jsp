<%@ page language="java" import="java.sql.*" %>
<%@ page import="java.sql.*"  %>
<%

//session.setAttribute("username", rs.getString("username"));

if(session.getAttribute("username")!=null)
{
%>

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
			<a href="session.jsp">Home</a>
			<a href="session.jsp">Recharge</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="pasttransaction.jsp">History</a>		
			<a href="editinfo.jsp">Edit Personal Info</a>
			<a href="logout.jsp">Logout</a>
			
		</div>


<%
//select * from rechargedetail, transactiondetail where rechargedetail.transid=transactiondetail.transid 
String user=session.getAttribute("username").toString();
Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select mobilenumber,amount, operator,rechargedetail.transid, rechargedetail.username from rechargedetail, transactiondetail where rechargedetail.transid=transactiondetail.transid");
ResultSet rs=ps.executeQuery();

out.print("<div id=\"about_text\"> <table width=\"80%\" align=\"center\" border=\"1\"><tr><th><b><h2>MobileNumber</th><th><b><h2>Amount</th> <th><b><h2>Operator</th> <th><b><h2>Transaction id</th></tr></b>");
out.print("</br></br>");

while(rs.next())
{
	if(rs.getString("username").compareTo(user)==0)
	{
	out.print("<tr class=\"tab\" height=\"40px\">");
        out.println("<td  align=\"center\">"+rs.getString("mobilenumber")+"</td>");
 	out.println("<td  align=\"center\">"+rs.getString("amount")+"</td>");
 	out.println("<td  align=\"center\">"+rs.getString("operator")+"</td>");
 	out.println("<td  align=\"center\">"+rs.getString("transid")+"</td>");
 	out.print("</tr>");
	}
}
out.print("<br/><br/></table></div>");

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
<%
}
else
{
response.sendRedirect("index.jsp");
}%>