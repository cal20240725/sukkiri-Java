package sukkiri.practice.practice_print02.practice08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号:");
		int num = sc.nextInt();
		switch (num) {
		case 1105 -> {
			System.out.println(num + "番は合格です。");
		}
		case 1200 -> {
			System.out.println(num + "番は合格です。");
		}
		case 1311 -> {
			System.out.println(num + "番は合格です。");
		}
		default -> {
			System.out.println(num + "番は不合格です。");
		}
		}
		System.out.println("=----------------------------------------");

		switch (num) {
		case 1105, 1200, 1311 -> {
			System.out.println(num + "番は合格です。");
		}
		default -> {
			System.out.println(num + "番は不合格です。");
		}
		}
	}

}
