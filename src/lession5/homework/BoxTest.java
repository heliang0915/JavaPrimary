package lession5.homework;


public class BoxTest {
	public static void main(String[] args) {
		 Box box=new Box(1,2,3);
		 System.out.println("立方体体积："+box.boxVolume());
		 box.setL(5);
		 System.out.println("立方体体积："+box.boxVolume());
	}
}
