package homework20181027;

/*
 学生信息类
 定义学生姓名、专业、数据库成绩、算法分析成绩、网络基础成绩5个成员变量。
 定义方法：
 输出学生信息；
 添加学生信息；
 计算总分；
 计算平均分
 */
public class StudentInfo {
	private String no; // 学号
	private static int total; // 学生总人数
	// 定义成员变量
	private String name;
	private String major;
	private double score1;
	private double score2;
	private double score3;

	// 获取学号
	public String getNo() {
		return no;
	}

	// 获取学生总数
	public static int getTotal() {
		return total;
	}

	// 添加学生信息
	public void setInfo(String name, String major, double score1, double score2, double score3) {
		this.name = name;
		this.major = major;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		StudentInfo.total++;
		if (StudentInfo.total < 9) {
			this.no = "20180" + StudentInfo.total;
		} else {
			this.no = "2018" + StudentInfo.total;
		}
	}

	public void getInfo() {
		System.out.println("学生信息如下");
		System.out.println("学生学号：" + this.no + ";学生姓名：" + this.name + "；所学专业：" + this.major + "；成绩1：" + this.score1
				+ "；成绩2：" + this.score2 + "；成绩3：" + this.score3);
	}

	// 计算总分
	public void Sum() {
		System.out.println("总成绩为：" + (this.score1 + this.score2 + this.score3));
	}

	public void avg() {
		System.out.println("平均分为：" + ((this.score1 + this.score2 + this.score3) / 3));
	}

}
