package lession5.homework;

public class StudentTest {

	public static void main(String[] args) {
		Object[] ary = new Object[3];

		Student student = new Student();
		student.setNo("1");
		student.setClassNo("001");
		student.setName("����");
		student.setSex("��");
		student.setAge(10);
		student.setTotal(10);

		Student student1 = new Student();
		student1.setNo("2");
		student1.setClassNo("002");
		student1.setName("����");
		student1.setSex("Ů");
		student1.setAge(20);
		student1.setTotal(10);

		Student student2 = new Student();
		student2.setNo("2");
		student2.setClassNo("003");
		student2.setName("����");
		student2.setSex("��");
		student2.setAge(11);
		student2.setTotal(10);
		ary[0] = student;
		ary[1] = student1;
		ary[2] = student2;
		System.out.println(student.toString());
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println("���鳤�ȣ�" + ary.length);
	}

}
