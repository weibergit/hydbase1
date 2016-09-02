package hyd.base.dao.mapper;

import hyd.base.pojo.vo.DepartmentCustom;
import hyd.base.pojo.vo.DepartmentQueryVo;

import java.util.List;

public interface DepartmentMapperCustom {
    //查询部门总数
	public int findDepartmentCount() throws Exception;
	//查询所有部门信息
	public List<DepartmentCustom> findDepartmentList(DepartmentQueryVo orgDepartmentQueryVo) throws Exception;
//	//根据上级部门查询同级部门
//	public List<DepartmentCustom> selectDepartmentByPname(String pname) throws Exception;
//	//查询所有部门名称和level
//	public List<DepartmentCustom> finddnamelevel() throws Exception;
}