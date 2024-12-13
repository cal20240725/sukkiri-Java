package sukkiri.lesson05.code05;

public class Main {

	public static void main(String[] args) {
		/*
		int a = 150;
		int b = 30;
		add(a, b);//これでもできる
		*/
		add(100, 20);
		add(200, 50);
		
		aaa("tama", 3);
		//aaa(2, "tama");逆はできない
		
	}
	
	public static void aaa(String name, int age) {//これもできる
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
	
	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
