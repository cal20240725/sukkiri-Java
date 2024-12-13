package sukkiri.practice.practice_print11.practice03;

public class Rectangle extends Shape{ //Shapeを継承
	//フィールド
	private int width;  //幅
	private int height; //高さ

	//引数2つのコンストラクタ
	public Rectangle(int width, int height) {
		//引数を2つ受け取り、フィールドに値を代入する
		this.width = width;
		this.height = height;
	}

	//Shapeクラスからdrawメソッドをオーバーライドする
	@Override
	public void draw() {
		//幅（width）、高さ（height）の長方形の形（四角形）になるように、
		//二重for文を用いてgetSymbolメソッドで取得したシンボルを表示する
		for(int i = 0; i < this.height; i++) {     //高さ(縦)
			for(int j = 0; j < this.width; j++) {  //幅(横)
				System.out.print(getSymbol());
			}
			System.out.println();
		}
	}

}
