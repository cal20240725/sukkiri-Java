package sukkiri.lesson02.code16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//教科書のやり方
		/*System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");*/
		
		//添付ファイルのやり方
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください。");
		String name = sc.nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = sc.nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}

}
