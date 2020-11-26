package ch04;

//자바 특징: 모든 코드는 class 내부에 둬야 한다.
public class Method01 {
	//heap에 보관
	//static이 있으면 static에 보관
	static void add () {
		System.out.println("add함수 호출 됨");
	}
	void sound() {
		System.out.println("sound함수 호출 됨");
	}
	public static void main(String[] args) {
		//stack에 보관
		//static 호출
		Method01.add();
		//heap 호출
		Method01 m = new Method01();
		m.sound();
		//메서드: 재사용: 기능정의(행위) 상태를 행위로 바꾸기 위해
	}
}
