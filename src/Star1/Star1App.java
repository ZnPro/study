//package Star1;
//
//public class Star1App {
//	
//	//�����ε�: �Լ����� ���Ƶ� �Ű������� ������ Ÿ���̳� ������ �ٸ��� �ٸ� �Լ��� �ν�(������)
//	//����: �Լ��� ����, ����: ����Ǽ��� �þ�� ����, ������ ����� ���� ���
//	static void attack(Zealot u1, Dragoon u2) {//attack stack�� ��������
//		System.out.println(u1.name + " -> " +u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü��: " + u2.hp);
//	}
//	
//	static void attack(Dragoon u1,Zealot  u2) {//attack stack�� ��������
//		System.out.println(u1.name + " -> " +u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü��: " + u2.hp);
//	}
//	
//	static void attack(Dragoon u1, Dragoon u2) {//attack stack�� ��������
//		System.out.println(u1.name + " -> " +u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü��: " + u2.hp);
//	}
//	
//	static void attack(Dark u1, Zealot u2) {//attack stack�� ��������
//		System.out.println(u1.name + " -> " +u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü��: " + u2.hp);
//	}
//	
//	static void attack(Dark u1, Dragoon u2) {//attack stack�� ��������
//		System.out.println(u1.name + " -> " +u2.name +" ����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" ü��: " + u2.hp);
//	}
//	
//	public static void main(String[] args) {
//		Zealot z1= new Zealot("����1", 100, 10);// z1, d1��������(���� �ȿ��� ���ǵȰ�)
//		Dragoon d1= new Dragoon("���1", 100, 20);//new�Ȱ� z1,d1�� heap����
//		Dragoon d2= new Dragoon("���2", 100, 20);
//		Dark dk1= new Dark("��ũ���÷�1", 100, 50);
//		Dark dk2= new Dark("��ũ���÷�2", 100, 50);
//		
//		
//		//1. ����1 -> ���1 ����
//		attack(z1, d1);//��������
//		
//		//2. ���1 -> ����1 ����
//		attack(d1, z1);
//		
//		//3. ���1 -> ���2 ����
//		attack(d1, d2);
//		
//		//4. ��ũ���÷�1 -> ����1 ����(��ũ���÷�1,100,50)
//		attack(dk1, z1);
//		
//		//5. ��ũ���÷�2 -> ���1 ����
//		attack(dk2, d1);
//	}
//}
