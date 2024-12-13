package sukkiri.lesson05.code06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int x = 100;
		int y = 10;
		add();

	}
	public static void add() {
		//int x = 3; 
		//int y = 2;
		//mainメソッドにある変数x,yはmainメソッド内でのみ使用可能
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
