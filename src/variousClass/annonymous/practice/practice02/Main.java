package variousClass.annonymous.practice.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		//String型のArrayListを作成し、「Alice」「David」「Charlie」「Bob」の順で追加
		ArrayList<String> slist = new ArrayList<>();

		slist.add("Alice");
		slist.add("David");
		slist.add("Charlie");
		slist.add("Bob");

		//Collections.sortメソッドの第2引数にComparatorインタフェースを匿名クラスで実装し、
		//名前に基づいて昇順で並び替え
		Collections.sort(slist, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

		//ArrayListの要素を全件表示
		for(String s : slist) {
			System.out.println(s);
		}

		System.out.println("---------------------------");

		//Collections.sortメソッドの第2引数にComparatorインタフェースを匿名クラスで実装し、
		//名前の長さに基づいて昇順で並び替え
		Collections.sort(slist, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		//ArrayListの要素を全件表示
		for(String s : slist) {
			System.out.println(s);
		}

	}

}
