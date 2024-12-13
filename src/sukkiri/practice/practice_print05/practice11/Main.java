package sukkiri.practice.practice_print05.practice11;

public class Main {
	/*
	 * 次のメソッドがある。呼び出すときに「10」を渡した場合の戻り値を答えなさい。
	 * ただし、実行せずに処理内容を考えて導き出してください。
	 */
	public static int function(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+function(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(function(10));
	}
	
	/*
	 *解答 
	 * 55
	 */
	
	/*
	 *解説 
	 *
	 *再帰メソッド
	 *
	 * function(10)
	 * 
	 * = 10 + function(10-1)
	 * 
	 * = 10 + 9 + function(9-1)
	 * 
	 * = 10 + 9 + 8 + function(8-1)
	 * 
	 * = 10 + 9 + 8 + 7 + function(7-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + function(6-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + 5 + function(5-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + 5 + 4 + function(4-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + function(3-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + function(2-1)
	 * 
	 * = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
	 * 
	 * = 55
	 */
	
	
}