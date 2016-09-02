<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>职位管理</title>

<script type="text/javascript">  	
	//datagrid列定义
	var columns_v = [ [ {
		field : 'rname',//对应json中的key
		title : '职位名称',
		width : 150
	}, {
		field : 'pname',//对应json中的key
		title : '上级职位 ',
		width : 150
	}, {
		field : 'opt1',//对应json中的key
		title : '编辑',
		width : 100,
		formatter : function(value, row, index) {
		return "<a href=javascript:editrole('"+row.roleid+"')>修改</a>";
		}
	}, {
		field : 'opt2',//对应json中的key
		title : '删除',
		width : 100,
		formatter : function(value, row, index) {
		return "<a href=javascript:deleterole('"+row.roleid+"')>删除</a>";
		}
	} ] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加职位信息", 800, 450, '${baseurl}role/addrole.action');
		}
	} ];

	//加载datagrid

	$(function() {
		//加载组织机构树列表
		$('#organizeTree').tree({  
			lines: true,  
			url: '${baseurl}tree.json',
			parentField : 'pid',
			onClick: function(node) { 
				$('#rolelist').datagrid('reload', "${path}/user/datagrid?sysid="+node.id);  
			}  
		});
		
		$('#rolelist').datagrid({
			title : '职位查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}role/queryrole_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList:[5,20,30],
			toolbar : toolbar_v
		});
	});
	//查询方法
	function queryrole(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#rolequeryForm").serializeJson();
		$('#rolelist').datagrid('load',formdata);
	}
	//删除部门方法
	function deleterole(roleid){

		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){

			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(roleid);
			//使用ajax的from提交执行删除
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('roledeleteform',roledel_callback,null,"json");
			
			
		});
	}
	//删除职位的回调
	function roledel_callback(data){
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type=data.resultInfo.type;
		if(type==1){
			//成功结果
			//重新加载 datagrid
			queryrole();
		}
	}
	//修改部门
	function editrole(roleid){
		
		//打开修改窗口
		createmodalwindow("修改职位信息", 800, 250, '${baseurl}role/editrole.action?roleid='+roleid);
	}
	
</script>

</head>
<body>
<form id="rolequeryForm">
	<div class="easyui-layout" style="height:650px;">
	<!-- 左半部-组织机构 -->
	<div id="div_organizeTree" region="west" iconCls="icon-chart_organisation" split="true" title="组织机构" 
			style="width:200px;padding: 2px" collapsible="false"> 
		<ul id="organizeTree"></ul>
	</div> 
	<!-- 查询列表 -->
	<div id="div_staffGird" region="center" iconCls="icon-users" style="overflow: hidden">
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="rolelist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
	</div>
	</form>
<form id="roledeleteform" action="${baseurl}role/deleterole.action" method="post">
  <input type="hidden" id="delete_id" name="roleid" />
</form>
</div>
</body>
</html>