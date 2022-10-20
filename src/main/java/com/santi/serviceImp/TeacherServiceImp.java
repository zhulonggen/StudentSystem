package com.santi.serviceImp;

import java.util.List;

import com.santi.StudentDao.StudentDao;
import com.santi.StudentDao.TeacherDao;
import com.santi.StudentDao.Imp.StudentDaoImp;
import com.santi.StudentDao.Imp.TeacherDaoImp;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;
import com.santi.service.StudentService;
import com.santi.service.TeacherService;

public class TeacherServiceImp implements TeacherService{
	TeacherDao teacherDao=new TeacherDaoImp();
	@Override
	public List<Teacher> findAllTeacher() {
		return teacherDao.findAllTeacher();
	}
	
	@Override
	public int insertTeacherInfo(String stno, String stname, String stsex, int stage, String sto) {
		return teacherDao.insertTeacherInfo(stno, stname, stsex, stage, sto);
	}
	
	@Override
	public TC findTeacherbySno(String stno) {
		return teacherDao.findTeacherbySno(stno);
	}
	@Override
	public int updateTeacherInfo(String stname, String stsex, int stage, String sto, String stno) {
		return teacherDao.updateTeacherInfo(stname, stsex, stage, sto, stno);
	}
	@Override
	public int deleteTeacher(String stno) {
		return teacherDao.deleteTeacher(stno);
	}
	@Override
	public Course findCourseInformation(String cno) {
		return teacherDao.findCourseInformation(cno);
	}

	@Override
	public int updateCourseInfo(String cname, int cgrade, int ctime, String ctype, String cno) {
		return teacherDao.updateCourseInfo(cname, cgrade, ctime, ctype, cno);
	}

	@Override
	public int addCourseInfo(String cno, String cname, int cgrade, int ctime, String ctype) {
		return teacherDao.addCourseInfo(cno, cname, cgrade, ctime, ctype);
	}

	@Override
	public List<TC> findAllTC() {
		return teacherDao.findAllTC();
	}

	@Override
	public int addTC(String stno, String cno, int clno) {
		return teacherDao.addTC(stno, cno, clno);
	}

	@Override
	public int ByStnoUpdateTc(int clno, String stno) {
		return teacherDao.ByStnoUpdateTc(clno, stno);
	}

}
