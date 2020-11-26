package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO=Data Transfer Object = 통신에서 많이 사용
class UserDto{
	private int id;
	private String name;
	
}
public class String01 {

	public static void main(String[] args) {
		String data="id:1, name:홍길동";
		
		//파싱parsing(구문분석)
		UserDto dto= new UserDto();
		dto.setId(1);
		dto.setName("홍길동");
		System.out.println(dto);
		
		String s[]=data.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" +i+": "+s[i]);
		}

	}

}
