package sukkiri.practice.practice_print02.practice04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力：");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0)
				System.out.println("その値は偶数です");
			if (num % 2 == 1) 
				System.out.println("その値は奇数です");
		} else if (num < 0) {
			System.out.println("正でない値が入力されました");
		}
	}

}
