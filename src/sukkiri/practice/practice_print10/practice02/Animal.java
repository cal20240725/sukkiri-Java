package sukkiri.practice.practice_print10.practice02;

public class Animal {
	//フィールド
	private String species;
	
	//引数1つのコンストラクタ
	public Animal(String species) {
		this.species = species;
	}
	
	//makeSoundメソッド
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
	
	//getter
	public String getSpecies() {
		return this.species;
	}
	
	//setter
	public void setSpecies(String species) {
		this.species = species;
	}

}
