package hyd.base.service;

import hyd.base.pojo.vo.DepartmentCustom;
import hyd.base.pojo.vo.DepartmentQueryVo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface DepartmentService {
	// 查询部门总数
	public int findDepartmentCount() throws Exception;

	// 查询所有部门信息
	public List<DepartmentCustom> findDepartmentList(
			DepartmentQueryVo departmentQueryVo) throws Exception;
//	//准备数据，部门名称
//	public List<DepartmentCustom> findalldname() throws Exception;
//	//添加部门信息
//	public void insertDepartment(DepartmentCustom departmentCustom) throws Exception;
//	//删除部门
//	public void deleteDepartment(String id) throws Exception;
//	//根据id查询部门信息
//	public Department selectDepartmentById(String id) throws Exception;
//	//添加部门信息
//	public void updateDepartment(DepartmentCustom departmentCustom,String id) throws Exception;
}
