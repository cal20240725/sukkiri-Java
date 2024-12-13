package sukkiri.practice.practice_print10.practice02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(true, "Golden Retriever");
		
		Main.info(dog);
		behavior(dog);
		
		//インスタンスメソッドとstaticメソッドの呼び出し方
		//インスタンスメソッドの呼び出し方
		//:インスタンス変数名.メソッド名
		//staticメソッド(クラスメソッド)の呼び出し方
		//:クラス名.メソッド名
		
	}
	
	public static void info(Dog dog) {
		System.out.println("Breed:" + dog.getBreed());
		System.out.println("Species:" + dog.getSpecies());
		System.out.println("Has fur:" + dog.getHasFur());
	}
	
	public static void behavior(Dog dog) {
		dog.makeSound();
		dog.giveBirth();
		dog.wagTail();
	}

}
