package lession8.homework.w02;

public class TestCoputer {

	public static void main(String[] args) {
		// ʵ����U��
		UDisk u = new UDisk();
		// ʵ�����ƶ�Ӳ��
		MobileHardDisk mhd = new MobileHardDisk();
		
		Computer pc = new Computer(u);
		pc.computerRead();
		pc.computerWrite();

		Computer pc2 = new Computer(mhd);
		pc2.computerRead();
		pc2.computerWrite();
	}

}
