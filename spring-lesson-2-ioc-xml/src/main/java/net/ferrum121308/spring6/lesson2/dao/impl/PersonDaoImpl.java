package net.ferrum121308.spring6.lesson2.dao.impl;

import net.ferrum121308.spring6.lesson2.dao.UserDao;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 11:42
 * @Description:
 */
public class PersonDaoImpl implements UserDao {
	@Override
	public void run() {
		System.out.println("Person run ...");
	}
}
