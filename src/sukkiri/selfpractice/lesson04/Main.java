package sukkiri.selfpractice.lesson04;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		/*
		 * 配列の作成　p142
		 * 
		 * Step1 配列変数の宣言
		 *  要素の型[]　配列変数名
		 *  例  int[] scores;
		 *  
		 *  Step2 要素の作成と代入
		 *  例  scores = new int[5]
		 *  上の例の意味はint型の要素を5個作り、配列変数scoresに代入する
		 */

		//code4-2
		//int型の要素を代入できる配列変数scoresを用意(角カッコが必要)
		int[] scores;
		//int型の要素を5つ作成してscoresに代入し、配列scoresの完成
		scores = new int[5];

		//code4-3
		//Step1とStep2を同時に行う
		int[] scores = new int[5];

		//code4-4
		//配列の長さを調べる
		//配列の要素数の取得
		//配列変数名.length
		int[] scores = new int[5];
		int num = scores.length;//5になる
		System.out.println("要素の数:" + num);

		//code4-5
		int[] scores;
		scores = new int[5];
		//2つ目の要素scores[1]に代入
		scores[1] = 30;
		//2つ目の要素scores[1]の中身を表示
		System.out.println(scores[1]);

		/*
		 * 省略記法 p147
		 * 
		 * ①要素の型[] 配列変数名 = new 要素の型[] {値1, 値2, 値3, …};
		 * 例 int[] scores = new int[] {20, 30, 40, 50, 80};
		 * 
		 * ②要素の型[] 配列変数名 = {値1, 値2, 値3, …};
		 * 例 int[] scores2 = {20, 30, 40, 50, 80};
		 */

		//code4-9
		//for文を使って配列を扱う
		int[] scores = {20, 30, 40, 50, 80};

		for (int i = 0; i < scores.length; i++) {
			//ループのたびにiの値が0～4で変化する
			System.out.println(scores[i]);
		}
		/*
		 * 配列活用の定石
		 * 
		 * パターン1　ループによる全要素の利用
		 * パターン2　ループによる集計
		 * パターン3　添え字に対応した情報の利用
		 */

		//パターン1　ループによる全要素の利用
		//forループで配列を回す
		//for (int i = 0; i < 配列変数名.length; i++) {
		//	  配列変数名[i]を使った処理
		//}

		//パターン2　ループによる集計
		//点数管理プログラム(for文の利用)
		//code4-10
		int[] scores = {20, 30, 40, 50, 80};
		//集計結果を入れるための変数を初期化して準備
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			//1科目ずつ変数sumに合算する
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

		//50点以上の科目の数を調べる
		//code4-11
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {//条件に合致する要素が
				count++;          //あればカウントする
			}
		}
		System.out.println("50点以上の科目の数は:" + count);

		//パターン3　添え字に対応した情報の利用
		//DNAの記号をランダムに表示する
		//code4-12
		int[] seq = new int[10];

		//塩基配列をランダムに生成
		Random rand = new Random();

		for (int i = 0; i < seq.length; i++) {
			seq[i] = rand.nextInt(4);
		}

		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0 -> {
				System.out.println("A ");
			}
			case 1 -> {
				System.out.println("T ");
			}
			case 2 -> {
				System.out.println("G ");
			}
			case 3 -> {
				System.out.println("C ");
			}
			}
		}
		
	}

}
