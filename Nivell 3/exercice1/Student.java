package exercice1;

public class Student {
	private String name;
	private String course;
	private int mark;
	private int age;
	
	
	public Student(String name, String course, int mark, int age) {
		this.name = name;
		this.course = course;
		this.mark = mark;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
