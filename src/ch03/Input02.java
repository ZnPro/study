package ch03;

import java.io.IOException;
import java.io.InputStream;

public class Input02 {

	public static void main(String[] args) {
		//IO장치중에 input되는 장치의 선에 접근해서 1Byte씩 데이터를 읽어주는 클래스
		InputStream in= System.in; //컴퓨터로 입력되는 모든 선(키보드)
		try {
			int num= in.read();
			System.out.println("입력받은 값: "+num);
			System.out.println((char)num);
		} catch (IOException e) {//블락킹
			System.out.println("괜찮아");
		}

	}

}
