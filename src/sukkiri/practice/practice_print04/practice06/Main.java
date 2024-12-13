package sukkiri.practice.practice_print04.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問5と同じようにString型配列subjects、int型配列scoresを作りましょう。
		//for文を使い配列scoresにキーボードより点数を入力し、
		//実行結果のようにＢ君の点数を表示してください。（ループ条件にはlengthを利用すること）

		//＜前半＞
		//配列subjectsの初期化
		//配列scoresの宣言
		//for文で、入力値を受け取り、それを配列scoresの各要素に代入
		//実行結果例のように表示

		//＜後半＞
		//カウント変数の初期化
		//for文で、対象となる科目があれば、カウント変数をインクリメント
		//カウント変数を表示

		Scanner sc = new Scanner(System.in);

		String[] subjects = {"英語", "国語", "数学", "社会", "理科"};
		int[] scores = new int[ subjects.length];

		for (int i = 0; i < scores.length; i++) {
			System.out.print(subjects[i] + "の得点");
			/*
			int point = sc.nextInt();
			scores[i] = point;
			 */
			scores[i] = sc.nextInt();
		}
		System.out.print("Ｂ君：");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(subjects[i] + scores[i] + "点 ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int i = 0; i <  scores.length; i++) {
			if (scores[i] <= 50) {//配列scoresの要素が50点以下の場合
				count++;
			}
		}
		System.out.println("B君は" + count + "科目追試が必要です。");



		/*自分の回答
		String[] subjects = {"英語", "国語", "数学", "社会", "理科"};
		int[] scores = new int[5];


		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			System.out.print("Ｂ君：");

		for (int j = 0; j < subjects.length; j++) {
			System.out.print(subjects[j] + scores[i] + "点 ");

			}
		}
		 */
	}

}
