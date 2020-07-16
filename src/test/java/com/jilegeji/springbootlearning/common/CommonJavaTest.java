package com.jilegeji.springbootlearning.common;

import org.junit.Test;
import com.alibaba.fastjson.JSON;
import com.jilegeji.springbootlearning.bean.Dog;

public class CommonJavaTest {

	@Test
	public void TestBean2Json(){
		Dog dog = new Dog("大黄",1);
		System.out.println(JSON.toJSONString(dog));
	}
}
