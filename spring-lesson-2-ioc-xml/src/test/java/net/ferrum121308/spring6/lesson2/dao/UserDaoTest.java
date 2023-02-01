package net.ferrum121308.spring6.lesson2.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 11:38
 * @Description:
 */
class UserDaoTest {

	public static final Logger log = LoggerFactory.getLogger(UserDaoTest.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// 根据类型获取接口实现类
		UserDao userDao = context.getBean(UserDao.class);
		System.out.println(userDao);
		userDao.run();
	}

}
