package sukkiri.lesson04.code08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};//箱の用意 + 箱に値を代入 + 配列の宣言
		
		//| scores[0] | | scores[1] | | scores[2] | | scores[3] | | scores[4] |
		//|    20     | |    30     | |    40     | |    50     | |    80     |
		
		//scores[5]つまりindex5は存在しない（範囲外なのでエラー発生）
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);

	}

}
