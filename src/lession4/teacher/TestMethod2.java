package lession4.teacher;

public class TestMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(add(2,3));    
	    System.out.println(add(2,3,3));    
	    System.out.println(add(2.15,3));    

	}

	  static int add(int a, int b){
		     return a+b;
		   }  

		   static double add(double a, double b){
		     return a+b;
		   }
		   static double add(double a, int b){
		     return a+b;
		   }
		   static double add(int a, double b){
		     return a+b;
		   }
		   static double add(double a, double b, double c){
		     return a+b+c;
		   }

}
