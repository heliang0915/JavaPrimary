package lession7.test;


/*
 学生信息类
 定义学生姓名、专业、数据库成绩、算法分析成绩、网络基础成绩5个成员变量。
 定义方法：
 输出学生信息；
 添加学生信息；
 计算总分；
 计算平均分
 test调用4个方法 
 */
public class StudentInfo {
	// 定义成员变量
	private String name;
	private String major;
	private double score1;
	private double score2;
	private double score3;

	// 添加学生信息
	public void setInfo(String name, String major, double score1, double score2, double score3) {
		this.name = name;
		this.major = major;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public void getInfo() {
		System.out.println("学生信息如下");
		System.out.println("学生姓名：" + this.name + "；所学专业：" + this.major + "；成绩1：" + this.score1 + "；成绩2：" + this.score2
				+ "；成绩3：" + this.score3);
	}

	// 计算总分
	public void Sum() {
		System.out.println("总成绩为：" + (this.score1 + this.score2 + this.score3));
	}

	public void avg() {
		System.out.println("平均分为：" + ((this.score1 + this.score2 + this.score3) / 3));
	}

/*	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("王平", "计算机科学与技术", 98, 90, 100);
		stu.getInfo();
		stu.Sum();
		stu.avg();
	}*/
}
