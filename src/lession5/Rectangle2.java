package lession5;

/**
 * 参照Circle 为矩行添加中心点坐标和拷贝构造方法 在Rectangle2Test中进行了测试
 * 
 * @author Administrator
 *
 */
public class Rectangle2 {
	private int x;
	private int y;

	private int w;

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	private int l;

	// public Rectangle2() {
	// }

	public Rectangle2(int x, int y,int w,int l) {
		this.x = x;
		this.y = y;
		this.w=w;
		this.l=l;
	}

	public Rectangle2(Rectangle2 c) {
		this.x = c.getX();
		this.y = c.getY();
		this.w=c.getW();
		this.l=c.getL();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 矩形面积
	 *
	 * @return
	 */
	public double getArea() {
		return this.w * this.l;
	}

	/**
	 * 矩形周长
	 *
	 * @return
	 */
	public double getPermitter() {
		return 2 * (this.w + this.l) * 2;
	}
}
