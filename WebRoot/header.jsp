<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container-fluid">
	<div class="col-md-9">
		<img src="img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline" style="padding-right:0px">
		    <%-- <li><a href="#" ><%=session.getAttribute("username")==null?"":session.getAttribute("username")%></a></li> --%>
			<%-- <li><a href="#" >Admin: ${sessionScope.username_admin==null?"":sessionScope.username_admin }</a></li> --%>
			<li><a href="editprofile" >${sessionScope.username==null?"":sessionScope.username }</a></li>
			<li><a href="login.jsp">Login</a></li>
			<li><a href="register.jsp">Register</a></li>
			<li><a href="cartservlet">${sessionScope.username==null?"":"Cart" }</a></li>
			<li><a href="orderhistory">${sessionScope.username==null?"":"Order" }</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid" >
	<nav class="navbar navbar-default" >
		<div class="container-fluid" >
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">Home</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li ><a href="/CS741/jerseyservlet">Jersey<span class="sr-only">(current)</span></a></li>
					<li ><a href="/CS741/shoesservlet">Footwear<span class="sr-only">(current)</span></a></li>
					<li><a href="/CS741/posterservlet">Poster</a></li>
					<li><a href="/CS741/movieservlet">Movie</a></li>
				</ul>
				<form action="searchheader" class="navbar-form navbar-right" role="search" method="post">
					<div class="form-group">
						<input type="text" name="mainSearch" class="form-control" autocomplete="off" placeholder="Search by name"/>
					</div>
					<input type="submit" value="Search" class="btn btn-default"</button>
				</form>
			</div>
		</div>
	</nav>
</div>