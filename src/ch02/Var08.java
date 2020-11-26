package ch02;

//heap
class Zealot{
	String name ="질럿";
	int attck= 10;
	int armor= 5;
	
	static int hp= 100;
}
public class Var08 {
	public static void main(String[] args) {
		Zealot z= new Zealot(); //new는 heap에 저장 (static이 안붙은 name, attck, armor)
		//크기를 알 수 없는 참조 자료형 z. 내가 만든 class명이 타입이 됨.
		System.out.println(z.name);
		System.out.println(z.attck);
		System.out.println(z.armor);
		
		Zealot z2= new Zealot();
		System.out.println(z2.name);
		System.out.println(z2.attck);
		System.out.println(z2.armor);
		//차이점: static(정적) main()호출 전에 딱 하나만 만들어져서 거의 안바뀌는 애들
		//차이점: heap(동적) main()호출 후 원할때마다 계속 호출
		
		z.attck= 50;
		System.out.println("변화 관찰");
		System.out.println(z.attck);
		System.out.println(z2.attck);
		
		Zealot.hp= 50;//Zealot.hp
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		//포지
		z.attck= 11;
		System.out.println(z.attck);
		System.out.println(z2.attck);
	}
}
