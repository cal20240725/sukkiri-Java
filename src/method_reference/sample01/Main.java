package method_reference.sample01;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		// 静的メソッドの参照
		Function<String, Integer> function = Main::stringLength;
		
		// 静的メソッドを呼び出し
		int length = function.apply("Hello");
		System.out.println("Length of string: " + length);
	}
	
	//staticメソッド()
	public static int stringLength(String str) {
		return str.length();
	}

}
