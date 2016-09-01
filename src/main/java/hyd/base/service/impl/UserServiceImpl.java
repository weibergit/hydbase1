package hyd.base.service.impl;

import hyd.base.dao.mapper.UserMapper;
import hyd.base.pojo.po.User;
import hyd.base.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;





public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findUserByUserid(int userId) throws Exception {
		return userMapper.selectByPrimaryKey(userId);	
	}

}
