package review;

//TV4��: �Ｚ, LG, ���, �Ϸ�Ʈ��

//������ �ο�
//����ڿ��� ���� �������̽�����
interface Remocon{
	void change();
}
class SamsungRemocon implements Remocon{
	public void change() {
		System.out.println("�Ｚ ä�� ����");
	}
}
class LGRemocon implements Remocon{
	public void change() {
		System.out.println("���� ä�� ����");
	}
}

public class Ex12 {
	
	static void ä�κ���(Remocon r) {
		r.change();
	}
	public static void main(String[] args) {
//		Remocon r= new LGRemocon();
//		r.change();
		ä�κ���(new SamsungRemocon());
		ä�κ���(new LGRemocon());
		
		//�͸�Ŭ����(�������̽� �ƴ�)
		Remocon r= new Remocon() {
			
			@Override
			public void change() {
				System.out.println("�ȳ�");
				
			}
		};
		r.change();
	}
}
