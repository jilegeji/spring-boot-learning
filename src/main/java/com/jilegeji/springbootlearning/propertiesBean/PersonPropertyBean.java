package com.jilegeji.springbootlearning.propertiesBean;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.jilegeji.springbootlearning.bean.Dog;

@Component
@ConfigurationProperties(prefix="person2")
public class PersonPropertyBean {
	
	private String name;
	private int age;
	private String sex;
	
	private Dog dog;
	private List<String> outlook;
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public List<String> getOutlook() {
		return outlook;
	}
	public void setOutlook(List<String> outlook) {
		this.outlook = outlook;
	}
	@Override
	public String toString() {
		return "PersonPropertiesBean [name=" + name + ", age=" + age + ", sex=" + sex + ", dog=" + dog + ", outlook="
				+ outlook + "]";
	}
	
}