package ch13;

public class Thread02 extends Thread{
	public void run() {
		System.out.println("���ο� ������");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ������ ��ü ����
		
		//2. Ÿ�� ����
		
		//3. ����
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		NewThread t2 = new NewThread();
		t2.start();
	}

}
