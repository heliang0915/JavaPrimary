package lession8.test;

/**
 * ��ʦ��
 * 
 * @author Administrator
 *
 */
public class Teacher extends Person {
	private int teachingAge;// ����

	/**
	 * Ĭ���޲ι���
	 */
	public Teacher() {
		System.out.println("TeacherĬ���޲ι���");
	}

	/**
	 * �в�������
	 * 
	 * @param teachingAge
	 *            ��ʦ����
	 * @param name
	 *            ����
	 * @param age
	 *            ����
	 */
	public Teacher(int teachingAge, String name, int age) {
		super(name, age);
		this.teachingAge = teachingAge;
		System.out.println("Teacher�в�������");
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
		return "��ʦ����Ϊ:" + teachingAge + super.getMessage();
	}

}
