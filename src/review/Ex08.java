package review;

public class Ex08 {
	void add(int n1, int n2) {
		//void�� return�� ����. add�� �����̸�, ()�� �Լ���� ��
		//int n1, int n2�� �Ű�����(arguments)
		System.out.println(n1+n2);
	}
	
	int minus(int n1, int n2) {
		return n1-n2; //�Լ��� ȣ���� ������ ���� n1-n2�� ����
	}
	public static void main(String[] args) {
		Ex08 e = new Ex08();
		e.add(3, 6); //�Լ��� ȣ��(15�� ���ο��� 7�� ���� ���� �� �ٽ� 15������ ���ƿ�)
		//3�� 6�� �μ���� �θ�.
		int result = e.minus(10, 5); //�� ���� 5�� ��. int result = 5;
		System.out.println(result);
		
	}
}
