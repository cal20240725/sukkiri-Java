package sukkiri.practice.practice_print02.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力：");
		int a = sc.nextInt();
		System.out.print("数字を入力：");
		int b = sc.nextInt();
		System.out.print("数字を入力：");
		int c = sc.nextInt();
		//最大値の求め方
		int max = 0;
		/*int max = a;
		  上のやり方をする入力された数字がマイナスでもできる
		  if (a > max) {
			max = a;
		　上の文が不要になる*/
		
		/*
		int max = Integer.MIN_VALUE; int型の最低値の文
		System.out.primtln("Integer.MIN_VALUE:" + max)
		*/
		
		/*
		3つの変数を順番にmaxと比較していく
		maxより値が大きい場合はmaxに値を代入していく
		*/
		if (a > max) {//変数aと変数maxより大きい場合
			max = a;
		}
		if (b > max) {//変数bと変数maxより大きい場合
			max = b;
		}
		if (c > max) {//変数cと変数maxより大きい場合
			max = c;
		}
		System.out.println("max" + max);
	
	}

}
