package review;

//����� �����͸� �����ִ°��� ������ �ƴϴ�.
//�����͸� �����ְ� ������ ���������� ���
//����� �ϴ� ����: �������� ����. Ÿ���� ��ġ��Ű���� ��!!(�������� ���(�Լ�)�� ���� �� ����)

class ���� {
	void start() {
	}
}
class �������� extends ����{
	void start() {
		System.out.println("�������� ���");
	}
}
class ����å�� extends ����{
	void start() {
		System.out.println("����å�� ���");
	}
}

public class Ex11 {

	static void use(���� u) {
		u.start();
	}
	
	public static void main(String[] args) {
		//use(new ����å��());
		//use(new ��������());
		���� n1 = new ����å��();
		���� n2 = new ��������();
		//n1.start();
		//n2.start();
		use(n1);
		use(n2);
	}
}
