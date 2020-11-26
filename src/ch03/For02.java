package ch03;

public class For02 {
	public static void main(String[] args) {
		// 1~100 Â¦¼ö
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				System.out.println("2ÀÇ ¹è¼ö"+i);
			}
		}
		for (int i = 1; i < 101; i++) {
			if (i%2==1) {
				System.out.println("È¦¼ö: "+i);
			}
		}
		//50~1±îÁö ¼ö Áß È¦¼ö Ãâ·Â(³»¸²Â÷¼ø)
		for (int i = 50; i > 0; i--) {
			if (i%2==1) {
				System.out.println("È¦¼ö: "+i);
			}
		}
		
	}
}
