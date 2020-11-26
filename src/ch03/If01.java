package ch03;

class Bean{
	
}
public class If01 {

	public static void main(String[] args) {
		
		int a= 20;
		if(a%2==0) {
			System.out.println();
		}
		
		
		
		
		//표현식
		if(true){
			System.out.println("true 입니다.");
		}
		if (false) {
			System.out.println("실행 안됨.");
		}
		int num= 0;
		if (num>1) {
			System.out.println("num은 1보다 크다");
		}else {//위에 if가 아니면
			System.out.println("num은 1보다 작다");
		}
		
		int sum=20;
		if (sum==10) {
			System.out.println("sum은 10입니다.");
		}else if(sum==20){
			System.out.println("sum은 20입니다.");
		}else {
			System.out.println("sum은 30입니다.");
		}

	}

}
