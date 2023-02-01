package net.ferrum121308.spring6.lesson2.entity.test2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 16:25
 * @Description:
 */
class DepartmentTest {

	@Test
	void testList() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-list.xml");
		Department department = context.getBean("department", Department.class);
		department.info();
	}

}
