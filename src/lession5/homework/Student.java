package lession5.homework;

/**
 * 75ҳ 4��
 * 
 * @Title: Student.java
 * @Package lession5.homework
 * @author: ������18 17����
 * @date: 2018��10��23�� ����9:15:29
 */
public class Student {
	// ѧ��
	private String no;
	// ���
	private String classNo;
	// ����
	private String name;
	// �Ա�
	private String sex;
	// ����
	private int age;
	// �༶����
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
