<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jersey</title>
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
</head>

<body>
	<jsp:include page="/header.jsp"></jsp:include>
	
		<div class="row" style="width: 1210px; margin: 0 auto;">
			<c:forEach items="${jerseyList }" var="jersey">
				<%-- <c:if test="${jersey.jflag==1 }"> --%>
					<div class="col-md-3" style="height:250px">
						<a href="/CS741/jerseyinformationservlet?jid=${jersey.jid }"> 
							<img src="${pageContext.request.contextPath }/${jersey.jimage }" width="170" height="170" style="display: inline-block;">
						</a>
						<p>
							<a href="/CS741/jerseyinformationservlet?id=${jersey.jid }" style='color: grey'>${jersey.jname }</a>
						</p>
						<p>
							<font color="#FF0000">Price: &dollar;${jersey.jprice }</font>
						</p>
					</div>
			</c:forEach>
		</div>
	
	
	
	<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>