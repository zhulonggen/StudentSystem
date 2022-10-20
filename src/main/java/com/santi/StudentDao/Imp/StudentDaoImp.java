package com.santi.StudentDao.Imp;

import java.util.List;

import com.santi.StudentDao.BaseDao;
import com.santi.StudentDao.StudentDao;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;

public class StudentDaoImp extends BaseDao implements StudentDao{

	@Override
	public List<Student> findAllStudent() {
		String sql="select * from student";
		return executeQueryForList(Student.class, sql);
	}

	@Override
	public List<Course> findAllCourseInformation() {
		String sql="select Cno cno,Cname cname,Cgrade cgrade,Ctime ctime,Ctype type from course";
		return executeQueryForList(Course.class, sql);
	}

	@Override
	public Student findStudentbySno(String sno) {
		String sql="select * from student where Sno=?";
		return executeQueryForObject(Student.class, sql,sno);
	}

	@Override
	public int updateStudentInfo(String sname,String ssex,int sage,String sdept,String clno,String sno) {
		String sql="update student set Sname=?,Ssex=?,Sage=?,Sdept=?,Clno=? where Sno=?";
		return executeUpdate(sql, sname,ssex,sage,sdept,clno,sno);
	}

	@Override
	public int insertStudentInfo(String sno, String sname, String ssex, int sage, String sdept, String clno) {
		String sql="insert into student values(?,?,?,?,?,?)";
		return executeUpdate(sql, sno,sname,ssex,sage,sdept,clno);
	}

	@Override
	public int deleteStudent(String sno) {
		String sql="delete from student where Sno=?";
		return executeUpdate(sql, sno);
	}

	@Override
	public List<StudentCourse> findCourse(String sno) {
		String sql="select student.Sno,student.Sname,course.Cno,course.Cname from course LEFT JOIN sc ON course.Cno=sc.Cno\r\n"
				+ "	LEFT JOIN student ON sc.Sno=student.Sno\r\n"
				+ "	where student.Sno=?";
		return executeQueryForList(StudentCourse.class, sql, sno);
	}
}
