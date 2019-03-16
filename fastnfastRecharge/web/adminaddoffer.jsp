<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
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
<a href="adminlogin.jsp">Home</a>		
			<a href="adminlogout.jsp">Admin Logout</a>
		</div>
<%

Connection con=null;
PreparedStatement ps =null;
PreparedStatement ps1=null;
ResultSet rs=null;

Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
ps1 =con.prepareStatement("select id from offer");
rs=ps1.executeQuery();
int count=0;
while(rs.next())
{
    count=rs.getInt(1)+1;
    
}
System.out.println(count);
System.out.println("ADD COUNT DONE");
if(request.getParameter("submit")!=null){
	
        ps=con.prepareStatement("insert into offer(id,operator,state,amount,offerdetail) values(?,?,?,?,?)");
        ps.setInt(1, count);
	ps.setString(2,request.getParameter("operator"));
	ps.setString(3,request.getParameter("state"));
	ps.setString(4,request.getParameter("amount"));
	ps.setString(5,request.getParameter("description"));
        ps.executeUpdate();
        
}
}
catch(Exception e)
{
    e.printStackTrace();
out.println(e.toString());
}



%>
<form action="adminaddoffer.jsp" method="post">
  <div align="justify">
<center>  <table>
<tr>
<td width="174"><div id="about_text"><c>
 <br/> <h3>State </h3></c></div> </td>
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
<tr>
<td><div id="about_text"><c>
  <h3>Mobile Operator  </h3></c></div></td>
<td> <select name="operator">
    <option value="reliance">Reliance</option>
    <option value="jio">Jio</option>
    <option value="airtel">Airtel</option>
    <option value="vodafone">Vodafone</option>
    <option value="tatadocomo">Tata Docomo</option>
    <option value="idea">Idea</option>
    <option value="BSNL">BSNL</option>
  </select>  </td>
</tr>
<tr>
<td><div id="about_text"><c>
  <h3>Offer Details  </h3></c></div></td>
<td><textarea rows="5" cols="32" name="description"></textarea></td>
</tr>
<tr>
<td><div id="about_text"><c>
  <h3>Amount  </h3></c></div></td>
<td><input type="text" name="amount"></td>
</tr>
</table>
</center>
 
   
    
 <br/> <center><input type="submit" name="submit" value="Add Offer" /></center>
  </div>
</form>
<div id="footer">
		<br><hr width="500px">
     	&#169; Copyright @Lavesh All rights reserved.
     </div>
</div>
</body>
</html>