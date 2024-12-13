package sukkiri.lesson09.sample08;

import sukkiri.lesson09.sample02.Sword;

public class Hero {
	String name;
	int hp;
	
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
//	public Hero() {
//		this.hp = 100;
//		this.name = "ダミー";
//	}
	
	public Hero() {
		this("ダミー");
	}
	/*
	＜thisに関して＞
	this.フィールド変数：自分自身のインスタンスのフィールドにアクセス
	this()：別コンストラクタの呼び出し
	*/

}
