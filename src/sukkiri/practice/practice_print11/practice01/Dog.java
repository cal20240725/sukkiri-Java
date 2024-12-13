package sukkiri.practice.practice_print11.practice01;

public class Dog extends Animal {
	//引数1つのコンストラクタ
	public Dog(String name) {
		//引数を１つ受け取り、親クラスのコンストラクタに渡す
		super(name);
	}

	//親クラスの抽象メソッドmakeSoundメソッドをオーバーライドして、実装
	@Override
	public void makeSound() {
		System.out.println(super.getName() + " says Woof!");
	}

}
