package sukkiri.practice.practice_print11.practice03;

public class Point extends Shape { //Shapeを継承
	//Shapeクラスからdrawメソッドをオーバーライドする
	@Override
	public void draw() {
		//getSymbolメソッドで取得したシンボルを表示する
		System.out.println(getSymbol());
	}

}
