package sukkiri.selfpractice.lesson05.practice_code02;

public class Main {
	public static void email(String address, String title, String text) {
		
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	
	public static void email(String address, String text) {
		
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	
	public static void main(String[] args) {
		
		email("gmail", "タイトル", "本文");
		
		email("アドレス", "本文");
	}

}
