package sukkiri.practice.practice_print03.addition.practice05;

public class Main {
	public static void main(String[] args) {
//		while文とif文を使い、１～１００までのうち３の倍数の値を
//		表示させるプログラムを作成しましょう。
//		実行結果例 
//		3
//		6
//		9
//		12
//		15
//		18
//		.
//		.
//		.
//		99
		
		//ループ変数の初期化
		int num = 0;
		
		//while文
		while (num <= 100) {
			num++;
			//3の倍数を表示する処理
			if (num % 3 == 0) {//3の倍数の時
				System.out.println(num);
			}
		}

	}

}
