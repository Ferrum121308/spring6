package net.ferrum121308.spring6.lesson2.entity.test3;

/**
 * @Auther: th
 * @CreateTime: 2023/2/1 16:43
 * @Description:
 */
public class Lesson {

	private String lessonName;

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	@Override
	public String toString() {
		return "Lesson{" +
				"lessonName='" + lessonName + '\'' +
				'}';
	}
}
