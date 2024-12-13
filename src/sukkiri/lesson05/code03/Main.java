package sukkiri.lesson05.code03;

public class Main {

	public static void methodA() {//methodAメソッド
		
		System.out.println("methodA");
		System.out.println("before calling methodB mathod");
		methodB();//methodBの呼び出し
		System.out.println("after calling methodB mathod");

	}
	public static void methodB() {//methodBメソッド
		System.out.println("methodB");
	}
	public static void main (String[] args) {//mainメソッド
		System.out.println("before calling methodA mathod");
		methodA();//methodAの呼び出し
		System.out.println("after calling methodA mathod");
	}

}
