<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>添加部门</title>
<script type="text/javascript">
  function rolesave(){
	  var pname = $("#pname").combotree("getText");
	  //alert(pname);
	  
	  $("#role_pname").val(pname);
	  jquerySubByFId('roleform',roleform_callback,null,"json");
	  
  }
	//ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
	function roleform_callback(data) {
		message_alert(data);
		//如果成功，自动关闭
		if (data.resultInfo.type == '1') {
			//延迟1秒执行关闭方法
			cole();
			setTimeout("parent.closemodalwindow()", 1000);
		}
	}
	//关闭时刷新datagid
	function cole(){
		parent.$('#rolelist').datagrid('reload');
		}
</script>
</head>
<body>
<form id="roleform" action="${baseurl}role/addrolesubmit.action" method="post">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;添加职位信息</TD>
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
								<TD height=30 width="15%" align=right >职位名称：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="role_rname" name="roleCustom.rname"  />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="role_rnameTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >上级职位：</TD>
								<TD class=category width="35%">
								<div>
								<select id="pname" name="pname" class="easyui-combotree" url="${baseurl}role/addrole_result.action" style="width:200px;"
								></select> <!-- multiple="true" --> 
								<input type="hidden" id="role_pname" name="roleCustom.pname" />
								</div>
								
								</TD>
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="rolesave()">提交</a>
								<a id="closebtn"  class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
							  </td>
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