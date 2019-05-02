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
<title>Order History</title>
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
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>


<div class="container-fluid" >
	<div class="col-md-3"></div>

	<table border="1" width="700">
		<tr align="center">
		 	<td>Order Number</td>
			<td>User Name</td>
			<td>Paid</td>
			<td>Item</td>
			<td>Transaction Time</td>
			
		</tr>
		  
		<c:forEach items="${orderList }" var="orderl">
			<tr align="center">
				<td>${orderl.id }</td>
				<td>${orderl.username }</td>
				<td>&dollar;${orderl.total }</td>
				<td>${orderl.itemname }</td>
				<td>${orderl.timecreate }</td>
			</tr>
		</c:forEach>
	</table>
</div>

<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>