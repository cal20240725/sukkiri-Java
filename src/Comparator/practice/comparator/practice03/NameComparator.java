package Comparator.practice.comparator.practice03;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	//compareメソッド
	//オーバーライドし、実装する
	@Override
	public int compare(Employee emp1, Employee emp2) {
		//return emp1.getName().length() - emp2.getName().length();
		
		return emp1.getName().compareTo(emp2.getName());
	}

}
