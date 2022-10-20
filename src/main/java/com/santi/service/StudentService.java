package com.santi.service;

import java.util.List;

import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;

public interface StudentService {
	public List<Student> findAllStudent();
	
	public List<Course> findAllCourseInformation();
	
	public Student findStudentbySno(String sno);
	
	public int updateStudentInfo(String sname,String ssex,int sage,String sdept,String clno,String sno);

	public int insertStudentInfo(String sno,String sname,String ssex,int sage,String sdept,String clno);
	
	public int deleteStudent(String sno);
	
	public List<StudentCourse> findCourse(String sno);
}
