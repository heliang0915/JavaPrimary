package lession7.test;


//继承，子类方法
public class Dog extends Animal {
	String kinds = "";

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.doRun();
		dog1.setKinds("德牧");
		System.out.println("狗的种类为：" + dog1.kinds);
	}
}
