package lession7.test;

//������д
public class DogOverride extends Animal {

	public void doRun() {
		System.out.println("���������ȣ����ܣ�");
	}
	
	public void sounds() {
		System.out.println("��������");
	}

	public static void main(String[] args) {
		DogOverride dog2 = new DogOverride();
		dog2.doRun();
		dog2.doEat();
		dog2.sounds();
	}

}
