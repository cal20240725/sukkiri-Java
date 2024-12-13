package sukkiri.practice.practice_print15_02.practice01;

public class Main {
	public static void main(String[] args) {
		/*下記表はA君のテストの点数です。
          各科目を要素の値に持つString型の配列subjectと、
          各点数を要素の値に持つint型の配列scoreを作り、
             実行結果のような表示をしてください。
                英語	国語	数学	社会	理科
                   5	  80	  60	 100	  55
 
               実行結果例
               英語：  5
               国語： 80
               数学： 60
               社会：100
               理科： 55
         */
		
		//配列の作成
		String[] subjects = {"英語", "国語", "数学", "社会", "理科"};
		int[] scores = {5, 80, 60, 100, 55};
		
		//書式は「科目：整数3桁(右詰)」
		final String FORMAT = "%s: %3d";
		
		for (int i = 0; i < subjects.length; i++) {
			String str = String.format(FORMAT, subjects[i], scores[i]);
			System.out.println(str);
		}
		
		System.out.println("------------------------------------");
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s:%5d\n", subjects[i], scores[i]);
			//System.out.printf(FORMAT + "\n", subjects[i], scores[i]);
		}

	}

}
