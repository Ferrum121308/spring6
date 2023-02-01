package net.ferrum121308.spring6.lesson2;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 17:27
 * @Description:
 */
public class JDBCTest {

	@Test
	void demo1() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://192.168.56.150:3306/spring?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=UTC");
		dataSource.setUsername("remote");
		dataSource.setPassword("Tieth@121308");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	}

}
