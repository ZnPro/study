package ch05;

class ������{
	String name="������";
}
class �ѱ��� extends ������{
	String name="�ѱ���";
}
class �λ��� extends �ѱ���{
	String name="�λ���";
}
public class Inherit02 {
	public static void main(String[] args) {
		//�λ��� b= new �ѱ���();//�λ����� �޸𸮿� �ȶ��� �ȵ�.
		������ b= new �ѱ���();//heap(�ѱ�,������) ->������(������)
		
		//1. b�� �ѱ���, �������� �޸𸮿� �� �ֱ� ������ �ٿ�ĳ���ð���
		�ѱ��� h= (�ѱ���)b;//�ѱ���h=b;b�� ������ ����Ű�� h�� �ѱ����� ����Ű������
		
		//2. 
		
		try {
			�λ��� busan= (�λ���)b;
		} catch (Exception e) {
			//�����ڰ� �ڵ鸵 �ϴ� �κ�(�α�����)
			System.out.println("�����߻�����");
		}
		
		
	}
}
