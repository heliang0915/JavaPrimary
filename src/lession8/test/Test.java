package lession8.test;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setId(100);
		stu1.setName("����");
		stu1.setAge(10);
		System.out.println(stu1.getMessage());
		Student stu2 = new Student(101, "����", 20);
		System.out.println(stu2.getMessage());

		Teacher t1 = new Teacher();
		t1.setTeachingAge(10);
		t1.setName("����ʦ");
		t1.setAge(30);
		System.out.println(t1.getMessage());

		Teacher t2 = new Teacher(20, "�����", 50);

		System.out.println(t2.getMessage());

	}
}
