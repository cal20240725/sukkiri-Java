package sukkiri.lesson04.code10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20, 30, 40, 50, 80};//箱の用意 + 箱に値を代入 + 配列の宣言
		
		//| scores[0] | scores[1] | scores[2] | scores[3] | scores[4] |
		//|    20     |    30     |    40     |    50     |    80     |
		
		//合計点を入れる箱(変数)
		int sum = 0;
		
		//箱(変数)sumに点数を加算していく
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + "週目に加算する数" +scores[i]);
			sum += scores[i];//箱(変数)sumに配列の要素を加算
		}
		
		//平均点を求めて、変数avgに代入
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);

	}

}
