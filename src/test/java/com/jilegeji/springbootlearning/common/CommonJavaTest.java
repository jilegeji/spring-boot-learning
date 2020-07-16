package com.jilegeji.springbootlearning.common;

import java.util.Arrays;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.jilegeji.springbootlearning.bean.Dog;

public class CommonJavaTest {

	@Test
	public void TestBean2Json(){
		Dog dog = new Dog("大黄",1);
		System.out.println(JSON.toJSONString(dog));
	}
	
	@Test
	public void bubbleSort(){
		Integer[] arr = new Integer[]{2,56,43,36,27,85,1,68,32};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.asList(arr));
	}
}
