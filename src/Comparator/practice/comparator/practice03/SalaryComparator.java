package Comparator.practice.comparator.practice03;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	//compareメソッド
	//オーバーライドし、実装する
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return Double.compare(emp1.getSalary(), emp2.getSalary());
		
//		double sub = emp1.getSalary() - emp2.getSalary();
//		
//		if(sub < 0) {
//			return -1;
//		} else if(sub > 0) {
//			return 1;
//		} else {
//			return 0;
//		}
	}

}
