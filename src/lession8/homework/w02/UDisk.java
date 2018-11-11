package lession8.homework.w02;

/**
 * 定义U盘类 实现了USB方法
 * 
 * @Description: 定义U盘类 实现了USB方法
 * @author: 何良
 * @date: @date
 */
public class UDisk implements USB {

	@Override
	public void read() {
		System.out.println("U盘读取...");

	}

	@Override
	public void write() {
		System.out.println("U盘写入...");

	}

}
