package Comparator.practice.comparator.practice02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		//Student型を要素とするArrayListを作成する
		ArrayList<Student> als = new ArrayList<>();

		//「"Alice", 85, 20」、「"Bob", 92, 22」、「Charlie", 78, 21」をコンストラクタに渡し、
		//Studentクラスのインスタンスを3つ生成し、ArrayListに追加する
		als.add(new Student("Alice", 85, 20));
		als.add(new Student("Bob", 92, 22));
		als.add(new Student("Charlie", 78, 21));

		StudentComparator sc = new StudentComparator();

		Collections.sort(als, sc);

		for(Student s : als) {
			System.out.println(s);
		}

		System.out.println("-----------------------------------------");

		als.add(new Student("Ray", 78, 19));

		Collections.sort(als, sc);

		for(Student s : als) {
			System.out.println(s);
		}

		System.out.println("-----------------------------------------");

		Collections.reverse(als);

		for(Student s : als) {
			System.out.println(s);
		}

	}

}
