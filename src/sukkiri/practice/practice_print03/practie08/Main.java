package sukkiri.practice.practice_print03.practie08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
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
