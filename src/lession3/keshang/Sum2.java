package lession3.keshang;

/**
 * 7����1��100���ܱ�3����������֮�͡�
 * @author Administrator
 *
 */
public class Sum2 {
	public static void main(String[] args) {
		Sum2 su=new Sum2();
		su.sum2();
	}

	public void sum2() {
		int sum = 0;
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 100; i++) {
			if (i % 3 != 0) { // ���ܱ�3����
				sum += i;
				sb.append(" ").append(i);
				
			}
		}
		System.out.println("���ܱ���������������:"+sb);
		System.out.println("���ܱ�3����������֮��Ϊ" + sum);
	}
}
