package Comparable.practice.comparable.practice01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//Number型を要素とするArrayListを作成する
		ArrayList<Number> aln = new ArrayList<>();
		
		//　Numberクラスのコンストラクタにそれぞれ5, 2, 8を渡し、
		//インスタンスを生成後、それらインスタンスをArrayListに追加する。
		aln.add(new Number(5));
		aln.add(new Number(2));
		aln.add(new Number(8));
		
		//ArrayListの要素を昇順に並び替え、表示する
		Collections.sort(aln);
		
		for(Number num : aln) {
			System.out.println("Value: " + num.getValue());
			sb.append(num.getValue());
			sb.append(" ");
		}
		
		System.out.println("---------------------");
		
		//ArrayListの要素を降順に並び替え、表示する
		Collections.reverse(aln); //昇順に並び替えてからでないと降順にならない
		
		for(Number num : aln) {
			System.out.println("Value: " + num.getValue());
			sb.append(num.getValue());
			sb.append(" ");
		}
		
		System.out.println("---------------------");
		
		//StringBuilderインスタンスを生成し、昇順、降順の並び替えを利用し、
		//左右対称になるように出力する
		System.out.println(sb);
		
	}

}
