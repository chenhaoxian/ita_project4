<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8" />

	<title>admin</title>

	<!-- The Main CSS File -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/buttons.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/wlc.css" />
	
  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css">
	#show {
		display: none;
		position: absolute;
		top: 25%;
		left: 22%;
		width: 53%;
		height: 49%;
		padding: 8px;
		border: 8px solid #E8E9F7;
		background-color: white;
		z-index: 1002;
		overflow: auto;
	}
	</style>
	
	</head>
<body>


	
	<!--==================================================== 4 yuan =============================================== -->
	<header class="main_header">
		<div class="wrapper">
			<nav class="top_buttons">
				<ul>
					<li class="big_button">
						<div class="big_count">
							<span id="span_complaint">7</span>
						</div>
						<div class="out_border">
							<div class="button_wrapper">
								<div class="in_border">
									<a href="javascript:showdiv()" title="Support" class="the_button">
										<span class="i_32_support"></span>
									</a>
								</div>
							</div>
						</div>
					</li>
					
				</ul>
			</nav>
		</div>
	</header>
	
	
	
	<div id="show" align="center">
	<h1 align="center">请登录</h1>
	<br><br><br>
	邮箱：<input id="userEmail" type="text"><br><br>
	密码：<input id="password" type="password"><br><br><br>
	<button id="btn_login" onclick="login_check()">登录</button><br><br><br><br>
	<br>
	<input id="btnclose" type="button" value="Close" onclick="hidediv();" /><br>
</div>

	

<script language="javascript" type="text/javascript">

		function showdiv() {
			document.getElementById("show").style.display = "block";
		}
		function hidediv() {
			document.getElementById("show").style.display = 'none';
		}
	</script>

</body>
</html>