package review;

/**
 * 
 * @author ����ȣ
 * static�� main�� �����ϱ� ���� �޸𸮿� �ε��ȴ�.
 * �� ���� static �����ʹ� �ߺ��� ������. �� �� ���� �޸𸮿� �ε��Ǳ� ����!!
 * �� ���� �޸𸮿� �� �� ����. =>static �����ʹ� ������ �� �ִ� ������
 * 
 * heap�� new�� �� �޸𸮿� ���. Ÿ�̹��� ������ static���� ����.
 * �����ڰ� ���ϴ� ��ŭ �޸𸮿� �ε��� �� ����.
 * ���� �����Ͱ� �ƴϰ� �� ���� �����͸� ���� ������ ����.
 * �ڵ��� ���忡�� �ҳ�Ÿ�� �� �븦 �� �Ǹ��ϸ� 3���� �ҳ�Ÿ�� �ٸ� �ҳ�Ÿ
 */
public class Ex07 {
	
	int num = 10;// �ȶ� new �ؾ� ��(heap����, �̸鼭 '�ʵ�', '������Ƽ')
	static int sum = 20;//main�� ���۵Ǳ� ���� ��
	
	public static void main(String[] args) {
	System.out.println(Ex07.sum);
	
	Ex07 e = new Ex07();
	System.out.println(e.num);
	}
}
