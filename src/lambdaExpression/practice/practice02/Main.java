package lambdaExpression.practice.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//String型ArrayListのインスタンスを生成し、「Alice」「David」「Charlie」「Bob」の順で要素を追加
		ArrayList<String> als = new ArrayList<>();
		
		als.add("Alice");
		als.add("David");
		als.add("Charlie");
		als.add("Bob");
		
		//arrayAlphabeticalOrderメソッドを呼び出した後、リストの要素を全件表示
		arrayAlphabeticalOrder(als);
		for(String s : als) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------");
		
		//arrayLengthOrderメソッドを呼び出した後、リストの要素を全件表示
		arrayLengthOrder(als);
		for(String s : als) {
			System.out.println(s);
		}
		
	}
	
	//arrayAlphabeticalOrderメソッド
	public static void arrayAlphabeticalOrder(List<String> ls) {
		//処理内容はラムダ式を用いて、辞書順にリストの要素を並び替える
		//Collections.sortメソッドの第2引数にラムダ式()とStringクラスのメソッドを用いる
		Collections.sort(ls, (o1, o2) -> o1.compareTo(o2)); //省略
	}
	
	//arrayLengthOrderメソッド
	public static void arrayLengthOrder(List<String> ls) {
		//処理内容はラムダ式を用いて、文字数の長さでリストの要素を並び替える
		//Collections.sortメソッドの第2引数にラムダ式()を用いて、Comparatorインタフェースを実装する
		Collections.sort(ls, (String o1, String o2) -> {return o1.length() - o2.length();});
	}

}
