<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Item</title>
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
	$(function(){
	    $("#image").change(function(){
	        var path=$(this).val().replace("C:\\fakepath\\","");
	        /* var    path1 = path.lastIndexOf("\\");
	         * var name = path.substring(path1+1); 
	         */
	        $("#imagePath").val(path);
	    });
	});
</script>
</head>
<body>
	<jsp:include page="header_admin.jsp"></jsp:include>
	<div class="container-fluid" >
		<div class="col-md-3"></div>
		<form method="post" action="addservlet" name="add">
		  <table border="0" width="720px">
		  <tr >
			<td >Item name: </td>
			<td style="text-align: left;"><input type="text" name="name"></td>
		  </tr>
		  <tr>
			<td>Price: </td>
			<td style="text-align: left;">
				<input type="text" name="price">
			</td>
		  </tr>
		  <tr>
			<td>Type: </td>
			<td style="text-align: left;"><input type="text" name="type">Please enter number: Jersey is 1; Movie is 2; Poster is 3; Shoes is 4.</td>
		  </tr>
		  <tr>
			<td>Picture: </td>
			<td style="text-align: left;">
				<!-- <input type="file" name="docFile" id="docFile" style="display: none;" onchange="document.fileUploadForm.filePath.value=this.value"/>
　　　　			<input type="text" name="filePath" id="filePath"/>
　　　　			<input type="button" value="Select" onclick="document.fileUploadForm.docFile.click()"/>
				 -->
				<input type="file" name="image" id="image" style="display:none;"><!--  onChange="document.add.imagePath.value=this.value" -->
				<input name="imagePath" id="imagePath" readonly>
				<input type="button" class="btn btn-info"value="Select" onclick="document.add.image.click()"> 
				<!-- <input type="file"> -->
　			</td>
		  </tr>
		  <tr>
			<td>Stock: </td>
			<td style="text-align: left;">
				<input type="text" name="stock">
			</td>
		  </tr>
		  <tr>
			<td>Description: </td>
			<td style="text-align: left;"><textarea name="desc" rows="3" cols="22"></textarea></td>
		  </tr></table><br/>
		  <div class="col-md-3"></div>
			<input type="submit" class="btn btn-success" value="Add"> 
	   </form>
	</div>
	
	
	
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>