package lession5;

/**
 * 矩形类
 * 
 * @author Administrator
 *
 */
public class Rectangle {
	//矩形的长
	private double l;
	// 矩形的宽
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
	 * 计算周长
	 * @return
	 */
	public double perimeter() {
		return 2 * (this.l + this.w);
	}

	/**
	 * 计算面积
	 * @return
	 */
	public double area() {
		return this.l * this.w;
	}
}
