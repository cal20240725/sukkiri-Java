package sukkiri.practice.practice_print03.practie10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ｍの値を入力：");
		int m = sc.nextInt();
		
		System.out.print("nの値を入力：");
		int n = sc.nextInt();
		
		int i = m;
		
		int s = 0;
		
		while (i <= n) {
			s += i;
			i++;
		}
		System.out.println(s);
	}

}
