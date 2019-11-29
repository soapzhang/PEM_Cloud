package com.fpi.pem;

import com.fpi.pem.service.mq.RabbitMqPublish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PemWebApplicationTests {
    @Autowired
    private RabbitMqPublish rabbitMqPublish;
//
//    @Autowired
//    private HelloReceiver helloReceiver;

    @Test
    public void hello() {

    }
}
