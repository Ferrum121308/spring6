package net.ferrum121308.spring6.lesson2.entity.test3;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 16:28
 * @Description:
 */
public class Teacher {

	private Integer teacherId;
	private String name;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"teacherId=" + teacherId +
				", name='" + name + '\'' +
				'}';
	}
}
