package sukkiri.lesson05.code11;

public class Main {
	public static int add(int x, int y) {//1つ目のaddメソッド
		return x + y;
	}
	/*
	public static String add(int x, int y) {//これはダメ
		return "";
	}
	*/
	
	/*
	public static String dd(int x, int y) {//これはいける
		int ans = x + y;
		return "和は" + ans;
	}
	*/
	
	public static int add(int x, int y, int z) {//2つ目のaddメソッド
		return x + y + z;
	}
	
	public static void main(String[] args) {
		System.out.println("10+20=" + add(10, 20));//1つ目のaddメソッドが呼び出される
		System.out.println("10+20+30=" + add(10, 20, 30));//2つ目のaddメソッドが呼び出される
	}
}
