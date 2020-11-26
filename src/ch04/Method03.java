package ch04;

class Cal {
	static void add(int n1, int n2) {//지역변수
		System.out.println(n1+n2);
	}
	static int minus(int n3, int n4) {
		return n3-n4;
	}
}
public class Method03 {
	public static void main(String[] args) {
		Cal.add(5, 6);
		//minus 함수는 return타입이 int이기 때문에
		//Cal.minus(10,4)가 호출된 후 메서드가 종료되면
		//Cal.minus(10,4) --> 6으로 변경된다.
		int result = Cal.minus(10, 4);
		//Cal.minus(10, 4);//static으로 이미 main()이 실행 전에 메모리에 떠있기 때문에 가능
		System.out.println(result);
	}
}
