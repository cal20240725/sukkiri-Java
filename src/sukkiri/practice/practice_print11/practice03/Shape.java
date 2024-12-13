package sukkiri.practice.practice_print11.practice03;

public abstract class Shape { //抽象クラス
	//フィールド
	//定数なのでfinalを付ける
	//定数なのでsetterはいらない
	private final String SYMBOL = "+";
	private final String HORZLINE = "-";
	private final String VERTLINE = "|";
	
	//抽象メソッド
	public abstract void draw();
	
	//getter
	public String getSymbol() {
		return this.SYMBOL;
	}
	
	public String getHorzline() {
		return this.HORZLINE;
	}
	
	public String getVertline() {
		return this.VERTLINE;
	}

}
