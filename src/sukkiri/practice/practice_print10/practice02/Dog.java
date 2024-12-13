package sukkiri.practice.practice_print10.practice02;

public class Dog extends Mammal{
	//差分フィールド
	private String breed;
	
	//引数2つのコンストラクタ
	public Dog(boolean hasFur, String breed) {
		super("Dog", hasFur);	
		this.breed = breed;
	}
	
	//wagTailメソッド
	public void wagTail() {
		System.out.println("The dog wags its tail.");
	}
	
	//makeSoundメソッドをオーバーライド
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
	
	//getter
	public String getBreed() {
		return this.breed;
	}
	
	//setter
	public void setBreed() {
		this.breed = breed;
	}

}
