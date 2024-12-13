package sukkiri.lesson02.practice01;

public class Main {
	public static void main(String[] args) {
		
	int x = 5;
	int y = 10;
	String ans = "x+yは" + (x + y);//()をつけて評価の優先順位を高める
	System.out.println(ans);
	
	//別解
	/*int x = 5;
	int y = 10;
	int z = x + y;
	String ans = "x+yは" + (x + y);
	String ans1 = "x+yは" + z;
	System.out.println(ans);
	System.out.println(ans1);*/
	}
}
