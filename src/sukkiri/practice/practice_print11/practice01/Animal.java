package sukkiri.practice.practice_print11.practice01;

public abstract class Animal {//抽象クラス
	//フィールド
	private String name;

	//引数1つのコンストラクタ
	public Animal(String name) {
		//引数を1つ受け取り、フィールドにセット
		this.name = name;
	}

	//引数、戻り値はなしの抽象メソッド
	public abstract void makeSound();

	//getter
	public String getName() {
		return this.name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
}
