package hyd.base.service.impl;

import hyd.base.dao.mapper.SysuserMapper;
import hyd.base.dao.mapper.SysuserMapperCustom;
import hyd.base.dao.mapper.UsergysMapper;
import hyd.base.dao.mapper.UserjdMapper;
import hyd.base.dao.mapper.UseryyMapper;
import hyd.base.pojo.po.OrgPrivilege;
import hyd.base.pojo.po.Sysuser;
import hyd.base.pojo.po.SysuserExample;
import hyd.base.pojo.po.Usergys;
import hyd.base.pojo.po.UsergysExample;
import hyd.base.pojo.po.Userjd;
import hyd.base.pojo.po.UserjdExample;
import hyd.base.pojo.po.Useryy;
import hyd.base.pojo.po.UseryyExample;
import hyd.base.pojo.vo.ActiveUser;
import hyd.base.pojo.vo.SysuserCustom;
import hyd.base.pojo.vo.SysuserQueryVo;
import hyd.base.process.context.Config;
import hyd.base.process.result.ResultUtil;
import hyd.base.service.PrivilegeService;
import hyd.base.service.UserService;
import hyd.util.MD5;
import hyd.util.UUIDBuild;

import java.util.List;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeServiceImpl implements PrivilegeService {

	// 注入 mapper
	@Autowired
	private SysuserMapper sysuserMapper;

	
	@Override
	public OrgPrivilege findPriByRoleid(String roleid){
		
		return null;
	}
}
