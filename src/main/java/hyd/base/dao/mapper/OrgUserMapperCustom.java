package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.vo.OrgUserCustom;
import hyd.base.pojo.vo.OrgUserRoleCustom;
import hyd.base.pojo.vo.SysuserCustom;
import hyd.base.pojo.vo.SysuserQueryVo;

import java.util.List;


public interface OrgUserMapperCustom {
	
	//通过userid查询role
	public List<OrgRole> selectUserRole(String userid) throws Exception;
	
	//根据user表中的id查询用户和组信息
	public OrgUserCustom selectUsercusByuserid(String userid) throws Exception;
	
	//保存user和role
	public void saveUserRole(OrgUserRoleCustom orgUserRoleCustom) throws Exception;

}
