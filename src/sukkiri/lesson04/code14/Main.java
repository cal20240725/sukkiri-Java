package sukkiri.lesson04.code14;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};

		//拡張for文
		for (int value : scores) {
			System.out.println(value);
		}

		System.out.println("--------------------------------");

		//普通のfor文
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}
