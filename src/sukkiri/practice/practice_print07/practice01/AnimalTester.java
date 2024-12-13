package sukkiri.practice.practice_print07.practice01;

import java.util.Scanner;

public class AnimalTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal dog = new Animal("犬", "ポチ", "ワンワン", 3);
		
		Animal cat = new Animal("猫", "タマ", "にゃーにゃー", 5);
		
		dog.show();
		cat.show();
		
		Animal dog2 = new Animal();
		
		System.out.print("種類＞");
		String kind = sc.nextLine();
		System.out.print("名前＞");
		String name = sc.nextLine();
		System.out.print("鳴き声＞");
		String cry = sc.nextLine();
		System.out.print("年齢＞");
		int age = sc.nextInt();
		
		dog2.setKind(kind);
		dog2.setName(name);
		dog2.setCry(cry);
		dog2.setAge(age);
		
		dog2.show();
		
	}

}
