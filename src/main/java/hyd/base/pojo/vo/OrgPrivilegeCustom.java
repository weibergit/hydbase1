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
public class OrgPrivilegeCustom extends OrgPrivilege {
	
	//对应的职位
	private List<OrgRole> role;

	public List<OrgRole> getRole() {
		return role;
	}

	public void setRole(List<OrgRole> role) {
		this.role = role;
	}
	
	
}
