package sukkiri.lesson09.sample03;

public class Main {
	public static void main(String[] args) {
		//Heroクラスのインスタンスを2つ生成
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		
		//Wizardクラスのインスタンスを生成
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		//Wizardインスタンスのインスタンスメソッド
		w.heal(h1); //ミナトを回復させる (HP: 100 → 110)
		System.out.println("ミナトのHP = " + h1.hp);
		w.heal(h2); //アサカを回復させる (HP: 100 → 110)
		w.heal(h2); //アサカを回復させる (HP: 100 → 110)
		System.out.println("アサカのHP = " + h2.hp);
		
	}

}
