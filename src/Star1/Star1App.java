//package Star1;
//
//public class Star1App {
//	
//	//오버로딩: 함수명이 같아도 매개변수의 갯수나 타입이나 순서가 다르면 다른 함수로 인식(과적재)
//	//장점: 함수명 간편, 단점: 경우의수가 늘어나면 힘듬, 적당한 경우의 수에 사용
//	static void attack(Zealot u1, Dragoon u2) {//attack stack의 지역변수
//		System.out.println(u1.name + " -> " +u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력: " + u2.hp);
//	}
//	
//	static void attack(Dragoon u1,Zealot  u2) {//attack stack의 지역변수
//		System.out.println(u1.name + " -> " +u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력: " + u2.hp);
//	}
//	
//	static void attack(Dragoon u1, Dragoon u2) {//attack stack의 지역변수
//		System.out.println(u1.name + " -> " +u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력: " + u2.hp);
//	}
//	
//	static void attack(Dark u1, Zealot u2) {//attack stack의 지역변수
//		System.out.println(u1.name + " -> " +u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력: " + u2.hp);
//	}
//	
//	static void attack(Dark u1, Dragoon u2) {//attack stack의 지역변수
//		System.out.println(u1.name + " -> " +u2.name +" 공격");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +" 체력: " + u2.hp);
//	}
//	
//	public static void main(String[] args) {
//		Zealot z1= new Zealot("질럿1", 100, 10);// z1, d1지역변수(스택 안에서 정의된거)
//		Dragoon d1= new Dragoon("드라군1", 100, 20);//new된건 z1,d1의 heap변수
//		Dragoon d2= new Dragoon("드라군2", 100, 20);
//		Dark dk1= new Dark("다크템플러1", 100, 50);
//		Dark dk2= new Dark("다크템플러2", 100, 50);
//		
//		
//		//1. 질럿1 -> 드라군1 공격
//		attack(z1, d1);//지역변수
//		
//		//2. 드라군1 -> 질럿1 공격
//		attack(d1, z1);
//		
//		//3. 드라군1 -> 드라군2 공격
//		attack(d1, d2);
//		
//		//4. 다크템플러1 -> 질럿1 공격(다크템플러1,100,50)
//		attack(dk1, z1);
//		
//		//5. 다크템플러2 -> 드라군1 공격
//		attack(dk2, d1);
//	}
//}
