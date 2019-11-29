package com.fpi.pem.controller;

import com.fpi.pem.entity.PemUser;
import com.fpi.pem.service.PemUserService;
import com.fpi.pem.entity.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private PemUserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RespBean addUser(PemUser user) {
        RespBean respBean = userService.regUser(user);
        return respBean;
    }

}
