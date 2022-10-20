package com.santi.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.service.StudentService;
import com.santi.serviceImp.StudentServiceImp;

@WebServlet("/StudentServlet")
public class StudentServlet extends BaseServlet {
	StudentService studentService = new StudentServiceImp();
	

	public void finAllStudent(HttpServletRequest req, HttpServletResponse reps) throws IOException, ServletException {
		List<Student> findAllStudent = studentService.findAllStudent();
		req.getSession().setAttribute("findAllStudent", findAllStudent);
		// reps.getWriter().write(JSON.toJSONString(findAllStudent));
		req.getRequestDispatcher("/Student/CrudStudent.jsp").forward(req, reps);
	}

	public void findAllCourse(HttpServletRequest req, HttpServletResponse reps) throws ServletException, IOException {
		List<Course> courseInformation = studentService.findAllCourseInformation();
		req.getSession().setAttribute("courseInformation", courseInformation);
		req.getRequestDispatcher("/course/Course_Information.jsp").forward(req, reps);

	}

	public void findStudentBySno(HttpServletRequest req, HttpServletResponse reps)
			throws IOException, ServletException {
		String sno = req.getParameter("sno");
		Student student = studentService.findStudentbySno(sno);
		if (student != null) {
			req.getSession().setAttribute("student", student);
			req.getRequestDispatcher("/common/StudentSelect.jsp").forward(req, reps);
		} else {
			String header = req.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}

	public void updateStudentInfo(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String sname = req.getParameter("sname");
		String ssex = req.getParameter("ssex");
		String sage = req.getParameter("sage");
		String sdept = req.getParameter("sdept");
		String clno = req.getParameter("clno");
		String sno = req.getParameter("sno");
		
		int i = studentService.updateStudentInfo(sname, ssex, Integer.parseInt(sage), sdept, clno, sno);
		reps.getWriter().write(i+"");;
	}
	
	public void getStudentId(HttpServletRequest req, HttpServletResponse reps) throws ServletException, IOException {
		String sno = req.getParameter("sno");
		if(sno!=null) {
			req.getSession().setAttribute("sno", sno);
			req.getRequestDispatcher("/Student/updateInformation.jsp").forward(req, reps);
		}else {
			String header = reps.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}
	
	public void addStudent(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String sno = req.getParameter("sno");
		String sname = req.getParameter("sname");
		String ssex = req.getParameter("ssex");
		String sage = req.getParameter("sage");
		String sdept = req.getParameter("sdept");
		String clno = req.getParameter("clno");
		
		int i = studentService.insertStudentInfo(sno, sname, ssex, Integer.parseInt(sage), sdept, clno);
		reps.getWriter().write(i+"");
	}
	
	public void deleteStudent(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String sno = req.getParameter("sno");
		int i = studentService.deleteStudent(sno);
		reps.getWriter().write(i+"");
		
	}
	
	public void findCourse(HttpServletRequest req, HttpServletResponse reps)
			throws IOException, ServletException {
		String sno = req.getParameter("sno");
		 List<StudentCourse> course = studentService.findCourse(sno);
		 System.out.println(course);
		 System.out.println(sno);
		if (!course.isEmpty()) {
			req.getSession().setAttribute("course", course);
			req.getRequestDispatcher("/Student/Time.jsp").forward(req, reps);
		} else {
			String header = req.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}
}
