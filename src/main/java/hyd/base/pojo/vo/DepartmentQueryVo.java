package hyd.base.pojo.vo;

import hyd.util.PageQuery;


public class DepartmentQueryVo {
	
	private DepartmentCustom DepartmentCustom;
	
	private PageQuery pageQuery;

	public DepartmentCustom getDepartmentCustom() {
		return DepartmentCustom;
	}

	public void setDepartmentCustom(DepartmentCustom departmentCustom) {
		DepartmentCustom = departmentCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	
	
}
