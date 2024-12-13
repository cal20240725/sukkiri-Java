package file_operation.practice.practice05;

public class Animal {
	//フィールド
	private String name;
	private String kind;
	private int age;
	
	//引数3つのコンストラクタ
	public Animal(String name, String kind, int age) {
		//引数を3つ持ち、フィールドにセット
		this.name = name;
		this.kind = kind;
		this.age = age;
	}
	
	//showメソッド
	public void show() {
		System.out.println("================");
		System.out.println("名前：" + getName());
		System.out.println("種類：" + getKind());
		System.out.println("年齢：" + getAge());
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public String getKind() {
		return this.kind;
	}
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
