package composite;

import lombok.Data;

@Data 
public class Burger {
	private int price;
	private String disc;
	
	public Burger(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"가 만들어 졌습니다.");
	}
	public Burger() {
		this(1000,"기본버거");
	}
}
