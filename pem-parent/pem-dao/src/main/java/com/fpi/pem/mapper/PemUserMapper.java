package com.fpi.pem.mapper;


import com.fpi.pem.entity.PemUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PemUserMapper {

    PemUser getUserByName(String username);


    void insertUser(PemUser user);
}
