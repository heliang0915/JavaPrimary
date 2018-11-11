package lesssion10;

import java.util.Calendar;

import org.junit.Test;

public class TestCalender {

	@Test
	public void testCalender() {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.get(Calendar.YEAR) + "年" + (ca.get(Calendar.MONTH) + 1) + "月" + ca.get(Calendar.DATE));
		// System.out.println(ca.get(Calendar.YEAR));// 年
		// System.out.println(ca.get(Calendar.MONTH));// 月
		// System.out.println("DAY_OF_MONTH::::" + ca.get(Calendar.DAY_OF_MONTH)); //
		//
		// System.out.println("DATE::::" + ca.get(Calendar.DATE));// 日
		//
		// System.out.println("12小时制:" + ca.get(Calendar.HOUR));// 时 12小时制
		// System.out.println("24小时制:" + ca.get(Calendar.HOUR_OF_DAY)); // 24小时制
		//
		// System.out.println(ca.get(Calendar.MINUTE));// 分
		// System.out.println(ca.get(Calendar.MINUTE));// 秒
		// System.out.println(ca.get(Calendar.DAY_OF_WEEK));// 星期
		//
		// ca.add(Calendar.DATE, 10);
		// System.out.println(ca.get(Calendar.DATE));
		//
		// System.out.println(ca.get(Calendar.YEAR) + "年" + (ca.get(Calendar.MONTH) + 1)
		// + "月" + ca.get(Calendar.DATE));
		//
		// Calendar ca1 = Calendar.getInstance();
		//
		// System.out.println(ca1.after(ca));
		// System.out.println(ca.after(ca1));
		//
		// long t1 = ca1.getTimeInMillis();
		// System.out.println(t1);
		// t1 += 10000 * 3600;
		// ca1.setTimeInMillis(t1);
		// System.out.println(ca1.get(Calendar.YEAR) + "年" + (ca1.get(Calendar.MONTH) +
		// 1) + "月" + ca1.get(Calendar.DATE));
		//
		// System.out.println(ca.compareTo(ca1)); // ca>ca1 返回1
		// System.out.println(ca1.compareTo(ca)); // ca<ca1 返回-1

		System.out.println(showCalender(ca));
		System.out.println();
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.MONTH, 11); //设置为2018.12
		System.out.println(showCalender(ca2));

	}

	private String showCalender(Calendar ca) {
		StringBuffer ary = new StringBuffer("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		ca.set(Calendar.DATE, 1);// 本月的第一天
		int week = ca.get(Calendar.DAY_OF_WEEK);
		week = week - 1;// 得到真正的星期

		System.out.println("week:::::::" + week);
		int maxDay = ca.getActualMaximum(Calendar.DATE);
		// System.out.println(maxDay);
		ary.append("\n");
		for (int i = 0; i < week; i++) {
			ary.append("\t");
			// System.out.print("\t");
		}

		for (int i = 0; i < maxDay; i++) {
			if ((i + week) % 7 == 0) {
				ary.append("\n");
			}
			ary.append((i + 1) + "\t");
		}

		return ary.toString();
		// System.out.print(ary);
	}
}
