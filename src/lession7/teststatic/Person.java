package lession7.teststatic;

public class Person {

	private static final String nationality;
	private static  boolean loaded=false;
	private int age;
	private String name;

	static {
		nationality = "�й�";
		System.out.println("��̬�����ִ��... �˴���ִ��װ�ڻ��涯��");

	}
	{
		age = 0;
		System.out.println("�Ǿ�̬�����ִ��...");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("���캯��ִ��....");
	}

	@Override
	public String toString() {
		return "����:" + this.name + "" + ",���䣺" + this.age + ",����" + Person.nationality;
	}

	public static void main(String[] args) {
		System.out.println("����ʼ����");
		Person.loaded=true;
		Person p1 = new Person("����");
		Person p2 = new Person("����");

		System.out.println(p1);
		System.out.println(p2);

	}
}
