package sukkiri.practice.practice_print02.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力：");
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("その値は0です。");
		} else if (a > 0) {//elseだけでよい
			System.out.println("その値は0ではありません");
		}

	}

}
