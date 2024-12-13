package sukkiri.practice.practice_print05.practice08;

import java.util.Scanner;

public class Main {
	/*
	 *メソッド名:minValue
	 *引数:int[]型 array
	 *戻り値:int
	 *処理:引数で受け取る配列の要素のうち、最も小さい値を返し表示する。
	 *配列の要素数は5で固定、各値はキーボード入力とします。
	 */
	public static int minValue(int[] array) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int[] value = new int[5];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < value.length; i++) {
			System.out.print("数字を入力＞");
			int num = sc.nextInt();
			
			if (num < min) {
				min = num;
			}
		}
		*/
		
		int min = array[0];//最小値変数の初期化
		
		for (int i = 0; i < array.length; i++) {//最小値の更新
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		return min;//最小値変数を返す
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[5];//配列の宣言
		
		for (int i = 0; i < ary.length; i++) {//配列の要素に値を代入
			System.out.print("数字を入力＞");
			int input = sc.nextInt();//入力受付
			ary[i] = input;//要素に代入
		}
		
		int min = minValue(ary);
		System.out.println("最小値は" + min);
	}

}
