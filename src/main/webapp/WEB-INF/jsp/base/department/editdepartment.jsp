<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>添加部门</title>
<script type="text/javascript">
	function departmentsave() {

		//准备使用jquery 提供的ajax Form提交方式
		//将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
		//使用ajax form提交时，不用指定url，url就是form中定义的action
		//此种方式和原始的post方式差不多，只不过使用了ajax方式

		//第一个参数：form的id
		//第二个参数：sysusersave_callback是回调函数，sysusersave_callback当成一个方法的指针
		//第三个参数：传入的参数， 可以为空
		//第四个参数：dataType预期服务器返回的数据类型,这里action返回json
		//根据form的id找到该form的action地址
		jquerySubByFId('departmentform', departmentform_callback, null, "json");

	}
	//ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
	function departmentform_callback(data) {
		message_alert(data);
		//如果成功，自动关闭
		if (data.resultInfo.type == '1') {
			//延迟1秒执行关闭方法
			
			setTimeout("parent.closemodalwindow()", 1000);
			cole();
		}
		//关闭时刷新datagid
		function cole() {
			parent.$('#departmentlist').datagrid('reload');
		}
	}
</script>
</head>
<body>
	<form id="departmentform"
		action="${baseurl}department/editdepartmentsubmit.action"
		method="post">
		<input type="hidden" name="id" value="${department.id}">
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%"
			bgColor=#c4d8ed>

			<TBODY>
				<TR>
					<TD background=images/r_0.gif width="100%">
						<TABLE cellSpacing=0 cellPadding=0 width="100%">
							<TBODY>
								<TR>
									<TD>&nbsp;修改部门信息</TD>
									<TD align=right>&nbsp;</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				</TR>

				<TR>
					<TD>
						<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
							align=center>
							<TBODY>

								<TR>
									<TD height=30 width="15%" align=right>部门编号：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="department_did" name="departmentCustom.did"
												value="${department.did}" />
										</div> <!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
										<div id="department_didTip">由6位数字或字母组成</div>
									</TD>
									<TD height=30 width="15%" align=right>部门名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="department_dname"
												name="departmentCustom.dname" value="${department.dname}" />
										</div>
										<div id="department_dnameTip"></div>
									</TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>上级部门：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="department_pname"
												name="departmentCustom.pname" value="${department.pname}" readonly="true" />
										</div> 
										<div id="department_pidTip"></div>
									</TD>
									<TD height=30 width="15%" align=right>创建时间：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="department_stime"
												name="departmentCustom.stime" value="${year}" readonly="true" />

										</div>

									</TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=char>部门说明：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="department_description"
												name="departmentCustom.description"
												value="${department.description}" />
										</div>
										<div id="department_descriptionTip"></div>
									</TD>
								</TR>
								<tr>
									<td colspan=4 align=center class=category><a
										id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok"
										href="#" onclick="departmentsave()">提交</a> <a id="closebtn"
										class="easyui-linkbutton" iconCls="icon-cancel" href="#"
										onclick="parent.closemodalwindow()">关闭</a></td>
								</tr>

							</TBODY>
						</TABLE>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>
</body>
</html>