package lession7.teststatic;

public class Person {

	private static final String nationality;
	private static  boolean loaded=false;
	private int age;
	private String name;

	static {
		nationality = "中国";
		System.out.println("静态代码块执行... 此处可执行装在缓存动作");

	}
	{
		age = 0;
		System.out.println("非静态代码块执行...");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("构造函数执行....");
	}

	@Override
	public String toString() {
		return "名字:" + this.name + "" + ",年龄：" + this.age + ",国别：" + Person.nationality;
	}

	public static void main(String[] args) {
		System.out.println("程序开始运行");
		Person.loaded=true;
		Person p1 = new Person("张三");
		Person p2 = new Person("李四");

		System.out.println(p1);
		System.out.println(p2);

	}
}
