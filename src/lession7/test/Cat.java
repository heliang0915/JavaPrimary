package lession7.test;

//¼Ì³Ğ£¬×ÓÀàÖØĞ´
public class Cat extends Animal{

	public void sounds() {
		System.out.println("Ã¨ß÷ß÷½Ğ");
	}

	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.sounds();
		cat1.doRun();
	}

}
