package lession8.test;

/**
 * ѧ����
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
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

}
