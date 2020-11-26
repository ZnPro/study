package ch02;

//클래스 자료형
//변수를 저장하고싶을 때 자료형이 다르면 class에 저장한다.
class Car {
	static int power = 2000;
	static String color = "하얀색";
	static String name = "소나타";
	static String type = "승용차";
}

public class Var07 {
	static int power = 2000;
	public static void main(String[] args) {
		System.out.println(Car.power);
		//System.out.println(Var07.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
	}
}
