package sukkiri.practice.practice_print16.practice04;

import java.util.HashSet;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		/*
		【HashSetの操作】
		ビンゴカードを作成しましょう。
		処理手順は以下の通りになります。
		1.	コレクションのSetをInteger型で宣言
		2.	While文を使い無限ループさせ、その中で乱数０～９９の値を繰り返し取得する。
		初めて取得した値ならSetに格納していく。
		3.	Setのサイズが24になったときに無限ループからbreakで抜ける。
		4.	最後に表示処理を行う。

		実行結果例(値はランダム)
		1  14  35  42  58
		3  20  40  50  62
		7  24  ☆  53  68
		8  28  41  54  74
		9  32  42  57  89
		 */

		//コレクションのSetをInteger型で宣言
		HashSet<Integer> numbers = new HashSet<Integer>();

		Random rand = new Random();

		while (true) {
			//乱数値の生成
			int ra = rand.nextInt(100);
			//Setに追加
			numbers.add(ra);
			//サイズが24になったらbreak
			if (numbers.size() == 24) {
				break;
			}

		}

		int count = 0;

		//最後に表示処理を行う
		for (int i : numbers) {
			count++;
			
			//☆の処理
			if (count == 13) {
				System.out.printf("%2s", "☆");
				//次のSetの要素を14番目にするための処理
				count++;
			}
			
			//Setの要素を表示
			System.out.printf("%3d", i);
			
			//改行処理
			if (count % 5 == 0) {
				System.out.println();
			}
		}

	}

}
