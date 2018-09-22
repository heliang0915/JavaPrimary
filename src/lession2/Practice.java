package lession2;
import org.junit.Test;
public class Practice {
	
	public static void main(String[] args) {
		Practice pr=new Practice();
//		pr.test1();
//		pr.test2();
		pr.test3();
	}
	@Test
	public void test1() {
	 char ch;
	 short shTemp;
	 shTemp=0x41;
	 System.out.println(shTemp); 
	 ch=(char)shTemp;
	 System.out.println("字符变量ch="+ch);
	}
	@Test
	public void test2() {
		final int X=5;
		final double Y=2.3;
		final long Z;
		final float Mark=3.2F;
		Z=100L;
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		System.out.println("Z="+Z);
		System.out.println("Mark="+Mark);
	}
	
	public void test3() {
      System.out.println("输出汉字字符:"+'中');
      System.out.println("输出换行符"+'\n');
      System.out.println("输出反斜杠"+'\\');
      System.out.println("输出单引号"+'\'');
      System.out.println("输出双引号"+'\"');
      System.out.println("输出字符A:"+'\u0041');
	}
	
}
