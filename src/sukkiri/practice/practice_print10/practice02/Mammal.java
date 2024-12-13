package sukkiri.practice.practice_print10.practice02;

public class Mammal extends Animal {
	//差分フィールド
	private boolean hasFur;
	
	//引数2つのコンストラクタ
	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
	
	//giveBirthメソッド
	public void giveBirth() {
		System.out.println("The mammal gives birth to live young.");
	}
	
	//getter
	public boolean getHasFur() {
		return this.hasFur;
	}
	
	//setter
	public void setHasHur(boolean hasFur) {
		this.hasFur = hasFur;
	}

}
