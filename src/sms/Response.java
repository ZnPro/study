package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2G84OsiXEwwbb4K\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		Response res = new Response();
		
		String s[];
		
		String t="1234";
		//System.out.println(t.indexOf(1));
		System.out.println(data.indexOf(1));
		System.out.println(data.lastIndexOf(1));
		//System.out.println(data);
	}
}
