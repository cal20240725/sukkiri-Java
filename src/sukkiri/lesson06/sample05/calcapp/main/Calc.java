package sukkiri.lesson06.sample05.calcapp.main;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.tasu(a, b);
		int delta = sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	/*
	public class Calc {
		
	}
	
	public class CalcLogic {
		
	}
	
	package calcapp.main;
	
	public class Calc {
		public static void main(String[] args) {
			int a = 10; int b = 2;
			int total = calcapp.logics.CalcLogic.tasu(a, b);
			int delta = calcapp.logics.CalcLogic.hiku(a, b);
			System.out.println("足すと" + total + "、引くと" + delta);
		}
	}
	*/
}
