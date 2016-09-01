package hyd.base.service;

import hyd.base.pojo.po.OrgPrivilege;
import hyd.base.pojo.po.Sysuser;
import hyd.base.pojo.po.Usergys;
import hyd.base.pojo.po.Userjd;
import hyd.base.pojo.po.Useryy;
import hyd.base.pojo.vo.ActiveUser;
import hyd.base.pojo.vo.SysuserCustom;
import hyd.base.pojo.vo.SysuserQueryVo;

import java.util.List;



public interface PrivilegeService {
	
	//根据roleid获取菜单
	public OrgPrivilege findPriByRoleid(String roleid);
	
}
