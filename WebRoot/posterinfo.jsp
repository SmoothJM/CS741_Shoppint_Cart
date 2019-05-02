<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Poster Detail</title>
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

<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		$.ajax({
			type:"POST",
			dataType:"text",
			url:"addtocartservlet",
			data:$('#form1').serialize(),
			success:function(result){
				alert(result);	
			},
			error:function(){
				alert(result+"1");
			}
		
		});
		
	});
});
</script>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>

<div class="container-fluid" >
<%-- 	<c:forEach items="${shoesInfoList }" var="shoesInfo"> --%>
		<div class="col-md-1"></div>
		<div class="col-md-6">
			<img src="${pageContext.request.contextPath }/${posterInfoString.pimage }" width="400" height="600">
		</div>
		<div >
			<table frame=below > 
				<tr><td height="120px"  >  </td></tr>
				<tr >
					<td height="100px" width ="300px" valign="bottom">
						Price: <font color="#EE3B3B" size="6">&dollar;${posterInfoString.pprice }</font>
					</td>
				</tr>
			</table>
			<table border="0px">
				<tr><td height="50px"  >  </td></tr>
				<tr>
					<td height="30px" >
						Version Name: ${posterInfoString.pname }
					</td>
				</tr>
				<tr>
					<td height="30px">
						Stock: ${posterInfoString.pstock }
					</td>
				</tr>
				<tr>
					<td width="400px" height="30px">
						Detail: ${posterInfoString.pdesc }
					</td>
				</tr>
			</table>
			<form class="form-horizontal" id="form1" style="margin-top: 5px;margin-left: 200px;" action="#" method="post"">
			<div class="form-group">
				<div class="col-md-6"></div>
				<div class="col-md-4" style="background:#EDEDED; height:150px; "><br/>
					<font color="#8B0000" size="5">Quantity:  </font>
					
					
					<input style="width: 50px; height:35px;text-align: center;" type="text" name="quantity" value="1"/><br/><br/>
					
					
					<input style="display:none" name="id" value="${posterInfoString.pid}"/>
					<input style="display:none" name="itemname" value="${posterInfoString.pname}"/>
					<input style="display:none" name="type"  value="${posterInfoString.pflag}"/>
					<input style="display:none" name="price" value="${posterInfoString.pprice }"/>
					<input style="display:none" name="image" value="${posterInfoString.pimage} "/>
					<input type="submit" width="100" value="" id="btn" name="submit"style="background: url('main/cart_button.png') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 45px; width: 201px; color: black;">
					
				</div>
			</div>
			</form>
		</div>
<%-- 	</c:forEach> --%>
</div>
<br/>
<br/>
<br/>
<br/>
<br/>

<p><jsp:include page="/footer.jsp"></jsp:include></p>


</body>
</html>