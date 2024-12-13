package sukkiri.practice.practice_print17.practice04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("整数を入力してください。");
		String str = sc.nextLine();

		int num = 0;

		while(true) {
			try {
				num = Integer.parseInt(str);
				if(num % 1 == 0) {
					System.out.println("入力された整数は" + num + "です。");
					break; 
				}
			} catch (Exception e) {
				System.out.println("整数値ではありません");
				System.out.println("もう一度入力してください。");
				str = sc.nextLine();
			}
		} 

	}


}


