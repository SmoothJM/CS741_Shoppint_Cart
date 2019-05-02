<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Management Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
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
<script type="text/javascript">

	function doDelete(did,dflag) {
		var type = confirm("Are you sure?");
		if(type){
			location.href="deleteservlet?did="+did+"&dflag="+dflag;
		}
	}
</script>

<!-- <script type="text/javascript">
	function doUpdate(uid,uflag) {
		location.href="updateitem?uid="+uid+"&uflag="+uflag;
	}
</script> -->

</head>
<body>
	<jsp:include page="../header_admin.jsp"></jsp:include>
<div class="container-fluid" >
	<div class="col-md-2"></div>
	<!-- <div class="col-md-7"> -->
		<form action="searchservlet" method="post">
			<table border="1" width="1000" >
				<tr >
					<td colspan="9">
						&nbsp;&nbsp;Search by name: <input type="text" name="itemName" autocomplete="off"/>
						&nbsp;&nbsp;Search by type: <select name=itemType>
						<option value=""/>*Please Select*
						<option value="Jersey"/>Jersey
						<option value="Movie"/>Movie
						<option value="Poster"/>Poster
						<option value="Shoes"/>Shoes
						</select>
						
						<input type="submit" class="btn btn-primary" value="Search">
						
						<a href="additem" style="float:right">Add new item</a>
					</td>
				</tr>
			
			  <tr align="center">
			 	<td>Type</td>
				<td>Name</td>
				<td>Price</td>
				<td>Description</td>
				<td>Stock</td>
				<td>Promotion</td>
				<td>Discount</td>
				<td>Promotion Begin</td>
				<td>Promotion End</td>
				<td>Management</td>
			  </tr>
			  
			  <c:forEach items="${allJersey }" var="jersey">
				  <tr align="center">
				    <td style="color:#EE8262;">Jersey</td>
					<td>${jersey.jname }</td>
					<td>${jersey.jprice }</td>
					<td>${jersey.jdesc }</td>
					<td>${jersey.jstock }</td>
					<td>${jersey.jpromotion }</td>
					<td>${jersey.joff }</td>
					<td>${jersey.jbegin }</td>
					<td>${jersey.jend }</td>
					<td><a href="updateitem?uid=${jersey.jid }&uflag=${jersey.jflag }" >Update</a>   <a href="#" onclick="doDelete('${jersey.jid}','${jersey.jflag }')">Delete</a></td>
				  </tr>
			  </c:forEach>
			  
			  <c:forEach items="${allShoes }" var="shoes">
				  <tr align="center">
				 	<td style="color:#BF3EFF;">Shoes</td>
					<td>${shoes.sname }</td>
					<td>${shoes.sprice }</td>
					<td>${shoes.sdesc }</td>
					<td>${shoes.sstock }</td>
					<td>${shoes.spromotion }</td>
					<td>${shoes.soff }</td>
					<td>${shoes.sbegin }</td>
					<td>${shoes.send }</td>
					<td><a href="updateitem?uid=${shoes.sid }&uflag=${shoes.sflag }">Update</a>   <a href="#" onclick="doDelete('${shoes.sid}','${shoes.sflag }')">Delete</a></td>
				  </tr>
			  </c:forEach>
			  
			  <c:forEach items="${allMovie }" var="movie">
				  <tr align="center">
				    <td style="color:#B03060;">Movie</td>
					<td>${movie.mname }</td>
					<td>${movie.mprice }</td>
					<td>${movie.mdesc }</td>
					<td>${movie.mstock }</td>
					<td>${movie.mpromotion }</td>
					<td>${movie.moff }</td>
					<td>${movie.mbegin }</td>
					<td>${movie.mend }</td>
					<td><a href="updateitem?uid=${movie.mid }&uflag=${movie.mflag }">Update</a>   <a href="#" onclick="doDelete('${movie.mid}','${movie.mflag }')">Delete</a></td>
				  </tr>
			  </c:forEach>
			  
			  <c:forEach items="${allPoster }" var="poster">
				  <tr align="center">
				  	<td style="color:#6E8B3D;">Poster</td>
					<td>${poster.pname }</td>
					<td>${poster.pprice }</td>
					<td>${poster.pdesc }</td>
					<td>${poster.pstock }</td>
					<td>${poster.ppromotion }</td>
					<td>${poster.poff }</td>
					<td>${poster.pbegin }</td>
					<td>${poster.pend }</td>
					<td><a href="updateitem?uid=${poster.pid }&uflag=${poster.pflag }">Update</a>   <a href="#" onclick="doDelete('${poster.pid}','${poster.pflag }')">Delete</a></td>
				  </tr>
			  </c:forEach>
		  </table>
		</form>
	<!-- </div> -->
</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>