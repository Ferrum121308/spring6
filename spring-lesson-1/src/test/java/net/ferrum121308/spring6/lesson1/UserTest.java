package net.ferrum121308.spring6.lesson1;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 9:44
 * @Description:
 */
class UserTest {

	private Logger log = LoggerFactory.getLogger(UserTest.class);

	@Test
	void testUserObject() {
		// 1.加载配置文件，对象创建
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// 2.获取创建的对象
		User user = (User) context.getBean("user");
		System.out.println(user);

		// 3.使用对象调用方法
		user.add();
		log.info("执行成功~");
	}

	@Test
	void testUserObjectReflect() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// 获取类Class对象
		Class clazz = Class.forName("net.ferrum121308.spring6.lesson1.User");
		// 调用方法创建对象
		User user = (User) clazz.getDeclaredConstructor().newInstance();
		System.out.println(user);

	}

}
