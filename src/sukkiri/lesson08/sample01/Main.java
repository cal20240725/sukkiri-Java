package sukkiri.lesson08.sample01;

public class Main {
	public static void main(String[] args) {		
		//1.勇者を生成
		Hero h = new Hero();		
		//2.フィールドに初期値をセット
		h.name = "ミナト"; //変数hのnameに代入
		h.hp = 100;        //変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");		
		//3.勇者メソッドを呼び出してゆく
		h.sit(5);  //5秒座れ
		h.slip();  //転べ
		h.sit(25); //25秒座れ
		h.run();   //逃げろ
		
		//お化けキノコA(1匹目)を生成し初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		//お化けキノコB(2匹目)を生成し初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険のはじまり
		h.slip(); //勇者は転ぶ
		m1.run(); //お化けキノコAが逃げる
		m2.run(); //お化けキノコBも逃げる
		h.run();  //勇者も逃げる
		
	}

}
