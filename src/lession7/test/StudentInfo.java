package lession7.test;


/*
 ѧ����Ϣ��
 ����ѧ��������רҵ�����ݿ�ɼ����㷨�����ɼ�����������ɼ�5����Ա������
 ���巽����
 ���ѧ����Ϣ��
 ���ѧ����Ϣ��
 �����ܷ֣�
 ����ƽ����
 test����4������ 
 */
public class StudentInfo {
	// �����Ա����
	private String name;
	private String major;
	private double score1;
	private double score2;
	private double score3;

	// ���ѧ����Ϣ
	public void setInfo(String name, String major, double score1, double score2, double score3) {
		this.name = name;
		this.major = major;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public void getInfo() {
		System.out.println("ѧ����Ϣ����");
		System.out.println("ѧ��������" + this.name + "����ѧרҵ��" + this.major + "���ɼ�1��" + this.score1 + "���ɼ�2��" + this.score2
				+ "���ɼ�3��" + this.score3);
	}

	// �����ܷ�
	public void Sum() {
		System.out.println("�ܳɼ�Ϊ��" + (this.score1 + this.score2 + this.score3));
	}

	public void avg() {
		System.out.println("ƽ����Ϊ��" + ((this.score1 + this.score2 + this.score3) / 3));
	}

/*	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("��ƽ", "�������ѧ�뼼��", 98, 90, 100);
		stu.getInfo();
		stu.Sum();
		stu.avg();
	}*/
}
