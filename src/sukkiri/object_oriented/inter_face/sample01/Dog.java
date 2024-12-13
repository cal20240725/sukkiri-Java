package sukkiri.object_oriented.inter_face.sample01;

public class Dog implements Animal{ //⑤実装
	//フィールド
	String name;

	//コンストラクタ
	public Dog(String name) {
		this.name = name;
	}

	//オーバーライド
	@Override //⑥抽象メソッドの実装
	public void run() {
		System.out.println(getName()+"は走りました");
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
