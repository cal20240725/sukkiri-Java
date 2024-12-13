package sukkiri.practice.practice_print15_02.practice07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		LocalDateクラスとPeriodクラスを使用して、年月日を入力し、今日との差を表示してください。
		実行結果例
		年月日を入力してください（yyyy/m/d形式）：2002/1/3
		今日との差：21年0か月9日
		*/
		
		//入力受付
		Scanner sc = new Scanner(System.in);
		
		System.out.print("年月日を入力してください（yyyy/m/d形式）＞");
		String num = sc.nextLine();
		
		//変数numをLocalDate型に変換
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d");
		LocalDate ld = LocalDate.parse(num, dtf);
		
		//「今日」の日時取得
		LocalDate now = LocalDate.now();
		
		//差の処理
		Period p = Period.between(ld, now);
		
		//表示
		int year = p.getYears();
		int month = p.getMonths();
		int day = p.getDays();
		System.out.printf("今日との差：%d年%dか月%d日", year, month, day);
		//System.out.printf("今日との差：%d年%dか月%d日\n", p.getYears(), p.getMonths(), p.getDays());
		
	}

}
