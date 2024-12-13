package sukkiri.practice.practice_print03.practie04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ｎの値を入力：");
		int n = sc.nextInt();
		//1～n(入力値)までを表示
		/*for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}*/
		int m = 0;
		//1～n(入力値)まで[で偶数]の和を求める
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {//偶数のとき→ループ変数が偶数のとき
				m += i;//偶数のループを
			}
			//System.out.println(m);
		}
		System.out.println(m);
	}

}
