package lession7.test;


public class School {
	private String schoolName;
	private int className;

	public void showInfo() {
		System.out.println("ѧУ���ƣ�" + this.schoolName + "\n�༶������" + this.className);
	}

	public static void main(String[] args) {
		School s1 = new School();
		School s2 = new School();
		School s3 = new School();
		s1.className = 30;
		s1.schoolName = "�����Ƽ���ѧ";
//		s1.showInfo();
		s2 = s1;
		s2.className = 40;
		s2.schoolName="������Ϣ��ѧ";
		s2.showInfo();
		s1.showInfo();
		s3.className=50;
		s3.schoolName="���������ѧ";
		s3.showInfo();
	}
}
