<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp" %>
</head>
<body style="border-top: 2px solid#999999;">

<form method="post" id="listform">
 
    <div class="padding border-bottom">
    <table class="table table-hover text-center">
      <tr>
        <th width="340">课程号</th>
        <th width="120">课程名</th>
        <th width="290">学分</th>
        <th width="120">学时</th>
          <th width="120">类别</th>
<!--        <th width="310">操作</th>-->
      </tr>

	<c:forEach items="${courseInformation }" var="list">
      <tr>   
          <td>${list.cno }</td>
          <td><font color="#00CC99">${list.cname }</font></td>
          <td>${list.cgrade }</td>
          <td>${list.ctime }</td>
          <td>${list.type }</td>
        </tr>
    </c:forEach>
    </table>
  </div>
</form>
</body>
</html>