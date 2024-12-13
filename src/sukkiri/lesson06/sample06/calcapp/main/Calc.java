package sukkiri.lesson06.sample06.calcapp.main;

import sukkiri.lesson06.sample06.calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		//FQCNをimprotしているので、「クラス名.メソッド名」で呼び出せる
		int total = CalcLogic.tasu(a, b);
		//「FQCN」
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	/*
	public class Calc {
		
	}
	
	public class CalcLogic {
		
	}
	
	package calcapp.main;
	import calcapp.iogics.CalcLogic;
	
	public class Calc {
		public static void main(String[] args) {
			
			
			int total = CalcLogic.tasu(a, b);
			int delta = calcapp.logics.CalcLogic.hiku(a, b);
		}
	}
	*/

}
