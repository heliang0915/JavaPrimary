package lession8.homework.w02;

/**
 * ����U���� ʵ����USB����
 * 
 * @Description: ����U���� ʵ����USB����
 * @author: ����
 * @date: @date
 */
public class UDisk implements USB {

	@Override
	public void read() {
		System.out.println("U�̶�ȡ...");

	}

	@Override
	public void write() {
		System.out.println("U��д��...");

	}

}
