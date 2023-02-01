package net.ferrum121308.spring6.lesson2;

import net.ferrum121308.spring6.lesson2.entity.test1.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 15:01
 * @Description:
 */
class BookTest {

	@Test
	void testSetter() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-book.xml");
		Book book = context.getBean("book", Book.class);
		System.out.println(book.toString());
	}

	@Test
	void testConstructor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-book.xml");
		Book book = context.getBean("book2", Book.class);
		System.out.println(book.toString());
	}

}
