package com.fpi.pem.service;

import com.fpi.pem.entity.PemRole;
import com.fpi.pem.entity.PemUser;
import com.fpi.pem.entity.PemUserRole;
import com.fpi.pem.mapper.PemRoleMapper;
import com.fpi.pem.mapper.PemUserMapper;
import com.fpi.pem.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service("userDetailService")
public class PemUserDetailsService implements UserDetailsService {
    @Autowired
    private PemUserMapper userMapper;

    @Autowired
    private PemRoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> auths = new ArrayList<>();
        PemUser user = userMapper.getUserByName(username);
        if(user==null){
            throw new UsernameNotFoundException("该用户不存在！!!!");
        }
        List<PemUserRole> roles = userRoleMapper.roleListByUserId(user.getId());
        for (PemUserRole role : roles) {
            PemRole r = roleMapper.getRoleByRoleId(role.getRoleId());
            auths.add(new SimpleGrantedAuthority(r.getName()));
        }
        return new User(user.getName(),user.getPassword(),auths);
    }
    

}
