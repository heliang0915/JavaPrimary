package lession7.test;

//子类重写
public class DogOverride extends Animal {

	public void doRun() {
		System.out.println("狗有四条腿，会跑！");
	}
	
	public void sounds() {
		System.out.println("狗汪汪叫");
	}

	public static void main(String[] args) {
		DogOverride dog2 = new DogOverride();
		dog2.doRun();
		dog2.doEat();
		dog2.sounds();
	}

}
