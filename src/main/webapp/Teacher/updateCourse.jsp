
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
				data:{"cname":$("#mTeacherStno").val(),"cgrade":$("#mTeacherStname").val(),"ctime":$("#mTeacherSsex").val(),"type":$("#mTeacherSage").val(),"cno":$("#cno").val(),"action":"updateCourseInfo"},
				dateType:"json",
				success:function(result){
					if(result>"0"){
						alert("修改成功");
						window.location.href="${pageContext.request.contextPath }/Teacher/Course.jsp";
					}
				}
			})
		})
	})
</script>


<body>



  <div class="panel admin-panel">
  <div class="panel-head"><strong>
  <span class="icon-key"></span> 修改课程信息</strong></div>
  <div class="body-content">
    <div class="form-x">
    <input type="hidden" name="cno" value="${course.cno }" id="cno"/>
        <div class="label">请输入新信息</div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新课程名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="mTeacherStno" size="50" placeholder="请输入新课程名" on data-validate="required:请输入新课程名" />       
        </div>
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新学时：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStname" name="mTeacherStname" size="50" placeholder="请输入新学时" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新学分：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSsex" name="mTeacherSsex" size="50" placeholder="请输入新学分" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新类型：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSage" name="mTeacherSage" size="50" placeholder="请输入新类型" />          
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
</body></html>