<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.jsp" %>

</head>
<body style="border-top: 2px solid#999999;">

<form method="post" id="listform" >
     <div class="padding border-bottom">
    <table class="table table-hover text-center" id="studentInfo">
    <!-- ajax -->
    <tr>
    <th width="100" style="text-align:left; padding-left:20px;"> 学号</th>
    <th width="340">姓名</th>
    <th width="120">性别</th>
    <th width="290">年龄</th> 
    <th width="120">院系</th>
    <th width="200">班号</th>
    </tr>
    
    <tr>
    <td>${student.sno }</td>
    <td>${student.sname }</td>
    <td>${student.ssex }</td>
    <td>${student.sage }</td>
    <td>${student.sdept }</td>
    <td>${student.clno }</td>
    </tr>
    </table>
  </div> 
</form>
</body>
</html>