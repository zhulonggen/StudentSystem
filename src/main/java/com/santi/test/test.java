package com.santi.test;

import java.util.List;

import org.junit.Test;

import com.santi.StudentDao.GradeDao;
import com.santi.StudentDao.StudentDao;
import com.santi.StudentDao.TeacherDao;
import com.santi.StudentDao.Imp.GradeDaoImp;
import com.santi.StudentDao.Imp.StudentDaoImp;
import com.santi.StudentDao.Imp.TeacherDaoImp;
import com.santi.UserDao.UserDao;
import com.santi.UserDaoImp.UserDaoImp;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;
import com.santi.entriy.User;
import com.santi.util.JDBCUtil;

public class test {
	StudentDao student=new StudentDaoImp();
	UserDao u=new UserDaoImp();
	GradeDao grade=new GradeDaoImp();
	TeacherDao teacher=new TeacherDaoImp();
	@Test
	public void t1() {
		
	}
}
