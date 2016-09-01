package hyd.base.pojo.vo;

import hyd.base.pojo.po.OrgUserRole;
import hyd.base.pojo.po.Sysuser;



/**
 * 
 * <p>Title: SysuserCustom</p>
 * <p>Description: 扩展类，用于提交信息、查询条件</p>
 * @author	王鹏
 * @date	2016年09月01日上午10:38:43
 * @version 1.0
 */
public class OrgUserRoleCustom extends OrgUserRole {
	
	//单位名称 
	private OrgUserCustom user;
	
	//用户类型名称 
	private OrgRoleCustom role;

	public OrgUserCustom getUser() {
		return user;
	}

	public void setUser(OrgUserCustom user) {
		this.user = user;
	}

	public OrgRoleCustom getRole() {
		return role;
	}

	public void setRole(OrgRoleCustom role) {
		this.role = role;
	}
	
	
}
