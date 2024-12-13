package sukkiri.practice.practice_print17.practice01;

public class Main {
	public static void main(String[] args) {
		//ArithmeticException」が発生した場合に「0で割ることができません」と表示するように例外処理
		int x = 5;
		int y = 0;
		
		try {
			int result = x / y;
			
			System.out.println(result);
			
		} catch(ArithmeticException ae) {
			System.out.println("0で割ることができません");
		}

	}

}
