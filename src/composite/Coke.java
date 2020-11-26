package composite;

import lombok.Data;

@Data 
public class Coke {
	private int price;
	private String disc;
	
	public Coke(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"가 만들어 졌습니다.");
	}
	public Coke() {
		this(1000,"콜라");
	}
}
