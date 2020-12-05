package com.project.springboot;

import com.project.springboot.bean.Person;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootHelloworldQuickApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testlog(){
        logger.trace(()->"trace日志");
        logger.debug(()->"deg日志");
        logger.info(()->"info日志");
        logger.warn(()->"warn日志");
        logger.error(()->"error日志");
    }

}
