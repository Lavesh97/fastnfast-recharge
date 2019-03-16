<%@ page language="java" import="java.sql.*" %>
<%@ page import="java.sql.*"  %>

<%
Connection con=null;
String amount="";
Class.forName("oracle.jdbc.OracleDriver");
try
{
con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","recharge","mobile");
if(request.getParameter("id")!=null){
	PreparedStatement ps=con.prepareStatement("select * from offer where id= ?");
        ps.setString(1, request.getParameter("id"));
        System.out.println("id:"+request.getParameter("id"));
      ResultSet rs =ps.executeQuery();
      rs.next();
      amount=rs.getString("amount");
      System.out.println("Lavesh Chack"+amount);
      con.close();
	//response.sendRedirect("adminoffer.jsp");
}
System.out.println("inside if amount value"+amount);
}catch(Exception e)
{ System.out.println("session me error he");
        e.printStackTrace();
        }
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
                   
                </div>
		
		<div id="menu">
			<a href="session.jsp">Home</a>
			<a href="session.jsp">Recharge</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="pasttransaction.jsp">History</a>		
			<a href="editinfo.jsp">Edit Personal Info</a>
			<a href="logout.jsp">Logout</a>
			
		</div>


<br>

<div id="about_text"><center><b><h2>Enter details for recharge</h2></b></center></div> 
<br/>
<form action="finalise.jsp" method="post" name="recharge">
    <div align="justify">
<br><center><table width="387" height="150">
        <tr>
            <td><div class="tab"><h3>Mobile Number<h3></td></div>
            <td><input type="text" name="mobileno"/></td>
        </tr>

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
    <form method="post">

        <p align="center"><a href="offer1.jsp"><input type="button" value="View offer" name="viewoffer" /></a></p>
    </form>
      <table width="300" >
<tr>
<td><div class="tab">
  <h3>Amount  </h3></div></td>
<td> <input type="text" name="amount" id="amountid" /> </td>
</tr>
</table>
    <script type="text/javascript">
        var x= '<%=amount%>';
        document.getElementById("amountid").value = x;
        
    </script>
</center>
<p align="center"><input type="submit" value="Submit" name="submit" /></p>
<br/><br/>
    </div>
</form>

    
	<div id="footer">
            <br><hr width="500px">
               Copyright @Lavesh All rights reserved.
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

