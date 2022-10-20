
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp" %>
<script>
	/*删除确定  */
$(function(){
	$("#submit").click(function(){
		if (confirm("是否确定删除？")) {
			$.ajax({
				url:"${pageContext.request.contextPath }/StudentServlet",
				type:"post",
				data:{"sno":$("#mTeacherStno").val(),"action":"deleteStudent"},
				dateType:"json",
				success:function(result){
					if(result>"0"){
						alert("删除成功");
						window.location.reload();
					}
				}
			})
		} 
	})
})
	
	
	
	function getkey(a) {
        var pms = document.getElementById("keywords").value;
  a.href = '${pageContext.request.contextPath }/StudentServlet?action=findStudentBySno&sno='+pms;
  }
</script>
</head>
<body>


   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath }/Student/AddStudentInformation.jsp"> 添加内容</a> </li>
        <li>搜索：</li>
        <li>
          <input type="text" placeholder="请输入学号"  id="keywords" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="" onClick="getkey(this)" class="button border-main icon-search" > 搜索</a>
        </ul>
    </div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="100" >选择</th>
			<th width="200">学号</th>
	        <th width="340">姓名</th>
	        <th width="120">性别</th>
	        <th width="290">年龄</th>
	        <th width="120">院系</th>
	        <th width="200">班号</th>
	        <th width="300">操作</th>
		</tr>
	
          <c:forEach items="${findAllStudent }" var="student">
		<tr>
		<td style="text-align:left; padding-left:20px;">
		<input type="checkbox" name="boxname" value="${student.sno }" id="mTeacherStno"/></td>
	    <td>${student.sno }</td>
	    <td><font color="#00CC99">${student.sname }</font></td>
	    <td>${student.ssex }</td>
	    <td>${student.sage }</td>
	    <td>${student.sdept }</td>
	    <td>${student.clno }</td>
		<td ><div> <a class="button border-main" href="${pageContext.request.contextPath }/StudentServlet?action=getStudentId&sno=${student.sno }"  style="padding: 2px 8px;">
		<span class="icon-edit"></span> 修改</a>
		<a class="button border-main" style="padding: 2px 8px;"><span class="icon-edit" id="submit">删除</span></a>
		</div></td>
		</tr>
	    </c:forEach>
	</table>
	</div>
</div>

</body>
</html>
