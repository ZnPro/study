package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> {//<T>: new�Ҷ� ��� Ÿ�� ����
	private int code; // 200(����), 400(����)
	private T data;
}

public class Generic04 {
	static RespDto<?> getData(String username) {//<T>: �Լ��� return�� �� Ÿ�� ����
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}