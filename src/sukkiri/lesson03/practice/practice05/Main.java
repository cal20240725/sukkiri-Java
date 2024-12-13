package sukkiri.lesson03.practice.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("[メニュー]１:検索２:登録３:削除４:変更＞");
		Scanner sc = new Scanner(System.in);
		int selected = sc.nextInt();
		switch (selected) {
		case 1 -> {
			System.out.println("検索します");
		}
		case 2 -> {
			System.out.println("登録します");
		}
		case 3 -> {
			System.out.println("削除します");
		}
		case 4 -> {
			System.out.println("変更します");
		}
		}
	}
}
