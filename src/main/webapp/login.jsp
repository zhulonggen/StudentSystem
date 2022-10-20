<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp" %>  
    <script type="text/javascript">  
    $(function() {
    	//更改验证码
		$("#src").click(function() {
			$(this).attr("src","${pageContext.request.contextPath}/kaptchaServlet?d="+ new Date());
		}); 
    	$("#submit").click(function(){
    		console.log("submit");
    		//判断用户
        	$.ajax({
        		url:"${pageContext.request.contextPath}/UserServlet",
        		type:"post",
        		data:{"name":$("#name").val(),"password":$("#password").val(),"code":$("#code").val(),"usertype":$(".usertype").val(),"action":"login"},
        		dataType:"json",
        		success:function(result){
        			 if(result!=null){
        				if(result.sno==="student"){
        					location.href="${pageContext.request.contextPath}/main/index(student).jsp";
        				}else if(result.sno==="teacher"){
        					location.href="${pageContext.request.contextPath}/main/index(teacher).jsp";
        				}else{
        					window.location.reload();
            			}
        			} else{
        				alert("登录失败");
        				window.location.reload();
        			}
        		}
        	});
        });
    }) 
	</script>
</head>
<body>
	<div class="bg"></div>
	<div class="container">
	    <div class="line bouncein">
	        <div class="xs6 xm4 xs3-move xm4-move">
	            <div style="height:150px;"></div>
	            <div class="media media-y margin-big-bottom">           
	            </div> 
	            
	            <div class="panel loginbox">
	                <div class="text-center margin-big padding-big-top">
	                <h1>学生成绩管理系统</h1>
	                </div>
	                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
	                	<h3 style="color:red" id="tishi"></h3>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="text" class="input input-big" id="name" name="name" placeholder="登录账号" data-validate="required:请填写账号" />
	                            <span class="icon icon-user margin-small"></span>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="field field-icon-right">
	                            <input type="password" class="input input-big" id="password" name="password" placeholder="登录密码" data-validate="required:请填写密码" />
	                            <span class="icon icon-key margin-small"></span>
	                        </div>
	                    </div>
	                    <hr>
	                    <div class="form-group">
	                        <div class="field person"> 用户类型：
								<input type="radio"  name="usertype"  value="student" />学生
								<input type="radio"  name="usertype"  value="teacher" />教师
	                        </div>
	                    </div> 
	                    <br>
				        验证码：<input type="text" name="code" id="code" maxlength="5" style="width:60px"/> 
				        <img id="src" border="0" src="${pageContext.request.contextPath}/kaptchaServlet" title="点击更换图片" style="width:110px">  
	                </div>
	                <div style="padding:30px;">
	                <input type="submit" class="button button-block bg-main text-big input-big" value="登录" id="submit"></div>
	            </div>     
	        </div>
	    </div>
	</div>
</body>
</html>