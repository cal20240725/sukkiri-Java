package sukkiri.practice.practice_print12.practice02;

public abstract class Vehicle { //抽象クラス
	//フィールド
	String name;
	
	//引数1つのコンストラクタ
	public Vehicle(String name) {
		//引数を1つ受け取り、フィールドにセット
		this.name = name;
	}
	
	//抽象メソッド
	public abstract void start();
	
	//抽象メソッド
	public abstract void stop();
	
	//getter
	public String getName() {
		return this.name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}

}
