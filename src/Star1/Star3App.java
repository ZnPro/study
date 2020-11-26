package Star1;

//1.Zealot,  Dragoon,Tank, Scv, DarkTempler, >>StarUnit타입으로 묶기

public class Star3App {
	
	static void attack(StarUnit u1, StarUnit u2) {
		// 1. hp를 수정할 수 있는 함수 setHp(int hp)
				// 2. hp의 값을 확인하는 함수 getHp()
				// 3. attack의 값을 확인하는 함수 getAttack()
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+" 의 HP: "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Dark dk1= new Dark("다크1", 100, 50); 
		Dark dk2= new Dark("다크2", 100, 50); 
		Dragoon d1= new Dragoon("드라군1", 100, 20); 
		Marine m1= new Marine("마린1", 100, 5); 
		Scv s1= new Scv("Scv1", 100, 10); 
		Tank t1= new Tank("탱크1", 100, 50); 
		Zealot z1= new Zealot("질럿1", 100, 20); 
		
		attack(dk1, d1);
		attack(d1, z1);
		attack(s1, m1);
		attack(z1, d1);
		attack(t1, dk1);
		attack(t1, dk2);
		attack(z1, dk2);
		attack(t1, dk2);
	}
}



