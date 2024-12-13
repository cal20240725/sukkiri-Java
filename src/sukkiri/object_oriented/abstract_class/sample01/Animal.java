package sukkiri.object_oriented.abstract_class.sample01;

public abstract class Animal { //①抽象クラス
	//フィールド
	String name;

	//コンストラクタ
	public Animal(String name) { 
		this.name = name;
	}
	
	//抽象メソッド
	abstract void run(); //②抽象メソッド

	//getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
