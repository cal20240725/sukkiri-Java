package sukkiri.lesson10.sample02;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		
		h.run();
		
		SuperHero sh = new SuperHero();
		
		sh.run();
		
		
		//教科書12章の話
		Hero minato = new SuperHero();
		double a = 3;//やってることはこれと同じ、大きいほうに入れる
		
		minato.run();//親クラスと子クラス両方にあるから呼び出せる
		//minato.land(); //landメソッドは親クラスに存在しないので呼び出せない、キャストすればできる
		
	}

}
