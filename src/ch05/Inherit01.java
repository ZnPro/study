package ch05;

//����� ���� �޴� �ǹ�(�̷������� ���� ������ ���������� �ؾߵ�.)
class Father{
	int money=10000;
}
class Son extends Father{
	int money=20000;
}
public class Inherit01 {
	public static void main(String[] args) {
		Son s= new Son();//Son()�� Son�� �������� new�� Son,Fatrher �Ѵ� ����. heap�� 2���� Son���� �ƹ��ŵ����� Father���� 10000�� �ְ� 
		//=������ Son s, Fater s ��.
		//��Ģ 1��. ������ ã�� �� Son�� ã�Ƽ� ������ ������ �� ������ �������� ������ Father�� ���� ������.
		System.out.println(s.money);
		
		//2��. new�� �ϸ� Father�� Son�� heap�� ���. but �����ڴ� son()�� ȣ��. ����Ű�¸޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f= new Son();
		System.out.println(f.money);
	}
}
