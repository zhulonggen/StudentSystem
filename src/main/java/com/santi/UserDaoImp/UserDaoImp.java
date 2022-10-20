package com.santi.UserDaoImp;

import com.santi.StudentDao.BaseDao;
import com.santi.UserDao.UserDao;
import com.santi.entriy.User;

public class UserDaoImp extends BaseDao implements UserDao{

	@Override
	public User findUser(String name, String pwd) {
		String sql="select Susername susername,Spassword spassword,Sno sno,SID sID from userperson where Susername=? and Spassword=?";
		return executeQueryForObject(User.class, sql, name,pwd);
	}

	@Override
	public int updatePwd(String pwd,String id) {
		String sql="update userperson set Spassword=? where SID=?";
		return executeUpdate(sql, pwd,id);
	}

}
