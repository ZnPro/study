package review;

//상속은 데이터를 물려주는것이 목적이 아니다.
//데이터를 물려주고 싶으면 콤포지션을 사용
//상속을 하는 이유: 다형성에 있음. 타입을 일치시키려는 것!!(공통적인 모듈(함수)을 만들 수 있음)

class 나무 {
	void start() {
	}
}
class 나무의자 extends 나무{
	void start() {
		System.out.println("나무의자 사용");
	}
}
class 나무책상 extends 나무{
	void start() {
		System.out.println("나무책상 사용");
	}
}

public class Ex11 {

	static void use(나무 u) {
		u.start();
	}
	
	public static void main(String[] args) {
		//use(new 나무책상());
		//use(new 나무의자());
		나무 n1 = new 나무책상();
		나무 n2 = new 나무의자();
		//n1.start();
		//n2.start();
		use(n1);
		use(n2);
	}
}
