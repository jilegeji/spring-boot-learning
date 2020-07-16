package com.jilegeji.springbootlearning.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		demo4();
	}

	private static void demo4() {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher("zhangsan",22));
		list.add(new Teacher("wangwu",24));
		list.add(new Teacher("lisi",23));
		
		System.out.println(list);
		Collections.sort(list, new Comparator<Teacher>(){
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		System.out.println(list);
	}

	private static void demo3() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("zhangsan",22));
		list.add(new Student("wangwu",24));
		list.add(new Student("lisi",23));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	private static void demo2() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(1);
		
		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("zhangsan",22));
		ts.add(new Student("zhangsan",22));
		
		System.out.println(ts);
	}

}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return this.getAge()-o.getAge();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

class Teacher{
	private String name;
	private int age;
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}