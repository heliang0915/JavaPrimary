package lession7.test;


public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("王平", "计算机科学与技术", 98, 90, 100);
		stu.getInfo();
		stu.Sum();
		stu.avg();
	}

}
