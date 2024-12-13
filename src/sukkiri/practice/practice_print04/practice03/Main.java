package sukkiri.practice.practice_print04.practice03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問3	配列namesの各要素を初期化し、ループ文を使用して順番に表示しましょう。
		String[] names = {"のび太", "すねお", "ジャイアン", "しずかちゃん", "出木杉君"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}

	}

}
