package hyd.base.pojo.vo;

import java.util.List;

import hyd.base.pojo.po.OrgPrivilege;
import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.po.Sysuser;



/**
 * 
 * <p>Title: SysuserCustom</p>
 * <p>Description: 扩展类，用于多对多查询</p>
 * <p>Company: www.itcast.com</p> 
 * @author	王鹏
 * @date	2016年09月01日上午10:38:43
 * @version 1.0
 */
public class OrgRoleCustom extends OrgRole {
	
	//对应的user
	private List<Sysuser> user;
	
	//对应的权限
	private List<OrgPrivilege> privilege;

	public List<Sysuser> getUser() {
		return user;
	}

	public void setUser(List<Sysuser> user) {
		this.user = user;
	}

	public List<OrgPrivilege> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<OrgPrivilege> privilege) {
		this.privilege = privilege;
	}
	
	
}
