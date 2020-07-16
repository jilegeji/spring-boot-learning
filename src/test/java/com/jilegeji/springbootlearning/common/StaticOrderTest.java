package com.jilegeji.springbootlearning.common;

public class StaticOrderTest {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.a);
	}

}
class Person{
	static{
		System.out.println("first");
	}
	public static int b=2;
	{a=2;}
	Person(){
		a=3;
	}
	public int a=1;
}