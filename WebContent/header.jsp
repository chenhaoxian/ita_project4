<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- The Main CSS File -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css" />
  
<title>Insert title here</title>
<style>
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

<header class="main_header">
		<div class="wrapper">
			<nav class="top_buttons">
				<ul>
					<li class="big_button">
						<div class="big_count">
							<span>1</span>
						</div>
						<div class="out_border">
							<div class="button_wrapper">
								<div class="in_border">
									<a href="#" title="Support" class="the_button">
										<span class="i_32_support" onclick="showdiv();"></span>
									</a>
								</div>
							</div>
						</div>
					</li>
					
				</ul>
			</nav>
		</div>
	</header>
</head>
<div id="show" align="center">
	<h1 align="center">用户投诉</h1>
	<br><br><br>
	
	
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
<body>

</body>
</html>