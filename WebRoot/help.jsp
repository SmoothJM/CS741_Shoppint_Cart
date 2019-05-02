<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
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

<div class="container-fluid">
	<div class="col-md-3"></div>
	
	<div class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Introduction</h3>
	  </div>
	  <div class="panel-body">
	    Greetings, my dear customer. 
	    This <a href="http://localhost:8080/CS741/Help Document.docx" download="Help Document.docx">page(Click to download help document)</a> helps you enjoy Kyrie Irving Mall better. 
	    You can find the following information here: register, login, browser, search, cart, purchase, order and personal information. 
	    If you still have question. 
	    Please contact our customer service: 1-(608)-667-6188.
		Thank you again for choosing Kyrie Irving Mall.
	    Enjoy yourself!
	    <li><a href="#1">Register</a></li>
		<li><a href="#2">Login</a></li>
		<li><a href="#3">Browser</a></li>
		<li><a href="#4">Search</a></li>
		<li><a href="#5">Cart</a></li>
		<li><a href="#6">Purchase</a></li>
		<li><a href="#7">Order</a></li>
	  </div>
	</div>
	
	<div id="1" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Register&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3> 
	  </div>
	  <div class="panel-body">
	  	Kyrie Irving Mall only serves for register customer. 
	  	If you like Kyrie, join us as soon as possible! 
	  	You can click "Register" link which locates top right of each web page.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/1.png" width="1000" height="470"></div>
	  	<br/><br/><br/>
	  	After click "Register" link, you will enter the register page. 
	  	Just a reminder, all the personal information you should better enter by correct format, if not there will be some tips for you when you got a mistake. 
	  	If you register successful, the page will jump to register page automatically.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/2.png" width="1000" height="470"></div>
	  </div>
	</div>
	
	<div  id="2" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	After you registered, you can click "Login" link which locates top right of each web page.
	  	After you login, there will display more link on the top right of each page.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/3.png" width="1000" height="470"></div>
	  </div>
	</div>
	
	<div id="3" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Browser&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	Whatever you are guest or register customer all can browsers item of this mall. 
	  	There are total four types of items you can buy. 
	  	You can see them at the navigation bar.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/4.png" width="1000" height="470"></div>
	  	<br/><br/><br/>
	  	You can also view details of items when you click the picture or name of items. 
	  	And you can add item into your cart after login.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/5.png" width="1000" height="470"></div>
	  </div>
	</div>
	
	<div id="4"  class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Search&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	You can use the search function locates right of navigation bar for searching the item you want. 
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/6.png" width="1000" height="470"></div>
	  </div>
	</div>

	<div  id="5" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Cart&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	You can click "Cart" link to view your cart. 
	  	You can click check button to the next step.
	  	And you can change quantity for each item. 
	  	If there is valid promotion, you can apply it. 
	  	The system will give you corresponding discount.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/7.png" width="1100" height="470"></div>
	  	<br/><br/><br/>
	  	In next step, you can edit your profile.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/8.png" width="1000" height="470"></div>
	  	<br/><br/><br/>
	  	You can also change your profile when you click your username locates top right of each page after you login.
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/9.png" width="1000" height="470"></div>
	  </div>
	</div>
	
	<div  id="6" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Purchase&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	In the final step of purchase, you can got the discount of promote item. 
	  	There will be the tax rate and total cost for this order. 
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/10.png" width="1000" height="470"></div>
	</div>
	  
	</div>
	<div  id="7" class="panel panel-primary">
	  <div class="panel-heading">
	    <h3 class="panel-title">Order&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <a class="glyphicon glyphicon-plane" href="#top" style="color:#FFFFFF"></a></h3>
	  </div>
	  <div class="panel-body">
	  	The history order will be generated after you confirm your purchase. 
	  	You can click "Order" link locates top right of each page after you login to view all your history order. 
	  	Shown as following figure.
	  	<br/><br/><br/>
	  	<div><img src="help/11.png" width="1200" height="470"></div>
	  </div>
	</div>
	
</div>




<jsp:include page="/footer.jsp"></jsp:include>



</body>
</html>