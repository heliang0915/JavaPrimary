package homework20181027;

/*
 ѧ����Ϣ��
 ����ѧ��������רҵ�����ݿ�ɼ����㷨�����ɼ�����������ɼ�5����Ա������
 ���巽����
 ���ѧ����Ϣ��
 ���ѧ����Ϣ��
 �����ܷ֣�
 ����ƽ����
 */
public class StudentInfo {
	private String no; // ѧ��
	private static int total; // ѧ��������
	// �����Ա����
	private String name;
	private String major;
	private double score1;
	private double score2;
	private double score3;

	// ��ȡѧ��
	public String getNo() {
		return no;
	}

	// ��ȡѧ������
	public static int getTotal() {
		return total;
	}

	// ���ѧ����Ϣ
	public void setInfo(String name, String major, double score1, double score2, double score3) {
		this.name = name;
		this.major = major;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		StudentInfo.total++;
		if (StudentInfo.total < 9) {
			this.no = "20180" + StudentInfo.total;
		} else {
			this.no = "2018" + StudentInfo.total;
		}
	}

	public void getInfo() {
		System.out.println("ѧ����Ϣ����");
		System.out.println("ѧ��ѧ�ţ�" + this.no + ";ѧ��������" + this.name + "����ѧרҵ��" + this.major + "���ɼ�1��" + this.score1
				+ "���ɼ�2��" + this.score2 + "���ɼ�3��" + this.score3);
	}

	// �����ܷ�
	public void Sum() {
		System.out.println("�ܳɼ�Ϊ��" + (this.score1 + this.score2 + this.score3));
	}

	public void avg() {
		System.out.println("ƽ����Ϊ��" + ((this.score1 + this.score2 + this.score3) / 3));
	}

}
