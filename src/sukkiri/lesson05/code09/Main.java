package sukkiri.lesson05.code09;

public class Main {
	public static int sample() {
		
		return 1;
		int x = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(sample());
		//System.out.println(aaa(0));
	}
	
	public static int aaa(int x) {//これはいける
		if (x > 0) {
			return x;
		}
		return - x;
	}
	
	public static int bbb(int x) {
		if (x > 0) {
			return 3;
		} else if (x > 0) {
			return 1;
		} else {
			return - x;
		}
	}

}
