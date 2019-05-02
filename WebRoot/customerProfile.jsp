<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Edit Your Profile</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/json.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}



</style>
<style type="text/css">
@import "css/table.css"
</style>


</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

		<div class="container-fluid">
			<div class="col-md-3"></div>
				<form method="post" action="updateprofile" name="profile">
				  <table border="0" width="700px" >
				  <tr >
					<td >Username: </td>
					<td style="text-align: left;">
						<input type="text" name="username"  value="${userInfo.username }" readonly></td>
				  </tr>
				  <tr>
					<td>First name: </td>
					<td style="text-align: left;">
						<input type="text" name="firstname" value="${userInfo.firstname }">
					</td>
				  </tr>
				  <tr>
					<td>Last name: </td>
					<td style="text-align: left;">
						<input type="text" name="lastname" value="${userInfo.lastname }">
					</td>
				  </tr>
				  <tr>
					<td>E-mail: </td>
					<td style="text-align: left;">
						<input type="text" name="email" value="${userInfo.email }">
		　			</td>
				  </tr>
				  <tr>
					<td>TEL: </td>
					<td style="text-align: left;">
						<input type="text" name="tel" value="${userInfo.tel }">
		　			</td>
				  </tr>
				    <tr>
						<td>Shopping Address State: </td>
						<td style="text-align: left;"><select id="state1" name="sstate">
									<option value="${userInfo.shippingstate }">${userInfo.shippingstate }</option>
								</select>
						</td>
					</tr>
					<tr>
						<td>Shopping Address City: </td>
						<td style="text-align: left;"><select id="city1" name="scity">
									<option value="${userInfo.shippingcity }">${userInfo.shippingcity }</option>
								</select>
						</td>
					</tr>
					<tr>
						<td >Shopping Address Street: </td>
						<td style="text-align: left;">
							<input type="text" name="sstreet"  style="width:320px"  value="${userInfo.shippingstreet }">
						</td>
				  </tr>
				  <tr>
						<td>Billing Address State: </td>
						<td style="text-align: left;"><select id="state2" name="bstate">
									<option value="${userInfo.billingstate }">${userInfo.billingstate }</option>
								</select>
					</td>
				  </tr>
				  <tr>
					<td>Billing Address City: </td> 
					<td style="text-align: left;"><select id="city2" name="bcity">
									<option value="${userInfo.billingcity }">${userInfo.billingcity }</option>
								</select>
					</td>
				</tr>
				  <tr>
					<td>Billing Address Street: </td>
					<td style="text-align: left;">
						<input type="text" name="bstreet" style="width:320px" value="${userInfo.billingstreet }">
					</td>
				  </tr>
				  <tr>
				  <td>Card ID: </td>
				  <td style="text-align: left;"> 
				  		<input type="text" name="cardreal" value="${userInfo.card }">
				  </td>
				  </tr>
				  
			
				  </table><br/>
				  <div class="col-md-3"></div>
					<input type="submit" class="btn btn-success" value="Update"> 
			   	</form>
		</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>