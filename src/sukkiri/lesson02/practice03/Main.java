package sukkiri.lesson02.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください＞");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("あなたの年齢を入力してください＞");
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);
		Random rand = new Random();
		int fortune = rand.nextInt(4);
		fortune += 1;//fortune++;でもいい
		System.out.println("占いの結果が出ました！");
		//System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.printf("%d歳%sさん、あなたの運気番号は%dです\n", age, name, fortune);
		//上記は教科書544ページ
		//printfは改行されないのでしたい場合は最後に\nをつける
		System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");
		
		//syso+ctrl+spaceを押すとSystem.out.println();が出る。
	}

}
