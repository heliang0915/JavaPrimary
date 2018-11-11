package lession3.keshang;
import org.junit.*;
/**
 * 3、计算1到100的累加和。
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		Sum fortest = new Sum();
		System.out.println("for循环输出100的和" + fortest.forSum());
		System.out.println("while循环输出100的和" + fortest.whileSum());
		System.out.println("do...while循环输出100的和" + fortest.doWhileSum());
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
//	 * 4.计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
//	*/
//	@Test
//	public void computedPow(){
//		int sum=0;
//		for(int i=1;;i++) {
//			 sum+=Math.pow(i,2);
//			 if(sum>5000) {
//				 System.out.println("i的值为:"+i);
//				 System.out.println("结果为:"+sum);
//				 break;
//			 }
//		}
//	}
	
	
//	/**
//	 * 5、假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，则输出 
//		“移动”、如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。如果输入的其 
//		他手机号，则输出“未知运营商”。
//
//	 */
//	public void phone() {
//		
//		
//		
//	}
//	
	
}
