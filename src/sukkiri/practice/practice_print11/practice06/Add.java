package sukkiri.practice.practice_print11.practice06;

public class Add implements IOperation { //IOperation を実装
	//Overrideして実装
	@Override
	public int intCalc(int a , int b) {
		//2つの int 型の引数a, bを持ち、 a + b の結果を返す
		return a + b;
	}
	
	//Overrideして実装
	@Override
	public void show(int a, int b, int result) {
		//String.formatを使用して、FORMAT_INT_CALCの書式に合わせて「a + b = 計算結果」を表示
		System.out.println(String.format(FORMAT_INT_CALC, a, '+', b, result)); //自分の解答
		//System.out.println(String.format(FORMAT_INT_CALC, a, INT_ADD, b, result)); //別解
	}

}
