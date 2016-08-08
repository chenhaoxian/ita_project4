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


	
	<!--==================================================== 4 yuan =============================================== 
	

	<!-- =========================侧边栏目          start ========================================================-->
	<div class="wrapper small_menu">
		<ul class="menu_small_buttons">
			<li><a title="个人 信息" class="i_22_dashboard smActive" href=""></a></li>
			<!-- <li><a title="选课" class="i_32_ui" href="${pageContext.request.contextPath}/student/findAllCourseTongXuan.do?flag=1&sno=${sessionScope.student.sno }"></a></li>
			<li><a title="查看课程" class="i_32_tables" href="${pageContext.request.contextPath}/student/findSelectCourse.do?sno=${sessionScope.student.sno }"></a></li>
			
			<li><a title="Kit elements" class="i_22_ui" href="ui.html"></a></li>			
			<li><a title="Some Rows" class="i_22_tables" href="tables.html"></a></li>
			<li><a title="Some Fields" class="i_22_forms" href="forms.html"></a></li>
			-->
		</ul>
		
	</div>

	<div class="wrapper contents_wrapper">
		
		<aside class="sidebar">
			<ul class="tab_nav">
				<li class="active_tab i_32_dashboard">
					<a href="" title="General Info">
						<span class="tab_label">个人信息</span>
						<span class="tab_info">Person Info</span>
					</a>
				</li>
				<!-- <li class="i_32_ui">
					<a href="${pageContext.request.contextPath}/student/findAllCourseTongXuan.do?flag=1&sno=${sessionScope.student.sno }" title="Your Messages">
						<span class="tab_label">选课</span>
						<span class="tab_info">Select course</span>
					</a>
				</li>
				<li class="i_32_tables">
					<a href="${pageContext.request.contextPath}/student/findSelectCourse.do?sno=${sessionScope.student.sno }" title="Some Rows">
						<span class="tab_label">查看课程</span>
						<span class="tab_info">Show Courses</span>
					</a>
				</li>
				
				<li class="i_32_charts">
					<a href="charts.html" title="Visual Data">
						<span class="tab_label">Charts</span>
						<span class="tab_info">Visual Data</span>
					</a>
				</li>
				<li class="i_32_ui">
					<a href="ui.html" title="Kit elements">
						<span class="tab_label">UI</span>
						<span class="tab_info">Kit elements</span>
					</a>
				</li>
				<li class="i_32_tables">
					<a href="tables.html" title="Some Rows">
						<span class="tab_label">Tables</span>
						<span class="tab_info">Some Rows</span>
					</a>
				</li>
				<li class="i_32_forms">
					<a href="forms.html" title="Some Fields">
						<span class="tab_label">Forms</span>
						<span class="tab_info">Some Fields</span>
					</a>
				</li>
				 -->
			</ul>
		</aside>
		<!-- ==================侧边栏目    end ===================================================================== -->

		<div class="contents">
			<div class="grid_wrapper">

				<div class="g_6 contents_header">
					<h3 class="i_16_dashboard tab_label">个人信息</h3>
					<div><span class="label">Person Info</span></div>
				</div>
				<!-- 
				<div class="g_6 contents_options">
					<div class="simple_buttons">
						<div class="bwIcon i_16_help">Help</div>
					</div>
					<div class="simple_buttons">
						<div class="bwIcon i_16_settings">Settings</div>
						<div class="buttons_arrow">
						
							<ul class="drop_menu menu_with_icons right_direction">
								<li>
									<a class="i_16_add" href="#" title="New Flie">
										<span class="label">New File</span>
									</a>									
								</li>
								<li>
									<a class="i_16_progress" href="#" title="2 Files Left">
										<span class="label">Files Left</span>
										<span class="small_count">2</span>
									</a>
								</li>
								<li>
									<a class="i_16_files" href="#" title="Browse Files">
										<span class="label">Browse Files</span>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				 -->

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
				<!-- Separator -->
				<div class="g_12 separator"><span></span></div>
				

			</div>
		</div>

	</div>


</body>
</html>