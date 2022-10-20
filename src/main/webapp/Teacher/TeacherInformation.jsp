
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
	/*删除确定  */
$(function(){
	$("#submit").click(function(){
		if (confirm("是否确定删除？")) {
			$.ajax({
				url:"${pageContext.request.contextPath }/TeacherServlet",
				type:"post",
				data:{"stno":$("#mTeacherStno").val(),"action":"deleteTeacher"},
				dateType:"json",
				success:function(result){
					alert("asdsa")
					if(result>"0"){
						alert("删除成功");
						window.location.reload();
					}else{
						alert("删除失败!")
						window.location.reload();
					}
				}
			})
		} 
	})
})

	 function getkey(a) {
	        var pms =document.getElementById("keywords").value;
	  a.href = '${pageContext.request.contextPath }/TeacherServlet?action=findTeacherBySno&sno='+ pms;
	  }
</script>
</head>
<body>


   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath }/Teacher/AddTeacherInformation.jsp"> 添加内容</a> </li>
        <li>搜索：</li>
        <li>
          <input type="text" placeholder="请输入教师号" Id="keywords" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
           <a href="" onClick="getkey(this)" class="button border-main icon-search">搜索</a>
          </li>
        </ul>
    </div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="100" >全选：<input type="checkbox"
				name="boxname" id="all" onclick="cli('boxname')" value="checkbox" />
			</th>
			<th width="200">教师号</th>
	        <th width="340">姓名</th>
	        <th width="120">性别</th>
	        <th width="290">年龄</th>
	        <th width="120">职称</th>
	        <th width="300">操作</th>
		</tr>
		
	<c:forEach items="${findAllTeacher }" var="teacher">
		<tr>
			<td style="text-align:left; padding-left:20px;">
			<input type="checkbox" name="boxname" value="${teacher.stno }" id="mTeacherStno"/></td>
		  <td>${teacher.stno }</td>
          <td><font color="#00CC99">${teacher.stname }</font></td>
          <td>${teacher.stsex }</td>
          <td>${teacher.stage }</td>
          <td>${teacher.sto }</td>
			<td ><div> <a class="button border-main" href="${pageContext.request.contextPath }/TeacherServlet?action=getTeacherId&stno=${teacher.stno }" style="padding: 2px 8px;">
			<span class="icon-edit">
			</span> 修改</a></div></td>
		</tr>
	</c:forEach>
		<tr height="50px">
			<td>
		
				<div style="margin-right: 20px;">
					<input type="submit" value="删除" id="submit">
				</div>
			</td>
		</tr>
	</table>
	</div>
</div>

</body>
</html>