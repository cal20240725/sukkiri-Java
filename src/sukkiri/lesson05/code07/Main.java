package sukkiri.lesson05.code07;

public class Main {

	public static int add(int x, int y) {
		
		//戻り値があるaddメソッド
		int ans = x + y;
		return ans;//整数2つを受け取って、足し算した結果を返している

	}
	public static void main(String[] args) {
		int ans = add(100, 10);//戻り値があるときは変数に代入
		System.out.println("100 + 10 = " + ans);
	}
}
