package ch03;

public class For01 {

	public static void main(String[] args) {
		//stack�� �ݺ�
		//�ʱⰪ i=1, <-������ 1���� ȣ��
		//���ǽ� i��5���� ���������� �ݺ� �� ����ɶ����� i�� 1�� ����
		
		//ù��° ����: �ʱⰪ ���� �� ���� Ȯ��
		//�ι�° ����~ : i�� ���� �� ���� Ȯ��~
		for(int i=1; i<5; i++) { //���ÿ� ���ϸ� i=1�� ��������
			System.out.println("����: "+i);
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("����: "+i);
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i =i+2) {
			System.out.println("����: "+i);
		}
		System.out.println();
		
		//0~100 �� 3�� ����� ���
		for (int i = 3; i <= 100; i=i+3) {
			System.out.println("����: "+i);
		}
	}

}
