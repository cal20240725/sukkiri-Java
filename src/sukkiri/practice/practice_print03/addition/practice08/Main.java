package sukkiri.practice.practice_print03.addition.practice08;

public class Main {
	public static void main(String[] args) {
		//	while文を使い、aから順にzまで表示させるプログラムを作成してください。
		//	※char c = ‘a’の値をインクリメントさせるとcの値は’b’になります。
		//	実行結果例 
		//	abcdefghijklmnopqrstuvwxyz

		//アルファベット変数の初期化
		char c = 'a';

		while (c <= 'z') {
			//表示
			System.out.print(c);
			//アルファベット変数の更新
			c++;
		}

		//別解
//		アルファベット変数の初期化
//		char c = 'a';
//		ループ変数の初期化
//		int i = 0;
//
//		while (i < 26) {
//			//表示
//			System.out.print(c);
//			//アルファベット変数とループ変数の更新
//			c++;
//		    i++;
//		}

	}

}
