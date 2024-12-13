package sukkiri.practice.practice_print11.practice06;

public interface IOperation {
	//フィールド
	//interfaceではpublic static finalは省略可能
	final String FORMAT_INT_CALC = "%d %c %d = %d";
	final char INT_ADD = '+';
	final char INT_SUB = '-';
	final char INT_MUL = '*';
	final char INT_DIV = '/';
	
	//抽象メソッド
	int intCalc(int a , int b);
	
	//抽象メソッド
	void show(int a, int b, int result);
	
}
