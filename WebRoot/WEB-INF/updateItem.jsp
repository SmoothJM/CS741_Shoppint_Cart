<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Update Item Info</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
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

<!-- <script type="text/javascript">
	$(function(){
	    $("#image").change(function(){
	        var path=$(this).val().replace("C:\\fakepath\\","");
	        /* var    path1 = path.lastIndexOf("\\");
	         * var name = path.substring(path1+1); 
	         */
	        $("#imagePath").val(path);
	    });
	});
</script> -->
</head>
<body>
	<jsp:include page="../header_admin.jsp"></jsp:include>
	
	
	<c:choose>
		<c:when test="${param.uflag==1}">
			<div class="container-fluid" >
			<div class="col-md-3"></div>
				<form method="post" action="updateitemdao" name="update">
				  <table border="0" width="720px">
				  <tr >
					<td >Item name: </td>
					<td style="text-align: left;">
						<input type="text" name="name"  value="${update.jname }"></td>
				  </tr>
				  <tr>
					<td>Price: </td>
					<td style="text-align: left;">
						<input type="text" name="price" value="${update.jprice }">
					</td>
				  </tr>
				  <tr>
					<td>Stock: </td>
					<td style="text-align: left;">
						<input type="text" name="stock" value="${update.jstock }">
					</td>
				  </tr>
				  <tr>
					<td>Type: </td>
					<td style="text-align: left;">
						<input type="text" name="flag" value="${update.jflag }" readonly>
		　			</td>
				  </tr>
				  <tr>
					<td>Promotion: </td>
					<td style="text-align: left;">
						<input type="text" name="promotion" value="${update.jpromotion }">
		　			</td>
				  </tr>
				  <tr>
					<td>Discount: </td>
					<td style="text-align: left;">
						<input type="text" name="off" value="${update.joff }">
					</td>
				  </tr>
				  <tr>
					<td>Promotion date: </td>
					<td style="text-align: left;">
						<input id="d12" type="text" name="begin" value="${update.jbegin }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
						to <input type="text" name="end" value="${update.jend }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
					</td>
				  </tr>
<%-- 				  <tr>
					<td>Promotion end: </td>
					<td style="text-align: left;">
						<input type="text" name="end" value="${update.jend }">
					</td>
				  </tr> --%>
				  <tr>
					<td>Description: </td>
					<td style="text-align: left;"><textarea name="desc" rows="3" cols="22" value>${update.jdesc }</textarea></td>
				  </tr>
				  
				  <tr style="display:none">
					<td>Id: </td>
					<td style="text-align: left;">
						<input type="text" name="id" value="${update.jid }">
					</td>
				  </tr>
				  
				  </table><br/>
				  <div class="col-md-3"></div>
					<input type="submit" class="btn btn-success" value="Update"> 
			   	</form>
			</div>
		</c:when>
		
		<c:when test="${param.uflag==2}">
			<div class="container-fluid" >
			<div class="col-md-3"></div>
				<form method="post" action="updateitemdao" name="update">
				  <table border="0" width="720px">
				  <tr >
					<td >Item name: </td>
					<td style="text-align: left;">
						<input type="text" name="name"  value="${update.mname }"></td>
				  </tr>
				  <tr>
					<td>Price: </td>
					<td style="text-align: left;">
						<input type="text" name="price" value="${update.mprice }">
					</td>
				  </tr>
				  <tr>
					<td>Stock: </td>
					<td style="text-align: left;">
						<input type="text" name="stock" value="${update.mstock }">
					</td>
				  </tr>
				  <tr>
					<td>Type: </td>
					<td style="text-align: left;">
						<input type="text" name="flag" value="${update.mflag }" readonly>
		　			</td>
				  </tr>
				  <tr>
					<td>Promotion: </td>
					<td style="text-align: left;">
						<input type="text" name="promotion" value="${update.mpromotion }">
		　			</td>
				  </tr>
				  <tr>
					<td>Discount: </td>
					<td style="text-align: left;">
						<input type="text" name="off" value="${update.moff }">
					</td>
				  </tr>
				  <tr>
					<td>Promotion date: </td>
					<td style="text-align: left;">
						<input id="d12" type="text" name="begin" value="${update.mbegin }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
						to <input type="text" name="end" value="${update.mend }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
					</td>
				  </tr>
				  <tr>
					<td>Description: </td>
					<td style="text-align: left;"><textarea name="desc" rows="3" cols="22" value>${update.mdesc }</textarea></td>
				  </tr>
				  
				  <tr style="display:none">
					<td>Id: </td>
					<td style="text-align: left;">
						<input type="text" name="id" value="${update.mid }">
					</td>
				  </tr>
				  
				  </table><br/>
				  <div class="col-md-3"></div>
					<input type="submit" class="btn btn-success" value="Update"> 
			   	</form>
			</div>
		</c:when>
		
		
		<c:when test="${param.uflag==3}">
			<div class="container-fluid" >
			<div class="col-md-3"></div>
				<form method="post" action="updateitemdao" name="update">
				  <table border="0" width="720px">
				  <tr >
					<td >Item name: </td>
					<td style="text-align: left;">
						<input type="text" name="name"  value="${update.pname }"></td>
				  </tr>
				  <tr>
					<td>Price: </td>
					<td style="text-align: left;">
						<input type="text" name="price" value="${update.pprice }">
					</td>
				  </tr>
				  <tr>
					<td>Stock: </td>
					<td style="text-align: left;">
						<input type="text" name="stock" value="${update.pstock }">
					</td>
				  </tr>
				  <tr>
					<td>Type: </td>
					<td style="text-align: left;">
						<input type="text" name="flag" value="${update.pflag }" readonly>
		　			</td>
				  </tr>
				  <tr>
					<td>Promotion: </td>
					<td style="text-align: left;">
						<input type="text" name="promotion" value="${update.ppromotion }">
		　			</td>
				  </tr>
				  <tr>
					<td>Discount: </td>
					<td style="text-align: left;">
						<input type="text" name="off" value="${update.poff }">
					</td>
				  </tr>
				 <tr>
					<td>Promotion date: </td>
					<td style="text-align: left;">
						<input id="d12" type="text" name="begin" value="${update.pbegin }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
						to <input type="text" name="end" value="${update.pend }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
					</td>
				  </tr>
				  <tr>
					<td>Description: </td>
					<td style="text-align: left;"><textarea name="desc" rows="3" cols="22" value>${update.pdesc }</textarea></td>
				  </tr>
				  
				  <tr style="display:none">
					<td>Id: </td>
					<td style="text-align: left;">
						<input type="text" name="id" value="${update.pid }">
					</td>
				  </tr>
				  
				  </table><br/>
				  <div class="col-md-3"></div>
					<input type="submit" class="btn btn-success" value="Update"> 
			   	</form>
			</div>
		</c:when>
		
		<c:when test="${param.uflag==4}">
			<div class="container-fluid" >
			<div class="col-md-3"></div>
				<form method="post" action="updateitemdao" name="update">
				  <table border="0" width="720px">
				  <tr >
					<td >Item name: </td>
					<td style="text-align: left;">
						<input type="text" name="name"  value="${update.sname }"></td>
				  </tr>
				  <tr>
					<td>Price: </td>
					<td style="text-align: left;">
						<input type="text" name="price" value="${update.sprice }">
					</td>
				  </tr>
				  <tr>
					<td>Stock: </td>
					<td style="text-align: left;">
						<input type="text" name="stock" value="${update.sstock }">
					</td>
				  </tr>
				  <tr>
					<td>Type: </td>
					<td style="text-align: left;">
						<input type="text" name="flag" value="${update.sflag }" readonly>
		　			</td>
				  </tr>
				  <tr>
					<td>Promotion: </td>
					<td style="text-align: left;">
						<input type="text" name="promotion" value="${update.spromotion }">
		　			</td>
				  </tr>
				  <tr>
					<td>Discount: </td>
					<td style="text-align: left;">
						<input type="text" name="off" value="${update.soff }">
					</td>
				  </tr>
				  <tr>
					<td>Promotion date: </td>
					<td style="text-align: left;">
						<input id="d12" type="text" name="begin" value="${update.sbegin }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
						to <input type="text" name="end" value="${update.send }" autocomplete="off"  onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd',lang:'en'})" />
					</td>
				  </tr>
				  <tr>
					<td>Description: </td>
					<td style="text-align: left;"><textarea name="desc" rows="3" cols="22" value>${update.sdesc }</textarea></td>
				  </tr>
				  
				  <tr style="display:none">
					<td>Id: </td>
					<td style="text-align: left;">
						<input type="text" name="id" value="${update.sid }">
					</td>
				  </tr>
				  
				  </table><br/>
				  <div class="col-md-3"></div>
					<input type="submit" class="btn btn-success" value="Update"> 
					
			   	</form>
			</div>
		</c:when>
		
	</c:choose>
	
	
	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>