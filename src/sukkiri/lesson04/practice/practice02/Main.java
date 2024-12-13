package sukkiri.lesson04.practice.practice02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//①3つの口座残高「121902」「8302」「55100」が格納されている
		//int型配列moneyListを宣言する
		//②moneyListの要素を1つずつfor文で取り出して画面に表示する。
		//③moneyListの要素を拡張for文で1つずつ取り出して画面に表示する。
		
		
		int[] moneyList = {121902, 8302, 55100};
		
		//for文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		//拡張for文
		for (int money : moneyList) {
			System.out.println(money);
		}
		

	}

}
