package com.santi.UserDao;

import com.santi.entriy.User;

public interface UserDao {
	/**
	 * 查询是否有该user
	 * @param name
	 * @param pwd
	 * @return
	 */
	public User findUser(String name,String pwd);
	/**
	 * 根据id来修改密码
	 * @param id
	 * @return
	 */
	public int updatePwd(String pwd,String id);
}
