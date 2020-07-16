package com.jilegeji.springbootlearning.common;

public class SigletonDemo {

	public static void main(String[] args) {

	}

}
//����ʽ
class Singleton{
	
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}