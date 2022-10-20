<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>学生成绩管理系统-教师界面</title>  
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
  <script src="${pageContext.request.contextPath }/js/jquery.js"></script>  
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="${pageContext.request.contextPath }/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />学生成绩管理系统-教师页面</h1>
  </div>
  <div class="head-l">
  	<a class="button button-little bg-red" href="${pageContext.request.contextPath }/UserServlet?action=close" >
  		<span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2><span class="icon-user"></span>用户信息</h2>
  <ul>
    <li><a href="${pageContext.request.contextPath }/common/personal_details.jsp" target="right"><span class="icon-caret-right"></span>账户信息</a></li>    
    <li><a href="${pageContext.request.contextPath }/common/personnew.jsp" target="right"><span class="icon-caret-right"></span>修改密码</a></li>
  </ul>
  <h2><span class="icon-user"></span>教师信息</h2>
    <ul>
    <li><a href="${pageContext.request.contextPath }/TeacherServlet?action=finAllTeacher" target="right"><span class="icon-caret-right"></span>查看教师信息</a></li>    
    </ul>
   
    <h2><span class="icon-pencil-square-o"></span>课程信息</h2>
    <ul >
    <li><a href="${pageContext.request.contextPath }/Teacher/Course.jsp" target="right"><span class="icon-caret-right"></span>查询课程信息</a></li>
  </ul>  
    
  <h2><span class="icon-pencil-square-o"></span>选课管理</h2>
    <ul>
     <li><a href="${pageContext.request.contextPath }/TeacherServlet?action=findAllTC" target="right"><span class="icon-caret-right"></span>查看选课</a></li>  
   </ul>
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
  
    $(".icon-home").click(function(){
	    $("#a_leader_txt").text("所有公告");
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
  
});
</script>
<ul class="bread">
  <li><a href="welcome.jsp" target="right" class="icon-home"> 首页</a></li>
  <li><a href="" id="a_leader_txt">公告信息</a></li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="welcome.jsp" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center;">
</div>
</body>
</html>