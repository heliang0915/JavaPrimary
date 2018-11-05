package lession8.test8;

public class TestInterface {
	public static void main(String[] args) {
		Student p = new Student(1, "张三", 10);
		Teacher p2 = new Teacher(1, "李老师", 20);

		System.out.println(p.getMessage());
		p.sing();
		p.run();

		System.out.println(p2.getMessage());
		p2.sing();

	}
}
