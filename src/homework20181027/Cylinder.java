package homework20181027;

/**
 * Բ������
 * 
 * @Title: Cylinder.java
 * @Package homework20181027
 * @Description: TODO(Բ������)
 * @author: ������18 17����
 * @date: Nov 1, 2018 8:37:13 PM
 */
public class Cylinder {
	private Circle circle;// Բ���������
	private double height; // Բ����ĸ�

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Բ���ı����=�����+���������=2��rh+2��r^2
	public double getSuperficialArea() {
		// Բ���ܳ�*��+2��Բ�����
		return this.circle.getPerimeter() * this.height + 2 * circle.getArea();
	}

	// ���=�����x�� ��r^2��h
	public double getVolume() {
		// Բ�����*��
		return this.circle.getArea() * this.height;
	}

}
