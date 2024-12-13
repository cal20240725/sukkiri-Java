package sukkiri.lesson14.sample04;

public class Main {
	public static void main(String[] args) {
//		//①static変数を用意、static変数にアクセス
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		//②インスタンスからstatic変数にアクセス
//		Hero.money = 100;
//		
//		System.out.println(h1.hp);
//		System.out.println(Hero.money);
//		
//		//②インスタンスからstatic変数にアクセス
//		System.out.println(Hero.money);
//		System.out.println(h1.money);
//		
//		h1.money = 300;
//		
//		System.out.println(h2.money);
		
		//③static変数にアクセス
		//1人も勇者を生み出していない状況で…
		Hero.money = 100;
		
		System.out.println(Hero.money);
		
	}

}
