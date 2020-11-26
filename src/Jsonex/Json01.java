package Jsonex;

import com.google.gson.Gson;

class Comment{
	private int id;
	private String content;
	
	public Comment(int id, String content) {
		this.id = id;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
public class Json01 {
	public static void main(String[] args) {
		// 자바 > JSON(String)	toJson
		Comment ct1= new Comment(1,"댓글1");
		Gson gson= new Gson();
		String ct1Json= gson.toJson(ct1);
		System.out.println(ct1Json);

		//JSON(String) > 자바	fromJson
		Comment ct2= gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
	}
}
