package ch13;

public class Thread03 {
	static int sum = 0;
	static class NewThread implements Runnable{
		//다른 곳에서 내부 클래스를 쓰려고하면 static을 붙임
		@Override
		public void run() {
			System.out.println("새로운 스레드 종료");
			for (int i = 0; i < 11; i++) {
				sum = sum + 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("새로운 스레드 종료");
		}
	}

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		Thread t1 = new Thread(new NewThread());
		t1.start();
		try {
			t1.join(); //t1이 끝날때 까지 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println("메인 스레드 종료");
	}
}
