package sukkiri.lesson09.sample05;

import sukkiri.lesson09.sample02.Sword;

public class Hero {
	String name;
	int hp;
	
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	//コンストラクタ：newされた時に呼び出されるメソッド
	public Hero() {
		this.hp = 100; //hpフィールドを100で初期化
	}

}
