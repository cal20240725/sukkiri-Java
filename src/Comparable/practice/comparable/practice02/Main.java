package Comparable.practice.comparable.practice02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//User型を要素とするArrayListを作成する
		ArrayList<User> alu = new ArrayList<>();

		//Userクラスのインスタンスを生成し、コンストラクタに渡す
		//生成したインスタンスをArrayListに追加する
		alu.add(new User("Alice", LocalDateTime.of(2023, 3, 15, 10, 30)));
		alu.add(new User("Bob", LocalDateTime.of(2023, 3, 14, 15, 45)));
		alu.add(new User("Alice", LocalDateTime.of(2023, 3, 16, 8, 0)));

		//日時情報に基づいてArrayListの要素を昇順にソートし、表示する。
		Collections.sort(alu);

		for(User user : alu) {
			System.out.println("Username:" + user.getUserName() + "    " + "Registration Date:" + 
		                        user.getRegistrationDate());
			//別のやり方
//			System.out.printf("Username:%-10s Registration Date:%-20s\n"
//					           , user.getUserName(), user.getRegistrationDate());
		}

		System.out.println("---------------------------------------------------------------------");

		//降順にソートし、表示する
		Collections.reverse(alu);

		for(User user : alu) {
			System.out.println("Username:" + user.getUserName() + "    " + "Registration Date:" + 
		                        user.getRegistrationDate());
			//別のやり方
//			System.out.printf("Username:%-10s Registration Date:%-20s\n"
//			           , user.getUserName(), user.getRegistrationDate());
		}

	}

}
