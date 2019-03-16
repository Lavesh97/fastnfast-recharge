<!DOCTYPE html>
<html>

<head>
	<title>Online Mobile Recharge</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<link href="style.css" type="text/css" rel="stylesheet">
	<script type="text/javascript">

//validation func
function Validate(){


	var mobno=document.forms['recharge']['no'].value;
	var sp=document.forms['recharge']['pro'].value;
	var st=document.forms['recharge']['state'].value;
	
if((mobno==null||mobno=="")||(sp==null||sp=="")||(st==null||st==""))
{
alert("Please Enter all fields")
return false
}

if(mobno.length!=10)
{
	alert("The mobile number that you entered is invalid");	
	return false;
}
return true
}
</script>
	
</head>

<body>
	<div id="main">
        	<div id="header">
                    <img src="images/header.jpg">
                </div>
		
		<div id="menu">
			<a href="index.jsp">Home</a>
			<a href="instructions.jsp">How to use</a>
			<a href="contacts.jsp">Contact Us</a>
			<a href="offer.jsp">Special Offers!</a>
			<a href="about.jsp">About Us</a>
		</div>
		<div id="form">
		<form action="payment.jsp" method="post" name="recharge" onSubmit="return Validate();" >
		<center>
		
<br><table width="387" height="150">
<tr>
<td><div class="tab">
  <h3>Mobile No.  </h3></div></td>
<td><input type="text" name="no" /></td>
</tr>

<tr>
<td><div class="tab">
  <h3>Mobile Operator  </h3></div></td>
<td> <select name="operator">
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
<p align="center"><input type="submit" value="Submit" name="submit" /></p>
</form>
</div>
	
	<div id="footer">
	</div>
</div>
</body>
</html>
