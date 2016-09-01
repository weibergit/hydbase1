package hyd.base.pojo.vo;

import hyd.base.pojo.po.OrgUser;


/**
 * 
 * <p>Title: SysuserCustom</p>
 * <p>Description: 扩展类，扩展部门和职位</p>
 * @author	王鹏
 * @date	2016年09月01日上午10:38:43
 * @version 1.0
 */
public class OrgUserCustom extends OrgUser {
	
	//部门名称
	private String departmentName;
	//职位
	private OrgRoleCustom role;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public OrgRoleCustom getRole() {
		return role;
	}
	public void setRole(OrgRoleCustom role) {
		this.role = role;
	}
	
	
	
}
