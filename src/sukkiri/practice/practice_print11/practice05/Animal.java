package sukkiri.practice.practice_print11.practice05;

public class Animal extends Mammal implements LivingBeing { //LivingBeingインタフェース、Mammalクラスを実装
	//引数1つのコンストラクタ
	public Animal(String name) {
		//引数を1つ受け取り、親クラスのコンストラクタに渡す
		super(name);
	}
	
	//オーバーライドして、実装する
	@Override
	public void eat() {
		System.out.println(getName() + " is eating.");
	}
	
	//オーバーライドして、実装する
	@Override
	public void breathe() {
		System.out.println(getName() + " is breathing.");
	}
	
	//オーバーライドして、実装する
	@Override
	public void makeSound() {
		System.out.println(getName() + " makes a sound.");
	}

}
