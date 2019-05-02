<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Total Price</title>
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
		var taxRate=$(".tax").text();
		var taxReal=Number(1.0+taxRate-9);
		//total += Number(text*Number(1+taxRate));
		//alert(taxReal);
		total += Number(text*taxReal); 
	});
	
	$("#total").text(total.toFixed(2));
	$("#totalNone").attr("value",total.toFixed(2));
}

showTotal();

});

</script>
</head>
<body>
	<jsp:include page="/header.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="col-md-3"></div> 
		<div class="col-md-6">
		<form method="post" action="orderfinal" name="final">
			<table width="500px">
				<tr>
					<td>
					Picture
					</td>
					<td>
					Item name
					</td>
					<td>
					Unit price
					</td>
					<td>
					Quantity
					</td>
					<td>
					Subtotal
					</td>
				</tr>
				<tr >
					<td align="center" style="color:red" colspan=5>
						We have given you a discount.
					</td>
				</tr>
				
				<c:forEach items="${cartList }" var="cart1">
					<tr>
						<td>
							<img src="${pageContext.request.contextPath }/${cart1.image }" width="100" height="100">
						</td>
						<td>
							<span id="${cart1.id}">${cart1.itemname }</span>
						</td>
						<td>
							<span id="itemprice${cart1.id}" style="font-size:15px;color:black" >&dollar;${cart1.itemprice }</span>
						</td>
						<td>
							<input  class="field" type="text" id="quantity${cart1.id}" style="width:30px;height:27px;text-align:center;border-style:none" readonly value="${cart1.itemquantity }"/>
						</td>
						<td>
							<span class="field glyphicon glyphicon-usd" id="subtotal${cart1.id}" style="font-size:15px;color:#FF6347">
								${cart1.subtotal}
							</span>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="5" style="text-align:right">
						<span>Tax Rate: </span>
						<span id="tax" class="tax">${tax.tax }</span>
						
					</td>
				</tr>
				<tr>
					<td colspan="5" style="text-align:right">
						<span>Total(Tax included): </span>
						<span class="glyphicon glyphicon-usd" style="font-size:25px;color:#FF6347">
							<span id="total" ></span>
							<input type="text" style="display:none" name="totalFinal" id="totalNone" value=""/>
						</span>
					</td>
				</tr>
				<tr>
					<td colspan="5" style="text-align:right">
						<button class="btn btn-success" type="submit" name="action">Confirm</button>
					</td>
				</tr>
			</table>
		</form>
		</div> 
	</div>





	<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="80%" color=#987cb9 SIZE=3>
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>