package sukkiri.lesson08.sample01;

public class Hero {	
	//field
	String name; //名前の宣言
	int hp;      //HPの宣言
	
	//眠る(sleepメソッド)
	public void sleep() {
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	//座る(sitメソッド)
	public void sit(int sec) { //何秒座るか引数で受け取る
		this.hp += sec; //座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	//転ぶ(slipメソッド)
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	//逃げる(runメソッド)
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	
	//デフォルトコンストラクタ(コンストラクタを1つも定義していない場合、自動的に呼ばれるもの)
	public Hero() {
	};

}
