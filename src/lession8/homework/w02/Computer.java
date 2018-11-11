package lession8.homework.w02;

/**
 * 电脑类
 * 
 * @Description:电脑类
 * @author: 何良
 * @date: 20181104
 */
public class Computer {
	private USB usb; // 类的聚集

	public Computer(USB usb) {
		this.usb = usb;
	}
	
	public void computerRead() {
		System.out.println("电脑开始执行读取操作");
		usb.read();
	}

	public void computerWrite() {
		System.out.println("电脑开始执行写入操作");
		usb.write();
	}
}
