
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp" %>
<script>
	/* 全选 */
	function cli(Obj) {
		var collid = document.getElementById("all")
		var coll = document.getElementsByName(Obj)
		if (collid.checked) {
			for (var i = 0; i < coll.length; i++)
				coll[i].checked = true;
		} else {
			for (var i = 0; i < coll.length; i++)
				coll[i].checked = false;
		}
	}
	
</script>
</head>
<body>

<form method="post" action="" id="listform">
   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath }/Teacher/AddSelect.jsp"> 添加内容</a> </li>
       
        
        </ul>
    </div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="100" >全选：<input type="checkbox"
				name="boxname" id="all" onclick="cli('boxname')" value="checkbox" />
			</th>
			 <th width="290">教师号</th>
        <th width="120">教师名</th>
        <th width="340">课程号</th>
        <th width="120">课程名</th>
        <th width="120">班号</th>
		 <th width="310">操作</th>
		</tr>
	
	<c:forEach items="${list }" var="tc"> 
		<tr>
		<td style="text-align:left; padding-left:20px;">
		<input type="checkbox" name="boxname" value=""/></td>
          <td>${tc.stno }</td>
          <td><font color="#00CC99">${tc.stname }</font></td>
          <td>${tc.cno }</td>
          <td>${tc.cname }</td>    
          <td>${tc.clno }</td>
			<td ><div> <a class="button border-main" href="${pageContext.request.contextPath }/TeacherServlet?action=getId&tno=${tc.stno }" style="padding: 2px 8px;"><span class="icon-edit">
			</span> 修改</a></div></td>
		</tr>
	</c:forEach>
		
	</table>
	</div>
</div>
</form>
</body></html>