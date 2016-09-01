package hyd.base.dao.mapper;

import hyd.base.pojo.vo.OrgRoleCustom;
import hyd.base.pojo.vo.SysuserCustom;
import hyd.base.pojo.vo.SysuserQueryVo;

import java.util.List;


public interface OrgRoleMapperCustom {
	
	//根据Group表中的id或name查询组信息和组内用户信息 
	public List<OrgRoleCustom> selectGroupUser(OrgRoleCustom orgRoleCustom) throws Exception;
	
	//删除组与组内成员的对应关系
	public void deleteGroupUser(OrgRoleCustom orgRoleCustom) throws Exception;

}
