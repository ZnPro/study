package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */

public class ExampleSend {
	private static void ��������(String to, String text) {
    	String api_key = "NCSC5OTLTRBTVJGQ";
        String api_secret = "9PM4JVY0UYUPGEM0CAPKZNZXUACM38PK";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", to);
        params.put("from", "a");
        params.put("type", "SMS");
        params.put("text", text);
        params.put("app_version", "test app 1.2"); // application name and version

        try {
          JSONObject obj = (JSONObject) coolsms.send(params);
          System.out.println("�޼����� ���۵Ǿ����ϴ�.");
          System.out.println(obj.toString());//���۷����� ȣ���ϸ� toString�� �ڵ����� ȣ��(obj�� ��� ��)
        //1. obj(���ڿ�) >>�ڹ� ������Ʈ
    	  //2. ������ �ִ��� Ȯ��
    	  //3. DB insert
        } catch (CoolsmsException e) {
          System.out.println(e.getMessage());
          System.out.println(e.getCode());
        }
    }
  public static void main(String[] args) {
	  ��������("01024091611", "���ڳ���");
  }
}