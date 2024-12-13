package sukkiri.lesson05.practice.practice02;

public class Main {
	/*
	 *name:email
	 *戻り値:なし
	 *引数:String address, String title, String text
	 *処理:引数で受け取ったメール情報を表示
	 */
	
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	/*
	 *name:email
	 *戻り値:なし
	 *引数:String address, String text
	 *処理:引数で受け取ったメール情報を表示
	 */
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	
public static void main(String[] args) {
	/*こうしてもいい
	String address = "メールの宛先アドレス";
	String title = "メールのタイトル";
	String text = "メールの本文";
	*/
	email("メールの宛先アドレス", "メールのタイトル", "メールの本文");
	
	email("メールの宛先アドレス", "メールの本文");
	}

}
