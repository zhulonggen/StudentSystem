package com.santi.serviceImp;

import com.santi.StudentDao.GradeDao;
import com.santi.StudentDao.Imp.GradeDaoImp;
import com.santi.service.GradeService;

public class GradeServiceImp implements GradeService{
		GradeDao grade=new GradeDaoImp();
	@Override
	public int findSumGrade(String sno) {
		return grade.findSumGrade(sno);
	}
	
}
