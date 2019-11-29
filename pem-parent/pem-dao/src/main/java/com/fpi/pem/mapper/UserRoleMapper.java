package com.fpi.pem.mapper;

import com.fpi.pem.entity.PemUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRoleMapper {

    List<PemUserRole> roleListByUserId(Integer userId);
}
