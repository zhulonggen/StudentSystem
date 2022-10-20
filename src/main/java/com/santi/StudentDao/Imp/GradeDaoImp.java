package com.santi.StudentDao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.santi.StudentDao.BaseDao;
import com.santi.StudentDao.GradeDao;
import com.santi.util.JDBCUtil;

public class GradeDaoImp extends BaseDao implements GradeDao{

	@Override
	public int findSumGrade(String sno) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
//		接收返回值
		int sum=0;
		try {
			String sql="select sum(Scg) from sc where Sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, sno);
			rs=ps.executeQuery();
//			
			while(rs.next()) {
				sum = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.commit();
		}
		return sum;
	}

}
