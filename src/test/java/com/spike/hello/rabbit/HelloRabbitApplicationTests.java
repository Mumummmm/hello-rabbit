package com.spike.hello.rabbit;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloRabbitApplication.class)
class HelloRabbitApplicationTests {

    @Autowired
    private RabbitProvider rabbitProvider;

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            rabbitProvider.send();
        }
    }

}
