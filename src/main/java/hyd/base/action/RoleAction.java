package hyd.base.action;

import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.vo.RoleCustom;
import hyd.base.pojo.vo.RoleQueryVo;
import hyd.base.process.context.Config;
import hyd.base.process.result.DataGridResultInfo;
import hyd.base.process.result.ResultUtil;
import hyd.base.process.result.SubmitResultInfo;
import hyd.base.service.RoleService;
import hyd.util.PageQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;


@Controller
@RequestMapping("/role")
public class RoleAction {
	@Autowired
	private RoleService roleService;

	//部门职位页面
	@RequestMapping("/queryrole")
	public String queryrole(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面
		return "/base/role/queryrole";
	}

	//用户查询页面的结果集
	//最终DataGridResultInfo通过@ResponseBody将java对象转成json
//	@RequestMapping("/queryrole_result")
//	public @ResponseBody DataGridResultInfo queryrole_result(
//			RoleQueryVo roleQueryVo,
//			int page,//页码
//			int rows//每页显示个数
//			)throws Exception{
//	//非空校验
//		roleQueryVo = roleQueryVo!=null?roleQueryVo:new RoleQueryVo();
//	//查询列表总数
//	int total = roleService.findRoleCount();
//	//查询部门结果
//	
//	PageQuery pageQuery = new PageQuery();
//	pageQuery.setPageParams(total,rows,page);
//	roleQueryVo.setPageQuery(pageQuery);
//	List<RoleCustom> roleList = roleService.findRoleList(roleQueryVo);
//	DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();	
//	dataGridResultInfo.setTotal(total);
//	dataGridResultInfo.setRows(roleList);
//	return dataGridResultInfo;
//	}
//	//添加职位页面
//	@RequestMapping("/addrole")
//	public String addrole(Model model)throws Exception{
//		return "/base/role/addrole";
//	}
//	//准备数据
//	@RequestMapping("/addrole_result")
//	public @ResponseBody String addrole_result(RoleQueryVo roleQueryVo)throws Exception{
//	
//		List<RoleCustom> roleList = roleService.findRoleTree();
//		Gson gson = new Gson();
//		String json = gson.toJson(roleList);
//		return json;
//	}
//	//添加职位提交
//	@RequestMapping("/addrolesubmit")
//	public @ResponseBody SubmitResultInfo addrolesubmit(RoleQueryVo roleQueryVo)throws Exception{
//		roleService.insertRole(roleQueryVo.getRoleCustom());
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
//
//	//删除职位
//	@RequestMapping("/deleterole")
//	public @ResponseBody SubmitResultInfo deleterole(String roleid) throws Exception{
//		//调用service
//		roleService.deleteRole(roleid);
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
//	
//	//修改职位页面
//	@RequestMapping("/editrole")
//	public String editrole(Model model,String roleid) throws Exception{
//		//调用service
//		OrgRole role = roleService.selectRoleById(roleid);
//		model.addAttribute("role", role);
//		return "/base/role/editrole"; 
//	}
//	
//	//修改职位提交
//	@RequestMapping("/editrolesubmit")
//	public @ResponseBody SubmitResultInfo editrolesubmit(RoleQueryVo roleQueryVo,String roleid) throws Exception{
//		//调用service
//		roleService.updateRole(roleQueryVo.getRoleCustom(), roleid);
//		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null)); 
//	}
}
