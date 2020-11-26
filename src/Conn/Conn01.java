package Conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn01 {

	public static void main(String[] args) {
		try {
			//1. �ּ� ���� URLŬ���� ���
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			//2. ���� ������ ���� ��Ʈ���� ����
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
		
		 //3. ���ۿ���(8192Byte)
		BufferedReader br =
				new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String input=null;
		String download="";
		while((input = br.readLine()) != null) {
			download = download + input;
		}
		
		FileWriter fw = new FileWriter("d:\\index.html");
		fw.write(download);
		
		Document doc = Jsoup.parse(download);
		Elements temp = doc.select(".todaytemp");
		System.out.println("������ �µ���: " +temp.get(0).text());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}