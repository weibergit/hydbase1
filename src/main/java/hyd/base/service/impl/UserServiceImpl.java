package hyd.base.service.impl;

import hyd.base.dao.mapper.UserMapper;
import hyd.base.pojo.po.OrgUser;
import hyd.base.pojo.po.User;
import hyd.base.pojo.vo.ActiveUser;
import hyd.base.process.context.Config;
import hyd.base.process.result.ResultUtil;
import hyd.base.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;





public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User findUserByUserid(int userId) throws Exception {
		return userMapper.selectByPrimaryKey(userId);	
	}

	@Override
	public ActiveUser checkUserInfo(String userid, String pwd) throws Exception {
		// 校验用户是否存在
//		OrgUser user = this.findUserByUserid(userId)
//		if (user == null) {
//			// 用户不存在
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,
//					null));
//		}
//
//		// 校验用户密码是否合法
//		String pwd_db = sysuser.getPwd();// md5密文
//		String pwd_md5 = new MD5().getMD5ofStr(pwd);
//
//		if (!pwd_db.equalsIgnoreCase(pwd_md5)) {
//			// 用户名或密码错误
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,
//					null));
//		}

		// 构建用户身份信息
		ActiveUser activeUser = new ActiveUser();
//		activeUser.setUserid(userid);
//		activeUser.setUsername(sysuser.getUsername());
//		activeUser.setGroupid(sysuser.getGroupid());

		return activeUser;
	}
	
}
