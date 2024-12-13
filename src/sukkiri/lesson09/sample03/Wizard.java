package sukkiri.lesson09.sample03;

public class Wizard {
	String name;
	int hp;
	
	public void heal(Hero h) { //staticがついていなんものはインスタンスという
		h.hp += 10; //引数で受け取ったHeroクラスのインスタンスのhpを10加算
		System.out.println(h.name + "のHPを10回復した！");
	}
	
	public static void aaa() { //インスタンス化せずに使える
                               //staticはクラス自体にあるメソッド
	}

}
