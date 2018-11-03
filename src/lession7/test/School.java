package lession7.test;


public class School {
	private String schoolName;
	private int className;

	public void showInfo() {
		System.out.println("学校名称：" + this.schoolName + "\n班级数量：" + this.className);
	}

	public static void main(String[] args) {
		School s1 = new School();
		School s2 = new School();
		School s3 = new School();
		s1.className = 30;
		s1.schoolName = "北京科技大学";
//		s1.showInfo();
		s2 = s1;
		s2.className = 40;
		s2.schoolName="北京信息大学";
		s2.showInfo();
		s1.showInfo();
		s3.className=50;
		s3.schoolName="北京民族大学";
		s3.showInfo();
	}
}
