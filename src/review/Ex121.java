package review;

//�ڹٴ� �Լ��� ������� ����.
//���ϱ� �Լ��� ����� ����. => ���ϱ� �Լ� ������� Ŭ������ �ʿ�

interface A{//�޼��常 ���鶩 class���� interface�� ����(���µ� �ʿ������)
	void add();
}
public class Ex121 {

	public static void main(String[] args) {
		
		//�������̽��� �͸� Ŭ����(�Լ� �����Ǿ����)�� ���� �� �ִ�.
		new A() {
			@Override
			public void add() {
				System.out.println("���ϱ�");
			}
		}.add();
	}
}