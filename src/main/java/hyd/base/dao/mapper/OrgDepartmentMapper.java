package hyd.base.dao.mapper;

import hyd.base.pojo.po.OrgDepartment;
import hyd.base.pojo.po.OrgDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgDepartmentMapper {
    int countByExample(OrgDepartmentExample example);

    int deleteByExample(OrgDepartmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrgDepartment record);

    int insertSelective(OrgDepartment record);

    List<OrgDepartment> selectByExample(OrgDepartmentExample example);

    OrgDepartment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrgDepartment record, @Param("example") OrgDepartmentExample example);

    int updateByExample(@Param("record") OrgDepartment record, @Param("example") OrgDepartmentExample example);

    int updateByPrimaryKeySelective(OrgDepartment record);

    int updateByPrimaryKey(OrgDepartment record);
}