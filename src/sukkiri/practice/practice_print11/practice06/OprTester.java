package sukkiri.practice.practice_print11.practice06;

import java.util.Scanner;

public class OprTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む
		System.out.println("計算する数値を２つ入力");
		System.out.print("1つめ：");
		int num1 = sc.nextInt();
		System.out.print("2つめ：");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		//2つの数字と四則演算の記号（+,-,*,/）をキーボードから読み込む
		System.out.println("計算する記号を入力（+,-,*,/）");
		//sc.nextLine()でString型として読み込み
		String symbol = sc.nextLine();
		//charAt()メソッドを使ってchar型変数に代入して引数に与える
		char c = symbol.charAt(0);	
		//1行にまとめるやり方
		//char c = sc.nextLine().charAt(0);
		
		//読み込んだ記号とIOperationの定数を比較し、 
		//Add, Sub, Mul, Divのいずれかのクラスのインスタンスを生成
		if(IOperation.INT_ADD == c) {
			Add add = new Add();
			int a = add.intCalc(num1, num2);
			add.show(num1, num2, a);
		} else if(IOperation.INT_SUB == c) {
			Sub sub = new Sub();
			int s = sub.intCalc(num1, num2);
			sub.show(num1, num2, s);
		} else if(IOperation.INT_MUL == c) {
			Mul mul = new Mul();
			int m = mul.intCalc(num1, num2);
			mul.show(num1, num2, m);
		} else if(IOperation.INT_DIV == c) {
			Div div = new Div();
			int d = div.intCalc(num1, num2);
			div.show(num1, num2, d);
		} else {
			System.out.println("四則演算の記号ではありません");
		}
		
		//模範解答
//		IOperation io = null;
//		
//		if(IOperation.INT_ADD == c) {
//			io = new Add();
//		} else if(IOperation.INT_SUB == c) {
//			io = new Sub();
//		} else if(IOperation.INT_MUL == c) {
//			io = new Mul();
//		} else if(IOperation.INT_DIV == c) {
//			io = new Div();
//		} else {
//			System.out.println("四則演算の記号ではありません");
//		}
//		
//		if(io != null) {
//			int result = io.intCalc(num1, num2);
//			io.show(num1, num2, result);
//		} 
		
	}

}
