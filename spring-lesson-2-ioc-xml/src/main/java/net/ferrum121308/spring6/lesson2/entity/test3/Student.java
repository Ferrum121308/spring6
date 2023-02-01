package net.ferrum121308.spring6.lesson2.entity.test3;

import java.util.List;
import java.util.Map;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 16:27
 * @Description:
 */
public class Student {

	private Integer studentId;
	private String name;

	private Map<String, Teacher> teacherMap;
	private List<Lesson> lessons;

	public void studentRun() {
		System.out.println(
				"学生编号：" + studentId + "\n"
				+ "学生名字：" + name
		);
		System.out.println(teacherMap.toString());
		System.out.println(lessons.toString());
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Teacher> getTeacherMap() {
		return teacherMap;
	}

	public void setTeacherMap(Map<String, Teacher> teacherMap) {
		this.teacherMap = teacherMap;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
}
