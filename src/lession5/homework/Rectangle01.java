package lession5.homework;

/**
 * ������ 47ҳ��ϰ
 * 
 * @author Administrator
 *
 */
public class Rectangle01 {
	//���εĳ�
	 double l;
	// ���εĿ�
	 double w;

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
