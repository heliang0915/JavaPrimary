package lession8.test8;

import lession8.test8.inter.Singable;

/**
 * 教师类
 * 
 * @author Administrator
 *
 */
public class Teacher extends Person implements Singable {
	private int teachingAge;// 工龄

	/**
	 * 默认无参构造
	 */
	public Teacher() {
		System.out.println("Teacher默认无参构造");
	}

	/**
	 * 有参数构造
	 * 
	 * @param teachingAge
	 *            教师工龄
	 * @param name
	 *            姓名
	 * @param age
	 *            年龄
	 */
	public Teacher(int teachingAge, String name, int age) {
		super(name, age);
		this.teachingAge = teachingAge;
		System.out.println("Teacher有参数构造");
	}

	public int getTeachingAge() {
		return teachingAge;
	}

	public void setTeachingAge(int teachingAge) {
		this.teachingAge = teachingAge;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "教师工龄为:" + teachingAge + super.getMessage();
	}

	@Override
	public void sing() {
		System.out.println("老师" + canSing);
	}

}
