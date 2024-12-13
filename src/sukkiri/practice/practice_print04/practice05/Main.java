package sukkiri.practice.practice_print04.practice05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//各科目を要素の値に持つString型の配列subjectsと、
		//各点数を要素の値に持つint型の配列scoresを作り、
		//実行結果のような表示をしてください。
		
		String[] subjects = {"英語", "国語", "数学", "社会", "理科"};
		int[] scores = {75, 80, 60, 90, 55};
		
		System.out.print("A君:");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + scores[i] + "点 ");
			if (i < subjects.length - 1) {//『、』を表示するとき
				System.out.print("、");
			}
		}
		
		
		/*
		System.out.println("A君:" + subjects[0] + scores[0] + "点、"
				+ subjects[1] + scores[1] + "点、" + subjects[2] + scores[2] + "点、" 
				+ subjects[3] + scores[3] + "点、" + subjects[4] + scores[4] + "点");
		*/


	}

}
