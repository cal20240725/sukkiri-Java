package sukkiri.practice.practice_print11.practice05;

public class Main {
	public static void main(String[] args) {
		//Animalクラスのインスタンスを生成し、「Lion」をコンストラクタに渡す
		Animal animal = new Animal("Lion");
		
		//そのインスタンスのeatメソッド、breatheメソッド、makeSoundメソッドを呼び出す
		animal.makeSound();
		animal.eat();
		animal.breathe();
				
	}

}
