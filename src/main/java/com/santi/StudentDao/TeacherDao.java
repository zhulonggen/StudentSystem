package com.santi.StudentDao;

import java.util.List;

import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;

public interface TeacherDao {
	/**
	 * 查询所有教师
	 * 
	 * @return
	 */
	public List<Teacher> findAllTeacher();

	/**
	 * 查询对应课程号的课程信息
	 * @param cno
	 * @return
	 */
	public Course findCourseInformation(String cno);

	/**
	 * 根据stno查询对应教师信息
	 * 
	 * @param stno
	 * @return
	 */
	public TC findTeacherbySno(String stno);

	/**
	 * 根据stno修改教师其他属性
	 * 
	 * @param stname
	 * @param stsex
	 * @param stage
	 * @param sto
	 * @param sto
	 * @return
	 */
	public int updateTeacherInfo(String stname, String stsex, int stage, String sto, String stno);

	/**
	 * 添加老师
	 * 
	 * @param stno
	 * @param stname
	 * @param stsex
	 * @param stage
	 * @param sto
	 * @return
	 */
	public int insertTeacherInfo(String stno, String stname, String stsex, int stage, String sto);
	/**
	 * 根据stno来删除教师
	 * @param stno
	 * @return
	 */
	public int deleteTeacher(String stno);
	/**
	 * 查询所有的TC
	 * @return
	 */
	public List<TC> findAllTC();
	/**
	 * 根据课程号修改课程信息
	 * @param cno
	 * @return
	 */
	public int updateCourseInfo(String cname,int cgrade,int ctime,String ctype,String cno);
	/**
	 * 添加课程信息
	 * @param cno
	 * @param cname
	 * @param cgrade
	 * @param ctime
	 * @param ctype
	 * @return
	 */
	public int addCourseInfo(String cno,String cname,int cgrade,int ctime,String ctype);
	
	/**
	 * 添加TC表信息
	 * @param stno
	 * @param cno
	 * @param clno
	 * @return
	 */
	public int addTC(String stno,String cno,int clno);
	/**
	 * 根据教师号来修改信息
	 * @param stno
	 * @return
	 */
	public int  ByStnoUpdateTc(int clno, String stno);

}
