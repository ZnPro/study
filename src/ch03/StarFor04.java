package ch03;

public class StarFor04 {

	static void starPrint() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void starPrint2() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void starPrint3() {
		for (int i = 1; i <= 6; i++) {
			if (i % 2 == 0) {
				System.out.println();
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
		}
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.println();
			} else {
				for (int j = i; j <= 3; j++) {
					System.out.print("*");
				}
			}
		}
	}

	public static void main(String[] args) {
		starPrint();
		starPrint2();
		starPrint3();
	}
}
