package sukkiri.practice.practice_print07.practice01;

public class Animal {
	//フィールド
	private String kind;
	private String name;
	private String cry;
	private int age;

	//コンストラクタ
	//空のコンストラクタ
	public Animal() {

	}
	
	//引数が4つのコンストラクタ
	public Animal(String kind, String name, String cry, int age) {
		this.kind = kind;
		this.name = name;
		this.cry = cry;
		this.age = age;
	}
	
	//setter
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//その他のメソッド
	public void show() {
		System.out.println(this.name + "は" + this.kind + "で、年齢は" + this.age + "歳、鳴き声は" + this.cry);
	}


}
