package sukkiri.practice.practice_print04.practice07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		下記値を要素の値として持つ配列scoresを作り、最大値と最小値を取得し表示しましょう。
	   （テキストP147　4.2.4省略記法の②で初期値にする）
		ループ条件にはlengthを利用すること。
		25	94	89	10	3	14	11	67
		*/
		
		//配列の初期化
		//最大値、最小値を表す変数の初期化
		//for文で、最大値、最小値を更新処理
		//int max = Integer.MAX_VALUE;
		//int min = Integer.MIN_VALUE;
		//表示
		
		
		int[] scores = {25, 94, 89, 10, 3, 14, 11, 67};
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		//別のやり方
		//int max = scores[0];
		//int min = scores[0];
		
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < max) {
				max = scores[i];
			} else if (scores[i] > min) {
				min = scores[i];
			}
		}
		/*別解
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		*/
		System.out.println("最大値：" + min);
		System.out.println("最小値：" + max);
	}

}
