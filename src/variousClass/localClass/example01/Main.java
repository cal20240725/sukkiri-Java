package variousClass.localClass.example01;

public class Main {
	static void method(final int x) {
		//ローカルクラスの定義
		class Local {
			int oddAbs(int t) {
				return (t%2==0 ? t:-t);
			}
		}
		//ローカルクラスのインスタンス生成
		Local lc = new Local();
		//ローカルクラスのインスタンスメソッドの呼び出し
		int y = lc.oddAbs(x);
		System.out.printf("x=%d y=%d\n", x, y);
	}
	
	public static void main(String[] args) {
		method(3);
	}

}
