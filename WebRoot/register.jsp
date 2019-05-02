<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Register Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script>
			var input_password ;
			var uPass ;
			 function checkUsername(){
				var inputObj = document.getElementById("username");
				var uValue = inputObj.value;
				var span = document.getElementById("span_username");
				if(uValue.length < 6 || uValue.length>15){
					<!-- alert("Sorry, the length of username is invaild, please check it again"); -->
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
				span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
				return true;
				}
			} 
			function checkPassword(){
				 input_password = document.getElementById("password");
				 uPass = input_password.value;
				 var span = document.getElementById("span_password");
				if(!/^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/.test(uPass)){
					<!--alert("Sorry, format of password is invaild, please check it again");-->
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
				span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
					return true;
					}
			}
			function checkConfirmpwd(){
				var input_repassword = document.getElementById("confirmpwd");
				var uRePass = input_repassword.value;
				var span = document.getElementById("span_confirm");
				if(uPass != uRePass){
					<!--alert("Your passwords do not match! Please check them again");-->
					span.innerHTML = "<span style='color:#F00;'>Password dismatched!</span>";
					return false;	
				}else {
				span.innerHTML ="<span style='color:#66CD00;'>Password matched!</span>";
					return true;
				}
			}
			
			function checkFirstName(){
				var input_firstname = document.getElementById("usercaption");
				var ufirstname = input_firstname.value;
				var span = document.getElementById("span_first");
				if(!/^[A-Za-z]+$/.test(ufirstname)){
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
				span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
					return true;
				}
			}
			
			function checkLastName(){
				var input_lastname = document.getElementById("userlast");
				var ulastname = input_lastname.value;
				var span = document.getElementById("span_last");
				if(!/^[A-Za-z]+$/.test(ulastname)){
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
				span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
					return true;
				}
			}
			
			
				function checkEmail(){
				var input_eamil = document.getElementById("inputEmail3");
				var uEmail = input_eamil.value;
				var span = document.getElementById("span_email");
				if(! /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/.test(uEmail)){
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
					span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
					return true;
				}
			}
			
			function checkTel(){
				var input_tel = document.getElementById("tel");
				var uTel = input_tel.value;
				var span = document.getElementById("span_tel");
				/* var matchStr = /^(((1(\s|))|)\([1-9]{3}\)(\s|-|)[1-9]{3}(\s|-|)[1-9]{4})$/;
  				var matchStr2 = /^(((1(\s)|)|)[1-9]{3}(\s|-|)[1-9]{3}(\s|-|)[1-9]{4})$/; */
				//   '/^[a-zA-Z0-9]{6,10}$/'
				if(!/^[0-9]{10}$/.test(uTel)){
					span.innerHTML = "<span style='color:#F00;'>Sorry, format incorrect!</span>";
					return false;	
				}else {
					span.innerHTML ="<span style='color:#66CD00;'>Format correct!</span>";
					return true;
				}
			}
			/*
			function checkCard(){
				var input_card = document.getElementById("card");
				var uCard = input_card.value;
				var span = document.getElementById("span_card");
				if(!/^[0-9]{16}$/.test(uCard)){
					span.innerHTML = "<font color='red' size='2'>Sorry, format incorrect!</font>";
					return false;
				}else {
					span.innerHTML ="<font color='red' size='2'>Format correct!</font>";
					return true;
				}
			 }
			 */
			 function checkForm(){
				var flag = checkUsername() && checkPassword() &&checkConfirmpwd()&&checkFirstName()&&checkLastName()&& checkMail()&&checkTel();
				return flag;
			}
			
			
</script>
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


#red-text{
color:red;
}

font {
	color: #3164af;
	font-size: 18px;
	font-weight: normal;
	padding: 0 10px;
}
</style>
</head>
<body>

	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>

	<div class="container"
		style="width: 100%; background: url('image/rr.jpg');">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8"
				style="background: #fff; padding: 40px 80px; margin: 30px; border: 7px solid #ccc;">
				<font>CUSTOMER REGISTER</font>
				<div style="color:#F00"><%=request.getAttribute("registerInfo")==null?"":request.getAttribute("registerInfo")%></div>
			
				<form class="form-horizontal" style="margin-top: 5px;margin-left: 200px;" action="/CS741/register" method="post" onsubmit="return checkForm()">
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label" >Username</label>
						<div class="col-sm-6">
							<input type="text" onblur="checkUsername()" class="form-control" id="username" name="username"
								placeholder="Length is between 6 to 15"></span><span id="span_username"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="password"   class="col-sm-2 control-label">Password</label>
						<div class="col-sm-6">
							<input type="password" onblur="checkPassword()" class="form-control" id="password"  name="password"
								placeholder="Please enter password in right way"><span id="span_password"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="confirmpwd" class="col-sm-2 control-label">Confirm</label>
						<div class="col-sm-6">
							<input type="password"  onblur="checkConfirmpwd()" class="form-control" id="confirmpwd" name="confirmpwd"
								placeholder="Please enter password again"><span id="span_confirm"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="usercaption" class="col-sm-2 control-label">Firstname</label>
						<div class="col-sm-6">
							<input type="text" onblur="checkFirstName()" class="form-control" id="usercaption" name="firstname"
								placeholder="Letter only"><span id="span_first"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="userlast" class="col-sm-2 control-label">Lastname</label>
						<div class="col-sm-6">
							<input type="text"  onblur="checkLastName()" class="form-control" id="userlast" name="lastname"
								placeholder="Letter only"><span id="span_last"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
						<div class="col-sm-6">
							<input type="text"  onblur="checkEmail()" class="form-control" id="inputEmail3"  name="email"
								placeholder="Your email address"><span id="span_email"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="tel" class="col-sm-2 control-label">Tel</label>
						<div class="col-sm-6">
							<input type="text" onblur="checkTel()" class="form-control" id="tel"  name="tel"
								placeholder="Your phone number"><span id="span_tel"></span>
						</div>
					</div>
					<div class="form-group">
						<label for="date" >Password format:</label>
						<div >
							<label>Minimum 6 bits, including at least 1 capital, 1 lowercase, 1 number,1 special character</label>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input class="btn btn-success" type="submit" width="100" value="Register" name="submit" >
						</div>
					</div>
				</form>
				
			</div>

			<div class="col-md-2"></div>

		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>




