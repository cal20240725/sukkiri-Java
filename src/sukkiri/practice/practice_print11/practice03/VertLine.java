package sukkiri.practice.practice_print11.practice03;

public class VertLine extends AbstLine{//AbstLineを継承
	//引数1つのコンストラクタ
	public VertLine(int length) {
		//引数を1つ受け取り、親クラスのコンストラクタに引数を渡す
		super(length);
	}
	
	//drawメソッドをオーバーライドする
	@Override
	public void draw() {
		//for文を使い、getVertlineメソッドを呼び出し、lengthの長さの垂直直線になるように表示する
		for(int i = 0; i < getLength(); i++) {
			System.out.println(getVertline());
		}
	}

}
