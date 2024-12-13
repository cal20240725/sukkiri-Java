package sukkiri.practice.practice_print14.practice02;

public class User {
	//フィールド
	private String name;
	private int age;
	
	//引数2つのコンストラクタ
	public User(String name, int age) {
		//引数を2つ受け取り、フィールドにセット
		this.name = name;
		this.age = age;
	}
	
	//オーバーライドして、boolean型を返す
	@Override
	public boolean equals(Object o) {
		//同じオブジェクトへの参照の場合、等しいとみなし、trueを返す
		if(this == o) {
			return true;
		}		
		//Userクラスのインスタンスである場合、名前と年齢が等しいなら等しいとみなし、trueを返す
		if (o instanceof User u) {
			if(this.name.equals(u.name) && this.age == u.age) { //u.getName、u.getAgeの方が良い
				return true;
			}
		}
		//それ以外はfalseを返す
			return false;
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
