package sukkiri.lesson09.sample06;

import sukkiri.lesson09.sample02.Sword;

public class Hero {
	String name;
	int hp;

	Sword sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

//	//コンストラクタ：newされた時に呼び出されるメソッド
//	public Hero() {
//		this.hp = 100; //hpフィールドを100で初期化
//	}

	public Hero(String name) {
		this.hp = 100;     //hpフィールドを100で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}

}
