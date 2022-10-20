<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
<script>
	
	function getkey(a) {
        var pms =document.getElementById("keywords").value;
  a.href = '${pageContext.request.contextPath }/TeacherServlet?action=findCourseByCno&cno='+pms;
  }
</script>
</head>
<body>

<form method="post" id="listform">
   <div class="panel admin-panel">
   <div class="panel-head"><strong class="icon-reorder">项目列表</strong></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath }/Teacher/AddCourse.jsp"> 添加内容</a> </li>
        <li>搜索：</li>
        <li>
          <input type="text" placeholder="请输入课程号" Id="keywords" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="" onClick="getkey(this)" class="button border-main icon-search"> 搜索</a>
          </li>
        </ul>
    </div>
    
</div>
</form>
</body>
</html>