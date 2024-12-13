package sukkiri.lesson15.practice.code05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		
		//現在日時を持ったLocalDateインスタンスを作成
		LocalDate ld = LocalDate.now();
		
		//100日加算
		LocalDate ld2 = ld.plusDays(100);
		
		//変換＆表示
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		
		String num = ld2.format(fmt);
		
		System.out.println(num);
	}

}
