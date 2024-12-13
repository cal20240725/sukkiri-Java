package sukkiri.practice.practice_print03.practie09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.print("ｎの値を入力：");
		int n = sc.nextInt();

		int i = 0;

		int m = 0;

		while (i <= n) {
			if (i % 2 == 0) {
				m += i;
				//System.out.println(m);
			}
			i++;
		}
		System.out.println(m);
	}
	/*別解
	 * int i = 1;
	 * 
	 * while (i <= n) {
	 * 		if (i % 2 == 0) {
	 * 			sum += i;
	 * 	}
	 * 		i++;
	 * }
	 * System.out.println(sum);
	 */


	/** for文とwhile文の対応
	 * 
	 * for(①int i=0; ②i<5; ③i++){
	 * 　　　処理
	 * }
	 * 
	 * --------------------------------------
	 * 
	 * ①int i=0;
	 * while( ②i<5 ){
	 * 　　　処理
	 * 
	 * 　　　③i++;
	 * }
	 */
}
