package lession8.test4;

public class Student {
	private String no;
	private String name;
	private int age;
	private double score;

	public Student(String no, String name, int age, double score) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
