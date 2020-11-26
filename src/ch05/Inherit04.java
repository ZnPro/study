package ch05;

//stack=body. interface는 body에 메서드가 있으면 안된다.
//interface는 new할 수 없다. why-추상 메서드를 가지고 있어서.
//interface: 약속을 만드는 갑(자동차 엑셀)외부에는 규격을 주고 내부에는 강제성을 준다.
interface Animal2{
	void sound(); 
}
//오버라이드: 재정의 no 무효화 o
class Dog2 implements Animal2{
	public void sound() {//추상메서드 (함수의 몸체가 없다.)
		System.out.println("멍멍");
	} //interface는 extends가 아니라 implements다.
	//부모와 자식이 같은 함수를 가지고 있음: 오버라이딩(무효화하다 -부모의 함수를 )
}
class Cat2 implements Animal2{
	public void sound() {
		System.out.println("야옹");
	}
}
class Bird2 implements Animal2{
	public void sound() {
		System.out.println("짹짹");
	}
}
class Tiger2 implements Animal2{
	public void sound() {
		System.out.println("어흥");
	}
}
//Monkey, 몽몽, 반드시 Animal2를 구현
class Monkey2 implements Animal2{
	public void sound() {
		System.out.println("몽몽");
	}
}

public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		//자기 자신의 클래스의 static을 호출할 때는 클래스명 생략 가능
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey2());
	}
}
