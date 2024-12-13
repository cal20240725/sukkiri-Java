package sukkiri.practice.practice_print11.practice05;

public abstract class Mammal { //抽象クラス
	//フィールド
	String name;
	
	//引数1つのコンストラクタ
	public Mammal(String name) {
		//引数を1つ受け取り、フィールドにセット
		this.name = name;
	}
	
	//抽象メソッド
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
