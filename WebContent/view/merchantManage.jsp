<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8" />

	<title>admin</title>

	<!-- The Main CSS File -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css" />
  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	</head>
<body>


	
	<!--==================================================== 4 yuan =============================================== -->
	<header class="main_header">
		<div class="wrapper">
			<nav class="top_buttons">
				<ul>
					<li class="big_button">
						<div class="big_count">
							<span>7</span>
						</div>
						<div class="out_border">
							<div class="button_wrapper">
								<div class="in_border">
									<a href="#" title="Support" class="the_button">
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

	<!-- =========================侧边栏目          start ========================================================-->


	<div class="wrapper contents_wrapper">
		
		<aside class="sidebar">
			<ul class="tab_nav">
				<li class=" i_32_dashboard">
					<a href="index.jsp" title="General Info">
						<span class="tab_label">首   页</span>
						<span class="tab_info">Index</span>
					</a>
				</li>
				<li class="active_tab i_32_dashboard">
					<a href="merchantManage.jsp" title="General Info">
						<span class="tab_label">商家管理</span>
						<span class="tab_info">Merchant Manage</span>
					</a>
				</li>
				<li class=" i_32_dashboard">
					<a href="chefDish.jsp" title="General Info">
						<span class="tab_label">推荐菜品</span>
						<span class="tab_info">Main Dish</span>
					</a>
				</li>
				<li class=" i_32_dashboard">
					<a href="scoreManage.jsp" title="General Info">
						<span class="tab_label">低评商家</span>
						<span class="tab_info">Score Manage</span>
					</a>
				</li>
			</ul>
		</aside>
		<!-- ==================侧边栏目    end ===================================================================== -->

		<div class="contents">
			<div class="grid_wrapper">
				<div class="g_6 contents_header">
					<h3 class="i_16_dashboard tab_label">商家管理</h3>
					<div><span class="label">Merchant Manage</span></div>
				</div>
				
				<div class="g_12 separator"><span></span></div>
				
				<div class="g_12 ">
						<table class="tables" >
							<th>身份证图片</th><th>身份证号</th><th>姓名</th><th>电话</th><th>店名</th><th>地址</th><th>状态</th>
							<!-- 
							<tr>
								<td><img class="img-circle" src="${pageContext.request.contextPath}/res/images/kanrisha_logo.png" style="width:80%;height:100%;"/></td>
								<td>22444444444444</td>
								<td>22444</td>
								<td>24444444442</td>
								<td>ddsfsdfsdfsdfdf</td>
								<td>fsfsdf22</td>
								<td>22sdfs</td>
							</tr> -->
							<tbody id="merchant_data_table"></tbody>
						</table>
						<div align="center"><button class="success">前一页</button><button class="success" id="btn_next">后一页</button></div>
				</div>

			</div>
		</div>
	</div>
<script type="text/javascript" src="../res/js/jquery.min.js"></script>
<script type="text/javascript" src="../res/js/merchantManage.js"></script>
</body>
</html>