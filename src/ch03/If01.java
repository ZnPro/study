package ch03;

class Bean{
	
}
public class If01 {

	public static void main(String[] args) {
		
		int a= 20;
		if(a%2==0) {
			System.out.println();
		}
		
		
		
		
		//ǥ����
		if(true){
			System.out.println("true �Դϴ�.");
		}
		if (false) {
			System.out.println("���� �ȵ�.");
		}
		int num= 0;
		if (num>1) {
			System.out.println("num�� 1���� ũ��");
		}else {//���� if�� �ƴϸ�
			System.out.println("num�� 1���� �۴�");
		}
		
		int sum=20;
		if (sum==10) {
			System.out.println("sum�� 10�Դϴ�.");
		}else if(sum==20){
			System.out.println("sum�� 20�Դϴ�.");
		}else {
			System.out.println("sum�� 30�Դϴ�.");
		}

	}

}
