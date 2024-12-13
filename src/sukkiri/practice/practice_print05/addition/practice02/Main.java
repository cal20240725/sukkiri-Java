package sukkiri.practice.practice_print05.addition.practice02;

import java.util.Scanner;

public class Main {
	public static int getMinValue(int[] array) {
//		メソッド名： getMinValue
//		引数：int[]型 array
//		戻り値の型：int
//		処理の内容： 引数で受け取る配列の要素のうち、最も小さい値をmainメソッドに返す。
//			※最小値の初期値としてInteger.MAX_VALUEを使うこと
		
		//変数minの初期化
		int min = Integer.MAX_VALUE;
		
		//変数minの更新処理
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
			
		//変数minを返す
		return min;
	}
	
	public static void main(String[] args) {
//		メソッド名：main
//		引数：String[] args
//			　戻り値：なし
//		処理の内容：①int型配列を要素数５で宣言する
//		            ②for文を使い配列の各要素にキーボードから入力を行う
//			        ③getMinValueメソッドに配列を渡して呼び出し、戻り値を受け取る
//			        ④「最小値は（戻り値）です」という形で表示する。
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("数字を入力＞");
			int num = sc.nextInt();
			
			array[i] = num;
		}
		
		int gmv = getMinValue(array);
		
		System.out.println("最小値は" + gmv + "です");
	}

}
