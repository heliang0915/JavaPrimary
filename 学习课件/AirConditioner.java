/**

*/
public class AirConditioner {
	//����
	String name;
	String brand;
	String type;
	int temperature;
	
	//��Ϊ
	void cool() {
		temperature --;
	}
	
	void hot() {
		temperature += 7;
	}
	
}
