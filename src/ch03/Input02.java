package ch03;

import java.io.IOException;
import java.io.InputStream;

public class Input02 {

	public static void main(String[] args) {
		//IO��ġ�߿� input�Ǵ� ��ġ�� ���� �����ؼ� 1Byte�� �����͸� �о��ִ� Ŭ����
		InputStream in= System.in; //��ǻ�ͷ� �ԷµǴ� ��� ��(Ű����)
		try {
			int num= in.read();
			System.out.println("�Է¹��� ��: "+num);
			System.out.println((char)num);
		} catch (IOException e) {//����ŷ
			System.out.println("������");
		}

	}

}