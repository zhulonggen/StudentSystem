package com.santi.service;

import java.util.List;

import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;

public interface TeacherService {
	public List<Teacher> findAllTeacher();
	
	public Course findCourseInformation(String cno);
	
	public TC findTeacherbySno(String stno);
	
	public int updateTeacherInfo(String stname, String stsex, int stage, String sto, String stno);

	public int insertTeacherInfo(String stno, String stname, String stsex, int stage, String sto);
	
	public int deleteTeacher(String stno);
	
	public int updateCourseInfo(String cname,int cgrade,int ctime,String ctype,String cno);
	
	public int addCourseInfo(String cno,String cname,int cgrade,int ctime,String ctype);
	
	public List<TC> findAllTC();
	
	public int addTC(String stno,String cno,int clno);
	
	public int  ByStnoUpdateTc(int clno, String stno);
	
}
