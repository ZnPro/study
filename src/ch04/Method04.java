package ch04;

//ctrl shift F : �ڵ� ����
//�޼��� �ȿ� �޼��带 ������ �� ����.
//������ �޼��带 ���� �� ����.
public class Method04 {
	int money = 10000; //heap
	int add(int num) { //add(): heap, int num: stack
		int money2 = money +num;
		return money2;
	}//���� ���� �� int num�� �װ� money�� �������. heap�� �ֱ� ����
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		//System.out.println(money2);
		System.out.println(m.money);
		//static�� 1. ó���� �����ǰ� 2. �ϳ��ۿ� ����
		//�߻�Ŭ����, ������Ʈ, �ν��Ͻ�: new�� ���������
	}
}
