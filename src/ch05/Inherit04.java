package ch05;

//stack=body. interface�� body�� �޼��尡 ������ �ȵȴ�.
//interface�� new�� �� ����. why-�߻� �޼��带 ������ �־.
//interface: ����� ����� ��(�ڵ��� ����)�ܺο��� �԰��� �ְ� ���ο��� �������� �ش�.
interface Animal2{
	void sound(); 
}
//�������̵�: ������ no ��ȿȭ o
class Dog2 implements Animal2{
	public void sound() {//�߻�޼��� (�Լ��� ��ü�� ����.)
		System.out.println("�۸�");
	} //interface�� extends�� �ƴ϶� implements��.
	//�θ�� �ڽ��� ���� �Լ��� ������ ����: �������̵�(��ȿȭ�ϴ� -�θ��� �Լ��� )
}
class Cat2 implements Animal2{
	public void sound() {
		System.out.println("�߿�");
	}
}
class Bird2 implements Animal2{
	public void sound() {
		System.out.println("±±");
	}
}
class Tiger2 implements Animal2{
	public void sound() {
		System.out.println("����");
	}
}
//Monkey, ����, �ݵ�� Animal2�� ����
class Monkey2 implements Animal2{
	public void sound() {
		System.out.println("����");
	}
}

public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		//�ڱ� �ڽ��� Ŭ������ static�� ȣ���� ���� Ŭ������ ���� ����
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey2());
	}
}
