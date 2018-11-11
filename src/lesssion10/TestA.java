package lesssion10;

public class TestA {
	static void aaa(StringBuffer x,StringBuffer y) {
			x.append(y);
			y=x;
	}
	
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
		aaa(a,b);
		System.out.println(a+"."+b);
	}
}
