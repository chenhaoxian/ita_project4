<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />

<title>admin</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/autocomplete.css" />

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<!-- =========================侧边栏目          start ========================================================-->


	<div class="wrapper contents_wrapper">

		<aside class="sidebar">
		<ul class="tab_nav">
			<li class=" i_32_dashboard"><a
				href="${pageContext.request.contextPath}/view/index.jsp"
				title="General Info"> <span class="tab_label">首 页</span> <span
					class="tab_info">Index</span>
			</a></li>
			<li class=" i_32_dashboard"><a
				href="${pageContext.request.contextPath}/view/merchantManage.jsp"
				title="General Info"> <span class="tab_label">注册管理</span> <span
					class="tab_info">Merchant Manage</span>
			</a></li>
			<li class=" i_32_dashboard"><a
				href="${pageContext.request.contextPath}/view/chefDish.jsp"
				title="General Info"> <span class="tab_label">推荐菜品</span> <span
					class="tab_info">Main Dish</span>
			</a></li>
			<li class=" i_32_dashboard"><a
				href="${pageContext.request.contextPath}/view/scoreManage.jsp"
				title="General Info"> <span class="tab_label">低评商家</span> <span
					class="tab_info">Score Manage</span>
			</a></li>
			<li class=" i_32_dashboard "><a
				href="${pageContext.request.contextPath}/order/get/orderPage"
				title="General Info"> <span class="tab_label">投诉订单</span> <span
					class="tab_info">Complaint Order</span>
			</a></li>
			<li class=" i_32_dashboard active_tab"><a
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
					<h3 class="i_16_dashboard tab_label">商家管理</h3>
					<div></div>
				</div>

				<div class="g_12 separator">
					<span></span>
				</div>

				<div class="g_12 ">
					<div>
						<table>
							<tr id="search_student_table_tr">
								<td class="labelText"><h4 class="tab_label" style="padding-top:0;">电话号码：</h4></td>
								<td >&nbsp;</td>
								<td ><input type="text" class="form-control" id="input_tel" size="50" name="searchValue"></td>
								<td >&nbsp;</td>
								<td ><button type="button" class="button button-tiny" id="btn_search_tel" >搜索</button></td>
							</tr>
						</table>
					</div>
				</div>

				<div class="g_12">
					<table class="tables">
						<thead>
							<tr class="success" >
								<th class="success">姓名</th>
								<th class="success">电话</th>
								<th class="success">身份证号</th>
								<th class="success">店名</th>
								<th class="success">地址</th>
								<th class="success">状态</th>
								<th class="success">操作</th>
							</tr>
						</thead>
						<tbody id="merchant_data_table">
						</tbody>
					</table>
				</div>


			</div>
		</div>

	</div>

	<script type="text/javascript" src="../res/js/jquery.min.js"></script>
	<script type="text/javascript" src="../res/js/jquery.autocomplete.min.js"></script>
	<script type="text/javascript" src="../res/js/search.js"></script>
</body>
</html>