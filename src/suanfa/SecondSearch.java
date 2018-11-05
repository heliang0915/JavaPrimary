package suanfa;

/**
 *  定义二分查找算法
 * @author Administrator
 *
 */
public class SecondSearch {
	private int []ary;
	
	public SecondSearch(int [] ary){
		this.ary=ary;
		 
	}
	public int  search(int key) {
		int low=0;
		int height=ary.length-1;
		while(low<=height) {
			int mid=(low+height)/2;
			 if(key==ary[mid]) {
				  return mid;
			 }
			 if(key<ary[mid]) {
				height=mid-1;
			 }else if(key>ary[mid]) {
				low=mid+1;
			 } 
			 
		 }
		return -1;
	}
	
	public int  search2(int key) {
		for (int i = 0; i < ary.length; i++) {
			if(ary[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int size=100000000;
		int ary[]=new int[size];
		for(int i=0;i<size;i++) {
			ary[i]=i+1;
		}
//		ary[0]=1;
//		ary[1]=2;
//		ary[2]=3;
//		ary[3]=4;
		long startTime=System.currentTimeMillis();
		System.out.println(ary.length);
		
		SecondSearch search=new SecondSearch(ary);
		int index=search.search(555);
		int index2=search.search2(555);
//		search2
		long endTime=System.currentTimeMillis();
		
		long diff=endTime-startTime;
		System.out.println("index:"+index);
		System.out.println("方法耗时:"+diff+"ms");
		
	}
}
