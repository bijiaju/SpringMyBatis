package com.bee.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bee.dao.IUserDao;
import com.bee.entity.User;
import com.bee.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	//@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
