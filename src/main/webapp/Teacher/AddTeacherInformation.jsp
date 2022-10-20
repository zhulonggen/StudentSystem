
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
</head>
<script type="text/javascript">
	$(function(){
		$("#submit").click(function(){
			$.ajax({
				url:"${pageContext.request.contextPath }/TeacherServlet",
				type:"post",
				data:{"stno":$("#mTeacherStno").val(),"stname":$("#mTeacherStname").val(),"stsex":$("#mTeacherSsex").val(),"stage":$("#mTeacherSage").val(),"sto":$("#mTeacherSto").val(),"action":"addTeacher"},
				dateType:"json",
				success:function(result){
					if(result>"0"){
						alert("添加成功");
						window.location.href="${pageContext.request.contextPath }/Teacher/TeacherInformation.jsp";
					}
				}
			})
		})
	})
</script>

<body>

  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 添加教师信息</strong></div>
  <div class="body-content">
    <div class="form-x">
        <div class="label">
          	请输入新信息 
        </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新教师号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="mTeacherStno" size="50" placeholder="请输入新教师号" on data-validate="required:请输入新教师号" />       
        </div>
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStname" name="mTeacherStname" size="50" placeholder="请输入新教师名" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSsex" name="mTeacherSsex" size="50" placeholder="请输入新性别" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新年龄：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSage" name="mTeacherSage" size="50" placeholder="请输入新年龄" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新职称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSto" name="mTeacherSto" size="50" placeholder="请输入新职称" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" id="submit"> 提交</button>
          
        </div>
      </div>      
    </div>
  </div>
</div>
</body>
</html>