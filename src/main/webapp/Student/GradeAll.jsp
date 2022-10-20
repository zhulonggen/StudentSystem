
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	

</script>
</head>
<body>

<div id="listform">
   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div>
     	<table class="table table-hover text-center">
		<tr >
			<th width="110" style="text-align:left; padding-left:20px;" >全选：<input type="checkbox"
				name="boxname" id="all" onclick="cli('boxname')" value="checkbox" />
			</th>
	        <th width="218" style="text-align:left; padding-left:20px;">学号</th>
	        <th width="21">总成绩</th>
	        <th width="200">操作</th>
		</tr>
	
		<tr>
			<td style="text-align:left; padding-left:20px;">
			<input type="checkbox" name="boxname" id="mTeacherStno" value="${sno }"/></td>
		  <td width="218" style="text-align:left; padding-left:20px;">${sno }</td>
          <td width="21">${i }</td>
			<td width="200"><div> 
			
			<a class="button border-main" href="" style="padding: 2px 8px;" id="submit">
			<span class="icon-edit">
			</span> 删除</a></div></td>
		</tr>
	</table>
	</div>
</div>
</div>
</body></html>