package com.santi.StudentDao;

import java.util.List;

import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;

public interface StudentDao {
	/**
	 * 查询所有学生
	 * 
	 * @return
	 */
	public List<Student> findAllStudent();

	/**
	 * 查询所有课程信息
	 * 
	 * @return
	 */
	public List<Course> findAllCourseInformation();

	/**
	 * 根据sno查询对应学生
	 * 
	 * @param sno
	 * @return
	 */
	public Student findStudentbySno(String sno);

	/**
	 * 根据sno修改其他属性
	 * 
	 * @param sname
	 * @param ssex
	 * @param sage
	 * @param sdept
	 * @param clno
	 * @param sno
	 * @return
	 */
	public int updateStudentInfo(String sname, String ssex, int sage, String sdept, String clno, String sno);

	/**
	 * 添加学生
	 * 
	 * @param sno
	 * @param sname
	 * @param ssex
	 * @param sage
	 * @param sdept
	 * @param clno
	 * @return
	 */
	public int insertStudentInfo(String sno, String sname, String ssex, int sage, String sdept, String clno);
	/**
	 * 根据sno来删除学生
	 * @param sno
	 * @return
	 */
	public int deleteStudent(String sno);
	/**
	 * 根据sno进行查看两表的选课
	 * @param sno
	 * @return
	 */
	public List<StudentCourse> findCourse(String sno);

}
