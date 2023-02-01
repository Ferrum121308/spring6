package net.ferrum121308.spring6.lesson2.entity.test3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 16:39
 * @Description:
 */
class StudentTest {

	@Test
	void testMap() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-map.xml");
		Student student = context.getBean("student", Student.class);
		student.studentRun();
	}

	@Test
	void testUtil() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-ref.xml");
		Student student = context.getBean("student", Student.class);
		student.studentRun();
	}

}
