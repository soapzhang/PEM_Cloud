package com.fpi.pem.service;

import com.alibaba.fastjson.JSON;
import com.fpi.pem.entity.PemUser;
import com.fpi.pem.entity.RespBean;
import com.fpi.pem.mapper.PemUserMapper;
import com.fpi.pem.service.mq.RabbitMqPublish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PemUserService {

    @Autowired
    private PemUserMapper userMapper;

    @Autowired
    private RabbitMqPublish rabbitMqPublish;
    /**
     * 创建成功，发送创建成功的消息，内容包括username，name，sex
     * @param user
     * @return
     */
    public RespBean regUser(PemUser user){
        userMapper.insertUser(user);
        rabbitMqPublish.publish("user-reg-q", JSON.toJSONString(user));
        return RespBean.ok("创建成功!");
    }
}
