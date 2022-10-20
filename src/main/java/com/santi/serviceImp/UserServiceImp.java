package com.santi.serviceImp;

import com.santi.UserDao.UserDao;
import com.santi.UserDaoImp.UserDaoImp;
import com.santi.entriy.User;
import com.santi.service.UserService;

public class UserServiceImp implements UserService{
	UserDao u=new UserDaoImp();
	@Override
	public User findUser(String name, String pwd) {
		return u.findUser(name, pwd);
	}
	
	@Override
	public int updatePwd(String pwd,String id) {
		return u.updatePwd(pwd,id);
	}

}
