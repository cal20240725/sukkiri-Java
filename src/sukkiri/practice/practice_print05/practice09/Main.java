package sukkiri.practice.practice_print05.practice09;

import java.util.Scanner;

public class Main {
	/*
	 *メソッド名:average
	 *引数:double[] array
	 *戻り値:double
	 *処理:引数で受け取る配列の要素の平均値を返し表示する。
	 *配列の要素数、各値はキーボード入力とします。
	 */
	public static double average(double[] array) {
		
		double sum = 0;//和の変数を初期化
		
		for (int i = 0; i < array.length; i++) {//加算処理
			sum += array[i];
		}
		
		double avg = sum / array.length;//平均の算出
		
		return avg;//平均値を返す
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("要素数を入力＞");
		int y = sc.nextInt();//配列の要素数の入力値を受付
		
		double[] array = new double[y];//配列の宣言
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("値を入力＞");//要素に入力値を代入
			double input = sc.nextDouble();//入力値の受付
			array[i] = input;//要素に代入
		}
		double avg = average(array);
		System.out.println("平均値は" + avg);
	}

}
