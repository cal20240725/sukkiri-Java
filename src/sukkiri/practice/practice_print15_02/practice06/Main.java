package sukkiri.practice.practice_print15_02.practice06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		/*
		LocalDateTimeクラスを使用して現在の日時を実行結果の形式で表示してください。
		実行結果例
		2023年01月09日（月） 09時05分03秒
		*/
		
		//現在日時の取得(LocalDateTimeインスタンスの作成)
		LocalDateTime ldt = LocalDateTime.now();
		
		//LocalDateTime型をString型に変換
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 (E) HH時mm分ss秒");
		
		//変換
		String s = ldt.format(dtf);
		
		//表示
		System.out.println(s);
	}

}
