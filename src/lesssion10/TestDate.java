package lesssion10;

import java.util.Date;

import org.junit.Test;

public class TestDate {

	@Test
	public void testDate() {
		Date date = new Date();
		Date date1 = new Date(1987, 9, 14);
		System.out.println("date::" + date);
		System.out.println("date1::" + date1);

		System.out.println("Year::" + date1.getYear());
		System.out.println("Month:::" + date1.getMonth());
		System.out.println(date1.getDate());
		System.out.println(date1.getHours());
		System.out.println(date1.getMinutes());
		System.out.println(date1.getSeconds());
		System.out.println(date1.getDay());
	}
}
