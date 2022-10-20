package com.santi.StudentDao;

public interface GradeDao {
	/**
	 * 查看总分
	 * @param sno
	 * @return
	 */
	public int findSumGrade(String sno);
}
