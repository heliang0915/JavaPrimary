package lession8.test5;

import org.junit.Test;

public class TestMain {
     
	 @Test
	public void test() {
		Automobile [] ary=new Automobile[4];
		ary[0]=new Trunk(6, "yellow",30);
		ary[1]=new Trunk(8, "yellow",30);
		ary[2]=new Car(4, "blue",10);
		ary[3]=new Car(4, "yellow",12);
		for(int i=0;i<ary.length;i++) {
			ary[i].output();
			if(ary[i] instanceof Trunk) {
				Trunk t=(Trunk) ary[i];
				t.outputLoadWeight();
			}else {
				Car car=(Car) ary[i];
				car.outputSeatingCapacity();
			}
			System.out.println();
		}
	}

}
