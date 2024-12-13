package sukkiri.practice.practice_print17.practice05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("IDを入力：");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("名前を入力：");
			String name = sc.nextLine();
			
			try {
				User user = new User(id, name);
				System.out.println(user.toString());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
