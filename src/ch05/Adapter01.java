package ch05;

interface Knife {
	void �丮();
	void ����();
}

//����� �뵵�� �丮��� ���ظ� ���൵ ��
abstract class �丮��Adapter implements Knife{
	public void ����() {}
	
	class ������ extends �丮��Adapter {

		@Override
		public void �丮() {
		}
	}
}

public class Adapter01 {
	public static void main(String[] args) {
	}
}
