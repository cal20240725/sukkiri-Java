package sukkiri.practice.practice_print14.practice05;

public class Animal {
	//フィールド
	private static int totalAnimals; //staticフィールド
	private String name;
	private int age;
	
	//引数2つのコンストラクタ
	public Animal(String name, int age) {
		//引数を2つ受け取り、非staticなフィールドにセットし、
		this.name = name;
		this.age = age;
		//staticなフィールドをインクリメントする
		totalAnimals++;
	}
	
	//引数はなく、staticなフィールドを返すstaticメソッド
	public static int getTotalAnimals() {
		return totalAnimals;
	}
	
	//非staticフィールドを表示するメソッド
	public void displayInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

}
