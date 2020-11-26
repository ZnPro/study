package ch05;

//재산을 물려 받는 의미(이런식으로 쓰지 않지만 콤포지션을 해야됨.)
class Father{
	int money=10000;
}
class Son extends Father{
	int money=20000;
}
public class Inherit01 {
	public static void main(String[] args) {
		Son s= new Son();//Son()은 Son만 때리지만 new는 Son,Fatrher 둘다 때림. heap은 2개고 Son에는 아무거도없고 Father에는 10000가 있고 
		//=다형성 Son s, Fater s 됨.
		//규칙 1번. 변수를 찾을 때 Son을 찾아서 변수가 있으면 그 변수를 가져오고 없으면 Father로 가서 가져옴.
		System.out.println(s.money);
		
		//2번. new를 하면 Father과 Son이 heap에 뜬다. but 생성자는 son()만 호출. 가리키는메모리 주소는 타입을 따라간다.
		Father f= new Son();
		System.out.println(f.money);
	}
}
