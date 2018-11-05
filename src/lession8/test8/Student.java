package lession8.test8;

import lession8.test8.inter.Runnable;
import lession8.test8.inter.Singable;

/**
 * ѧ����
 * 
 * @author Administrator
 *
 */
public class Student extends Person implements Runnable, Singable {
	private int id;

	public Student() {
		System.out.println("Student�޲ι���");
	}

	/**
	 * ѧ�����в�������
	 * 
	 * @param id
	 *            ѧ��ѧ��
	 * @param name
	 *            ѧ������
	 * @param age
	 *            ѧ������
	 */
	public Student(int id, String name, int age) {
		super(name, age);
		this.id = id;
		System.out.println("Student�вι���");
	}

	@Override
	public String getMessage() {
		return "ѧ��" + id + super.getMessage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void sing() {
		System.out.println("ѧ��" + canSing);

	}

	@Override
	public void run() {
		System.out.println("ѧ��" + canRun);
	}

}
