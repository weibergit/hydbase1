package hyd.base.service.impl;

import hyd.base.dao.mapper.DepartmentMapperCustom;
import hyd.base.pojo.vo.DepartmentCustom;
import hyd.base.pojo.vo.DepartmentQueryVo;
import hyd.base.process.result.ResultUtil;
import hyd.base.service.DepartmentService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;





public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentMapperCustom departmentMapperCustom;
//	@Autowired
//	private DepartmentMapper departmentMapper;
//	@Autowired
//	private SysuserMapper sysuserMapper;
//	
	//查询总记录数
	@Override
	public int findDepartmentCount() throws Exception {
		return departmentMapperCustom.findDepartmentCount();	
	}
//	
	//查询所有部门信息
	@Override
	public List<DepartmentCustom> findDepartmentList(
			DepartmentQueryVo departmentQueryVo) throws Exception {
		return departmentMapperCustom.findDepartmentList(departmentQueryVo);
	}
//	
//	//根据did查询部门
//	public Department findDepartmentByDid(String did) throws Exception{
//		DepartmentExample departmentExample = new DepartmentExample();
//		DepartmentExample.Criteria criteria = departmentExample.createCriteria();
//		criteria.andDidEqualTo(did);
//		List<Department> list = departmentMapper.selectByExample(departmentExample);
//		if (list != null && list.size() !=0) {
//			return list.get(0);
//		}
//		return null;
//	}
//	
//	//根据dname查询部门
//	public Department findDepartmentByDname(String dname) throws Exception{
//		DepartmentExample departmentExample = new DepartmentExample();
//		DepartmentExample.Criteria criteria = departmentExample.createCriteria();
//		criteria.andDnameEqualTo(dname);
//		List<Department> list = departmentMapper.selectByExample(departmentExample);
//		if (list != null && list.size()!=0) {
//			return list.get(0);
//		}
//		return null;
//	}
//	//根据pname查询部门
//	public Department findDepartmentByPname(String pname) throws Exception{
//		DepartmentExample departmentExample = new DepartmentExample();
//		DepartmentExample.Criteria criteria = departmentExample.createCriteria();
//		criteria.andDnameEqualTo(pname);
//		List<Department> list = departmentMapper.selectByExample(departmentExample);
//		if (list != null && list.size() == 1) {
//			return list.get(0);
//		}
//		return null;
//		}
//	
//	//查询同级部门
//	public List<DepartmentCustom> selectDepartmentByPname(String pname) throws Exception{		
//		return departmentMapperCustom.selectDepartmentByPname(pname);
//		}
//	
//	//查询所有部门名称和等级
//	public List<DepartmentCustom> finddnamelevel() throws Exception{
//		return departmentMapperCustom.finddnamelevel();
//	}
//	
//	//根据departmentid查询用户
//	public Sysuser findUserByDepartmentId(String id) throws Exception{
//		SysuserExample sysuserExample = new SysuserExample();
//		SysuserExample.Criteria criteria = sysuserExample.createCriteria();
//		criteria.andDepartmentidEqualTo(id);
//		List<Sysuser> list = sysuserMapper.selectByExample(sysuserExample);
//		if (list != null && list.size()!=0) {
//			return list.get(0);
//		}
//		return null;
//		}
//	
//	
//	@Override
//	public void insertDepartment(DepartmentCustom departmentCustom) throws Exception {
//		//部门编号不能为空
//		if(departmentCustom.getDid()==null || departmentCustom.getDid()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 217,
//					null));
//		}
//		//部门名称不能为空
//		if(departmentCustom.getDname()==null || departmentCustom.getDname()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 218,
//					null));
//		}
//		//部门创建时间不能为空
//		if(departmentCustom.getStime()==null || departmentCustom.getStime()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 219,
//					null));
//		}
//		Department departmentDid= new Department();
//		departmentDid = this.findDepartmentByDid(departmentCustom.getDid());
//		//如果部门编号重复抛出异常
//		if(departmentDid!=null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 220,
//					null));
//		}
//		Department departmentdname= new Department();
//		departmentdname = this.findDepartmentByDname(departmentCustom.getDname());
//		//如果部门名称重复抛出异常
//		if(departmentdname!=null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 221,
//					null));
//		}
//		String pname = departmentCustom.getPname().replaceAll("　","");
//		List<DepartmentCustom> department1 = this.selectDepartmentByPname(pname);//查询同级部门
//		if(pname==null || pname==""){
//			Long l = TreeCodeUtil.getTopCode(department1);
//			departmentCustom.setLevel(1);
//			departmentCustom.setCode(l);
//		}else{
//			Department department2= new Department();
//			department2 = this.findDepartmentByPname(pname);//查询上级部门
//			Long ll = TreeCodeUtil.getCode(department1, department2.getLevel());
//			departmentCustom.setLevel(department2.getLevel()+1);			
//			departmentCustom.setCode(department2.getCode()+ll);
//			
//		}
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = sdf.parse(departmentCustom.getStime());
//		departmentCustom.setDid(departmentCustom.getDid());
//		departmentCustom.setDname(departmentCustom.getDname());
//		departmentCustom.setPname(pname);
//		departmentCustom.setDescription(departmentCustom.getDescription());
//		departmentCustom.setTime(date);
//		departmentCustom.setId(UUIDBuild.getUUID());
//		departmentMapper.insert(departmentCustom);
//	}
//
//	@Override
//	public void deleteDepartment(String id) throws Exception {
//		// TODO Auto-generated method stub
//		Sysuser sysuser = new Sysuser();
//		sysuser = this.findUserByDepartmentId(id);
//		if(sysuser!=null){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 223,
//					null));
//		}
//		departmentMapper.deleteByPrimaryKey(id);
//	}
//
//	@Override
//	public Department selectDepartmentById(String id) throws Exception {
//		// TODO Auto-generated method stub
//		
//		return departmentMapper.selectByPrimaryKey(id);
//	}
//
//	@Override
//	public void updateDepartment(DepartmentCustom departmentCustom, String id)
//			throws Exception {
//		// TODO Auto-generated method stub
//		//部门编号不能为空
//		if(departmentCustom.getDid()==null || departmentCustom.getDid()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 217,
//					null));
//		}
//		//部门名称不能为空
//		if(departmentCustom.getDname()==null || departmentCustom.getDname()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 218,
//					null));
//		}
//		//部门创建时间不能为空
//		if(departmentCustom.getStime()==null || departmentCustom.getStime()==""){
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 219,
//					null));
//		}
//		Department department= new Department();
//		department = departmentMapper.selectByPrimaryKey(id);
//		//修改部门为null抛异常
//		if (department == null) {
//			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 222,
//					null));
//		}
//		
//		if(!departmentCustom.getDid().equals(department.getDid())){
//		Department departmentDid= new Department();
//		departmentDid = this.findDepartmentByDid(departmentCustom.getDid());
//			if(departmentDid!=null){
//				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 220,
//						null));
//			}
//		}
//		if(!departmentCustom.getDname().equals(department.getDname())){
//			Department departmentDname= new Department();
//			departmentDname = this.findDepartmentByDname(departmentCustom.getDname());
//				if(departmentDname!=null){
//					ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 221,
//							null));
//				}
//			}
//			
//		department.setDid(departmentCustom.getDid());
//		department.setDname(departmentCustom.getDname());
//		department.setPname(departmentCustom.getPname());
//		department.setDescription(departmentCustom.getDescription());
//		departmentMapper.updateByPrimaryKey(department);
//	}
//
//	@Override
//	public List<DepartmentCustom> findalldname() throws Exception {
//		List<DepartmentCustom> list = this.finddnamelevel();
//		for(DepartmentCustom li:list){
//			
//			for(int i=1;i<li.getLevel();i++){
//				li.setDname("　"+li.getDname());
//			}
//		}
//		return list;
//	}
	
	
	
}
