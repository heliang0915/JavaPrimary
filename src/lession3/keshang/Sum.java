package lession3.keshang;
import org.junit.*;
/**
 * 3������1��100���ۼӺ͡�
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		Sum fortest = new Sum();
		System.out.println("forѭ�����100�ĺ�" + fortest.forSum());
		System.out.println("whileѭ�����100�ĺ�" + fortest.whileSum());
		System.out.println("do...whileѭ�����100�ĺ�" + fortest.doWhileSum());
//		fortest.computedPow();
	}

	public int forSum() {
		int sumNum = 0;
		for (int i = 1; i <= 100; i++) {
			sumNum += i;
		}
		return sumNum;
	}

	public int whileSum() {
		int sumNum = 0;
		int i = 0;
		while (i <= 100) {
			sumNum += i;
			i++;
		}

		return sumNum;
	}

	public int doWhileSum() {
		int sumNum = 0;
		int i = 0;
		do {
			sumNum += i;
			i++;
		} while (i <= 100);

		return sumNum;
	}
	
	
//	/**
//	 * 4.����1^2+2^2+3^2+...+i^2...���������5000ʱֹͣ���㣬�������Ͷ�Ӧ��iֵ��
//	*/
//	@Test
//	public void computedPow(){
//		int sum=0;
//		for(int i=1;;i++) {
//			 sum+=Math.pow(i,2);
//			 if(sum>5000) {
//				 System.out.println("i��ֵΪ:"+i);
//				 System.out.println("���Ϊ:"+sum);
//				 break;
//			 }
//		}
//	}
	
	
//	/**
//	 * 5�������ܹ������ֻ��ŵ�ǰ��λ�ж���Ӫ�̣����������ֻ���ǰ��λ��136��137��138��139������� 
//		���ƶ����������130��131��133������������š��������186��188�����������ͨ�������������� 
//		���ֻ��ţ��������δ֪��Ӫ�̡���
//
//	 */
//	public void phone() {
//		
//		
//		
//	}
//	
	
}
