<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
</head>
<body>

  <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改学生信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="first">
    <input type="hidden" name="jsp" value="Student_Add_Grade"/>
    
        <div class="label">
          	请输入新信息 
        </div>
        <div class="form-group">
        <div class="label">
          <label for="sitename">新学号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mSno" name="mSo" size="50" placeholder="请输入新学生名" on data-validate="required:请输入新学生名" />       
        </div>
      </div>  
      
      <div class="form-group">
        <div class="label">
          <label for="sitename">新学生名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mTeacherStno" name="mTeacherStno" size="50" placeholder="请输入新学生名" on data-validate="required:请输入新学生名" />       
        </div>
        
      </div>  
      <div class="form-group">
        <div class="label">
          <label for="sitename">新课程号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" id="mCno" name="mCno" size="50" placeholder="请输入新学生名" on data-validate="required:请输入新学生名" />       
        </div>
      </div>  
      
      <div class="form-group">
        <div class="label">
          <label for="sitename">新课程名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="mTeacherStname" size="50" placeholder="请输入新课程名" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">新成绩：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="mTeacherSage" size="50" placeholder="请输入新成绩" />          
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>      
    </form>
  </div>
</div>
</body></html>
