
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
				data:{"stname":$("#mTeacherStno").val(),"stsex":$("#mTeacherStname").val(),"stage":$("#mTeacherSsex").val(),"sto":$("#mTeacherSage").val(),"stno":$("#stno").val(),"action":"updateTeacherInfo"},
				dateType:"json",
				success:function(result){
					if(result>"0"){
						alert("修改成功");
						window.location.href="${pageContext.request.contextPath }/Teacher/TeacherInformation.jsp";
						//window.location.reload();
					}
				}
			})
		})
	})
</script>

<body>

  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改教师信息</strong></div>
  <div class="body-content">
  <input type="hidden" name="sno" value="${stno }" id="stno"/>
    <div class="form-x">
        <div class="label">
          	请输入新信息 
        </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="mTeacherStno" size="50" placeholder="请输入新姓名" on data-validate="required:请输入新教师号" />       
        </div>
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStname" name="mTeacherStname" size="50" placeholder="请输入新性别" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新年龄：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSsex" name="mTeacherSsex" size="50" placeholder="请输入新年龄" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新职位：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherSage" name="mTeacherSage" size="50" placeholder="请输入新职位" />          
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