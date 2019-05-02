<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Profile</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<!-- <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/> -->
<!-- <script type="text/javascript" src="js/materialize.min.js"></script> -->
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/json.js"></script>
<link rel="stylesheet" href="css/style.css" type="text/css" />
<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
<style type="text/css">
@import "css/table.css"
</style>

<script type="text/javascript">
$(function(){

function showTotal() {
	var total = 0;
	$(".field.glyphicon.glyphicon-usd").each(function() {
		var id = $(this).attr("id").substring(8);
		var text = $("#subtotal" + id).text();
		total += Number(text); 
	});
	$("#total").text(total.toFixed(2));
}

showTotal();

});

</script>
</head>
<body>
	<jsp:include page="/header.jsp"></jsp:include>
	<!-- <h2 class="text-danger bg-success" align="center">This is the last step for this order. Please check your order and your information.</h2> -->
	<div class="container-fluid">
			<div class="col-md-3"></div> 
				<!-- <div class="col-md-5"> -->
					<form method="post" action="checkprofile" name="profile">
					  <table border="0" width="600px" >
					  <tr >
						<td >Username: </td>
						<td style="text-align: left;">
							<input type="text" name="username"  value="${user.username }" readonly></td>
					  </tr>
					  <tr>
						<td>First name: </td>
						<td style="text-align: left;">
							<input type="text" name="firstname" value="${user.firstname }">
						</td>
					  </tr>
					  <tr>
						<td>Last name: </td>
						<td style="text-align: left;">
							<input type="text" name="lastname" value="${user.lastname }">
						</td>
					  </tr>
					  <tr>
						<td>E-mail: </td>
						<td style="text-align: left;">
							<input type="text" name="email" value="${user.email }" >
						</td>
					  </tr>
					  <tr>
						<td>TEL: </td>
						<td style="text-align: left;">
							<input type="text" name="tel" value="${user.tel }">
						</td>
					  </tr>
					    <tr>
							<td>Shopping Address State: </td>
							<td style="text-align: left;"><select id="state1" name="sstate">
										<option value="${user.shippingstate }">${user.shippingstate }</option>
									</select>
							</td>
						</tr>
						<tr>
							<td>Shopping Address City: </td>
							<td style="text-align: left;"><select id="city1" name="scity">
										<option value="${user.shippingcity }">${user.shippingcity }</option>
									</select>
							</td>
						</tr>
						<tr>
							<td >Shopping Address Street: </td>
							<td style="text-align: left;">
								<input type="text" name="sstreet"  style="width:320px"  value="${user.shippingstreet }">
							</td>
					  </tr>
					  <tr>
							<td>Billing Address State: </td>
							<td style="text-align: left;"><select id="state2" name="bstate">
										<option value="${user.billingstate }">${user.billingstate }</option>
									</select>
						</td>
					  </tr>
					  <tr>
						<td>Billing Address City: </td> 
						<td style="text-align: left;"><select id="city2" name="bcity">
										<option value="${user.billingcity }">${user.billingcity }</option>
									</select>
						</td>
					</tr>
					  <tr>
						<td>Billing Address Street: </td>
						<td style="text-align: left;">
							<input type="text" name="bstreet" style="width:320px" value="${user.billingstreet }">
						</td>
					  </tr>
					  <tr>
					  <td>Card ID: </td>
					  <td style="text-align: left;"> 
					  		<input type="text" name="cardreal" value="${user.card }">
					  </td>
					  </tr>
				</table>
					<div class="col-md-9"></div>
					<button type="submit" class="btn btn-success" name="action">Next</button>
				</form>
			<!-- </div> -->
		
		
	</div>
	<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="80%" color=#987cb9 SIZE=3>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>