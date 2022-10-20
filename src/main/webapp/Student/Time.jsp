
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../common/header.jsp" %>
</head>
<body>

<form method="post" action="" id="listform">
   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div class="padding border-bottom">
    </div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="100">
			</th>
	        <th width="40" style="text-align:left; padding-left:20px;">学号</th>
	        <th width="183">姓名</th>
	        <th width="71">课程号</th>
	        <th width="157">课程名</th>
		</tr>
	 
	 <c:forEach items="${course }" var="c">
		<tr>
		<td></td>
          <td>${c.sno }</td>
          <td><font color="#00CC99">${c.sname }</font></td>
          <td>${c.cno }</td>
		  <td>${c.cname }</td>
		</tr>
		</c:forEach>
		
		</table>
	</div>
</div>
</form>
</body></html>