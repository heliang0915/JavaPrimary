package lession8.test8;

import lession8.test8.inter.Runnable;
import lession8.test8.inter.Singable;

/**
 * 学生类
 * 
 * @author Administrator
 *
 */
public class Student extends Person implements Runnable, Singable {
	private int id;

	public Student() {
		System.out.println("Student无参构造");
	}

	/**
	 * 学生类有参数构造
	 * 
	 * @param id
	 *            学生学号
	 * @param name
	 *            学生姓名
	 * @param age
	 *            学生年龄
	 */
	public Student(int id, String name, int age) {
		super(name, age);
		this.id = id;
		System.out.println("Student有参构造");
	}

	@Override
	public String getMessage() {
		return "学号" + id + super.getMessage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void sing() {
		System.out.println("学生" + canSing);

	}

	@Override
	public void run() {
		System.out.println("学生" + canRun);
	}

}
