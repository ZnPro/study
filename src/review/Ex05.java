package review;

public class Ex05 {
	public static void main(String[] args) {
		//�迭: ���ӵ� ������ ������ Ȯ�����ֱ� ������ �������� ������ ����
		//����: �迭�� ������ �߰�, ������ �ȵ�
		//Ư¡: ���� Ÿ��(int)�� ���� �����͸� �����ϴ� �ڷ���
		//Object Ÿ�����θ���� ��� Ÿ���� ����
		//����� ���ؼ� �θ�Ÿ������ ������ ��� Ÿ���� �� ����
		
		//�迭�� ũ�Ⱑ������ �־�� ��
		//�÷����� ����� ����(ArrayList) - ���׸��� �˾ƾ� ��� ����
		
		int[] n1= new int[3];
		n1[0]=1;
		n1[1]=2;
		n1[2]=3;
		System.out.println(n1[2]);
		
		Object[] n2= new Object[3];
		//Wrapper class
		n2[0]="��";//Sting
		n2[1]=10;//Integer
		n2[2]=10.5;//Double
	}
}