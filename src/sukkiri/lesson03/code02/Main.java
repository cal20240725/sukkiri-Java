package sukkiri.lesson03.code02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//boolean doorClose = true;
		/*boolean doorClose = false;
		while (doorClose == true) {//while(条件式)
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		
		System.out.println("トイレに入ります");*/
		
		//int temp = 28;
		int temp = 25;
		while (temp > 25) {
			temp--;
			System.out.println("-------------------------------------");
			System.out.println("温度を１度下げました");
			System.out.println("ただ今の温度は" + temp + "度です");
			System.out.println("-------------------------------------");
		}
		
		do {
			temp--;
			System.out.println("-------------------------------------");
			System.out.println("温度を１度下げました");
			System.out.println("ただ今の温度は" + temp + "度です");
			System.out.println("-------------------------------------");
		} while (temp > 25);
		
		
		
		
	}
	/*while(条件式)｛
	 	処理
	 ｝
	 
	 while(　①　)
	 	処理
	 }*/
	
}
