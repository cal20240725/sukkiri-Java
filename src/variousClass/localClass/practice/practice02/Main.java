package variousClass.localClass.practice.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//String型のArrayListを作成し、「Alice」「David」「Charlie」「Bob」の順で追加
		ArrayList<String> slist = new ArrayList<>();

		slist.add("Alice");
		slist.add("David");
		slist.add("Charlie");
		slist.add("Bob");

		//引数にArrayListを渡し、arrayAlphabeticalOrderメソッドを呼び出す
		arrayAlphabeticalOrder(slist);
		//ArrayListの要素を全件表示
		for(String s : slist) {
			System.out.println(s);
		}

		System.out.println("---------------------------");

		//引数にArrayListを渡し、arrayLengthOrderメソッドを呼び出す
		arrayLengthOrder(slist);
		//ArrayListの要素を全件表示
		for(String s : slist) {
			System.out.println(s);
		}

	}

	//arrayAlphabeticalOrderメソッド
	//arrayAlphabeticalOrderメソッド内のローカルクラスとソート部分をそれぞれ匿名クラスを用いて書き換える
	static void arrayAlphabeticalOrder(List<String> ls) {
		//		//Comparator<String>を実装したローカルクラスAlphabeticalOrderComparatorを作成
		//		class AlphabeticalOrderComparator implements Comparator<String> {
		//			//compareメソッドをオーバーライドし、文字列を辞書順で比較し、実装
		//			@Override
		//			public int compare(String s1, String s2) {
		//				return s1.compareTo(s2);
		//			}
		//		}
		//		//そのクラスを利用して、引数で受け取ったリストを辞書順で並び替える
		//		Collections.sort(ls, new AlphabeticalOrderComparator());

		Collections.sort(ls, new Comparator<String>() {
			//compareメソッドをオーバーライドし、文字列を辞書順で比較し、実装
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	//arrayLengthOrderメソッド
	//arrayLengthOrderメソッド内のローカルクラスとソート部分をそれぞれ匿名クラスを用いて書き換える
	static void arrayLengthOrder(List<String> ls) {
		//		//Comparator<String>を実装したローカルクラスLengthOrderComparatorを作成
		//		class LengthOrderComparator implements Comparator<String> {
		//			//compareメソッドをオーバーライドし、文字列の長さで比較し、実装
		//			@Override
		//			public int compare(String s1, String s2) {
		//				return s1.length() - s2.length();
		//			}
		//		}
		//		//そのクラスを利用して、引数で受け取ったリストを文字列の長さに基づいて昇順で並び替える
		//		Collections.sort(ls, new LengthOrderComparator());

		Collections.sort(ls, new Comparator<String>() {
			//compareメソッドをオーバーライドし、文字列を辞書順で比較し、実装
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
	}

}
