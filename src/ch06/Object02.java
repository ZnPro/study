package ch06;

public class Object02{
	public static void main(String[] args) {
		String str = "ȫ�浿";
		System.out.println(str.hashCode());
		
		String str2= "ȫ�浿";
		System.out.println(str2.hashCode());
		
		str="�Ӳ���";
		System.out.println(str.hashCode());
		//������ ������ �����͸� ������ ������ �����ͷθ����ϴ� �Լ�
		//���� ���� �ؽ� �浹�� �Ͼ
		//��ȣȭ�� �ȵ�
		//���������� ��(���� ������ �뵵�� ��)
		//String a = new String("����"); heap ����
		//String s="�ȳ�"; heap�ȿ� �ִ� String Constant Pool�� ����
		}
}
