package lession7.test;

//�̳У�������д
public class Cat extends Animal{

	public void sounds() {
		System.out.println("è������");
	}

	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.sounds();
		cat1.doRun();
	}

}
