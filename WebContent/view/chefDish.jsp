<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8" />

	<title>admin</title>

	<!-- The Main CSS File -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css" />
  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
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
				<li class=" i_32_dashboard">
					<a href="merchantManage.jsp" title="General Info">
						<span class="tab_label">商家管理</span>
						<span class="tab_info">Merchant Manage</span>
					</a>
				</li>
				<li class="active_tab i_32_dashboard">
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
					<h3 class="i_16_dashboard tab_label">首   页</h3>
					<div><span class="label">Index</span></div>
				</div>
				

				<div class="g_12 separator"><span></span></div>
				

				<!-- Quick Statistics -->
				<!-- 
				<div class="g_3 quick_stats">
					<div class="big_stats visitor_stats">
						${sessionScope.student.credit.required }
					</div>
					<h5 class="stats_info">必修学分</h5>
				</div>
				 -->
				 <!-- 
				<div class="g_3 quick_stats">
					<div class="big_stats tickets_stats">
						${sessionScope.student.credit.selected }
					</div>
					<h5 class="stats_info">已选学分</h5>
				</div>
				
				 -->
				<!-- 
				<div class="g_3 quick_stats">
					<div class="big_stats users_stats">
						${sessionScope.student.credit.common }
					</div>
					<h5 class="stats_info">通选学分</h5>
				</div>
				
				<div class="g_3 quick_stats">
					<div class="big_stats orders_stats">
						${sessionScope.student.credit.required +sessionScope.student.credit.selected+sessionScope.student.credit.common}
					</div>
					<h5 class="stats_info">已选学分</h5>
				</div>
				 -->
				<!-- Separator -->
				<!-- <div class="g_12 separator"><span></span></div> -->
				
				<!-- 头像 -->
				<!-- 
				<div class="g_6">
				
					
					
					<div class="span4">
						<table style="width: 100%">
							<tr>
								<td align="center">
									<img class="img-circle" alt="140x140" src="${pageContext.request.contextPath}/res/images/avatar.jpg" style="width:150px;height:150px;"/>
								</td>
							</tr>
						</table>
					</div>
				</div>
					
					
				<div class="g_12">
					<div class="widget_header">
						<h4 class="widget_header_title wwIcon i_16_add">姓名</h4>
					</div>
					<div class="widget_contents">
					${sessionScope.student.sname }
					</div>
				</div>
				
				<div class="g_12">
					<div class="widget_header">
						<h4 class="widget_header_title wwIcon i_16_add">学号</h4>
					</div>
					<div class="widget_contents">
						${sessionScope.student.sno}
					</div>
				</div>
				
				<div class="g_12">
					<div class="widget_header">
						<h4 class="widget_header_title wwIcon i_16_add">年级</h4>
					</div>
					<div class="widget_contents">
					 ${sessionScope.student.grade }年级 
					</div>
				</div>
				
				<div class="g_12">
					<div class="widget_header">
						<h4 class="widget_header_title wwIcon i_16_add">专业</h4>
					</div>
					<div class="widget_contents">
						${sessionScope.student.profession.professionName }
					</div>
				</div>
				
				<div class="g_12">
					<div class="widget_header">
						<h4 class="widget_header_title wwIcon i_16_add">学院</h4>
					</div>
					<div class="widget_contents">
						${sessionScope.student.profession.department.departmentName }
					</div>
				</div>
				 -->
				
				

			</div>
		</div>

	</div>

<script type="text/javascript" src="../res/js/jquery.min.js"></script>
<script type="text/javascript" src="../res/js/index.js"></script>
</body>
</html>