package Star1;

//1.Zealot,  Dragoon,Tank, Scv, DarkTempler, >>StarUnitŸ������ ����

public class Star3App {
	
	static void attack(StarUnit u1, StarUnit u2) {
		// 1. hp�� ������ �� �ִ� �Լ� setHp(int hp)
				// 2. hp�� ���� Ȯ���ϴ� �Լ� getHp()
				// 3. attack�� ���� Ȯ���ϴ� �Լ� getAttack()
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+" �� HP: "+u2.getHp());
	}
	
	public static void main(String[] args) {
		Dark dk1= new Dark("��ũ1", 100, 50); 
		Dark dk2= new Dark("��ũ2", 100, 50); 
		Dragoon d1= new Dragoon("���1", 100, 20); 
		Marine m1= new Marine("����1", 100, 5); 
		Scv s1= new Scv("Scv1", 100, 10); 
		Tank t1= new Tank("��ũ1", 100, 50); 
		Zealot z1= new Zealot("����1", 100, 20); 
		
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



