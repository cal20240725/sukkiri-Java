package sukkiri.practice.practice_print03.practie06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ
		
		/*for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}*/
		
		
		//ループ変数の初期化
		int i = 0;
		//while文
		while (i < 5) {//繰り返し条件式
			System.out.println(i + 1);
			
			//繰り返し時の処理(ループ変数の更新)
			i++;
		}
		/** for文とwhile文の対応
		 * 
		 * for(①int i=0; ②i<5; ③i++){
		 * 　　　処理
		 * }
		 * 
		 * --------------------------------------
		 * 
		 * ①int i=0;
		 * while( ②i<5 ){
		 * 　　　処理
		 * 
		 * 　　　③i++;
		 * }
		 */
	}

}
