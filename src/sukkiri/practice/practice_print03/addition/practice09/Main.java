package sukkiri.practice.practice_print03.addition.practice09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		for文とif文を使い、ｎ回整数を読み込みし、整数を加算してください。
//		合計値が1000を超えない範囲で加算し、超えた時点でｎ回読み込みが
//		完了していなくても入力処理を終了して合計値を表示してください。
//		
//		実行結果例
//		何回入力？：5 (キーボード入力)
//		整数値：333(キーボード入力)
//		整数値：123(キーボード入力)
//		整数値：200(キーボード入力)
//		整数値：44(キーボード入力)
//		整数値：299(キーボード入力)
//		合計：999(表示)
//		
//		実行結果例
//		何回入力？：5 (キーボード入力)
//		整数値：333(キーボード入力)
//		整数値：555(キーボード入力)
//		整数値：300(キーボード入力)
//
//		合計が1000超えました（表示）
//		最後の数値は無視します。（表示）
//		合計：888(表示)
		
		Scanner sc = new Scanner(System.in);
		
		//加算処理回数の入力受付
		System.out.print("何回入力？：");
		int num = sc.nextInt();
		
		//加算変数の初期化
		int count = 0;
		
		//ループ文で加算処理
		for (int i = 0; i < num; i++) {
			//入力受付
			System.out.print("整数値：");
			int numb = sc.nextInt();
			
			count += numb;
			
			if (count > 1000) {
				System.out.println("合計が1000超えました。");
				System.out.println("最後の数値は無視します。");
				count -= numb;
				break;
			}
			
			//別解
//			if ((count + numb) <= 1000) {
//				count += numb;
//			} else {
//				System.out.println("合計が1000超えました。");
//				System.out.println("最後の数値は無視します。");
//				count -= numb;
//				break;
//			}
			
			//別解
//			if (count + numb > 1000) {
//				System.out.println("合計が1000超えました。");
//				System.out.println("最後の数値は無視します。");
//				count -= numb;
//				break;
//			}
//			count += numb;
		}
		
		System.out.println("合計：" + count);

	}

}
