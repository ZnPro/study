package ch04;

//���� 10,5�� ���ؼ� 
//�� ������� ���� 20�� ���ؼ�
//�� ������� ���� 5�� ������
//�� ������� 100�� �� ���� ȭ�鿡 ���
public class Calculator {

	int add(int n1, int n2) {
		int result = n1 +n2; //result : ��������(��� ���մ� ���. add �߿��� minus�� ����� �� ���� ���ε��� ����Ǳ⶧��)
		return result;
	}
	int minus(int n1, int n2) {
		int result = n1 -n2;
		return result;
	}
	int divid(int n1, int n2) {
		int result = n1 /n2;
		return result;
	}
	int multi(int n1, int n2) {
		int result = n1 *n2;
		return result;
	}
}
