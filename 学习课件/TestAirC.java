
public class TestAirC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirConditioner kt = new AirConditioner();
		kt.name = "����360";
		kt.brand = "����";
		kt.type = "1.5ƥ";
		kt.temperature = 20;
		
		kt.cool();
		System.out.println("��ǰ�¶�Ϊ��"+kt.temperature);
	
		kt.hot();
		System.out.println("��ǰ�¶�Ϊ��"+kt.temperature);
		System.out.println("�յ�Ʒ��Ϊ"+kt.brand+",����Ϊ��"+kt.type);
	}

}
