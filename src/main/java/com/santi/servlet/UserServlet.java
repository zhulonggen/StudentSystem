package com.santi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.santi.entriy.User;
import com.santi.service.UserService;
import com.santi.serviceImp.UserServiceImp;

@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet{
	UserService userService=new UserServiceImp();
	
	public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String code = req.getParameter("code");
		String usertype = req.getParameter("usertype");//类别
//		验证码图片
		String checkCode = (String) req.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//		查找此user
		User user = userService.findUser(name, password);
		System.out.println(usertype);
		System.out.println(checkCode);
		//传到session方便获取
		if(checkCode.equals(code)) {
			req.getSession().setAttribute("user", user);
			resp.getWriter().write(JSON.toJSONString(user));
		}else {
			System.out.println("失败");
			String header = resp.getHeader("Referer");
			resp.sendRedirect(header);
		}
	}
	
	//退出
	public void close(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("user");
		resp.sendRedirect(req.getContextPath()+"/login.jsp");
	}
	//改密码
	public void updatePwd(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		System.out.println(id);
		System.out.println(pwd);
		int i = userService.updatePwd(pwd,id);
		System.out.println(i);
	}
	
}
