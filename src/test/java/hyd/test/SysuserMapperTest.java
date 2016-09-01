package hyd.test;

import hyd.base.dao.mapper.OrgRoleMapper;
import hyd.base.dao.mapper.OrgUserMapper;
import hyd.base.dao.mapper.OrgUserMapperCustom;
import hyd.base.dao.mapper.SysuserMapper;
import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.po.OrgUser;
import hyd.base.pojo.po.Sysuser;
import hyd.base.pojo.po.SysuserExample;
import hyd.base.pojo.vo.OrgUserCustom;
import hyd.base.pojo.vo.OrgUserRoleCustom;
import hyd.util.UUIDBuild;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SysuserMapperTest extends TestCase {

	private ApplicationContext applicationContext;
	
//	private OrgUserMapperCustom userMapper;
	
	private OrgUserMapper userMapper;
	private OrgRoleMapper roleMapper;
	private OrgUserMapperCustom userMapperCustom;
//	private SysuserMapper userMapper;

	protected void setUp() throws Exception {
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml", "spring/applicationContext-base-dao.xml"

		});
//		userMapper = (OrgUserMapperCustom) applicationContext.getBean("OrgUserMapperCustom");
		userMapper = (OrgUserMapper) applicationContext.getBean("orgUserMapper");
//		userMapper = (SysuserMapper) applicationContext.getBean("sysuserMapper");
		roleMapper = (OrgRoleMapper) applicationContext.getBean("orgRoleMapper");
		userMapperCustom = (OrgUserMapperCustom) applicationContext.getBean("orgUserMapperCustom");
		
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//根据主键删除
//	public void testDeleteByPrimaryKey() {
//		sysuserMapper.deleteByPrimaryKey("test009");
//	}

	//插入用户信息
	@Test
	public void testInsert() {
		
		OrgUser user = new OrgUser();
//		Sysuser user = new Sysuser();
		user.setId(UUIDBuild.getUUID());//生成uuid主键
		user.setUserid("test1");
		user.setUsername("test1");
//		user.setPwd("test");
		user.setPassword("test1");
		userMapper.insert(user);
	}

	
	//插入分组信息
	@Test
	public void saveUserRole() throws Exception {
		
		OrgUserRoleCustom ur = new OrgUserRoleCustom();
		ur.setId(UUIDBuild.getUUID());
		ur.setRoleid("3adf14688cbf4611aa0ef447b3ecffee");
		ur.setUserid("f08a8926300b4a4684f346e133e8e7a2");
		userMapperCustom.saveUserRole(ur);
	}
	
	//插入role信息
	@Test
	public void testInsertrole() {
		OrgRole role = new OrgRole();
//			Sysuser user = new Sysuser();
		role.setId(UUIDBuild.getUUID());//生成uuid主键
		role.setRoleName("用户组2");
		roleMapper.insert(role);
	}
	
//	//自定义查询条件查询
//	public void testSelectByExample() {
//		SysuserExample sysuserExample  =new SysuserExample();
//		SysuserExample.Criteria criteria = sysuserExample.createCriteria();
//		//自定义查询条件
//		criteria.andUsernameEqualTo("test009");
//		criteria.andGroupidEqualTo("4");
//		
//		List<Sysuser> list = sysuserMapper.selectByExample(sysuserExample);
//		
//		System.out.println(list.get(0));
//	}
//
	//根据主键查询用户信息
	@Test
	public void testSelectByPrimaryKey() throws Exception {
		OrgUserCustom sysuser =  userMapperCustom.selectUsercusByuserid("f08a8926300b4a4684f346e133e8e7a2");
		System.out.println(sysuser.getId());
	}
//
//	//根据主键更新，传入的po类的属性不为空才更新
//	public void testUpdateByPrimaryKeySelective() {
//		//定义一个新的对象
//		Sysuser sysuser = new Sysuser();
//		//对象设置id
//		sysuser.setId("18e6c4bc2f3244bfa146ec6e3f73919a");
//		//再设置要更新的值
//		sysuser.setUsername("test009999");
//		sysuserMapper.updateByPrimaryKeySelective(sysuser);
//	}
//	//根据主键更新，不管传入的po类的属性是否为空，都更新
//	public void testUpdateByPrimaryKey() {
//		
//		//先查询对象
//		Sysuser sysuser = sysuserMapper.selectByPrimaryKey("18e6c4bc2f3244bfa146ec6e3f73919a");
//		//向对象中设置要更新的值
//		sysuser.setUsername("test009999");
//		//执行更新
//		sysuserMapper.updateByPrimaryKey(sysuser);
//	}

}
