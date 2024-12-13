package sukkiri.object_oriented.abstract_class.sample01;

public class Dog extends Animal {
	//コンストラクタ
	public Dog(String name) {
		super(name);
	}

	//抽象メソッドの実装
	@Override //③抽象メソッドの実装
	void run() {
		System.out.println(getName() + "は走りました");
	};

}
