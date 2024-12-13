package sukkiri.practice.practice_print02.practice07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号:");
		int num = sc.nextInt();
		if (num == 1105) {
			System.out.println(num + "番は合格です。");
		} else if (num == 1200) {
			System.out.println(num + "番は合格です。");
		} else if (num == 1311) {
			System.out.println(num + "番は合格です。");
		} else {
			System.out.println(num + "番は不合格です。");
		}
		
		System.out.println("------------------------------------------");
		
		if (num == 1105 || num == 1200 || num == 1311) {
			System.out.println(num + "番は合格です。");
		} else {
			System.out.println(num + "番は不合格です。");
		}
	}

}
