package coffee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//커피
//책임: 없음
@Data

public class Coffee {
	private String name;
	
	public Coffee() {
		name = "아메리카노";
	}
}
