
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
</head>
<script type="text/javascript">
	$(function(){
		$("#submit").click(function(){
			$.ajax({
				url:"${pageContext.request.contextPath }/StudentServlet",
				type:"post",
				data:{"sname":$("#mTeacherStno").val(),"ssex":$("#mTeacherStname").val(),"sage":$("#mTeacherSsex").val(),"sdept":$("#mTeacherSage").val(),"clno":$("#mTeacherSto").val(),"sno":$("#sno").val(),"action":"updateStudentInfo"},
				dateType:"json",
				success:function(result){
					if(result>"0"){
						alert("修改成功");
						window.location.href="${pageContext.request.contextPath }/Student/CrudStudent.jsp";
						//window.location.reload();
					}
				}
			})
		})
	})
</script>

<body>

  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改学生信息</strong></div>
  <div class="body-content">
    <div class="form-x">
    <input type="hidden" name="sno" value="${sno }" id="sno"/>
        <div class="label">
          	请输入新信息 
        </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="sname" size="50" placeholder="请输入新姓名" on data-validate="required:请输入学生号" />       
        </div>
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStname" name="ssex" size="50" placeholder="请输入新性别" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新年龄：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="sage" id="mTeacherSsex" size="50" placeholder="请输入新年龄" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新院系：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="sdept" id="mTeacherSage" size="50" placeholder="请输入新院系" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新班级：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="clno" id="mTeacherSto" size="50" placeholder="请输入新班级" />          
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