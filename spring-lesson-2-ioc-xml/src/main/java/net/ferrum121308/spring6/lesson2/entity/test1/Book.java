package net.ferrum121308.spring6.lesson2.entity.test1;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 11:45
 * @Description:
 */
public class Book {

	private String name;
	private String author;
	private String other;

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getOther() {
		return other;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Book() {
	}

	public Book(String name, String author, String other) {
		System.out.println("有参构造被调用！");
		this.name = name;
		this.author = author;
		this.other = other;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", other='" + other + '\'' +
				'}';
	}

	public static void main(String[] args) {
		// Setter方法注入
		Book book = new Book();
		book.setName("Java测试");
		book.setAuthor("test1");
		book.setOther("a <= b");

		// 通过构造器注入
		Book book1 = new Book("C++", "test2", "a < b");
	}

}
