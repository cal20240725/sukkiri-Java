package sukkiri.practice.practice_print11.practice03;

public class HorzLine extends AbstLine{ //AbstLineを継承
	//引数1つのコンストラクタ
	public HorzLine(int length) {
		//引数を1つ受け取り、親クラスのコンストラクタに引数を渡す
		super(length);
	}
	
	//drawメソッドをオーバーライドする
	@Override
	public void draw() {
		//for文を使い、getHorzlineメソッドを呼び出し、lengthの長さの水平直線になるように表示する
		for(int i = 0; i < getLength(); i++) {
			System.out.print(getHorzline());
		}
		//改行のSystem.out.println()
		System.out.println();
	}

}
