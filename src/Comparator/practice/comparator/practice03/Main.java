package Comparator.practice.comparator.practice03;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//Employee型を要素とするArrayListを作成する
		ArrayList<Employee> ale = new ArrayList<>();

		//「"Alice", 50000」、「"Bob", 60000」、「"Charlie", 55000」コンストラクタに渡し、
		//Employeeクラスのインスタンスを3つ生成し、ArrayListに追加する
		ale.add(new Employee("Alice", 50000));
		ale.add(new Employee("Bob", 60000));
		ale.add(new Employee("Charlie", 55000));

		//名前に基づいて昇順でソートし、表示する
		System.out.println("名前でソート:");

		NameComparator nc = new NameComparator();
		Collections.sort(ale, nc);

		for(Employee n : ale) {
			System.out.println(n);
		}

		System.out.println("--------------------------------------------");

		//給与に基づいて昇順でソートし、表示する
		System.out.println("給与でソート:");

		SalaryComparator sc = new  SalaryComparator();
		Collections.sort(ale, sc);

		for(Employee n : ale) {
			System.out.println(n);
		}

		System.out.println("--------------------------------------------");

		//名前に基づいて降順でソートし、表示する
		System.out.println("名前でソート:");

		Collections.sort(ale, Collections.reverseOrder(nc));

		for(Employee n : ale) {
			System.out.println(n);
		}

		System.out.println("--------------------------------------------");

		//給与に基づいて降順でソートし、表示する
		System.out.println("給与でソート:");

		Collections.sort(ale, Collections.reverseOrder(sc));

		for(Employee n : ale) {
			System.out.println(n);
		}

		System.out.println("--------------------------------------------");

	}

}
