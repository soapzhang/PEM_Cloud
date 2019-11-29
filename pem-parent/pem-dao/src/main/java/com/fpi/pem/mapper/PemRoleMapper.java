package com.fpi.pem.mapper;

import com.fpi.pem.entity.PemRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PemRoleMapper {

    @Select("select * from pem_role where id = #{roleId}")
    PemRole getRoleByRoleId(Integer roleId);
}
