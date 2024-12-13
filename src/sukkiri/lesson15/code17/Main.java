package sukkiri.lesson15.code17;

import java.time.LocalDate;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		
		//特定の日時のLocalDate型変数2つd1,d2を生成
		LocalDate d1 = LocalDate.of(2023,1,1);
		LocalDate d2 = LocalDate.of(2023,1,4);
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2);
		
		//3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		
		//d2のさらに3日後を計算する
		//日時を進める -> LocalDateTime型変数.plus(Period型 or Duration型);
		LocalDate d3 = d2.plus(p2);
		System.out.println("d2:" + d2);
		System.out.println("d3:" + d3);
	}

}
