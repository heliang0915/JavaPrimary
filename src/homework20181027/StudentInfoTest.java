package homework20181027;

public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("����", "�������ѧ�뼼��", 98, 90, 80);
		StudentInfo stu2 = new StudentInfo();
		stu2.setInfo("����", "�������ѧ�뼼��", 88, 70, 90);
		stu.getInfo();
		stu2.getInfo();
		System.out.println("������Ϊ:"+StudentInfo.getTotal());
	}

}
