package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgRole;
import hyd.base.pojo.po.OrgRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgRoleMapper {
    int countByExample(OrgRoleExample example);

    int deleteByExample(OrgRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgRole record);

    int insertSelective(OrgRole record);

    List<OrgRole> selectByExample(OrgRoleExample example);

    OrgRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgRole record, @Param("example") OrgRoleExample example);

    int updateByExample(@Param("record") OrgRole record, @Param("example") OrgRoleExample example);

    int updateByPrimaryKeySelective(OrgRole record);

    int updateByPrimaryKey(OrgRole record);
}