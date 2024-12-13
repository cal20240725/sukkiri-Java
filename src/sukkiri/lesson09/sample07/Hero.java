package sukkiri.lesson09.sample07;

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
		
		System.out.println("have an arg");
	}
	
	//コンストラクタのオーバーロード
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
		
		System.out.println("no args");
	}

}
