package sukkiri.practice.practice_print12.practice02;

public class Bicycle extends Vehicle { //Vehicleクラスを継承
	//引数1つのコンストラクタ
	public Bicycle(String name) {
		//引数を1つ受け取り、親クラスのコンストラクタに渡す
		super(name);
	}

	//オーバーライドして、実装する
	@Override
	public void start() {
		System.out.println(getName() + " is starting to pedal.");
	}

	//オーバーライドして、実装する
	@Override
	public void stop() {
		System.out.println(getName() + " is stopping pedaling.");
	}

}
