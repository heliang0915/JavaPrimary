package lession11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("今天是全年的第D天 全年的第w星期 星期是E 一个月的第d天  一个月的第W个星期 区时z");
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH 24小时制
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // hh 十二小时制

		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));

	}

}
