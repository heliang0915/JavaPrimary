package homework20181027;

public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("张三", "计算机科学与技术", 98, 90, 80);
		StudentInfo stu2 = new StudentInfo();
		stu2.setInfo("李四", "计算机科学与技术", 88, 70, 90);
		stu.getInfo();
		stu2.getInfo();
		System.out.println("总人数为:"+StudentInfo.getTotal());
	}

}
