package sukkiri.object_oriented.sample01;

public class Animal {
	//①フィールドの設定
	private String name;
	private int age;
	
	//②コンストラクタ
	public Animal(String name, int age) { //引数が 2 つのコンストラクタ
		this.name = name;
		this.age = age;
	}
	public Animal() {} //引数がないコンストラクタ
	
	//④その他メソッド
	public void show() {
		System.out.println("吾輩は"+this.name+"である。");
		System.out.println(this.age+"歳である。");
	}
	
	//③getter, setter メソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
