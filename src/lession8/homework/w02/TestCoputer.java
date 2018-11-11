package lession8.homework.w02;

public class TestCoputer {

	public static void main(String[] args) {
		// 实例化U盘
		UDisk u = new UDisk();
		// 实例化移动硬盘
		MobileHardDisk mhd = new MobileHardDisk();
		
		Computer pc = new Computer(u);
		pc.computerRead();
		pc.computerWrite();

		Computer pc2 = new Computer(mhd);
		pc2.computerRead();
		pc2.computerWrite();
	}

}
