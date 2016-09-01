package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgPrivilege;
import hyd.base.pojo.po.OrgPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgPrivilegeMapper {
    int countByExample(OrgPrivilegeExample example);

    int deleteByExample(OrgPrivilegeExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgPrivilege record);

    int insertSelective(OrgPrivilege record);

    List<OrgPrivilege> selectByExample(OrgPrivilegeExample example);

    OrgPrivilege selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgPrivilege record, @Param("example") OrgPrivilegeExample example);

    int updateByExample(@Param("record") OrgPrivilege record, @Param("example") OrgPrivilegeExample example);

    int updateByPrimaryKeySelective(OrgPrivilege record);

    int updateByPrimaryKey(OrgPrivilege record);
}