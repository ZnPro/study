package composite;

import lombok.Data;

@Data 
public class Potato {
	private int price;
	private String disc;
	
	public Potato(int price, String disc) {
		this.price = price;
		this.disc = disc;
		System.out.println(disc+"�� ����� �����ϴ�.");
	}
	public Potato() {
		this(1000,"����Ƣ��");
	}
}
