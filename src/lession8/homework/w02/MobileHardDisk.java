package lession8.homework.w02;

/**
 * 定义移动硬盘类
 * 
 * @Description: 定义移动硬盘类
 * @author: 何良
 * @date: @date
 */
public class MobileHardDisk implements USB {

	@Override
	public void read() {
		System.out.println("移动硬盘读取...");
	}

	@Override
	public void write() {
		System.out.println("移动硬盘写入...");

	}

}
