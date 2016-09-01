package hyd.base.service;

import hyd.base.pojo.po.User;

import java.util.List;


public interface UserService {
	
	
		// 根据用户账号查询用户信息
		public User findUserByUserid(int userId) throws Exception;

}
