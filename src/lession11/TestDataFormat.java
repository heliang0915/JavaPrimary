package lession11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("������ȫ��ĵ�D�� ȫ��ĵ�w���� ������E һ���µĵ�d��  һ���µĵ�W������ ��ʱz");
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH 24Сʱ��
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // hh ʮ��Сʱ��

		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));

	}

}
