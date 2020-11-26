package composite;

import lombok.Data;

@Data 
public class Burger {
	private int price;
	private String disc;
	
	public Burger(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"�� ����� �����ϴ�.");
	}
	public Burger() {
		this(1000,"�⺻����");
	}
}
