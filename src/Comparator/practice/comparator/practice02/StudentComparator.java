package Comparator.practice.comparator.practice02;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	//compareメソッド
	//オーバーライドし、実装する
	@Override
	public int compare(Student student1, Student student2) {
		//成績の差
		int sub = student1.getScore() - student2.getScore();
		
		//成績の差がある場合
		if(sub != 0) {
			//その差を返す
			return sub;
			//成績の差がない場合
		} else {
			//年齢の差を返す
			return student1.getAge() - student2.getAge();
		}
	}

}
