package com.santi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.santi.service.GradeService;
import com.santi.serviceImp.GradeServiceImp;

@WebServlet("/GradeServlet")
public class GradeServlet extends BaseServlet{
	GradeService gradeService=new GradeServiceImp();
	
	public void sumGrade(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String sno = req.getParameter("sno");
		System.out.println(sno);
		int i = gradeService.findSumGrade(sno);
		System.out.println(i);
		if(i>0) {
			req.getSession().setAttribute("sno", sno);
			req.getSession().setAttribute("i", i);
			req.getRequestDispatcher("/Student/GradeAll.jsp").forward(req, resp);
		}
	}
	
	
}
