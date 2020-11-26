package login;

public class LoginApp {
	static void userInfo(OAuth o) {
		System.out.println(o.oauthProvider() + "로그인한 사용자는: ");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	
	public static void main(String[] args) {
		Facebook f= new Facebook();//로그인하면 자동으로 만들어짐
		userInfo(f);
		
		Naver n= new Naver();//로그인하면 자동으로 만들어짐
		userInfo(n);
		
		Kakao k= new Kakao();//로그인하면 자동으로 만들어짐
		userInfo(k);
	}
}
