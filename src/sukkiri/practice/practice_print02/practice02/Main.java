package sukkiri.practice.practice_print02.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int num = sc.nextInt();
		if (num > 5) {
			System.out.println("5より大きい値です。");
		} else {
			System.out.println("5以下の数値です。");
		}

	}

}
