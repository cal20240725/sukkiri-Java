package sukkiri.practice.practice_print12.practice03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Animalクラス配列を要素数4で作成
		Animal[] animal = new Animal[4];

		for(int i = 0; i < animal.length; i++) {
			//ループ文の中で、「動物を指定してください。１：猫　２：犬」と表示後
			System.out.println("動物を指定してください。１：猫　２：犬");
			//キーボードから動物の指定番号を入力
			int animalNum = sc.nextInt();
			
			sc.nextLine();

			//犬、猫で共通の内容は、「名前」「年齢」なので、キーボードから入力
			System.out.print("名前：");
			String animalName = sc.nextLine();

			System.out.print("年齢：");
			int animalAge = sc.nextInt();

			if(animalNum == 1) {
				//動物指定が１：猫の時は、追加で「体重」をキーボードから入力
				System.out.print("体重：");
				int animalWeight = sc.nextInt();
				//動物指定が１の時は、インスタンス生成し、
				//Catクラスのコンストラクタに「名前」「年齢」「体重」を渡す
				Cat cat = new Cat(animalName, animalAge, animalWeight);
				//インスタンス化したら、作成した配列に順番に格納
				animal[i] = cat;
			} else if(animalNum == 2) {
				//動物指定が2の時は、インスタンス生成し、
				//DOGクラスのコンストラクタに「名前」「年齢」を渡す
				Dog dog = new Dog(animalName, animalAge);
				//インスタンス化したら、作成した配列に順番に格納
				animal[i] = dog;
			}

			//ループ文の中で、showProfileメソッド、speakメソッドを呼び出す
			animal[i].showProfile();
			animal[i].speak();

			if(animal[i] instanceof Cat cat) {
				//配列に格納されているのがCatクラスの場合はsleepメソッドを呼び出す
				cat.sleep();
			} else if(animal[i] instanceof Dog dog) {
				//配列に格納されているのがDogクラスの場合はrunメソッドを呼び出す
				dog.run();
			} /*else { このやり方もある
				Dog dog = (Dog)animal[i];
			}*/
			break;
		}

	}

}
