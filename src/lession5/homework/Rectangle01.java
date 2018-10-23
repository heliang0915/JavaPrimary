package lession5.homework;

/**
 * 矩形类 47页练习
 * 
 * @author Administrator
 *
 */
public class Rectangle01 {
	//矩形的长
	 double l;
	// 矩形的宽
	 double w;

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
