package ch13;

public class Thread02 extends Thread{
	public void run() {
		System.out.println("새로운 스레드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 스레드 객체 생성
		
		//2. 타겟 설정
		
		//3. 실행
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		NewThread t2 = new NewThread();
		t2.start();
	}

}
