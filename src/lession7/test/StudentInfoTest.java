package lession7.test;


public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("��ƽ", "�������ѧ�뼼��", 98, 90, 100);
		stu.getInfo();
		stu.Sum();
		stu.avg();
	}

}
