package sukkiri.object_oriented.abstract_class.sample01;

public class Main {
	public static void main(String[] args) {
		//インスタンス生成
		Dog dog = new Dog("ポチ");

		//実装したインスタンスメソッドの呼出し
		dog.run();
		
		//抽象クラスのインスタンスは生成不可
		//Animal animal = new Animal("abc");
		Animal animal = new Dog("abc"); //12章でやる
		

	}

}
