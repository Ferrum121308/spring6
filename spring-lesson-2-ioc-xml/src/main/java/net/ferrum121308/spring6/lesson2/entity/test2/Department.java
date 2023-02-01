package net.ferrum121308.spring6.lesson2.entity.test2;

import java.util.List;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 15:42
 * @Description:
 */
public class Department {

	private String name;

	private List<Employee> employees;

	public void info() {
		System.out.println("部门名称：" + name);
		for (Employee employee : employees) {
			System.out.println("员工：" + employee.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department{" +
				"name='" + name + '\'' +
				", employees=" + employees +
				'}';
	}
}
