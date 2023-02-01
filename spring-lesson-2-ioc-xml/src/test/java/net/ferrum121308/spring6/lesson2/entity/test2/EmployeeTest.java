package net.ferrum121308.spring6.lesson2.entity.test2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 15:55
 * @Description:
 */
class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-relation.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.work();
		Employee employee2 = context.getBean("employee2", Employee.class);
		employee2.work();
		Employee employee3 = context.getBean("employee3", Employee.class);
		employee3.work();
	}

	@Test
	void testArray() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-array.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.work();
	}

}
