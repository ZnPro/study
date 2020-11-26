package ch04;

//ctrl shift F : 코드 정령
//메서드 안에 메서드를 정의할 수 없다.
//변수에 메서드를 담을 수 없다.
public class Method04 {
	int money = 10000; //heap
	int add(int num) { //add(): heap, int num: stack
		int money2 = money +num;
		return money2;
	}//여기 종료 시 int num은 죽고 money는 살아있음. heap에 있기 때문
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		//System.out.println(money2);
		System.out.println(m.money);
		//static은 1. 처음에 생성되고 2. 하나밖에 없다
		//추상클래스, 오브젝트, 인스턴스: new로 만들어지면
	}
}
