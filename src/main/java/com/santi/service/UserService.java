package com.santi.service;

import com.santi.entriy.User;

public interface UserService {
	public User findUser(String name,String pwd);
	
	public int updatePwd(String pwd,String id);
}
