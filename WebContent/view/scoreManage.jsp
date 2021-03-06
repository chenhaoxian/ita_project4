<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8" />
	<title>admin</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<!-- =========================侧边栏目          start ========================================================-->

	<div class="wrapper contents_wrapper">
		<aside class="sidebar">
			<ul class="tab_nav">
				<li class=" i_32_dashboard">
					<a href="${pageContext.request.contextPath}/view/index.jsp" title="General Info">
						<span class="tab_label">首   页</span>
						<span class="tab_info">Index</span>
					</a>
				</li>
				<li class=" i_32_dashboard">
					<a href="${pageContext.request.contextPath}/view/merchantManage.jsp" title="General Info">
						<span class="tab_label">注册管理</span>
						<span class="tab_info">Merchant Manage</span>
					</a>
				</li>
				<li class=" i_32_dashboard">
					<a href="${pageContext.request.contextPath}/view/chefDish.jsp" title="General Info">
						<span class="tab_label">推荐菜品</span>
						<span class="tab_info">Main Dish</span>
					</a>
				</li>
				<li class=" i_32_dashboard active_tab">
					<a href="${pageContext.request.contextPath}/view/scoreManage.jsp" title="General Info">
						<span class="tab_label">低评商家</span>
						<span class="tab_info">Score Manage</span>
					</a>
				</li>
				<li class=" i_32_dashboard ">
					<a href="${pageContext.request.contextPath}/order/get/orderPage" title="General Info">
						<span class="tab_label">投诉订单</span>
						<span class="tab_info">Complaint Order</span>
					</a>
				</li>
				<li class=" i_32_dashboard"><a
				href="${pageContext.request.contextPath}/view/search.jsp"
				title="General Info"> <span class="tab_label">商家管理</span> <span
					class="tab_info">Index</span>
			</a></li>
			</ul>
		</aside>
		<!-- ==================侧边栏目    end ===================================================================== -->

		<div class="contents">
			<div class="grid_wrapper">

				<div class="g_6 contents_header">
					<h3 class="i_16_dashboard tab_label">低 评 商 家</h3>
					<div><span class="label">Low Rating Businesses</span></div>
				</div>
				

				<div class="g_12 separator"><span></span></div>
				
				<div class="g_12 ">
						<table class="tables" >
							<th>姓名</th><th>电话</th><th>店名</th><th>地址</th><th>店铺分数</th><th>状态</th>
							<tbody id="lowMerchant_data_table"></tbody>
						</table>
						<div align="center"><button class="button button-tiny" id="btn_previous">Prev</button>&nbsp;<button class="button button-tiny" id="btn_next">next</button></div>
				</div>

			</div>
		</div>

	</div>

<script type="text/javascript" src="../res/js/jquery.min.js"></script>
<script type="text/javascript" src="../res/js/scoreManage.js"></script>
</body>
</html>