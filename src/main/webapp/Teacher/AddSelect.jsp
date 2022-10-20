
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
			data:{"stno":$("#mTeacherStno").val(),"cno":$("#mTeacherStname").val(),"clno":$("#mTeacherSsex").val(),"action":"addTc"},
			dateType:"json",
			success:function(result){
				if(result>"0"){
					alert("添加成功");
					location.href='${pageContext.request.contextPath }/Teacher/SelectCourse.jsp';
				}else{
					alert("添加失败!")
					window.location.reload();
				}
			}
		})
	})
})
</script>

<body>
  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 添加课程</strong></div>
  <div class="body-content">
    <div class="form-x">
    <input type="hidden" name="jsp" value="AddSelect"/>
        <div class="label">
          	请输入新信息 
        </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新教师号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="mTeacherStno" size="50" placeholder="新教师号" on data-validate="required:新教师号" />       
        </div>
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新课程号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStname" name="mTeacherStname" size="50" placeholder="请输入新课程名" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新班号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSsex" name="mTeacherSsex" size="50" placeholder="请输入新班号" />          
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
    </diiv>
  </div>
</div>
</body>
</html>