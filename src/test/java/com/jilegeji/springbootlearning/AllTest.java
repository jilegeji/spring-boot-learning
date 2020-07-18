package com.jilegeji.springbootlearning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jilegeji.springbootlearning.bean.Dog;
import com.jilegeji.springbootlearning.controller.FirstController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AllTest {
	
    @Autowired
    private FirstController firstController;
 
    @Test
     public void testSLF4j(){
    	firstController.testSLF4j(new Dog());
     }
 
 
}