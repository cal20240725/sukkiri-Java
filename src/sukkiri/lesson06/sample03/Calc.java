package sukkiri.lesson06.sample03;

public class Calc {
	//code6-3
	/*
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = tasu(a, b);
		int delta = hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	*/
	//code6-4
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
