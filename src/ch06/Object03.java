package ch06;

public class Object03{
	public static void main(String[] args) {
		String str1="ȫ�浿";
		String str2="ȫ�浿";
		
		int num=10;
		//==:���� �������� �޸� ������ ������ ����.
		System.out.println(str1==str2);
		
		//String�� Hash�Լ��� �������̵� �Ǽ�
		//���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		//�����δ� �ٸ� �ּ�
		String str3="�Ӳ���"; //constant pool
		String str4=new String("�Ӳ���");// heap
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		//equals�� ==���� ���� ���ؼ� ������ true
		//==���� ���ߴµ� false�� ������ ���������� ���� ��
		//�� 2���� �� ����
		//�Ϲ����� ������ ==���� ���ϰ� ���ڿ��� equals�� ��
		System.out.println(str3.equals(str4));
		}
}
