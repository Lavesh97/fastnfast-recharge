<%@ page language="java" import="java.sql.*" %>
<%@ page import="java.sql.*"  %>

<%@page import="java.util.Random"%>
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
String mobileno=request.getParameter("mobileno");
String operator=request.getParameter("operator");
String state=request.getParameter("state");
String amount=request.getParameter("amount");
String user=session.getAttribute("username").toString();

Connection con=null;
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
PreparedStatement ps=con.prepareStatement("select * from offer");
Random r=new Random();
int tranid=r.nextInt(100000000);
session.setAttribute("tid", ""+tranid+"");
PreparedStatement ps1=con.prepareStatement("insert into rechargedetail values ('"+amount+"','"+operator+"','"+user+"','"+tranid+"','"+mobileno+"')" );
ps1.executeUpdate();

ResultSet rs=ps.executeQuery();
int flag=0;
while(rs.next()){
	if(rs.getString("operator").compareTo(operator)==0  && rs.getString("amount").compareTo(amount)==0)
		{
		flag=1;break;
		}
}
if(flag==1)
{

out.println("<br/>");
out.println("<br/>");
out.println("<div id=\"about_text\"><center><b><h2>There is this offer on the details you entered.</h2></b></center></div>");
out.println("<br>");
out.println("<div id=\"about_text\"><center>");
out.println("OFFER :" + rs.getString("offerdetail"));
out.println("</center></div>");
//out.write("<div id=\"about_text\"><b><h2><center>Login Successful!</center></h2></b></div>");
%>
<br>
<div id="about_text"><center><b><h2>Enter details for payment</h2></b></center></div> 
<br>
<form action="payment.jsp" method="post" name="recharge">
	<center><table width="387" height="150">


<tr>
<td><div class="tab">
  <h3>Select Bank  </h3></div></td>
<td> <select name="bank">
	  <option value="sboi">State Bank Of India</option>
	  <option value="boi">Bank Of India</option>
	  <option value="icici">ICICI Bank</option>
	  <option value="hdfc">HDFC Bank</option>
	  <option value="sb">Syndicate Bank</option>
	  </select>  </td>
</tr>

<tr>
<td><div class="tab">
  <h3>Select Mode of Payment </h3></div></td>
<td> <select name="card_type">
	  <option value="anp">Debit Card</option>
	  <option value="arp">Credit Card</option>
	  <option value="assam">Net Banking</option>
	</select>  </td>
</tr>	   

	<tr>
<td><div class="tab">
  <h3>Enter Account No/Card No. </h3></div></td> 
  <td> <input type="text" name="accno" /> </td>
  </tr>
	
		<tr>
<td><div class="tab">
  <h3>Enter secret pin </h3></div></td> 
  <td>  <input type="password" name="pin" /> </td>
  </tr>
  </table>

	<input type="submit" value="Submit" name="submit" />
	<br/><br/>
	</form>


<% 
}
else
{
	out.println("<br/>");
	out.println("<br/>");
	out.println("<div id=\"about_text\"><center><b><h3>There is presently no offer on this amount, service provider. You will get as you get on normal recharge</h3></b></center></div>");
	
%>
	
	
	<div id="about_text"><center><b><h2>Enter details for payment</h2></b></center></div> 
	<br/>
	<form action="payment.jsp" method="post" name="recharge">
	<center><table width="387" height="150">


<tr>
<td><div class="tab">
  <h3>Select Bank  </h3></div></td>
<td> <select name="bank">
	  <option value="sboi">State Bank Of India</option>
	  <option value="boi">Bank Of India</option>
	  <option value="icici">ICICI Bank</option>
	  <option value="hdfc">HDFC Bank</option>
	  <option value="sb">Syndicate Bank</option>
	  </select>  </td>
</tr>

<tr>
<td><div class="tab">
  <h3>Select Mode of Payment </h3></div></td>
<td> <select name="card_type">
	  <option value="anp">Debit Card</option>
	  <option value="arp">Credit Card</option>
	  <option value="assam">Net Banking</option>
	</select>  </td>
</tr>	   

	<tr>
<td><div class="tab">
  <h3>Enter Account No/Card No. </h3></div></td> 
  <td> <input type="text" name="accno" /> </td>
  </tr>
	
		<tr>
<td><div class="tab">
  <h3>Enter secret pin </h3></div></td> 
  <td>  <input type="password" name="pin" /> </td>
  </tr>
  </table>

	<input type="submit" value="Submit" name="submit" />
	<br/><br/>
	</form>

	<% 
	
} 
}
catch(Exception e)
{
out.print(e.toString());
}
%>

<div id="footer">
     	<br><hr width="500px">
     	&#169; Copyright @Lavesh All rights reserved.
     </div>
</div>
</body>
</html>
