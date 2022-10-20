
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
			data:{"tno":$("#mTeacherStno").val(),"clno":$("#mTeacherStname").val(),"action":"updateTC"},
			dateType:"json",
			success:function(result){
				if(result>"0"){
					alert("修改成功");
					location.href='${pageContext.request.contextPath }/Teacher/SelectCourse.jsp';
				}else{
					alert("修改失败!")
					window.location.reload();
				}
			}
		})
	})
})
</script>

<body>

  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改课程信息</strong></div>
  <div class="body-content">
    <div class="form-x">
        <div class="label">
          	请输入新信息 
        </div>
       
      <div class="form-group">
        <div class="label">
          <label for="sitename">新班号：</label>
        </div>
        <div class="field">
        <input type="hidden" id="mTeacherStno" value="${tno }"/>
          <input type="text" class="input w50" id="mTeacherStname" name="mTeacherStname" size="50" placeholder="请输入新班号" />         
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