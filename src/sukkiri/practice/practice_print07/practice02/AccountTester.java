package sukkiri.practice.practice_print07.practice02;

import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//要素数3個のAccount型クラスの配列
		Account[] person = new Account[3];
		
		for (int i = 0; i < person.length; i++) {
			//口座名義、口座番号、預金額、口座作成年、口座作成月、口座作成日を順番にScannerを用いて値を入力
			System.out.print("口座名義：");
			String name = sc.nextLine();
			System.out.print("口座番号：");
			String num = sc.nextLine();
			System.out.print("預金額：");
			int deposit = sc.nextInt();//Integer.parseInt(sc.nextLine()); このやり方もある
			System.out.print("口座作成年：");
			int year = sc.nextInt();//Integer.parseInt(sc.nextLine()); このやり方もある
			System.out.print("口座作成月：");
			int month = sc.nextInt();//Integer.parseInt(sc.nextLine()); このやり方もある
			System.out.print("口座作成日：");
			int day = sc.nextInt();//Integer.parseInt(sc.nextLine()); このやり方もある
			sc.nextLine();
			
			//入力値をコンストラクタに渡し、Accountクラスのインスタンスを生成し、配列の要素に代入
			person[i] = new Account(name, num, deposit, year, month, day);
			
			//模範解答
//			Account account = new Account(name, num, deposit, year, month, day);
//			person[i] = account;
		}
		
		//配列personの中身を全件表示
		for (int i = 0; i < person.length; i++) {
			person[i].showAccount();
		}
		
		//person[0]のbalanceを1000加算
		person[0].deposit(1000);
		
		//person[1]のbalanceを500減算
		person[1].withdraw(500);
		
		//person[2]の口座作成日を「2000年10月20日」に変更
		person[2].setDay(2000, 10, 20);
		
		//person[0]のbalanceを表示
		System.out.println(person[0].getName() + "の預金額は" + person[0].getBalance() + "です");
		
		//person[1]のbalanceを表示
		System.out.println(person[1].getName() + "の預金額は" + person[1].getBalance() + "です");
		
		//person[2]の口座作成日を表示
		person[2].getDay().showCreateDate();
	}

}
