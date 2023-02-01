package net.ferrum121308.spring6.lesson2;

import net.ferrum121308.spring6.lesson2.entity.test1.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 11:26
 * @Description:
 */
class UserTest {

	private final static Logger log = LoggerFactory.getLogger(UserTest.class);

	public static void main(String[] args) {
		// 1.根据Id获取Bean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user1 = (User) context.getBean("user");
		log.info("根据Id获取Bean：{}", user1);

		// 2.根据类型获取Bean
		User user2 = context.getBean(User.class);
		log.info("根据类型获取Bean：{}", user2);

		// 3.根据Id和类型获取Bean
		User user3 = context.getBean("user", User.class);
		log.info("根据Id和类型获取Bean：{}", user3);
	}

}
