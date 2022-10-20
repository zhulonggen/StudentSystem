
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
</head>
<body style="border-top: 2px solid#999999;">

<form method="post" action="first" id="listform">
 
    <div class="padding border-bottom">
    <table class="table table-hover text-center">
      <tr>
        <th width="100" style="text-align:left; padding-left:20px;">教师号</th>
        <th width="340">姓名</th>
        <th width="120">性别</th>
        <th width="290">年龄</th>
        <th width="120">职称</th>
		<th width="310">操作</th>
      </tr>
      <tr>   
          <td></td>
          <td><font color="#00CC99"></font></td>
          <td></td>
          <td></td>
          <td></td>
          <td ><div> <a class="button border-main" href="updateTeacher1.jsp?Sno=" style="padding: 2px 8px;">
          <span class="icon-edit">
			</span> 修改</a></div></td>
        </tr>
    </table>
  </div>
</form>
</body>
</html>