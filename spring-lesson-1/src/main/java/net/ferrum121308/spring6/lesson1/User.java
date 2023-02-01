package net.ferrum121308.spring6.lesson1;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 9:32
 * @Description:
 */
public class User {

	public void add() {
		System.out.println("add ...");
	}

	public static void main(String[] args) {
		User user = new User();
		user.add();
	}

	// 生成无参构造


	public User() {
		System.out.println("无参构造执行了！");
	}
}
