package sukkiri.practice.practice_print15_01.practice05;

public class Main {
	public static void main(String[] args) {
		/*下記表はA君のテストの点数です。
          各科目を要素の値に持つString型の配列ｓと、各点数を要素の値に持つint型の配列aを作り、
          実行結果のような表示をしてください。（実行結果はStringBuilderを用いて文字列を作る）
          ※forの中で科目と点数を連結させていき、if文を使い、
          「、」を実行結果例に合うように連結させる。
                英語	国語	数学	社会	理科
                  75	  80	  60	  90	  55

                          実行結果例
           Ａ君：英語 75点、国語 80点、数学 60点、社会 90点、理科 55点
        */
		
		//科目と点数の配列の用意
		String[] s = {"英語", "国語", "数学", "社会", "理科"};
		int[] a = {75, 80, 60, 90, 55};
		
		StringBuilder sb = new StringBuilder();
		
		//文字列を連結するメソッドを用いて"Ａ君："を連結する
		sb.append("Ａ君：");
		
		//要素数だけループするfor文を用意
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
			sb.append(" ");
			sb.append(a[i]);
			sb.append("点");
			
			//sb.append(s[i] + " " + a[i] + "点");
			//sb.append(s[i]).append(" ").append(a[i]).append("点");
			
			if (i < s.length - 1) {
				sb.append("、");
			}
		}
		
		//変数を表示
		//String b = sb.toString();
		//System.out.println(b);
		
		System.out.println(sb);
	}

}
