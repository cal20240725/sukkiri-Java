package sukkiri.lesson15.code01;

public class Main {
	public static void main(String[] args) {
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		} else {
			System.out.println("s2とs3は等しくない");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		} else {
			System.out.println("s1は空文字ではない");
		}
	}

}
