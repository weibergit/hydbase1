package hyd.base.service.impl;

import hyd.base.dao.mapper.OrgUserMapper;
import hyd.base.dao.mapper.OrgUserMapperCustom;
import hyd.base.dao.mapper.SysuserMapper;
import hyd.base.dao.mapper.SysuserMapperCustom;
import hyd.base.dao.mapper.UsergysMapper;
import hyd.base.dao.mapper.UserjdMapper;
import hyd.base.dao.mapper.UseryyMapper;
import hyd.base.pojo.po.OrgUser;
import hyd.base.pojo.po.OrgUserExample;
import hyd.base.pojo.po.Sysuser;
import hyd.base.pojo.po.SysuserExample;
import hyd.base.pojo.po.Usergys;
import hyd.base.pojo.po.UsergysExample;
import hyd.base.pojo.po.Userjd;
import hyd.base.pojo.po.UserjdExample;
import hyd.base.pojo.po.Useryy;
import hyd.base.pojo.po.UseryyExample;
import hyd.base.pojo.vo.ActiveUser;
import hyd.base.pojo.vo.OrgUserCustom;
import hyd.base.pojo.vo.SysuserCustom;
import hyd.base.pojo.vo.SysuserQueryVo;
import hyd.base.process.context.Config;
import hyd.base.process.result.ResultUtil;
import hyd.base.service.UserService;
import hyd.util.MD5;
import hyd.util.UUIDBuild;

import java.util.List;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	// 注入 mapper
	@Autowired
	private OrgUserMapper orgUserMapper;


	@Autowired
	private OrgUserMapperCustom orgUserMapperCustom;

	@Override
	public List<OrgUserMapperCustom> findSysuserList(OrgUserQueryVo orgUserQueryVo)
			throws Exception {
		return orgUserMapperCustom.findSysuserList(orgUserQueryVo);
	}

	@Override
	public int findOrgUserCount(OrgUserQueryVo orgUserQueryVo) throws Exception {
		return orgUserMapperCustom.findSysuserCount(orgUserQueryVo);
	}

	// 根据账号查询用户方法
	public OrgUser findOrgUserByUserid(String userId) throws Exception {
		OrgUserExample orgUserExample = new OrgUserExample();
		OrgUserExample.Criteria criteria = orgUserExample.createCriteria();
		// 设置查询条件，根据账号查询
		criteria.andUseridEqualTo(userId);
		List<OrgUser> list = orgUserMapper.selectByExample(orgUserExample);

		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}


	@Override
	public void insertOrgUser(OrgUserCustom orgUserCustom) throws Exception {

		// 参数校验
		// 通用的参数合法校验，非空校验，长度校验
		// ...使用一些工具类来完成

		// 数据业务合法性校验
		// 账号唯一性校验，查询数据库校验出来
		// 思路：根据用户账号查询sysuser表，如果查询到说明 账号重复
		OrgUser user = this.findOrgUserByUserid(orgUserCustom.getUserid());
		if (user != null) {
			// 账号重复
			// 抛出异常，可预知异常
			// throw new Exception("账号重复");

			// 使用系统自定义异常类
			/*
			 * ResultInfo resultInfo = new ResultInfo();
			 * resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL); //从资源文件中获取异常信息
			 * String message = ResourcesUtil.getValue("resources.messages",
			 * "213"); resultInfo.setMessage(message);
			 */
			// 使用ResultUtil构造resultInfo
			// ResultInfo resultInfo =
			// ResultUtil.createFail("resources.messages", 213, null);

			// throw new ExceptionResultInfo(resultInfo);
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 213,
					null));
		}


	}

	@Override
	public void deleteSysuser(String id) throws Exception {
		// 校验约束
		// 校验用户是否存在
		OrgUser user = orgUserMapper.selectByPrimaryKey(id);
		if (user == null) {
			// 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 212,
					null));
		}
		// 执行删除
		orgUserMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void updateOrgUser(String id, OrgUserCustom orgUserCustom)
			throws Exception {
		// 非空校验。。。

		// 修改用户账号不允许暂用别人的账号
		// 如果判断账号修改了
		// 页面提交的账号可能是用户修改的账号
		String userid_page = orgUserCustom.getUserid();

		// 数据库中的账号是用户原始账号
		// 通过id查询数据库
		OrgUser user = orgUserMapper.selectByPrimaryKey(id);
		if (user == null) {
			// 抛出异常
			// 找不到要修改用户信息
			// .....
		}
		// 用户原始账号
		String userid = user.getUserid();

		if (!userid_page.equals(userid)) {
			// 通过页面提交的账号查询数据库，如果查到说明暂用别人的账号
			OrgUser user1 = this.findOrgUserByUserid(userid_page);
			if (user1 != null) {
				// 说明暂用别人的账号
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,
						213, null));
			}
		}
		// 设置更新用户信息

		// 调用mapper更新用户
		// 使用updateByPrimaryKey更新，要先查询用户

		OrgUser user_update = orgUserMapper.selectByPrimaryKey(id);

		user_update.setUserid(orgUserCustom.getUserid());
		user_update.setUsername(orgUserCustom.getUsername());
		user_update.setStatus(orgUserCustom.getStatus());
		orgUserMapper.updateByPrimaryKey(user_update);

	}

	@Override
	public OrgUserCustom findSysuserById(String id) throws Exception {

		// 从数据库查询用户
		OrgUser user = orgUserMapper.selectByPrimaryKey(id);

		OrgUserCustom orgUserCustom = new OrgUserCustom();

		// 将sysuser中数据设置到sysuserCustom
		BeanUtils.copyProperties(user, orgUserCustom);

		return orgUserCustom;
	}

	@Override
	public ActiveUser checkUserInfo(String userid, String pwd) throws Exception {
		// 校验用户是否存在
		OrgUser user = this.findOrgUserByUserid(userid);
		if (user == null) {
			// 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101,
					null));
		}

		// 校验用户密码是否合法
		String pwd_db = user.getPassword();// md5密文
		String pwd_md5 = new MD5().getMD5ofStr(pwd);

		if (!pwd_db.equalsIgnoreCase(pwd_md5)) {
			// 用户名或密码错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114,
					null));
		}

		// 构建用户身份信息
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(userid);
		activeUser.setUsername(user.getUsername());
		

		return activeUser;
	}
}
