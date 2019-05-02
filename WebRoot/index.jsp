<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Welcome to Kyrie Irving Mall</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">
			<!-- import header.jsp -->
			<jsp:include page="/header.jsp"></jsp:include>
			<!-- change img-->
			<div class="container-fluid">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- 轮播图的中的小点 -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						<li data-target="#carousel-example-generic" data-slide-to="3"></li>
						<li data-target="#carousel-example-generic" data-slide-to="4"></li>
						<li data-target="#carousel-example-generic" data-slide-to="5"></li>
					</ol>
					<!-- 轮播图的轮播图片 -->
					<div class="carousel-inner" role="listbox" >
						<div class="item active">
							<img src="main/1.png" >
							<div class="carousel-caption">
								 Enjoy Shopping
							</div>
						</div>
						<div class="item">
							<img src="main/3.png" >
							<div class="carousel-caption">
								Same Jerseys On Sale
							</div>
						</div>
						<div class="item">
							<img src="main/4.png">
							<div class="carousel-caption">
								Get More Poster
							</div>
						</div>
												<div class="item">
							<img src="main/5.png">
							<div class="carousel-caption">
								Cavalier & Celtics
							</div>
						</div>
												<div class="item">
							<img src="main/6.png">
							<div class="carousel-caption">
								Uncle Drew DVD
							</div>
						</div>
												<div class="item">
							<img src="main/7.png">
							<div class="carousel-caption">
								Latest Version
							</div>
						</div>
					</div>

					<!-- 上一张 下一张按钮 -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			
			<!-- Footwear -->
			<div class="container-fluid">
				<div class="col-md-12">
					<h2>Footwear&nbsp;&nbsp;</h2>
				</div>
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=1">
							<img src="shoes/11.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=1" style='color:#666'>Kyrie 1 Independence</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;499.98</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=2">
							<img src="shoes/12.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=2" style='color:#666'>Kyrie 1 Australia</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;259.98</font></p>
					</div>

					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=3">
							<img src="shoes/14.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=3" style='color:#666'>Kyrie 1 Grey-Infrared</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;229.98</font></p>
					</div>
					
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=4">
							<img src="shoes/19.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=4" style='color:#666'>Kyrie 1 White</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;239.98</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=5">
							<img src="shoes/17.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=5" style='color:#666'>Kyrie 1 Platinum</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;269.98</font></p>
					</div>

					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=6">
							<img src="shoes/18.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=6" style='color:#666'>Kyrie 1 Lmtd</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;359.98</font></p>
					</div>
					
					<!-- second row -->
					<div class="col-md-2 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=7">
							<img src="shoes/41.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=7" style='color:#666'>Kyrie 4 Navy</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;120.99</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=8">
							<img src="shoes/42.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=8" style='color:#666'>Kyrie 4 Gray Black</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;129.98</font></p>
					</div>

					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=9">
							<img src="shoes/411.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=9" style='color:#666'>Kyrie 4 Amarillo</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;129.98</font></p>
					</div>
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=12">
							<img src="shoes/412.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=12" style='color:#666'>Kyrie 4 Bright Crimson</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;129.98</font></p>
					</div>
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=10">
							<img src="shoes/413.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=10" style='color:#666'>Kyrie 4 Amarillo/Black</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;129.98</font></p>
					</div>
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/shoesinformationservlet?sid=11">
							<img src="shoes/415.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/shoesinformationservlet?sid=11" style='color:#666'>kyrie 4 March Madness</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;129.98</font></p>
					</div>
				<!-- </div> -->
			</div>
			
			
            <div class="container-fluid">
				
			</div>
			
			<!-- Jersey -->
			<div class="container-fluid">
				<div class="col-md-12">
					<h2>Jersey&nbsp;&nbsp;</h2>
				</div>
				<!-- <div class="col-md-2" style="border:1px solid #E7E7E7;border-right:0;padding:0;">
					<img src="products/hao/big01.jpg" width="205" height="404" style="display: inline-block;"/>
				</div> -->
				<div class="col-md-12">
					<!-- <div class="col-md-6" style="text-align:center;height:200px;padding:0px;">
						<a href="#">
							<img src="products/hao/middle01.jpg" width="516px" height="200px" style="display: inline-block;">
						</a>
					</div> -->
				
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=2">
							<img src="jersey/2.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=2" style='color:#666'>Celtics Green</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;89.98</font></p>
					</div>
	
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=3">
							<img src="jersey/3.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=3" style='color:#666'>Celtics W-Black</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;69.98</font></p>
					</div>

					<div class="col-md-3 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=5">
							<img src="jersey/5.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=5" style='color:#666'>Celtics Black</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;89.98</font></p>
					</div>
					
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=8">
							<img src="jersey/8.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=8" style='color:#666'>Celtics White</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;89.98</font></p>
					</div>
	
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=1">
							<img src="jersey/1.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=1" style='color:#666'>Cavalier Red</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;79.98</font></p>
					</div>

					<div class="col-md-3 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=7">
							<img src="jersey/7.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=7" style='color:#666'>All Start</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;109.98</font></p>
					</div>
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=4">
							<img src="jersey/4.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=4" style='color:#666'>Cavalier Dark</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;79.98</font></p>
					</div>
	
					<div class="col-md-3" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="/CS741/jerseyinformationservlet?jid=6">
							<img src="jersey/6.png" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="/CS741/jerseyinformationservlet?jid=6" style='color:#666'>Cavalier White</a></p>
						<p><font color="#E4393C" style="font-size:16px">&dollar;79.98</font></p>
					</div>
				</div>
			</div>			
			
			<!-- 引入footer.jsp -->
			<jsp:include page="/footer.jsp"></jsp:include>
			
		</div>
	</body>

</html>