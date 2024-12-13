package sukkiri.object_oriented.inheritance.sample01;

class Dog extends Animal { //①extends
	//コンストラクタ ②コンストラクタ(super(引数リスト))
	public Dog(String name) { 
		super(name); 
	}

	//差分フィールド ③差分メンバ
	private int age;

	//差分メソッド(showAge(), getter, setter) ③差分メンバ
	public void showAge() { 
		System.out.println(this.age + "歳"); 
	}
	
	public int getAge() { 
		return age; 
	}
	
	public void setAge(int age) { 
		this.age = age; 
	}

	//親クラスの run メソッドをオーバーライド ④オーバーライド
	@Override
	public void run() { 
		System.out.println(getName() + "は走りました"); 
	}
}

