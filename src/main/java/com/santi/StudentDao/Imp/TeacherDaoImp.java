package com.santi.StudentDao.Imp;

import java.util.List;

import com.santi.StudentDao.BaseDao;
import com.santi.StudentDao.StudentDao;
import com.santi.StudentDao.TeacherDao;
import com.santi.entriy.Course;
import com.santi.entriy.Student;
import com.santi.entriy.StudentCourse;
import com.santi.entriy.TC;
import com.santi.entriy.Teacher;

public class TeacherDaoImp extends BaseDao implements TeacherDao{

	@Override
	public List<Teacher> findAllTeacher() {
		String sql="select * from teacher";
		return executeQueryForList(Teacher.class, sql);
	}

	@Override
	public int insertTeacherInfo(String stno, String stname, String stsex, int stage, String sto) {
		String sql="insert into teacher values(?,?,?,?,?)";
		return executeUpdate(sql, stno,stname,stsex,stage,sto);
	}
	
	@Override
	public TC findTeacherbySno(String stno) {
		String sql="select t.Stno,t.Stname,tc.Cno,c.Cname,tc.Clno from teacher t,tc,course c  where t.Stno=tc.Stno and tc.Cno=c.Cno and t.Stno=?";
		return executeQueryForObject(TC.class, sql, stno);
	}

	@Override
	public int updateTeacherInfo(String stname, String stsex, int stage, String sto, String stno) {
		String sql="update teacher set Stname=?,Stsex=?,Stage=?,Sto=? where Stno=?";
		return executeUpdate(sql, stname,stsex,stage,sto,stno);
	}

	@Override
	public int deleteTeacher(String stno) {
		String sql="delete from teacher where Stno=?";
		return executeUpdate(sql, stno);
	}

	@Override
	public Course findCourseInformation(String cno) {
		String sql="select Cno cno,Cname cname,Cgrade cgrade,Ctime ctime,Ctype type from course where Cno=?";
		return executeQueryForObject(Course.class, sql, cno);
	}

	@Override
	public int updateCourseInfo(String cname,int cgrade,int ctime,String ctype,String cno) {
		String sql="update course set Cname=?,Cgrade=?,Ctime=?,Ctype=? where Cno=?";
		return executeUpdate(sql, cname,cgrade,ctime,ctype,cno);
	}

	@Override
	public int addCourseInfo(String cno, String cname, int cgrade, int ctime, String ctype) {
		String sql="insert into course values(?,?,?,?,?)";
		return executeUpdate(sql, cno,cname,cgrade,ctime,ctype);
	}

	@Override
	public List<TC> findAllTC() {
		String sql="select t.Stno,t.Stname,tc.Cno,c.Cname,tc.Clno from teacher t,tc,course c  where t.Stno=tc.Stno and tc.Cno=c.Cno";
		return executeQueryForList(TC.class, sql);
	}

	@Override
	public int addTC(String stno, String cno, int clno) {
		String sql="insert into tc values(?,?,?)";
		return executeUpdate(sql, stno,cno,clno);
	}

	@Override
	public int ByStnoUpdateTc(int clno, String stno) {
		String sql="update tc set Clno=? where Stno=?";
		return executeUpdate(sql,clno,stno);
	}
}
