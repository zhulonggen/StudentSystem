package com.santi.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;
import com.santi.service.StudentService;
import com.santi.service.TeacherService;
import com.santi.serviceImp.StudentServiceImp;
import com.santi.serviceImp.TeacherServiceImp;

@WebServlet("/TeacherServlet")
public class TeacherServlet extends BaseServlet {
	TeacherService teacherService=new TeacherServiceImp();
	
	public void finAllTeacher(HttpServletRequest req, HttpServletResponse reps) throws IOException, ServletException {
		List<Teacher> findAllTeacher = teacherService.findAllTeacher();
		req.getSession().setAttribute("findAllTeacher", findAllTeacher);
		// reps.getWriter().write(JSON.toJSONString(findAllStudent));
		req.getRequestDispatcher("/Teacher/TeacherInformation.jsp").forward(req, reps);
	}

	public void findCourseByCno(HttpServletRequest req, HttpServletResponse reps) throws ServletException, IOException {
		String cno = req.getParameter("cno");
		Course course = teacherService.findCourseInformation(cno);
		if(course!=null) {
			req.getSession().setAttribute("course", course);
			req.getRequestDispatcher("/Teacher/CourseSelect.jsp").forward(req, reps);
		}else {
			String header = reps.getHeader("Referer");
			reps.sendRedirect(header);
		}

	}

	public void findTeacherBySno(HttpServletRequest req, HttpServletResponse reps)
			throws IOException, ServletException {
		String sno = req.getParameter("sno");
		TC tc = teacherService.findTeacherbySno(sno);
		if(tc!=null) {
			System.out.println(tc);
			req.getSession().setAttribute("tc", tc);
			req.getRequestDispatcher("/SelectCourse/Teacher.jsp").forward(req, reps);
		}else {
			String header = reps.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}

	public void updateTeacherInfo(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String stname = req.getParameter("stname");
		String stsex = req.getParameter("stsex");
		String stage = req.getParameter("stage");
		String sto = req.getParameter("sto");
		String stno = req.getParameter("stno");
		
		int i = teacherService.updateTeacherInfo(stname, stsex, Integer.parseInt(stage), sto, stno);
		
		reps.getWriter().write(i+"");;
	}
	
	public void getTeacherId(HttpServletRequest req, HttpServletResponse reps) throws ServletException, IOException {
		String stno = req.getParameter("stno");
		if(stno!=null) {
			req.getSession().setAttribute("stno", stno);
			req.getRequestDispatcher("/Teacher/updateTeacher.jsp").forward(req, reps);
		}else {
			String header = reps.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}
	
	public void addTeacher(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String stno = req.getParameter("stno");
		String stname = req.getParameter("stname");
		String stsex = req.getParameter("stsex");
		String stage = req.getParameter("stage");
		String sto = req.getParameter("sto");
		
		int i = teacherService.insertTeacherInfo(stno, stname, stsex, Integer.parseInt(stage), sto);
		reps.getWriter().write(i+"");
	}
	
	public void deleteTeacher(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String stno = req.getParameter("stno");
		int i = teacherService.deleteTeacher(stno);
		reps.getWriter().write(i+"");
		
	}
	
	public void findAllTC(HttpServletRequest req, HttpServletResponse reps)
			throws IOException, ServletException {
		List<TC> list = teacherService.findAllTC();
		req.getSession().setAttribute("list", list);
		req.getRequestDispatcher("/Teacher/SelectCourse.jsp").forward(req, reps);
	}

	public void updateCourseInfo(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String cno = req.getParameter("cno");
		String cname = req.getParameter("cname");
		String cgrade = req.getParameter("cgrade");
		String ctime = req.getParameter("ctime");
		String type = req.getParameter("type");
		
		int i = teacherService.updateCourseInfo(cname, Integer.parseInt(cgrade), Integer.parseInt(ctime), type, cno);
		reps.getWriter().write(i+"");
	}
	
	
	public void addCourse(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String cno = req.getParameter("cno");
		String cname = req.getParameter("cname");
		String cgrade = req.getParameter("cgrade");
		String ctime = req.getParameter("ctime");
		String type = req.getParameter("type");
		
		int i = teacherService.addCourseInfo(cno,cname, Integer.parseInt(cgrade), Integer.parseInt(ctime), type);
		reps.getWriter().write(i+"");
	}
	
	public void addTc(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String stno = req.getParameter("stno");
		String cno = req.getParameter("cno");
		String clno = req.getParameter("clno");
		
		int i = teacherService.addTC(stno, cno, Integer.parseInt(clno));
		reps.getWriter().write(i+"");
	}
	
	public void updateTC(HttpServletRequest req, HttpServletResponse reps) throws IOException {
		String tno = req.getParameter("tno");
		String clno = req.getParameter("clno");
		
		int i = teacherService.ByStnoUpdateTc(Integer.parseInt(clno),tno);
		reps.getWriter().write(i+"");
	}
	
	public void getId(HttpServletRequest req, HttpServletResponse reps) throws ServletException, IOException {
		String tno = req.getParameter("tno");
		if(tno!=null) {
			req.getSession().setAttribute("tno", tno);
			req.getRequestDispatcher("/Teacher/updateSelect.jsp").forward(req, reps);
		}else {
			String header = reps.getHeader("Referer");
			reps.sendRedirect(header);
		}
	}
}
