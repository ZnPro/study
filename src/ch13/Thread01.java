package ch13;

class Another implements  Runnable{ //RunnabalmŸ���� �ž���
//�Ǵ� class Another implements  Runnable	= class Another extends Thread
	//���� ���� �ڵ� ��� = ����(������)
	public void run() {
		System.out.println("���ο� ������ �����");
		//���ο� ������ ����
		//1. ������ ��ü ����� 2. Ÿ�� ���� 3. ����
		Thread t1 = new Thread(new Another());// new Another() = Ÿ��
		t1.start();	//������������� -���ý���
		
		for (int i=1; i<11; i++) {
			try {
				System.out.println("���ο� ������ : " +i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {		
				e.printStackTrace();
			}
		}
		System.out.println("���ο� ������ ����");
	}	
}
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("���� ������ �����");
	} //end of source
}