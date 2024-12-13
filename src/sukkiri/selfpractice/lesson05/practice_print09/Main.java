package sukkiri.selfpractice.lesson05.practice_print09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//	メソッド名： average
//	引数：double[] array
//	戻り値の型：double
//	処理の内容： 引数で受け取る配列の要素の平均値を返し表示する。
//	配列の要素数、各値はキーボード入力とします。
	
	public static double average(List<Double> array) {
		
		double num = 0;
		
		for (int i = 0; i < array.size(); i++) {
			num += array.get(i);
		}
		
		double avg = num / array.size();
		
		return avg;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Double> numList = new ArrayList<>();
		
		System.out.print("要素数を入力＞");
		double element = sc.nextInt();
		
		numList.add(element);
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print("値を入力＞");
			double value = sc.nextInt();
			
			numList.add(value);
			
		}
		
		double avg = average(numList);
		System.out.println(avg);
	}


}
