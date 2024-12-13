package sukkiri.practice.practice_print12.practice03;

public class Animal {
	//フィールド
	private String name;
	private int age;
	
	//引数2つのコンストラクタ
	public Animal(String name, int age) {
		//setNameとsetAgeを呼び出す
		setName(name);
		setAge(age);
	}
	
	//showProfileメソッド
	public void showProfile() {
		System.out.println("名前は" + getName() + "で、" + getAge() + "歳です。");
	}
	
	//speakメソッド
	public void speak() {
		System.out.println(".........");
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
