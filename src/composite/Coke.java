package composite;

import lombok.Data;

@Data 
public class Coke {
	private int price;
	private String disc;
	
	public Coke(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"�� ����� �����ϴ�.");
	}
	public Coke() {
		this(1000,"�ݶ�");
	}
}
