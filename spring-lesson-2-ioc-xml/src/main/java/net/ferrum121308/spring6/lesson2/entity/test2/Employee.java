package net.ferrum121308.spring6.lesson2.entity.test2;

import java.util.Arrays;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 15:41
 * @Description:
 */
public class Employee {

	private String name;
	private Integer age;

	private String[] hobby;

	// 连接关系
	private Department department;


	public void work() {
		System.out.println(name + "employee is working! He's age is " + age);
		department.info();
		System.out.println("This person's hobby is " + Arrays.toString(hobby));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
