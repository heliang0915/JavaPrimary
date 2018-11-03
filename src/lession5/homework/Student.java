package lession5.homework;

/**
 * 75页 4题
 * 
 * @Title: Student.java
 * @Package lession5.homework
 * @author: 计续本18 17何良
 * @date: 2018年10月23日 下午9:15:29
 */
public class Student {
	// 学号
	private String no;
	// 班号
	private String classNo;
	// 姓名
	private String name;
	// 性别
	private String sex;
	// 年龄
	private int age;
	// 班级总数
	private int total;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", classNo=" + classNo + ", name=" + name + ", sex=" + sex + ", age=" + age
				+ ", total=" + total+"]";
	}
	
	

}
