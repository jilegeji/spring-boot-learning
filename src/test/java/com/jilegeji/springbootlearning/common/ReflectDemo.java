package com.jilegeji.springbootlearning.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class<ReflectBean> clz = ReflectBean.class;
		Field[] fields = clz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("=========================");
		Field[] declaredFields = clz.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			System.out.println(declaredField);
		}
		System.out.println("=========================");
		Method[] methods = clz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("=========================");
		Method[] declaredMethods = clz.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {
			System.out.println(declaredMethod);
			declaredMethod.setAccessible(true);
			declaredMethod.invoke(new ReflectBean());
		}
		System.out.println("=========================");
	}

}

@SuppressWarnings(value="all")
class ReflectBean{
	public String name;
	private int age;
	
	public void method(){
		System.out.println("ִ��public��method()");
	}
	
	private void secretMethod(){
		System.out.println("ִ��private��secretMethod()");
	}
}