package lession5.homework;


public class BoxTest {
	public static void main(String[] args) {
		 Box box=new Box(1,2,3);
		 System.out.println("�����������"+box.boxVolume());
		 box.setL(5);
		 System.out.println("�����������"+box.boxVolume());
	}
}
