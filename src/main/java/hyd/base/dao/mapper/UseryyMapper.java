package hyd.base.dao.mapper;

import hyd.base.pojo.po.Useryy;
import hyd.base.pojo.po.UseryyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UseryyMapper {
    int countByExample(UseryyExample example);

    int deleteByExample(UseryyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Useryy record);

    int insertSelective(Useryy record);

    List<Useryy> selectByExample(UseryyExample example);

    Useryy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Useryy record, @Param("example") UseryyExample example);

    int updateByExample(@Param("record") Useryy record, @Param("example") UseryyExample example);

    int updateByPrimaryKeySelective(Useryy record);

    int updateByPrimaryKey(Useryy record);
}