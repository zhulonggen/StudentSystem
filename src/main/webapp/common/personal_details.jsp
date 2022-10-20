<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<%@include file="header.jsp" %>

</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong><span class="icon-key"></span> 查看账户信息</strong>
		</div>
		<div title="欢迎使用" style="padding: 20px; overflow: hidden;">
			<p>
				账户名:${user.susername}</p>
			 <p>
				密码:${user.spassword }</p>
			<p>
				权限:${user.sno }</p>
		</div>
	</div>
</body>
</html>