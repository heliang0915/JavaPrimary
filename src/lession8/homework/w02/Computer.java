package lession8.homework.w02;

/**
 * ������
 * 
 * @Description:������
 * @author: ����
 * @date: 20181104
 */
public class Computer {
	private USB usb; // ��ľۼ�

	public Computer(USB usb) {
		this.usb = usb;
	}
	
	public void computerRead() {
		System.out.println("���Կ�ʼִ�ж�ȡ����");
		usb.read();
	}

	public void computerWrite() {
		System.out.println("���Կ�ʼִ��д�����");
		usb.write();
	}
}
