package ch02;

//heap
class Zealot{
	String name ="����";
	int attck= 10;
	int armor= 5;
	
	static int hp= 100;
}
public class Var08 {
	public static void main(String[] args) {
		Zealot z= new Zealot(); //new�� heap�� ���� (static�� �Ⱥ��� name, attck, armor)
		//ũ�⸦ �� �� ���� ���� �ڷ��� z. ���� ���� class���� Ÿ���� ��.
		System.out.println(z.name);
		System.out.println(z.attck);
		System.out.println(z.armor);
		
		Zealot z2= new Zealot();
		System.out.println(z2.name);
		System.out.println(z2.attck);
		System.out.println(z2.armor);
		//������: static(����) main()ȣ�� ���� �� �ϳ��� ��������� ���� �ȹٲ�� �ֵ�
		//������: heap(����) main()ȣ�� �� ���Ҷ����� ��� ȣ��
		
		z.attck= 50;
		System.out.println("��ȭ ����");
		System.out.println(z.attck);
		System.out.println(z2.attck);
		
		Zealot.hp= 50;//Zealot.hp
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		//����
		z.attck= 11;
		System.out.println(z.attck);
		System.out.println(z2.attck);
	}
}
