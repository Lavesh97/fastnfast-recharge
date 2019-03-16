<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
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
<% 		
if(session.getAttribute("username")==null)
{
	
%>
		<div id="menu">
			<a href="index.jsp">Home</a>
			<a href="instructions.jsp">How to use</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="about.jsp">About Us</a>
			<a href="contacts.jsp">Contact Us</a>
			<a href="admin.jsp">Admin Login</a>
		</div>
		
<%
}
else
{
	%>
		
		<div id="menu">
			<a href="session.jsp">Home</a>
			<a href="session.jsp">Recharge</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="pasttransaction.jsp">History</a>		
			<a href="editinfo.jsp">Edit Personal Info</a>
			<a href="logout.jsp">Logout</a>			
		</div>
<% 		
}

%>
<form name="offer" action="offer.jsp" method="post" > 
<br><center><table width="387" height="150">

<tr>
<td><div class="tab">
  <h3>Mobile Operator  </h3></div></td>
<td> <select name="operator">
    <option value="reliance">Reliance</option>
    <option value="jio">Jio</option>
    <option value="airtel">Airtel</option>
    <option value="vodafone">Vodafone</option>
    <option value="tatadocomo">Tata Docomo</option>
    <option value="idea">Idea</option>
  </select>  </td>
</tr>

<tr>
<td width="174"><div class="tab">
  <h3>State </h3></div> </td>
<td width="219"> 
    <select name="state">
         <option value="anp">Andhra Pradesh</option>
      <option value="arp">Arunachal Pradesh</option>
      <option value="assam">Assam</option>
      <option value="bihar">Bihar</option>
      <option value="cg">Chhattisgarh</option>
      <option value="bihar">Bihar</option>
      <option value="goa">Goa</option>
      <option value="gujrat">Gujarat</option>
      <option value="haryana">Haryana</option>
      <option value="himachal">Himachal Pradesh</option>
      <option value="jammu">Jammu and Kashmir</option>
      <option value="jharkhand">Jharkhand</option>
      <option value="karnataka">Karnataka</option>
      <option value="kerala">Kerala</option>
      <option value="madhyapradesh">Madhya Pradesh</option>
      <option value="maharastra">Maharastra</option>
      <option value="nagaland">Nagaland</option>
      <option value="mizoram">Mizoram</option>
      <option value="orissa">Orissa</option>
      <option value="punjab">Punjab</option>
      <option value="rajasthan">Rajasthan</option>
      <option value="sikkim">Sikkim</option>
      <option value="tamilnadu">Tamil Nadu</option>
      <option value="chennai">Chennai</option>
      <option value="tripura">Tripura</option>
      <option value="agartala">Agartala</option>
      <option value="uttrancal">Uttranchal</option>
      <option value="uttarpradesh">Uttar Pradesh</option>
      <option value="westbangal">West Bengal</option>
    </select></td>
</tr>
</table>
</center>
					
<p align="center"><input type="submit" value="Submit" name="Submit"/></p>				
</form>		 

<div id="asd">
<%
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
%>
<center>
<table><tr><td><div class="tab"> Description</div></td><td><div class="tab">Amount</div></td></tr>
<% 
while(rs.next()){
	
	if(rs.getString("operator").compareTo(operator)==0 /* && rs.getString("state").compareTo(state)==0 */)
		{
		amount=rs.getString("amount"); 
		offerdetail=rs.getString("offerdetail");
		flag++;
		%>
		<tr><td><div class="tab"><%=offerdetail %></div></td><td><div class="tab"><%=amount %></div></td></tr>
		<% 
		}
		
	
}%>
                </div></table></center>

<%
if(flag==0)
	out.println("There is presently no offer for detail selected");
}
%>                    
                    
		<div id="footer">
     	<br><hr width="500px">
     	&#169; Copyright @Lavesh All rights reserved.
     </div>

</body>
</html>
