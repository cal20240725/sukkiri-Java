package sukkiri.lesson04.code09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};//箱の用意 + 箱に値を代入 + 配列の宣言
		
		//| scores[0] | scores[1] | scores[2] | scores[3] | scores[4] |
		//|    20     |    30     |    40     |    50     |    80     |
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + "週目の要素" + scores[i]);
		}
		/*
		for (int i = 0; i < 回数; i++) {
			処理
		}
		*/
	}

}
