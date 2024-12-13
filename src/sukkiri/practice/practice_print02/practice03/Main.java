package sukkiri.practice.practice_print02.practice03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = sc.nextInt();
		System.out.print("整数値を入力：");
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("aとbの値は等しいです。");
		} else if (a != b) {//elseだけでもいい
			System.out.println("aとbの値は等しくないです。");
		}
	}
}
