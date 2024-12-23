package sukkiri.practice.practice_print05.addition.practice01;

import java.util.Scanner;

public class Main {
	public static int add(int a, int b) {
//		メソッド名：add
//		引数：int a , int b
//		戻り値の型：int
//		処理：引数で受け取った変数aと変数bを足し算した値を返す
		
		return a + b;
	}
	
	public static int sub(int a, int b) {
//		メソッド名：sub
//		引数：int a, int b
//		戻り値の型：int
//		処理：引数で受け取った変数aを変数bで引き算した値を返す。
		
		return a - b;
	}
	
	public static int mul(int a, int b) {
//		メソッド名：mul
//	    引数：int a, int b
//		戻り値の型：int
//		処理：引数で受け取った変数aと変数bを乗算した値を返す。
		
		return a * b;
	}
	
	public static int div(int a, int b) {
//		メソッド名：div
//	    引数：int a, int b
//		戻り値の型：int
//		処理：引数で受け取った変数aを変数bで除算した値を返す。
		
		return a / b;
	}
	
	public static void main(String[] args) {
//		メソッド名：main
//	    引数：String[] args
//		戻り値：なし
//	    処理の内容：①int型変数aとbを用意し、キーボードから入力を行う
//		　　②addメソッドを呼び出し、戻り値を表示する
//		　　　「a + b = (戻り値)」の形で出力する。
//		　　③subメソッドを呼び出し、戻り値を表示する。
//		　　　「a - b = (戻り値)」の形で出力する。
//		　　④mulメソッドを呼び出し、戻り値を表示する。
//		　　　「a × b = (戻り値)」の形で出力する。
//		　　⑤divメソッドを呼び出し、戻り値を表示する。
//		　　　「a ÷ b = (戻り値)」の形で出力する。
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("数字を入力＞");
		int a = sc.nextInt();
		System.out.print("数字を入力＞");
		int b = sc.nextInt();
		
		System.out.println("a + b = " + add(a, b));
		
		System.out.println("a - b = " + sub(a, b));
		
		System.out.println("a × b = " + mul(a, b));
		
		System.out.println("a ÷ b = " + div(a, b));
	}

}
