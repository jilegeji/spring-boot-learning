package com.jilegeji.springbootlearning.common;

//���߳��±��
public class DiguiTest {
	
	public static int times = 0;
	
	public static int total = 0;

	public static void main(String[] args) {
		System.out.println(100%3.0);
		drink(50);
	}
	
	public static void drink(int source){
		if(source>3){
			source=source-2;
			times++;
			total+=3;
			drink(source);
		}else{
			total+=source;
			System.out.println(times);
			System.out.println(total);
		}
	}
}
