package lession5.homework;
/**
 * 75ҳ 3��
 * @Title:  Box.java   
 * @Package lession5.homework   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: ������18 17����     
 * @date:   2018��10��23�� ����9:15:29
 */
public class Box {
	private double w;
	private double l;
	private double h;

	public Box(double w, double l, double h) {
		this.w = w;
		this.l = l;
		this.h = h;
	}
	
	/**
	 * ���������
	 * @Title: boxVolume   
	 * @Description: �������������
	 * @throws
	 */
	public double boxVolume() {
		return w*l*h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

}
