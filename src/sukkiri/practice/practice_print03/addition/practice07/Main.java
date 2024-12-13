package sukkiri.practice.practice_print03.addition.practice07;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//  do-while文、switch文、乱数を使い、おみくじのプログラムを作成してください。
		//	乱数値は0～3の範囲になるようにしてください。
		//	値が０のときは凶、１のときは吉、２のときは中吉、３のときは大吉を表示。
		//	結果を表示後、再度おみくじを行うか確認を求め、入力値がyの場合は再度おみくじを、
		//	nの場合はおみくじを終了させてください。
		//	実行結果例 （入力正常時）	実行結果例（入力不正時）
		//	あなたの運勢は中吉です。(表示)
		//	再度おみくじを行いますか？(y/n): y（yの場合）
		//	あなたの運勢は凶です。(表示)
		//	再度おみくじを行いますか？(y/n): n(nの場合)
		//	おみくじを終了します。(表示)	あなたの運勢は大吉です。(表示)
		//	再度おみくじを行いますか？(y/n): a
		//	入力が不正です。(表示)
		//	再度おみくじを行いますか？(y/n): b
		//	入力が不正です。(表示)

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
			
//		String str = null;
//		int ran = rand.nextInt(3) + 1;
	
//		do {
//			switch (ran) {
//			case 0 -> {
//				System.out.println("凶");
//			}
//			case 1 -> {
//				System.out.println("吉");
//			}
//			case 2 -> {
//				System.out.println("中吉");
//			}
//			case 3 -> {
//				System.out.println("大吉");
//			}
//			}
//			
//			System.out.print("再度おみくじを行いますか？(y/n):");
//			str = sc.nextLine();
//			
//			switch (str) {
//			case "y" -> {
//				continue;
//			}
//			default -> {
//				System.out.println("入力が不正です。");
//			}
//			}
//			
//		} while (!(str.equals("n")));
		
		//解答
		

		//入力値を表す変数strの初期化
		String str = null;
		
		do {
			//乱数生成
			int ran = rand.nextInt(3) + 1;
			//おみくじの結果を表示
			switch (ran) {
			case 0 -> {
				System.out.println("あなたの運勢は凶です。");
			}
			case 1 -> {
				System.out.println("あなたの運勢は吉です。");
			}
			case 2 -> {
				System.out.println("あなたの運勢は中吉です。");
			}
			case 3 -> {
				System.out.println("あなたの運勢は大吉です。");
			}
			}
			
			//入力が不正の場合、再度入力を要求する処理
			do {
				//入力受付
				System.out.print("再度おみくじを行いますか？(y/n):");
				str = sc.nextLine();
				//入力値が不正(入力値がy,n以外)
				if (!(str.equals("y")) || str.equals("n")) {
					System.out.println("入力が不正です。");
				}
			} while (!(str.equals("y")) || str.equals("n"));			
		} while (str.equals("y"));
		
		System.out.println("おみくじを終了します");

	}

}
