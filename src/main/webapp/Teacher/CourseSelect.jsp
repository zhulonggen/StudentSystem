<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<form method="post" action="" id="listform">
   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="100" >
				
			</th>
			<th width="170">课程号</th>
	        <th width="171">课程名</th>
	        <th width="79">学分</th>
	        <th width="178">学时</th>
	        <th width="79">类型</th>
	        <th width="187">操作</th>
		</tr>
	
		<tr>
		  <td style="text-align:left; padding-left:20px;"></td>
          <td>${course.cno }</td>
          <td><font color="#00CC99">${course.cname }</font></td>
          <td>${course.cgrade }</td>
          <td>${course.ctime }</td> 
          <td>${course.type }</td>
			<td ><div> <a class="button border-main" href="${pageContext.request.contextPath }/Teacher/updateCourse.jsp" style="padding: 2px 8px;">
			<span class="icon-edit">
			</span> 修改</a></div></td>
		</tr>
		
		
	</table>
	</div>
</div>
</form>
</body></html>