package ch13;

class Another implements  Runnable{ //Runnabalm타입이 돼야함
//또는 class Another implements  Runnable	= class Another extends Thread
	//실행 단위 코드 블록 = 스택(스레드)
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		//새로운 스레드 실행
		//1. 스레드 객체 만들기 2. 타겟 설정 3. 실행
		Thread t1 = new Thread(new Another());// new Another() = 타겟
		t1.start();	//독립스레드실행 -동시실행
		
		for (int i=1; i<11; i++) {
			try {
				System.out.println("새로운 스레드 : " +i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {		
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료");
	}	
}
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 실행됨");
	} //end of source
}