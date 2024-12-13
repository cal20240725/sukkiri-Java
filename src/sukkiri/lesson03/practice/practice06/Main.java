package sukkiri.lesson03.practice.practice06;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("【数あてゲーム】");
		int ans = rand.nextInt(10);
		//System.out.println("ans:" + ans);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = sc.nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
				
			} else {
				System.out.println("違います");
			}
		}

		System.out.println("ゲームを終了します");

	}

}
