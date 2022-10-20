package com.santi.serviceImp;

import java.util.List;

import com.santi.StudentDao.StudentDao;
import com.santi.StudentDao.Imp.StudentDaoImp;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.service.StudentService;

public class StudentServiceImp implements StudentService{
	StudentDao studentDao=new StudentDaoImp();
	@Override
	public List<Student> findAllStudent() {
		return studentDao.findAllStudent();
	}
	@Override
	public List<Course> findAllCourseInformation() {
		return studentDao.findAllCourseInformation();
	}
	@Override
	public Student findStudentbySno(String sno) {
		return studentDao.findStudentbySno(sno);
	}
	@Override
	public int updateStudentInfo(String sname, String ssex, int sage, String sdept, String clno, String sno) {
		return studentDao.updateStudentInfo(sname, ssex, sage, sdept, clno, sno);
	}
	@Override
	public int insertStudentInfo(String sno, String sname, String ssex, int sage, String sdept, String clno) {
		return studentDao.insertStudentInfo(sno, sname, ssex, sage, sdept, clno);
	}
	@Override
	public int deleteStudent(String sno) {
		return studentDao.deleteStudent(sno);
	}
	@Override
	public List<StudentCourse> findCourse(String sno) {
		return studentDao.findCourse(sno);
	}

}
