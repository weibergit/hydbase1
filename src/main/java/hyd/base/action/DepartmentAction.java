package hyd.base.action;

import hyd.base.pojo.vo.DepartmentCustom;
import hyd.base.pojo.vo.DepartmentQueryVo;
import hyd.base.process.result.DataGridResultInfo;
import hyd.base.service.DepartmentService;
import hyd.util.PageQuery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/department")
public class DepartmentAction {
//	@Autowired
//	private DepartmentService departmentService;

	//部门查询页面
	@RequestMapping("/querydepartment")
	public String querydepartment(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面
		return "/base/department/querydepartment";
	}

	//用户查询页面的结果集
	//最终DataGridResultInfo通过@ResponseBody将java对象转成json
//	@RequestMapping("/querydepartment_result")
//	public @ResponseBody DataGridResultInfo querydepartment_result(
//			DepartmentQueryVo departmentQueryVo,
//			int page,//页码
//			int rows//每页显示个数
//			)throws Exception{
//	//非空校验
//	departmentQueryVo = departmentQueryVo!=null?departmentQueryVo:new DepartmentQueryVo();
//	//查询列表总数
//	int total = departmentService.findDepartmentCount();
//	//查询部门结果
//	
//	PageQuery pageQuery = new PageQuery();
//	pageQuery.setPageParams(total,rows,page);
//	departmentQueryVo.setPageQuery(pageQuery);
//	List<DepartmentCustom> departmentList = departmentService.findDepartmentList(departmentQueryVo);
//	DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
//	dataGridResultInfo.setTotal(total);
//	dataGridResultInfo.setRows(departmentList);
//	return dataGridResultInfo;
//	}
//	//添加部门页面
//	@RequestMapping("/adddepartment")
//	public String adddepartment(Model model)throws Exception{
//		String year = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//		model.addAttribute("year", year);
//		List<DepartmentCustom> departmentCustomlist=departmentService.findalldname();
//		model.addAttribute("departmentCustomlist", departmentCustomlist);
//		return "/base/department/adddepartment";
//	}
//	//添加部门提交
//	@RequestMapping("/adddepartmentsubmit")
//	public @ResponseBody SubmitResultInfo adddepartmentsubmit(DepartmentQueryVo departmentQueryVo)throws Exception{
//		departmentService.insertDepartment(departmentQueryVo.getDepartmentCustom());
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
//
//	//删除部门
//	@RequestMapping("/deletedepartment")
//	public @ResponseBody SubmitResultInfo deletedepartment(String id) throws Exception{
//		//调用service
//		departmentService.deleteDepartment(id);
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
//	
//	//修改部门页面
//	@RequestMapping("/editdepartment")
//	public String editdepartment(Model model,String id) throws Exception{
//		//调用service
//		Department department = departmentService.selectDepartmentById(id);
//		Date time = department.getTime();
//		String year = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
//		model.addAttribute("department", department);
//		model.addAttribute("year", year);
//		return "/base/department/editdepartment"; 
//	}
//	
//	//修改部门提交
//	@RequestMapping("/editdepartmentsubmit")
//	public @ResponseBody SubmitResultInfo editdepartmentsubmit(DepartmentQueryVo departmentQueryVo,String id) throws Exception{
//		//调用service
//		departmentService.updateDepartment(departmentQueryVo.getDepartmentCustom(), id);
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
}
