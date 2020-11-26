package composite;

import lombok.Data;

@Data 
public class Potato {
	private int price;
	private String disc;
	
	public Potato(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"이 만들어 졌습니다.");
	}
	public Potato() {
		this(1000,"감자튀김");
	}
}
