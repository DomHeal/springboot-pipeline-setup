package com.dominicheal.restcontrollers;

import com.dominicheal.SpringBootWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWebApplication.class)
public class HelloRestControllerTests {

    @Autowired
    private HelloRestController helloRestController;

    @Test
    public void getHelloWorldTest(){
        assertEquals("Hello World", helloRestController.getHelloWorld());
    }
}
