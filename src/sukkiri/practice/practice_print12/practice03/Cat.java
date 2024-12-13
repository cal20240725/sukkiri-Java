package sukkiri.practice.practice_print12.practice03;

public class Cat extends Animal{ //Animalクラスを継承
	//差分フィールド
	private int weight;

	//引数3つのコンストラクタ
	public Cat(String name, int age, int weight) {
		//親クラス（Animal)にnameとageを渡す
		super(name, age);
		//setWeightメソッドを呼び出す
		setWeight(weight);
	}

	//差分メソッド
	public void sleep() {
		System.out.println("スースー");
	}

	//AnimalクラスからshowProfileメソッドをオーバーライド
	@Override
	public void showProfile() {
		System.out.println("名前は" + getName() + "で、" + getAge() + 
				"歳、体重は" + getWeight() + "キログラムです。");
	}

	//Animalクラスからspeakメソッドをオーバーライド
	@Override
	public void speak() {
		System.out.println("にゃーにゃー");
	}

	//getter
	public int getWeight() {
		return this.weight;
	}

	//setter
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
