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
		System.out.println("������"+EdgeNum+"���ߣ���"+AngleNum+"���ǣ�\n����r1�����Ϊ��"+(r1.length*r1.width));
	}

}
