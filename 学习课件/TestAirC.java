
public class TestAirC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirConditioner kt = new AirConditioner();
		kt.name = "静音360";
		kt.brand = "格力";
		kt.type = "1.5匹";
		kt.temperature = 20;
		
		kt.cool();
		System.out.println("当前温度为："+kt.temperature);
	
		kt.hot();
		System.out.println("当前温度为："+kt.temperature);
		System.out.println("空调品牌为"+kt.brand+",功率为："+kt.type);
	}

}
