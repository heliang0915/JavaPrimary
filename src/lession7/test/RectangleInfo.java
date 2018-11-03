package lession7.test;


public class RectangleInfo {
	public static int EdgeNum = 0;
	public static int AngleNum = 0;
	public double length;
	public double width;
	static {
		EdgeNum = 4;
		AngleNum = 4;
	}

	public static void main(String[] args) {
		RectangleInfo r1 = new RectangleInfo();
		r1.length = 5;
		r1.width = 6;
		System.out.println("矩形有"+EdgeNum+"个边，有"+AngleNum+"个角，\n矩形r1的面积为："+(r1.length*r1.width));
	}

}
