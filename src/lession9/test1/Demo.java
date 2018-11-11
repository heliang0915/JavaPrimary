package lession9.test1;

public class Demo {
	public static int i = 10;
	public int j;
	
	public Demo() {
		this.j = 20;
		System.out.println("构造函数...");
	}
	
	static {
//		System.out.println("static.....");
		System.out.println("static块");
	}
	
	{
		System.out.println("内部块");
	}
	

	public void add(int N) {
		i += N;
		j += N;
	}

	public static void main(String[] args) {
		System.out.println(Demo.i); //i:10
		Demo obj1 = new Demo();
		obj1.add(10);
		System.out.println(obj1.i+"//"+obj1.j);  //i:20 j:30
		obj1.add(2);
		System.out.println(obj1.i+"//"+obj1.j); //i:22 j:32
		Demo obj2 = new Demo();
		obj2.add(100);
		System.out.println(obj1.i+"//"+obj1.j); //i:122 j:32
	}

}
