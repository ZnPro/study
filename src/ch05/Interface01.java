package ch05;

//1. interface는 new 안됨
//2. 변수를 가질 수 있다. 그 변수는 public static final이다.
//3. 추상 메서드를 가진다. 그 메서드는 public abstract  이다.
//4. 정삭적인 메서드를 가질 수 없다.
//5. interface를 구현하는 클래스는 반드시 오버라이딩 해야 한다.
interface Remocon{
	String name= "리모컨";//String 앞에 public final static이 생략
	public abstract void control();
}
public class Interface01 {
	public static void main(String[] args) {
	}
}
