package ch07;

import lombok.Data;

@Data
class ResponseDto<A>{
	private int statusCode; //200���� 300 �ٽÿ�û 400 �߸��ȿ�û
	private A data; //���� �������� ���� Ÿ��
}

public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); //<>�� Ŭ������ ���;���. = Wrapper Ŭ������ ����
		dto.setStatusCode(200);
		dto.setData("���");
	
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}
}
