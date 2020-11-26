package ch07;

import lombok.Data;

@Data
class ResponseDto<A>{
	private int statusCode; //200성공 300 다시요청 400 잘못된요청
	private A data; //아직 정해지지 않은 타입
}

public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); //<>는 클래스가 들어와야함. = Wrapper 클래스를 넣음
		dto.setStatusCode(200);
		dto.setData("사과");
	
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}
}
