package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgUserRole;
import hyd.base.pojo.po.OrgUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgUserRoleMapper {
    int countByExample(OrgUserRoleExample example);

    int deleteByExample(OrgUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgUserRole record);

    int insertSelective(OrgUserRole record);

    List<OrgUserRole> selectByExample(OrgUserRoleExample example);

    OrgUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgUserRole record, @Param("example") OrgUserRoleExample example);

    int updateByExample(@Param("record") OrgUserRole record, @Param("example") OrgUserRoleExample example);

    int updateByPrimaryKeySelective(OrgUserRole record);

    int updateByPrimaryKey(OrgUserRole record);
}