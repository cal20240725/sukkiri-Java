package sukkiri.practice.practice_print12.practice03;

public class Dog extends Animal{ //Animalクラスを継承
	//引数2つのコンストラクタ
	public Dog(String name, int age) {
		//Animalクラスのコンストラクタを呼び出し、name, ageをセットする
		super(name, age);
	}

	//差分メソッド
	public void run() {
		System.out.println("トコトコ");
	}

	//Animalクラスからspeakメソッドをオーバーライド
	@Override
	public void speak() {
		System.out.println("わんわん");
	}

}
