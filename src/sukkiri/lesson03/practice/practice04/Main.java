package sukkiri.lesson03.practice.practice04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else //誤り
			System.out.println("映画を見ます");
		System.out.println("寝ます");
	}
}
/*elseの内容が2行になったのに{をつけていないため
 * 追加された行がただの文字列として表示されている
 * 修正するにはelseの後に{をつける*/