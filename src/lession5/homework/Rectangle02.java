package lession5.homework;

/**
 * ������ 49ҳ��ϰ
 * 
 * @author Administrator
 *
 */
public class Rectangle02 {
	//���εĳ�
	private double l;
	// ���εĿ�
	private double w;
 
	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	/**
	 * �����ܳ�
	 * @return
	 */
	public double perimeter() {
		return 2 * (this.l + this.w);
	}

	/**
	 * �������
	 * @return
	 */
	public double area() {
		return this.l * this.w;
	}
}
