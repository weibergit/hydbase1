package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgRolePrivilege;
import hyd.base.pojo.po.OrgRolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgRolePrivilegeMapper {
    int countByExample(OrgRolePrivilegeExample example);

    int deleteByExample(OrgRolePrivilegeExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgRolePrivilege record);

    int insertSelective(OrgRolePrivilege record);

    List<OrgRolePrivilege> selectByExample(OrgRolePrivilegeExample example);

    OrgRolePrivilege selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgRolePrivilege record, @Param("example") OrgRolePrivilegeExample example);

    int updateByExample(@Param("record") OrgRolePrivilege record, @Param("example") OrgRolePrivilegeExample example);

    int updateByPrimaryKeySelective(OrgRolePrivilege record);

    int updateByPrimaryKey(OrgRolePrivilege record);
}