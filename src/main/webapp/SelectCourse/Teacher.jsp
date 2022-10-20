<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.jsp" %>

</head>
<body style="border-top: 2px solid#999999;">


<form id="listform">
 
    <div class="padding border-bottom">
    <table class="table table-hover text-center">
      <tr>
          <th width="290">教师号</th>
        <th width="120">教师名</th>
        <th width="340">课程号</th>
        <th width="120">课程名</th>
        <th width="120">班号</th>
      </tr>

      <tr>   
          <td>${tc.stno }</td>
          <td><font color="#00CC99">${tc.stname }</font></td>
          <td>${tc.cno }</td>
          <td>${tc.cname }</td>    
          <td>${tc.clno }</td>
        </tr>
    
    </table>
  </div>
</form>
</body>
</html>