package ch02;

//Ŭ���� �ڷ���
//������ �����ϰ���� �� �ڷ����� �ٸ��� class�� �����Ѵ�.
class Car {
	static int power = 2000;
	static String color = "�Ͼ��";
	static String name = "�ҳ�Ÿ";
	static String type = "�¿���";
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
