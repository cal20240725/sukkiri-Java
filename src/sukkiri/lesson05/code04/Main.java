package sukkiri.lesson05.code04;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("メソッドを呼び出します");
		hello("湊");//"湊"を渡してhelloメソッドを呼び出す
		hello("朝香");//"朝香"を渡してhelloメソッドを呼び出す
		hello("菅原");//"菅原"を渡してhelloメソッドを呼び出す
		System.out.println("メソッドの呼び出しが終わりました");
		
		/*
		hello_minato();
		hello_asaka();
		hello_sugawara();
		*/
	}
	/*
	public static void hello_minato() {
		System.out.println("Hello, Minato");
	}
	
	public static void hello_asaka() {
		System.out.println("Hello, Asaka");
	}
	
	public static void hello_sugawara() {
		System.out.println("Hello, sugawara");
	}
	*/
		
	public static void hello(String name) {//helloメソッドの定義
		System.out.println(name + "さん、こんにちは");
	}
	/*
	 * 引数の書き方
	 * public static void メソッド名(型　ブロック内で使う変数名) {
	 * 
	 * } 
	 */
	
}
