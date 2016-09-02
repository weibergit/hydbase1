package hyd.base.service.impl;

import hyd.base.dao.mapper.OrgRoleMapper;
import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.po.OrgRoleExample;
import hyd.base.pojo.vo.RoleCustom;
import hyd.base.pojo.vo.RoleQueryVo;
import hyd.base.process.context.Config;
import hyd.base.process.result.ResultUtil;
import hyd.base.service.RoleService;
import hyd.util.UUIDBuild;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



public class RoleServiceImpl implements RoleService{
//	@Autowired
//	private RoleMapperCustom roleMapperCustom;
	@Autowired
	private OrgRoleMapper roleMapper;
	
//	//查询上级职位
//	private OrgRole findRoleByPname(String pname) throws Exception{
//		OrgRoleExample roleExample = new OrgRoleExample();
//		OrgRoleExample.Criteria criteria = roleExample.createCriteria();
//		criteria.andRoleNameEqualTo(pname);
//		List<OrgRole> list = roleMapper.selectByExample(roleExample);
//		if (list != null && list.size() == 1) {
//			return list.get(0);
//		}
//		return null;
//		}
//	//根据职位名称查询职位
//	private OrgRole findRoleByRname(String rname) throws Exception{
//		OrgRoleExample roleExample = new OrgRoleExample();
//		OrgRoleExample.Criteria criteria = roleExample.createCriteria();
//		criteria.andRoleNameEqualTo(rname);
//		List<OrgRole> list = roleMapper.selectByExample(roleExample);
//		if (list != null && list.size() != 0) {
//			return list.get(0);
//		}
//		return null;
//		}
//	@Override
//	public int findRoleCount() throws Exception {
//
//		return roleMapperCustom.findRoleCount();
//	}
//
//	@Override
//	public List<RoleCustom> findRoleList(RoleQueryVo roleQueryVo)
//			throws Exception {
//		return roleMapperCustom.findRoleList(roleQueryVo);
//		
//	}
//	
//	@Override
//	//添加职位
//	public void insertRole(RoleCustom roleCustom) throws Exception {
//		// TODO Auto-generated method stub
//	
//		//职位名称不能为空
//		if(roleCustom.getRoleName()==null || roleCustom.getRoleName()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 224,
//					null));
//		}
//		OrgRole rolername = new OrgRole();
//		rolername = this.findRoleByRname(roleCustom.getRoleName());
//		if(rolername!=null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 225,
//					null));
//		}
//		OrgRole role = new OrgRole();		
//		role.setRoleName(roleCustom.getRoleName());
//		role.setPid(roleCustom.getPid());
//		role.setId(UUIDBuild.getUUID());
//		roleMapper.insert(role);
//	}
//
//	@Override
//	public void deleteRole(String id) throws Exception {
//		// TODO Auto-generated method stub
//		OrgRole role = this.selectRoleById(id);
//		if(role==null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 226,
//					null));
//		}
//		roleMapper.deleteByPrimaryKey(id);
//	}
//
//	@Override
//	public OrgRole selectRoleById(String id) throws Exception {
//		// TODO Auto-generated method stub
//		
//		return roleMapper.selectByPrimaryKey(id);
//	}
//	
//	//更新
//	@Override
//	public void updateRole(RoleCustom roleCustom, String id) throws Exception {
//		// TODO Auto-generated method stub
//		OrgRole findrole = this.selectRoleById(id);//要修改的职位是否存在
//		if(findrole==null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 226,
//					null));
//		}
//		if(!findrole.getRoleName().equals(roleCustom.getRoleName())){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 225,
//					null));
//		}
//		findrole.setRoleName(roleCustom.getRoleName());
//		findrole.setPid(roleCustom.getPid());
//		roleMapper.updateByPrimaryKey(findrole);
//	}
//	
//	
//	@Override
//	public List<RoleCustom> findRoleTree() throws Exception {
//		// TODO Auto-generated method stub
//		List<RoleCustom> roleList = roleMapperCustom.findRoleTree();
//		return roleList;
//	}
//	
////	private void roleTreeList(Collection<RoleCustom> topList,List<RoleCustom> list){
////		for(RoleCustom top:topList){
////			RoleCustom roleCustom = new RoleCustom();
////			roleCustom.setId(top.getLevel());
////			roleCustom.setText(top.getRname());
////			list.add(roleCustom);
////			roleTreeList(top.getChildren(),list);
////		}
////	}
	
}
