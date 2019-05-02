<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Cart</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
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
        .glyphicon-usd {
            color:#FF6347;
            font-size:25px;
        }
        
</style>

<style type="text/css">
@import "css/table.css"
</style>

<script type="text/javascript">
	function doDelete(did) {
		var type = confirm("Are you sure?");
		if(type){
			location.href="deleteitemincart?did="+did;
		}
	}
</script>
<script type="text/javascript">
	function guestDelete(id) {
		var type = confirm("Are you sure?");
		if(type){
			location.href="deleteguestitemservlet?id="+id;
		}
	}
</script>


<script type="text/javascript">

$(function(){
	showTotal();
	
	$(".btn.btn-default.btn-sm.btn-success.glyphicon.glyphicon-plus").click(function(){
		var id = $(this).attr("id").substring(4);
		var itemQuantity = $("#quantity"+id).val();
		var count = eval(itemQuantity)+1;
		$("#quantity"+id).val(count); 
		var unitPrice = $("#itemprice"+id).text();
		var sub = eval(unitPrice*count);
		$("#subtotal"+id).text(sub.toFixed(2));
		$.ajax({
			type:"POST",
			dataType:"text",
			url:"updatequantityservlet",
			data:{idreal:id,quantityreal:count,subtotal:sub}
		});
		showTotal();
	});
});

$(function(){
	$(".btn.btn-default.btn-success.btn-sm.glyphicon.glyphicon-minus").click(function(){
		var id = $(this).attr("id").substring(5);
		var itemQuantity = $("#quantity"+id).val();
		var count = eval(itemQuantity)-1;
		var count1=eval(itemQuantity)-0;
		$("#quantity"+id).val(count);
		var unitPrice = $("#itemprice"+id).text();
		var sub = eval(unitPrice*count);
		$("#subtotal"+id).text(sub.toFixed(2));
		$.ajax({
			type:"POST",
			dataType:"text",
			url:"updatequantityservlet",
			data:{idreal:id,quantityreal:count,subtotal:sub}
		});
		showTotal();
		
	});
});
function showTotal() {
	var total = 0;
	$(".field.glyphicon.glyphicon-usd").each(function() {
		var id = $(this).attr("id").substring(8);
		var text = $("#subtotal" + id).text();
		total += Number(text); 
	});
	$("#total").text(total.toFixed(2));
}
$(function(){
	$(".btn.btn-warning").click(function(){
		var itemid = $(this).attr("id").substring(9);
		var itemtype = $(this).attr("flag");
		var itemcode = $("#code"+itemid+itemtype).val();
		
		var id = $(this).attr("iid").substring(9);
		var count = $("#quantity"+id).val();
		var unitPrice = $("#itemprice"+id).text();
		var sub = eval(unitPrice*count);
		var count1=eval(count)-0;
		//alert(count+"..."+count1);
		/* var itemQuantity = $("#quantity"+itemid).val();
		var count = eval(itemQuantity);
		var unitPrice = $("#itemprice"+itemid).text();
		var sub = eval(unitPrice*count); 
		$.ajax({
			type:"POST",
			dataType:"text",
			url:"updatequantityservlet",
			data:{idreal:itemid,quantityreal:count,subtotal:sub}
		}); */
		
		//alert(itemid+"...."+itemtype+"...."+itemcode);
		//alert(itemid+"..."+itemcode);
 		$.ajax({
			type:"POST",
			dataType:"text",
			url:"promotionservlet",
			data:{id:itemid,type:itemtype,code:itemcode},
			success:function(result){
				alert(result);
			},
			error:function(){
				alert(result+"1");
			}
		}); 
		subDB(id,count1,sub);
	});
	
});

function subDB(id,count,sub) {
	$.ajax({
		type:"POST",
		dataType:"text",
		url:"updatequantityservlet",
		data:{idreal:id,quantityreal:count,subtotal:sub}
	});
	
}


</script>
</head>

<body>
	<jsp:include page="/header.jsp"></jsp:include>
	<div class="container-fluid">
	<div class="col-md-3"></div>
	<!-- <form> -->
		<table border="1" width="700">
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
				<td>
				Manage
				</td>
				<td>
				Promotion
				</td>
			</tr>
			<%-- <%String userName = session.getAttribute("username") %> --%>
			<c:if test="${sessionScope.username!=null }">
				<c:forEach items="${cartList }" var="cart1">
					<tr>
						<td>
						<img src="${pageContext.request.contextPath }/${cart1.image }" width="100" height="100">
						</td>
						<td>
							<span id="${cart1.id}">${cart1.itemname }</span>
						</td>
						<td>
							<span id="itemprice${cart1.id}" style="font-size:15px;color:black" class="glyphicon glyphicon-usd">${cart1.itemprice }</span>
						</td>
						<td>
						<button type="button" id="minus${cart1.id}" class="btn btn-default btn-success btn-sm glyphicon glyphicon-minus"></button>
						<input  class="field" type="text" id="quantity${cart1.id}" style="width:30px;height:27px;text-align:center;border-style:none" readonly value="${cart1.itemquantity }"/>
						<button type="button" id="plus${cart1.id }" class="btn btn-default btn-sm btn-success glyphicon glyphicon-plus"></button>
						</td>
						<td>
							<span id="subtotal${cart1.id}" style="font-size:15px" class="field glyphicon glyphicon-usd" style="color:#FF6347">
							<fmt:formatNumber type="number" value="${cart1.itemprice*cart1.itemquantity}" pattern="0.00" maxFractionDigits="2"/></span>
						</td>
						<td>
							<a href="#" onclick="doDelete('${cart1.id}')">Delete</a>
						</td>
						<td>
							<input type="text" name="code" id="code${cart1.itemid }${fn:trim(cart1.itemtype) }" style="width:55px">
						</td>
						<td>
							<button type="button" class="btn btn-warning" flag="${cart1.itemtype }" id="promotion${cart1.itemid}" iid="promotion${cart1.id}">Apply</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
			<%-- <c:if test="${sessionScope.username==null }">
				<c:forEach items="${cartList }" var="cart1">
					<tr>
						<td>
						<img src="${pageContext.request.contextPath }/${cart1.image }" width="100" height="100">
						</td>
						<td>
							<span id="${cart1.id}">${cart1.itemname }</span>
						</td>
						<td>
							<span id="itemprice${cart1.id}" style="font-size:15px;color:black" class="glyphicon glyphicon-usd">${cart1.itemprice }</span>
						</td>
						<td>
						<button type="button" id="minus${cart1.id}" class="btn btn-default btn-success btn-sm glyphicon glyphicon-minus"></button>
						<input  class="field" type="text" id="quantity${cart1.id}" style="width:30px;height:27px;text-align:center;border-style:none" readonly value="${cart1.itemquantity }"/>
						<button type="button" id="plus${cart1.id }" class="btn btn-default btn-sm btn-success glyphicon glyphicon-plus"></button>
						</td>
						<td>
							<span id="subtotal${cart1.id}" style="font-size:15px" class="field glyphicon glyphicon-usd" style="color:#FF6347">
							<fmt:formatNumber type="number" value="${cart1.itemprice*cart1.itemquantity}" pattern="0.00" maxFractionDigits="2"/></span>
						</td>
						<td>
							<a href="#" onclick="guestDelete('${cart1.id}')">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</c:if> --%>
			
			
			<tr>
				<td colspan="8" style="text-align:right">
					<span>Total: </span>
					<span class="glyphicon glyphicon-usd">
						<span id="total"></span>
					</span>
				</td>
			</tr>
			<tr>
				<td colspan="8" style="text-align:right">
					<a href="orderservlet" id="jiesuan" class="jiesuan"><img src="main/checkout.png" width="80" height="80">&nbsp;&nbsp;&nbsp;</a>
				</td>
			</tr>
		</table>
	<!-- </form> -->
</div>
	
	
	
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>